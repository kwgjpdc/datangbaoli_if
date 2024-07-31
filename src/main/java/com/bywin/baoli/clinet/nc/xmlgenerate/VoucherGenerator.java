/*
package com.bywin.baoli.clinet.nc.xmlgenerate;

import cn.hutool.core.util.StrUtil;
import com.bywin.baoli.clinet.nc.vo.BusinessVchManageVo;
import com.bywin.baoli.clinet.nc.vo.VchUfinterfaceCopyVo;
import com.bywin.baoli.clinet.nc.vo.VchUfinterfaceVo;
import com.bywin.baoli.constants.EventTypeConst;
import com.bywin.baoli.utils.VchExplainUtil;
import com.bywin.baoli.utils.XmlUtils;

import java.math.BigDecimal;
import java.util.*;

public class VoucherGenerator {


    public static final VoucherGenerator INSTANCE = new VoucherGenerator();
    //1:客户档案
    private static final String ASS_TYPE_CUS = "1";
    //2:业务类型
    private static final String ASS_TYPE_BUS = "2";
    //3:租赁合同
    private static final String ASS_TYPE_COT = "3";
    //4.供应商档案
    private static final String ASS_TYPE_PROVIDER = "4";
    //5.融资合同
    private static final String ASS_TYPE_RZCONT = "5";
    //6.标的物类型
    private static final String ASS_TYPE_BDW = "6";
    //7.期限
    private static final String ASS_TYPE_QX = "7";
    // 8.借款来源
    private static final String ASS_TYPE_JKLY = "8";
    //9.财务公司账号
    private static final String ASS_TYPE_ACCOUNT = "9";
    //0.无
    private static final String ASS_TYPE_NONE = "-1";


    */
/**
     * 根据btxVch list 获取xml格式的凭证
     *
     * @param vchList
     * @return
     *//*

    public String getVoucherXmlStr(List<BusinessVchManageVo> vchList, Map<Integer, String> cashFlwoMap) {
        return getVoucherXmlMap(vchList, cashFlwoMap).get("xmlStr");
    }

    */
/**
     * 根据btxVch list 获取xml格式的凭证
     *
     * @param vchList
     * @return
     *//*

    public Map<String, String> getVoucherXmlMap(List<BusinessVchManageVo> vchList, Map<Integer, String> cashFlwoMap) {
        Map<String, String> returnMap = new HashMap<String, String>();
        VchUfinterfaceCopyVo vo = composeVoucherInterfaceVo(vchList, cashFlwoMap);
        String xmlStr = XmlUtils.objCvrt2Str(vo.getVchUfinterfaceVo());

        returnMap.put("xmlStr", xmlStr);
        returnMap.put("voucherId", vo.getVoucherId());

        return returnMap;
    }


    */
