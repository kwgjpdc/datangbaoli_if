//package com.bywin.baoli.utils;
//
//
//import cn.hutool.core.util.ArrayUtil;
//import cn.hutool.core.util.StrUtil;
//import com.bywin.baoli.constants.EventTypeConst;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
///**
// * 生成凭证摘要类
// *
// * @author wenxia.zhi
// */
////20   可还本可付息       98  预提       3   可还本可付息     17收费/手续费  6   可还本可付息 19可还本可付息 653 尾款？ 767 付息  27 投放
//public class VchExplainUtil {
//
//
//    public static final ThreadLocal<String> CUSTID_CONTAINER = new ThreadLocal<String>() {
//        protected String initialValue() {
//            return "";
//        }
//
//        ;
//    };
//
//    //付息
//    public static final int VCH_INT = 1;
//
//    //还本
//    public static final int VCH_PRI = 2;
//
//    //收入尾款
//    public static final int VCH_CTR = 3;
//
//    //未定义+
//    public static final int VCH_UNDEFINED = 0;
//
//
//    /**
//     * TODO
//     * 100201	100201\银行存款\基本户  未定义！！！！！！
//     */
//
//    //定义还本的会计分录号数组
//    //2221010202	2221010202\应交税费\应交增值税\销项税额\税率6%		  还本
//    //1122020101	1122020101\应收账款\应收保理\本金\有追索权			  还本
//    //1122020102	1122020102\应收账款\应收保理\本金\无追索权			  还本
//    private static final String[] VCH_PRI_ARR = {"1122020101", "1122020102"};
//
//
//    //		1122020203	1122020203\应收账款\ 应收保理\利息\逾期保理利息                收息
////		601101	601101\利息收入\保理利息收入							         收息
////		1122020201	1122020201\应收账款\应收保理\利息\有追索权			  收息
////		1122020202	1122020202\应收账款\应收保理\利息\无追索权			  收息
//    private static final String[] VCH_INT_ARR = {"1122020203", "601101", "1122020201", "1122020202"};
//
//
//    public static String getExplainByEventType(BusinessVchManageVo vchVo) {
//        return getExplainAndChageCustidByEventType(vchVo, null);
//
//    }
//
//
//    public static String getExplainByVchList(List<BusinessVchManageVo> vchVoList) {
//        String explain = null;
//        String tailDesc = null;
//        boolean hasPri = false;
//        boolean hasInt = false;
//        for (BusinessVchManageVo var1 : vchVoList) {
//            if (ArrayUtil.contains(VCH_INT_ARR, var1.getAccno())) {
//                hasInt = true;
//            }
//            if (ArrayUtil.contains(VCH_PRI_ARR, var1.getAccno())) {
//                hasPri = true;
//            }
//        }
//
//        if (hasPri && hasInt) {
//            tailDesc = "本金利息";
//        }
//
//        for (BusinessVchManageVo vchVo : vchVoList) {
//            if ("2221010202".equals(vchVo.getAccno())) {//税率的科目，不能判断利息OR本金
//                continue;
//            }
//            explain = getExplainAndChageCustidByEventType(vchVo, tailDesc);
//            if (!("null".equals(explain) || "undefined".equals(explain))) {
//                break;
//            }
//        }
//
//        return explain;
//    }
//
//
//    private static String getExplainAndChageCustidByEventType(BusinessVchManageVo vchVo, String tailDesc) {
//        int eventType = vchVo.getEventtype();
//        int suitno = vchVo.getSuitno();
//        String accno = vchVo.getAccno();
//
//        String busscontno = vchVo.getBusscontno();
//        if (EventTypeConst.EVENTTYPE_LSM_ZFJK == eventType ||
//                EventTypeConst.EVENTTYPE_LSM_SDJK == eventType ||
//                EventTypeConst.EVENTTYPE_LSM_XMHK == eventType ||
//                EventTypeConst.EVENTTYPE_LSM_MCBLZC == eventType) {
//            busscontno = "null";
//        } else {
//            //从放款申请查询合同号
//            if (StrUtil.isBlank(busscontno)) {
//                busscontno = null;
//            }
//            //取账务的 dtcrefcode
//            if (StrUtil.isBlank(busscontno)) {
//                busscontno = null;
//            }
//            //653  应收账款回款TODO
//            if (EventTypeConst.EVENTTYPE_EF_BUYERPAID == eventType && StrUtil.isBlank(busscontno)) {
//                busscontno = null;
//            } else if (EventTypeConst.EVENTTYPE_EF_RETAINAGE_TRANS == eventType && StrUtil.isBlank(busscontno)) {
//                busscontno = null;
//            } else if (StrUtil.isBlank(busscontno) && vchVo.getEventtype().intValue() == EventTypeConst.EVENTTYPE_EF_TXFEECHG) {
//                busscontno = null;
//            }
//        }
//
//        if (StrUtil.isBlank(busscontno)) {
//            busscontno = null;
//        }
//
//        //确定是为付息或是还本
//        int vchType = decideVchType(accno);
//        //从融资信息表 取
//        Map<String, String> custInfo = new HashMap<String, String>();
////		Map<String, String> custInfo = OsgiServiceUtil.getService(Activator.getContext(), BussCntQueryService.class).getCoreCustByBusscontno(busscontno);
//
//        if (vchVo.getEventtype().intValue() == EventTypeConst.EVENTTYPE_EF_TXFEECHG) {
//            Map<String, Object> feeInfo = null;
//            custInfo.put("custname", (String) feeInfo.get("CUSTNAME"));
//            custInfo.put("custid", (String) feeInfo.get("CUSTID"));
//        } else if (vchVo.getEventtype().intValue() == EventTypeConst.EVENTTYPE_LSM_BUYPAIDINT) {
////				|| VCH_INT == vchType) {//利息
//            Map<String, Object> feeInfo = null;
//            custInfo.put("custname", (String) feeInfo.get("CUSTNAME"));
//            custInfo.put("custid", (String) feeInfo.get("CUSTID"));
//        } else {
//            custInfo = null;
//        }
//
//        String loaninvseqno = "";
//        if (EventTypeConst.EVENTTYPE_LSM_MCBLZC == eventType) {
//            if (StrUtil.isNotBlank(vchVo.getRemark())) {
//                loaninvseqno = null;
//            }
//        } else if (EventTypeConst.EVENTTYPE_LSM_SDJK == eventType) {
//            if (StrUtil.isNotBlank(vchVo.getRemark())) {
//                loaninvseqno = null;
//            }
//        } else if (EventTypeConst.EVENTTYPE_LSM_XMHK == eventType) {
//            if (StrUtil.isNotBlank(vchVo.getRemark())) {
//                loaninvseqno = null;
//            }
//        } else if (EventTypeConst.EVENTTYPE_LSM_ZFJK == eventType) {
//            if (StrUtil.isNotBlank(vchVo.getRemark())) {
//                loaninvseqno = null;
//            }
//        }
//
//        if (StrUtil.isBlank(loaninvseqno)) {
//            loaninvseqno = null;
//        }
//
//        if (!StrUtil.isBlank(loaninvseqno)) {
//            busscontno = loaninvseqno;
//        }
//
//        String custName = custInfo.get("custname");
//        //如果是反向保理，取得不是保理申請人
//        CUSTID_CONTAINER.set(custInfo.get("custid"));
//        //如果同时收取本金与利息的话
//        if (tailDesc != null) {
//            return "收取+" + custName + "+" + busscontno + "+" + tailDesc;
//        }
//
//        String explain = "";
//        if (EventTypeConst.EVENTTYPE_LSM_MCBLZC == eventType) {
//            if (suitno == 1) {
//                //卖出保理资产+保理申请人+合同编号+确认转让收入
//                explain = "卖出保理资产+" + custName + "+" + busscontno + "+" + "确认转让收入";
//            } else {
////				卖出保理资产+保理申请人+合同编号+确认持有期间利息收入
//                explain = "卖出保理资产+" + custName + "+" + busscontno + "+" + "确认持有期间利息收入";
//            }
//        } else if (EventTypeConst.EVENTTYPE_LSM_SDJK == eventType) {
//            //卖出保理资产+保理申请人+合同编号+收到卖断价款
//            explain = "卖出保理资产+" + custName + "+" + busscontno + "+" + "收到卖断价款";
//        } else if (EventTypeConst.EVENTTYPE_LSM_XMHK == eventType) {
//
//            if (suitno == 1) {
//                //收取卖出保理资产+保理申请人+合同编号+本金利息
////				explain = "收取卖出保理资产+" + custName + "+" + busscontno + "+" + FormatBuilder.formatMoney(vchVo.getAccamt());
//                explain = "收取卖出保理资产+" + custName + "+" + busscontno + "+" + "本金利息";
//            } else {
//                //确认+项目名称+合同号+利息收入
////				explain = "收取卖出保理资产+" + custName + "+" + busscontno + "+" + FormatBuilder.formatMoney(vchVo.getAccamt());
//                explain = "确认+" + custName + "+" + busscontno + "+" + "利息收入";
//            }
//
//        } else if (EventTypeConst.EVENTTYPE_LSM_ZFJK == eventType) {
//            //卖出保理资产+保理申请人+合同编号+支付结清价款
//            explain = "卖出保理资产+" + custName + "+" + busscontno + "+" + "支付结清价款";
//        } else {
//            //19, 6, 3, 20 可还本,可收息
//            if (EventTypeConst.EVENTTYPE_EF_BINDIRECTPAID == eventType
//                    || EventTypeConst.EVENTTYPE_EF_ACCOUNTSBUYBACK == eventType
//                    || EventTypeConst.EVENTTYPE_LSM_SELLERPAID == eventType
//                    || EventTypeConst.LAM_APPLYANDACCEPT_ITEMID_FAIL == eventType) {
//                if (VCH_INT == vchType) {//收息
//                    //收取+借款人名称+合同号+利息
//                    if (vchVo.getSuitno().intValue() == 1) {
//                        explain = "收取+" + custName + "+" + busscontno + "+" + "利息";
//                    } else {
//                        explain = "确认+" + custName + "+" + busscontno + "+" + "利息收入";
//                    }
//
//                }
//                if (VCH_PRI == vchType) {//还本
//                    //收取+借款人名称+合同号+本金
//                    explain = "收取+" + custName + "+" + busscontno + "+" + "本金";
//                }
//
//                if (VCH_CTR == vchType) {//收入尾款
//                    explain = "收取+" + custName + "+" + busscontno + "+" + "尾款";
//                }
//
//                if (VCH_UNDEFINED == vchType) {
//                    explain = "undefined";
//                }
//            }
//
//            //98  预提
//            if (EventTypeConst.EVENTTYPE_DT_MEND_ACCRUAL == eventType) {
//                //预提当月保理利息收入
//                explain = "预提当月保理利息收入";
//            }
//
//            //2  收费/手续费
//            if (EventTypeConst.LAM_LOAN_ITEMID_MOD == eventType || EventTypeConst.EVENTTYPE_EF_TXFEECHG == eventType) {
//                //收取+客户 +合同号+手续费
//                if (StrUtil.isBlank(busscontno)) {
//                    if (vchVo.getSuitno().intValue() == 1) {
//                        explain = "收取+" + custName + "+" + "手续费";
//                    } else {
//                        explain = "确认收取+" + custName + "+" + "手续费";
//                    }
//                } else {
//                    if (vchVo.getSuitno().intValue() == 1) {
//                        explain = "收取+" + custName + "+" + busscontno + "+" + "手续费";
//                    } else {
//                        explain = "确认收取+" + custName + "+" + busscontno + "+" + "手续费";
//                    }
//                }
//            }
//
//            //767  付息
//            if (EventTypeConst.EVENTTYPE_LSM_BUYPAIDINT == eventType) {
//                //收取+项目名称+合同号+利息
//                if (vchVo.getSuitno().intValue() == 1) {
//                    explain = "收取+" + custName + "+" + busscontno + "+" + "利息";
//                } else {
//                    explain = "确认+" + custName + "+" + busscontno + "+" + "利息收入";
//                }
//
//            }
//
//            //27  保理投放
//            if (EventTypeConst.EVENTTYPE_LAM_RESULTINPUT == eventType) {
//                //投放+项目名称+合同号
//                explain = "投放+" + custName + "+" + busscontno;
//            }
//
//            //653  尾款划转 TODO
//            if (EventTypeConst.EVENTTYPE_EF_RETAINAGE_TRANS == eventType) {
//                explain = "尾款划转";
//            }
//
//            //768 月头利息反冲;冲销
//            if (EventTypeConst.EVENTTYPE_LSM_YTLXFC == eventType) {
//                explain = "冲销上月保理利息收入";
//            }
//        }
//
//
//        return explain;
//    }
//
//
//    /**
//     * 确定账务的类型
//     *
//     * @param accno
//     * @return
//     */
//    public static int decideVchType(String accno) {
//        if (ArrayUtil.contains(VCH_INT_ARR, accno)) return VCH_INT;
//
//        if (ArrayUtil.contains(VCH_PRI_ARR, accno)) return VCH_PRI;
//
//        //单位往来，为尾款
//        if ("224101".equals(accno)) {
//            return VCH_CTR;
//        }
//
//
//        return VCH_UNDEFINED;
//    }
//
//    public static String getBusscontno(List<BusinessVchManageVo> vchVoList) {
//
//        String busscontno = null;
//        for (BusinessVchManageVo vchVo : vchVoList) {
//            busscontno = vchVo.getBusscontno();
//            //从放款申请查询合同号
//            if (busscontno == null) {
//                busscontno = null;
//
//                if (StrUtil.isBlank(busscontno) && vchVo.getEventtype().intValue() == EventTypeConst.EVENTTYPE_EF_TXFEECHG) {
//                    busscontno = null;
//                } else {
//                    busscontno =null;
//                }
//            }
//
//            if (busscontno != null) {
//                return busscontno;
//            }
//        }
//
//        return busscontno;
//    }
//
//}
