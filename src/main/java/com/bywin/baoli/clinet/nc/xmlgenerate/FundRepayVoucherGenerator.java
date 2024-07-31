package com.bywin.baoli.clinet.nc.xmlgenerate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.XmlUtil;
import com.bywin.baoli.clinet.nc.vo.VchUfinterfaceVo;
import com.bywin.baoli.utils.XmlUtils;

/**
 * 资金偿还XML生成
 */
public class FundRepayVoucherGenerator {


    /**
     * 获取资金提款的凭证xml
     *
     * @param bchkzje
     * @param isPayInterest
     * @param accType
     * @param args
     * @param strPrepareDate
     * @param DCGroup
     * @return
     */
    public static String getGetRepayVoucherXmlStr(BigDecimal bchkzje, boolean isPayInterest, String accType, Map<String, String> args, String strPrepareDate, String DCGroup) {
        Object o = getGetRepayVoucherVo(bchkzje, isPayInterest, accType, args, strPrepareDate, DCGroup);
        String xml = XmlUtils.objCvrt2Str(o);
        return XmlUtil.format(xml);
    }


    /**
     * 把资金提款的数据转换成账务数据
     *
     * @param bchkzje
     * @param isPayInterest
     * @param accType
     * @param args
     * @param strPrepareDate
     * @param DCGroup
     * @return
     */
    public static VchUfinterfaceVo getGetRepayVoucherVo(BigDecimal bchkzje, boolean isPayInterest, String accType,
                                                        Map<String, String> args, String strPrepareDate, String DCGroup) {


        String pkOrg = "null";

        String pkPrepared = "null";
        String pkGroup = "null";

        List<VchUfinterfaceVo.Item> detailsItemList = new ArrayList<VchUfinterfaceVo.Item>();


        VchUfinterfaceVo.Item.Ass dAss = getSupItems(args, "D");
        VchUfinterfaceVo.Item.Ass cAss = getSupItems(args, "C");

        String DPkAccasoa = accType;
        String CPkAccasoa = "";
        String explanation = args.get("explation");
        ;
        String pkCashflow = "1321";
        if (isPayInterest) {
            //付息的会计科目
            CPkAccasoa = "22310101";
            pkCashflow = "1121 ";
        } else {
            //还本的会计科目
            CPkAccasoa = args.get("C_accasoa");
        }


        VchUfinterfaceVo.Item cashFlowItem = VchUfinterfaceVo.Item.newItem()
                .mPkCurrtype("CNY")
                .money(bchkzje.toString())
                .moneymain(bchkzje.toString())
                .pkCashflow(pkCashflow)//对方科目
                .build();

        VchUfinterfaceVo.Details.CashFlow cashFlow = VchUfinterfaceVo.Details.CashFlow.newCashFlow()
                .item(cashFlowItem)
                .build();

        if (!"ODC".equals(DCGroup)) {
            //借方金额
            VchUfinterfaceVo.Item detailItemJ = VchUfinterfaceVo.Item.newItem()
                    .ass(dAss)
                    .cashFlow(cashFlow)
                    .debitamount(bchkzje.toString())
                    .detailindex(null)
                    .explanation(explanation)
                    .localdebitamount(bchkzje.toString())
                    .pkAccasoa(CPkAccasoa)
                    .pkCurrtype("CNY")//系统只有人名币
                    .build();
            detailsItemList.add(detailItemJ);

            //贷方金额
            VchUfinterfaceVo.Item detailItemD = VchUfinterfaceVo.Item.newItem()
                    .creditamount(bchkzje.toString())
                    .localcreditamount(bchkzje.toString())
                    .ass(cAss)
                    .detailindex(null)
                    .explanation(explanation)
                    .pkAccasoa(DPkAccasoa)
                    .pkCurrtype("CNY")//系统只有人名币
                    .build();
            detailsItemList.add(detailItemD);
        }

        //如果是利息新增一对科目
        if (isPayInterest && "ODC".equals(DCGroup)) {
            VchUfinterfaceVo.Item.Ass odAss = getSupItems(args, "OD");
            VchUfinterfaceVo.Item.Ass ocAss = getSupItems(args, "OC");

            //借：利息支出/到期利息支出/借款利息;
            //借方金额
            VchUfinterfaceVo.Item detailItemOD = VchUfinterfaceVo.Item.newItem()
                    .ass(odAss)
                    .debitamount(bchkzje.toString())
                    .detailindex(null)
                    .explanation(explanation)
                    .localdebitamount(bchkzje.toString())
                    .pkAccasoa("64110101")//64110101\利息支出\到期利息支出\借款利息
                    .pkCurrtype("CNY")//系统只有人名币
                    .build();
            detailsItemList.add(detailItemOD);

            //贷22310101\应付利息\到期利息\借款利息
            VchUfinterfaceVo.Item detailItemOC = VchUfinterfaceVo.Item.newItem()
                    .creditamount(bchkzje.toString())
                    .localcreditamount(bchkzje.toString())
                    .ass(ocAss)
                    .detailindex(null)
                    .explanation(explanation)
                    .pkAccasoa("22310101")//贷22310101\应付利息\到期利息\借款利息 
                    .pkCurrtype("CNY")//系统只有人名币
                    .build();
            detailsItemList.add(detailItemOC);


        }

        String attachment = "0";
        if (!"ODC".equals(DCGroup)) {
            attachment = "2";
        }

        VchUfinterfaceVo.Details details = VchUfinterfaceVo.Details.newDetails()
                .itemList(detailsItemList)
                .build();

        VchUfinterfaceVo.Voucher.VoucherHead voucherHead = VchUfinterfaceVo.Voucher.VoucherHead.newVoucherHead()
                .details(details)
                .pkAccountingbook(pkOrg + "-0001")
                .pkGroup(pkGroup)//配置
                .pkOrg(pkOrg)
                .pkOrgV("")
                .period(DateUtil.format(new Date(), "MM"))
                .pkPrepared(pkPrepared)//TODO NC里对应的用户编码;配置
                .prepareddate(strPrepareDate)
                .year(DateUtil.format(new Date(), "yyyy"))
                .details(details)
                .attachment(attachment)//单据附件默认为2
                .build();

        //凭证的ID要改：保理公司统一信用代码 + 年月日 + 6位数
        String blCompanyId = "null";
        String seqId = "null";
        String dateStr = "null";
        String voucherId = blCompanyId + seqId + dateStr;
        VchUfinterfaceVo.Voucher voucher = VchUfinterfaceVo.Voucher.newVoucher()
                .voucherHead(voucherHead)
                .id(voucherId)
                .build();

        VchUfinterfaceVo vo = VchUfinterfaceVo.newUfinterfaceVo()
                .filename(voucherId)
                .voucher(voucher)
                .businessunitcode(pkOrg)
                .orgcode(pkOrg)
                .receiver(pkOrg)
                .build();

        return vo;
    }


    private static VchUfinterfaceVo.Item.Ass getSupItems(Map<String, String> args, String TypeOfCD) {
        List<VchUfinterfaceVo.Item> supItems = new ArrayList<VchUfinterfaceVo.Item>();

        for (Map.Entry<String, String> entry : args.entrySet()) {
            String key = entry.getKey();
            if ("C_accasoa".equals(key)) {//去除会计科目，此项并不是辅助核算项
                continue;
            }
            String[] keys = key.split("_");
            if (TypeOfCD.equals(keys[0])) {
                VchUfinterfaceVo.Item supItem = VchUfinterfaceVo.Item.newItem()
                        .pkChecktype(keys[1])
                        .pkCheckvalue(entry.getValue())
                        .build();

                supItems.add(supItem);
            }

        }

        VchUfinterfaceVo.Item.Ass ass = VchUfinterfaceVo.Item.Ass.newAss()
                .SupItemList(supItems)
                .build();

        return ass;
    }


}