/**
     * 把系统的账务数据转换成接口数据对应的对象
     *
     * @param vchList
     * @param cashFlwoMap
     * @return
     *//*

    public VchUfinterfaceCopyVo composeVoucherInterfaceVo(List<BusinessVchManageVo> vchList, Map<Integer, String> cashFlwoMap) {


        String pkOrg = "null";

        String pkPrepared = "null";
        String pkGroup = "null";

        List<VchUfinterfaceVo.Item> detailsItemList = new ArrayList<VchUfinterfaceVo.Item>();

        String explain = VchExplainUtil.getExplainByVchList(vchList);
        //排个序，借方排在前边

        List<BusinessVchManageVo> dList = new ArrayList<BusinessVchManageVo>();
        List<BusinessVchManageVo> cList = new ArrayList<BusinessVchManageVo>();

        int eventtype = vchList.get(0).getEventtype().intValue();
        int suitno = vchList.get(0).getSuitno();
        if (EventTypeConst.EVENTTYPE_LSM_MCBLZC == eventtype
                || EventTypeConst.EVENTTYPE_LSM_SDJK == eventtype
                || EventTypeConst.EVENTTYPE_LSM_XMHK == eventtype
                || EventTypeConst.EVENTTYPE_LSM_ZFJK == eventtype) {
            BusinessVchManageVo syvch = new BusinessVchManageVo();
            BusinessVchManageVo ratevch = new BusinessVchManageVo();
            for (BusinessVchManageVo vch : vchList) {
                if (vch.getDaccamt() != null && vch.getDaccamt().compareTo(BigDecimal.ZERO) != 0) {
                    dList.add(vch);
                } else if (vch.getCaccamt() != null && vch.getCaccamt().compareTo(BigDecimal.ZERO) < 0) {
//		    		vch.setDcmark(FieldConst.DCMARK_DEBIT);
//		    		vch.setDaccamt(vch.getCaccamt().abs());
//		    		vch.setCaccamt(BigDecimal.ZERO);
                    if (vch.getAccno().equals("2221010202")) {//销项税额
                        PojoUtils.copy(vch, ratevch);
                    } else if (vch.getAccno().equals("611102")) {//持有至到期投资收益
                        PojoUtils.copy(vch, syvch);
                    }
//		    		else {
//			    		dList.add(vch);
//		    		}
                } else {
                    cList.add(vch);
                }
            }


            if (syvch.getDaccamt() != null && syvch.getDaccamt().compareTo(BigDecimal.ZERO) != 0) {
                if (ratevch.getDaccamt() != null) {
                    syvch.setDaccamt(syvch.getDaccamt().add(ratevch.getDaccamt()));
                }
                dList.add(syvch);
            } else if (syvch.getCaccamt() != null && syvch.getCaccamt().compareTo(BigDecimal.ZERO) != 0) {
                if (ratevch.getCaccamt() != null) {
                    syvch.setCaccamt(syvch.getCaccamt().add(ratevch.getCaccamt()));
                }
                cList.add(syvch);
            }

        } else {
            for (BusinessVchManageVo vch : vchList) {
                if (vch.getDaccamt() != null && vch.getDaccamt().compareTo(BigDecimal.ZERO) != 0) {
                    dList.add(vch);
                } else {
                    cList.add(vch);
                }
            }
        }

        dList.addAll(cList);
        vchList = dList;
        String busscontno = VchExplainUtil.getBusscontno(vchList);

        for (BusinessVchManageVo vch : vchList) {

            VchUfinterfaceVo.Item.Ass ass = this.getAssItems(vch, busscontno);

            if (ArrayUtils.contains(NCExchangeService.BANK_DISPOES, vch.getAccno())) {
                //如果是银行存款科目类型，则需要重新计算
                vch.setAccno(accnoLocal.get());
                accnoLocal.remove();
            }

            if (vch.getDaccamt() != null && vch.getDaccamt().compareTo(BigDecimal.ZERO) != 0) {//借方金额
                //判断作为借方是否有现金流
                CashFlow cashFlow = this.getCashFlow(vch.getDaccamt().toString(), cashFlwoMap.get(vch.getRefcode()));

                VchUfinterfaceVo.Item detailItem = null;
                if (cashFlow != null) {
                    detailItem = VchUfinterfaceVo.Item.newItem()
                            .ass(ass)
                            .cashFlow(cashFlow)
                            .debitamount(vch.getDaccamt().toString())
                            .detailindex(commonService.getMaxRefcodeByTableName("UFINTERFACE_ITEM_INDEX") + "")
                            .explanation(explain)
                            .localdebitamount(vch.getDaccamt().toString())
                            .pkAccasoa(vch.getAccno())
                            .pkCurrtype("CNY")//系统只有人名币
                            .build();
                } else {
                    detailItem = VchUfinterfaceVo.Item.newItem()
                            .ass(ass)
//    		 	                .cashFlow(cashFlow)
                            .debitamount(vch.getDaccamt().toString())
                            .detailindex(commonService.getMaxRefcodeByTableName("UFINTERFACE_ITEM_INDEX") + "")
                            .explanation(explain)
                            .localdebitamount(vch.getDaccamt().toString())
                            .pkAccasoa(vch.getAccno())
                            .pkCurrtype("CNY")//系统只有人名币
                            .build();
                }

                detailsItemList.add(detailItem);
            }

            if (vch.getCaccamt() != null && vch.getCaccamt().compareTo(BigDecimal.ZERO) != 0) {//贷方金额
                //判断作为贷方是否有现金流
                CashFlow cashFlow = this.getCashFlow(vch.getCaccamt().toString(), cashFlwoMap.get(vch.getRefcode()));
                VchUfinterfaceVo.Item detailItem = null;

                if (cashFlow != null) {//有现金流
                    detailItem = VchUfinterfaceVo.Item.newItem()
                            .creditamount(vch.getCaccamt().toString())
                            .localcreditamount(vch.getCaccamt().toString())
                            .ass(ass)
                            .cashFlow(cashFlow)
                            .detailindex(commonService.getMaxRefcodeByTableName("UFINTERFACE_ITEM_INDEX") + "")
                            .explanation(explain)
                            .pkAccasoa(vch.getAccno())
                            .pkCurrtype("CNY")//系统只有人名币
                            .build();
                } else {//无现金流
                    detailItem = VchUfinterfaceVo.Item.newItem()
                            .creditamount(vch.getCaccamt().toString())
                            .localcreditamount(vch.getCaccamt().toString())
                            .ass(ass)
//    		 	                .cashFlow(cashFlow)
                            .detailindex(commonService.getMaxRefcodeByTableName("UFINTERFACE_ITEM_INDEX") + "")
                            .explanation(explain)
                            .pkAccasoa(vch.getAccno())
                            .pkCurrtype("CNY")//系统只有人名币
                            .build();
                }

                detailsItemList.add(detailItem);
            }

        }

        VchUfinterfaceVo.Details details = VchUfinterfaceVo.Details.newDetails()
                .itemList(detailsItemList)
                .build();


        String attachment = "0";
        //尾款划转或是保理投放，附件数改为2
        if (EventTypeConst.EVENTTYPE_LAM_RESULTINPUT == eventtype
                || EventTypeConst.EVENTTYPE_EF_RETAINAGE_TRANS == eventtype
                || ((EventTypeConst.EVENTTYPE_EF_BUYERPAID == eventtype
                || EventTypeConst.EVENTTYPE_LSM_SELLERPAID == eventtype
                || EventTypeConst.EVENTTYPE_LSM_BUYPAIDINT == eventtype
                || EventTypeConst.EVENTTYPE_LSM_XMHK == eventtype
                || EventTypeConst.ARFP_BUYERPAID == eventtype)
                && suitno == 1)) {
            attachment = "2";
        } else if ((EventTypeConst.EVENTTYPE_LSM_ZFJK == eventtype
                || EventTypeConst.EVENTTYPE_LSM_MCBLZC == eventtype
                || EventTypeConst.EVENTTYPE_LSM_SDJK == eventtype)
                && suitno == 1) {
            attachment = "1";
        }
        VchUfinterfaceVo.Voucher.VoucherHead voucherHead = VchUfinterfaceVo.Voucher.VoucherHead.newVoucherHead()
                .details(details)
                .pkAccountingbook(pkOrg + "-0001")
                .pkGroup(pkGroup)//配置
                .pkOrg(pkOrg)
                .pkOrgV("")
                .period(DateTimeUtils.getStringDate(new Date(), "MM"))
                .pkPrepared(pkPrepared)//TODO NC里对应的用户编码;配置
                .prepareddate(DateTimeUtils.getStringDate(vchList.get(0).getVchdate()))
                .year(DateTimeUtils.getStringDate(new Date(), "yyyy"))
                .details(details)
                .attachment(attachment)//单据附件默认为2
                .build();


        //凭证的ID要改：保理公司统一信用代码 + 年月日 + 6位数
        String blCompanyId = ApplicationConfigFactory.getInstance().getPropertyValue("NCConfig", "default", "bl_company_code");
        String seqId = String.valueOf(commonService.getMaxRefcodeByTableName("UFINTERFACE_VOUCHER_ID"));
        String dateStr = DateTimeUtils.getStringDate(new Date(), "yyyyMMdd");
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

        VchUfinterfaceCopyVo copyVo = new VchUfinterfaceCopyVo();

        copyVo.setVchUfinterfaceVo(vo);
        copyVo.setVoucherId(voucherId);

        return copyVo;
    }


    */
