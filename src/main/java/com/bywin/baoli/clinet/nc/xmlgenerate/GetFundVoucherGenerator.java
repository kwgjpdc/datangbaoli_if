package com.bywin.baoli.clinet.nc.xmlgenerate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.XmlUtil;
import com.bywin.baoli.clinet.nc.vo.VchUfinterfaceVo;
import com.bywin.baoli.utils.XmlUtils;

/**
 * 资金还款XML生成
 */
public class GetFundVoucherGenerator {


    /**
     * 获取资金提款的凭证xml
     *
     * @param amount
     * @param busscontno
     * @param supCode
     * @param bankAccCode
     * @return
     */
    public String getGetFundVoucherXmlStr(BigDecimal amount, String bankAccCode, String supCode, String busscontno, String accosoa, String explation, String acctype, String strPrepareDate) {
        Object o = this.composeFundVoucherInterfaceVo(amount, bankAccCode, supCode, busscontno, accosoa, explation, acctype, strPrepareDate);
        String xml = XmlUtils.objCvrt2Str(o);
        return  XmlUtil.format(xml);
    }


    /**
     * 把资金提款的数据转换成账务数据
     *
     * @param fundAmt
     * @param bankAccCode
     * @param supCode
     * @param busscontno
     * @param accasoa
     * @param explation
     * @param acctype
     * @param strPrepareDate
     * @return
     */
    public VchUfinterfaceVo composeFundVoucherInterfaceVo(BigDecimal fundAmt, String bankAccCode,
                                                          String supCode, String busscontno, String accasoa,
                                                          String explation, String acctype, String strPrepareDate) {

//		String pkSystem = ApplicationConfigFactory.getInstance().getPropertyValue("NCConfig", "default", "pk_system");

        String pkOrg = "null";

        String pkPrepared = "null";
        String pkGroup = "null";

        List<VchUfinterfaceVo.Item> detailsItemList = new ArrayList<VchUfinterfaceVo.Item>();


        VchUfinterfaceVo.Item.Ass dAss = this.getDSupItems(bankAccCode);
        VchUfinterfaceVo.Item.Ass cAss = this.getCSupItems(supCode, busscontno);
        //借方金额
        VchUfinterfaceVo.Item detailItemJ = VchUfinterfaceVo.Item.newItem()
                .ass(dAss)
//	 	                .cashFlow(cashFlow)
                .debitamount(fundAmt.toString())
                .detailindex(null)
                .explanation(explation)
                .localdebitamount(fundAmt.toString())
                .pkAccasoa(acctype)
                .pkCurrtype("CNY")//系统只有人名币
                .build();
        detailsItemList.add(detailItemJ);


        VchUfinterfaceVo.Item cashFlowItem = VchUfinterfaceVo.Item.newItem()
                .mPkCurrtype("CNY")
                .money(fundAmt.toString())
                .moneymain(fundAmt.toString())
                .pkCashflow("1312")//对方科目
                .build();

        VchUfinterfaceVo.Details.CashFlow cashFlow = VchUfinterfaceVo.Details.CashFlow.newCashFlow()
                .item(cashFlowItem)
                .build();
//        cashFlow
        //贷方金额
        VchUfinterfaceVo.Item detailItemD = VchUfinterfaceVo.Item.newItem()
                .creditamount(fundAmt.toString().toString())
                .localcreditamount(fundAmt.toString().toString())
                .ass(cAss)
                .cashFlow(cashFlow)
                .detailindex(null)
                .explanation(explation)
                .pkAccasoa(accasoa)
                .pkCurrtype("CNY")//系统只有人名币
                .build();
        detailsItemList.add(detailItemD);


        VchUfinterfaceVo.Details details = VchUfinterfaceVo.Details.newDetails()
                .itemList(detailsItemList)
                .build();

        VchUfinterfaceVo.Voucher.VoucherHead voucherHead = VchUfinterfaceVo.Voucher.VoucherHead.newVoucherHead()
                .details(details)
                .pkAccountingbook(pkOrg + "-0001")
                .pkGroup(pkGroup)//配置
                .pkOrg(pkOrg)
                .pkOrgV("")
                .pkPrepared(pkPrepared)//TODO NC里对应的用户编码;配置
                .prepareddate(strPrepareDate)
                .year(strPrepareDate.split("-")[0])
                .details(details)
                .attachment("2")//单据附件默认为2
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


    private VchUfinterfaceVo.Item.Ass getCSupItems(String supCode, String busscontno) {
        List<VchUfinterfaceVo.Item> supItems = new ArrayList<VchUfinterfaceVo.Item>();

        //辅助核算项: 供应商档案;/0019
        if (StrUtil.isNotBlank(supCode)) {
            VchUfinterfaceVo.Item supItem = VchUfinterfaceVo.Item.newItem()
                    .pkChecktype("0019")
                    .pkCheckvalue(supCode)
                    .build();

            supItems.add(supItem);
        }

        //辅助核算项: 融资合同号;
        if (StrUtil.isNotBlank(busscontno)) {
            VchUfinterfaceVo.Item supItem = VchUfinterfaceVo.Item.newItem()
                    .pkChecktype("rzht")
                    .pkCheckvalue(busscontno)
                    .build();

            supItems.add(supItem);
        }
        VchUfinterfaceVo.Item.Ass ass = VchUfinterfaceVo.Item.Ass.newAss()
                .SupItemList(supItems)
                .build();

        return ass;
    }


    private VchUfinterfaceVo.Item.Ass getDSupItems(String bankAccCode) {
        List<VchUfinterfaceVo.Item> supItems = new ArrayList<>();
        //辅助核算项: 银行账户/0011
        if (StrUtil.isNotBlank(bankAccCode)) {
            VchUfinterfaceVo.Item supItem = VchUfinterfaceVo.Item.newItem()
                    .pkChecktype("0011")
                    .pkCheckvalue(bankAccCode)
                    .build();

            supItems.add(supItem);
        }
        VchUfinterfaceVo.Item.Ass ass = VchUfinterfaceVo.Item.Ass.newAss()
                .SupItemList(supItems)
                .build();

        return ass;
    }

}