/**
     * 获取现金流
     *
     * @param accno
     * @param amt
     * @param DOrC
     * @return
     *//*

    private CashFlow getCashFlow(String amt, String cashPk) {

        //获取对方的科目，写在配置项
        //TODO
//		this.getConterpartAccno(acccno, DOrC);

        if (cashPk == null) {
            return null;
        }

        VchUfinterfaceVo.Item cashFlowItem = VchUfinterfaceVo.Item.newItem()
                .mPkCurrtype("CNY")
                .money(amt)
                .moneymain(amt)
                .pkCashflow(cashPk)//对方科目
                .build();

        Details.CashFlow cashFlow = Details.CashFlow.newCashFlow()
                .item(cashFlowItem)
                .build();

        return cashFlow;

    }


    private Ass getAssItems(BusinessVchManageVo vch, String busscontno) {

        String assType = ApplicationConfigFactory.getInstance().getPropertyValue("ncAssItems", "default", vch.getAccno());

        List<VchUfinterfaceVo.Item> supItems = new ArrayList<VchUfinterfaceVo.Item>();

        //如果是一下两个特定的分录号，则分开进行
        if ("64110202".equals(vch.getAccno()) || "64110102".equals(vch.getAccno())) {

            Map<String, Object> fudMap = OsgiServiceUtil.getService(Activator.getContext(), BusinessVchManageQueryService.class).getBchFundByTxno(vch.getTxno());

            String jkly = this.getJKLY(String.valueOf(fudMap.get("FUNDPSOURCE")), String.valueOf(fudMap.get("FUNDPPROVIDER")), String.valueOf(fudMap.get("POTHERPROVIDERNAME")));

            VchUfinterfaceVo.Item supItemQx = VchUfinterfaceVo.Item.newItem()
                    .pkChecktype("qx")
                    .pkCheckvalue(String.valueOf(fudMap.get("DURATION")))
                    .build();
            VchUfinterfaceVo.Item supItemJKLY = VchUfinterfaceVo.Item.newItem()
                    .pkChecktype("jkly")
                    .pkCheckvalue(jkly)
                    .build();

            VchUfinterfaceVo.Item supItemGYS = VchUfinterfaceVo.Item.newItem()
                    .pkChecktype("0019")
                    .pkCheckvalue(String.valueOf(fudMap.get("PROVIDERCODE")))
                    .build();

            VchUfinterfaceVo.Item supItemRZHT = VchUfinterfaceVo.Item.newItem()
                    .pkChecktype("rzht")
                    .pkCheckvalue(String.valueOf(fudMap.get("BANK_LOAN_CONTRACT")))
                    .build();

            supItems.add(supItemQx);
            supItems.add(supItemJKLY);
            supItems.add(supItemGYS);
            supItems.add(supItemRZHT);
        } else {//根据配置项生成凭证
            //非无配置选项
            if (StrUtil.isNotBlank(assType) && (!ASS_TYPE_NONE.equals(assType))) {
                String[] assTypes = assType.split(",");

                for (int i = 0; i < assTypes.length; i++) {
                    VchUfinterfaceVo.Item supItem = this.getSupItemByAssType(assTypes[i], vch, busscontno);
                    supItems.add(supItem);
                }

            }

        }


        VchUfinterfaceVo.Item.Ass ass = VchUfinterfaceVo.Item.Ass.newAss()
                .SupItemList(supItems)
                .build();

        return ass;
    }


    private Item getSupItemByAssType(String assType, BusinessVchManageVo vch, String busscontno) {

        NCExchangeService ncExChangeService = OsgiServiceUtil.getService(Activator.getContext(), NCExchangeService.class);
        String pkChecktype = StrUtil.EMPTY;
        String pkCheckvalue = StrUtil.EMPTY;

        if (ASS_TYPE_BUS.equals(assType)) {//业务类型辅助核算项
            pkChecktype = "ywlx";
            pkCheckvalue = vch.getBussType();

        } else if (ASS_TYPE_CUS.equals(assType)) {//客户档案辅助核算项
            pkChecktype = "0017";

            //重新发送一遍
            String custid = VchExplainUtil.CUSTID_CONTAINER.get();
            VchExplainUtil.CUSTID_CONTAINER.remove();
            if (StrUtil.isBlank(custid)) {
                custid = vch.getCustid();
            }

            //只有资产卖断的4个交易需要处辅助核算项,客户档案需要买方的客户档案
            if (EventTypeConst.EVENTTYPE_LSM_MCBLZC == vch.getEventtype().intValue()
                    || EventTypeConst.EVENTTYPE_LSM_SDJK == vch.getEventtype().intValue()
                    || EventTypeConst.EVENTTYPE_LSM_XMHK == vch.getEventtype().intValue()
                    || EventTypeConst.EVENTTYPE_LSM_ZFJK == vch.getEventtype().intValue()) {
                if (EventTypeConst.EVENTTYPE_LSM_MCBLZC == vch.getEventtype().intValue() &&
//						112102/122102/1002
                        (vch.getAccno().startsWith("1002") || vch.getAccno().equals("112102") || vch.getAccno().equals(122102))) {
//					List<VbtxmasVo> vbtxmasVoList = OsgiServiceUtil.getService(Activator.getContext(), TxPendingQueryService.class).getTxPendingVoByTxno(vch.getTxno());
//					if(vbtxmasVoList != null && !vbtxmasVoList.isEmpty()){
//						VbtxmasVo vbtxmasVo = vbtxmasVoList.get(0);
//						Map<String, String> map = JsonUtil.fromJson(vbtxmasVo.getJson(), java.util.HashMap.class);
//						String backrefcode = map.get("backrefcode");
//						if(backrefcode != null){
//							VcusinxmVo vcusinxmVo = OsgiServiceUtil.getService(Activator.getContext(), CustBasicQueryService.class).getMcustInfo(Integer.parseInt(backrefcode));
//							custid = vcusinxmVo.getCustid();
//						}
//					}
                    custid = OsgiServiceUtil.getService(Activator.getContext(), BusinessVchManageQueryService.class).getMrCustByTxno(vch.getTxno(), vch.getRemark());
                } else if (EventTypeConst.EVENTTYPE_LSM_SDJK == vch.getEventtype().intValue() && ("112102".equals(vch.getAccno()) || "122102".equals(vch.getAccno()))) {
                    custid = OsgiServiceUtil.getService(Activator.getContext(), BusinessVchManageQueryService.class).getMrCustByTxno(vch.getTxno(), vch.getRemark());
                } else if (EventTypeConst.EVENTTYPE_LSM_XMHK == vch.getEventtype().intValue() && "224101".equals(vch.getAccno())) {
                    if (!vch.getVouchno().startsWith("BTX")) {
                        custid = OsgiServiceUtil.getService(Activator.getContext(), BusinessVchManageQueryService.class).getMrCustByTxno(vch.getTxno(), vch.getRemark());
                    }
                }
            }


//			int vchType = VchExplainUtil.decideVchType(vch.getAccno());
//			if(vch.getEventtype().intValue() == EventTypeConst.EVENTTYPE_LSM_BUYPAIDINT
//					|| VchExplainUtil.VCH_INT == vchType) {//利息
//				Map<String, Object> feeInfo = OsgiServiceUtil.getService(Activator.getContext(), BusinessVchManageQueryService.class).getIntInfoByTxno(vch.getTxno());
//				custid = (String)feeInfo.get("CUSTID");
//			}

            if (StrUtil.isBlank(custid)) {
                custid = vch.getCustid();
            }

            CustBasicVo custVo = OsgiServiceUtil.getService(Activator.getContext(), CustBasicQueryService.class).getVcusinxmByCustid(custid);
            if (EventTypeConst.EVENTTYPE_DT_MEND_ACCRUAL != vch.getEventtype().intValue() && EventTypeConst.EVENTTYPE_LSM_YTLXFC != vch.getEventtype().intValue()) {
                ncExChangeService.sendCust2NC(custVo);
            }

            String custVal = CustGenerator.sliceCode(custVo.getSocialCreditCode());
            pkCheckvalue = custVal;
        } else if (ASS_TYPE_COT.equals(assType)) {//租赁合同辅助核算项
            pkChecktype = "zlht";
            //合同号
            if (StrUtil.isNotBlank(busscontno)) {
                pkCheckvalue = busscontno;
            } else if (StrUtil.isBlank(busscontno) && vch.getEventtype().intValue() == EventTypeConst.EVENTTYPE_EF_TXFEECHG) {
                pkCheckvalue = OsgiServiceUtil.getService(Activator.getContext(), BusinessVchManageQueryService.class).getBusscontnoByTxnoforfee(vch.getTxno());
            } else {
                pkCheckvalue = OsgiServiceUtil.getService(Activator.getContext(), BusinessVchManageQueryService.class).getBusscontnoByTxno(vch.getTxno());
            }

            //发送一下合同号
            if (StrUtil.isNotBlank(pkCheckvalue)) {
                BussCntVo bussCntVo = OsgiServiceUtil.getService(Activator.getContext(), BussCntQueryService.class).getBussCntVoWithBusscontno(pkCheckvalue);
                if (EventTypeConst.EVENTTYPE_DT_MEND_ACCRUAL != vch.getEventtype().intValue() && EventTypeConst.EVENTTYPE_LSM_YTLXFC != vch.getEventtype().intValue()) {
                    ncExChangeService.sendBusscont2NC(pkCheckvalue, bussCntVo.getTemplateid());
                }
            }
//			if(StrUtil.isBlank(pkCheckvalue) && vch.getEventtype().intValue() == EventTypeConst.EVENTTYPE_EF_TXFEECHG) {
//			}
        } else if (ASS_TYPE_BDW.equals(assType)) {
            pkChecktype = "bdw";
            pkCheckvalue = "01";
        } else if (ASS_TYPE_PROVIDER.equals(assType)) {
            pkChecktype = "0019";
            String supCode = null;
            if (EventTypeConst.EVENTTYPE_LSM_XMHK == vch.getEventtype().intValue() && "224101".equals(vch.getAccno()) && !vch.getVouchno().startsWith("BTX")) {
                String socialCreditCode = null;
                supCode = CustGenerator.sliceCode(socialCreditCode);
            } else if (EventTypeConst.EVENTTYPE_LSM_ZFJK == vch.getEventtype().intValue() && "224101".equals(vch.getAccno())) {
                String socialCreditCode = null;
                supCode = CustGenerator.sliceCode(socialCreditCode);
            } else {
                //TODO 供应商编码
                Integer custRefcode = Onull;
                VcusinxmVo cusVo = null;
                VcuscbsmVo cbsVo = null;

                supCode = CustGenerator.sliceCode(cbsVo.getSocialCreditCode());

                if (EventTypeConst.EVENTTYPE_DT_MEND_ACCRUAL != vch.getEventtype().intValue()) {
                    OsgiServiceUtil.getService(Activator.getContext(), NCExchangeService.class).sendSupplier(supCode, cusVo.getCustname());
                }
            }


            pkCheckvalue = supCode;
        } else if (ASS_TYPE_ACCOUNT.equals(assType)) {
            pkChecktype = "0011";
            //保理公司账号
            pkCheckvalue = getAccountno(vch, busscontno);
            //根据账号类型反推会计科目
            computAccnoByAccountno(pkCheckvalue);
        }

        VchUfinterfaceVo.Item supItem = VchUfinterfaceVo.Item.newItem()
                .pkChecktype(pkChecktype)
                .pkCheckvalue(pkCheckvalue)
                .build();

        return supItem;
    }

    private void computAccnoByAccountno(String accountno) {
        //获取账号所属的账号类型
        if (StrUtil.isBlank(accountno)) {
            return;
        }
        //优先读取配置文件
        String accType = null;
        if (StrUtil.isNotBlank(accType)) {
            this.accnoLocal.set(accType);
            return;
        }
        //配置文件没有配置的话，根据规则判断。10位以内区100202财务公司户，其他100203一般户
        if (accountno.length() <= 10) {
            this.accnoLocal.set("100202");
        } else {
            this.accnoLocal.set("100203");
        }

    }

    public String getAccnoByAccountno(String accountno) {
        //获取账号所属的账号类型
        if (StrUtil.isBlank(accountno)) {
            return null;
        }
        //优先读取配置文件
        String accType = null;
        if (StrUtil.isNotBlank(accType)) {
            return accType;
        }
        //配置文件没有配置的话，根据规则判断。10位以内区100202财务公司户，其他100203一般户
        if (accountno.length() <= 10) {
            return "100202";
        } else {
            return "100203";
        }

    }


    private String getAccountno(BusinessVchManageVo vchVo, String busscontno) {
        if (StrUtil.isNotBlank(vchVo.getDwaccno())) {
            return vchVo.getDwaccno();
        }

        //保理投放取功能录入的账号
        if (EventTypeConst.EVENTTYPE_LAM_RESULTINPUT == vchVo.getEventtype()) {
            return null;

        }
        //费用管理取vbtxdatm表的账号
        if (EventTypeConst.EVENTTYPE_EF_TXFEECHG == vchVo.getEventtype()) {
            return null;
        }
        //尾款划转取VBTXCTRm表的账号
        if (EventTypeConst.EVENTTYPE_EF_RETAINAGE_TRANS == vchVo.getEventtype()
                || EventTypeConst.EVENTTYPE_LSM_ZFJK == vchVo.getEventtype().intValue()) {
            return null;
        }

        if (EventTypeConst.EVENTTYPE_LSM_MCBLZC == vchVo.getEventtype().intValue()
                || EventTypeConst.EVENTTYPE_LSM_SDJK == vchVo.getEventtype().intValue()) {
            return null;
        }

        Integer acctype = 2;
        if (StrUtil.isNotEmpty(busscontno)) {
            //取合同下的卖方保理专户
            return null;
        } else {//合同号为空的话，直接取客户的保理专户
            AccountWithBankVo condition = new AccountWithBankVo();
            condition.setCustrefcode(vchVo.getCustrefcode());
            condition.setAcctype(acctype);
            return OsgiServiceUtil.getService(Activator.getContext(), CusAccountQueryService.class).getAccountWithBankVoByCondition(condition).getAccountno();
        }


    }


    */
/**
     * 与财务的借款来源对齐
     *
     * @param fundsource
     * @param fundprovider
     * @param otherprovidername
     * @return
     *//*

    private String getJKLY(String fundsource, String fundprovider, String otherprovidername) {
        //自有资金 code=4
        //股东 code=3
        //银行code=2
        //财务公司 code=1
        //其他 = 9

        if ("1".equals(fundsource)) {
            return "4";
        } else if ("1".equals(fundprovider)) {//银行
            return "2";
        } else if ("5".equals(fundprovider)) {
            String companyName = null;
            if (companyName.equals(otherprovidername)) {
                return "1";
            } else {
                return "3";
            }
        } else if ("7".equals(fundprovider)) {
            return "3";
        }
        return "9";
    }


}
*/
