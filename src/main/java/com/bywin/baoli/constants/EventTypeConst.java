/**
\ * 创建于: 2013-11-08 下午14:36:14<br>
 * 所属项目:CSPS(保理公司保理系统)
 * 文件名称:EventTypeConst.java
 * 作者:leon.du
 * 版权信息: 版权所有 © 2001-2013 天逸财金科技服务(武汉)有限公司
 */
package com.bywin.baoli.constants;

/**
 * 
 * 类功能描述：交易型态常量类
 * @className EventTypeConst.java
 * @author leon.du
 * @version 0.1.0
 * @history 2013-11-8 leon.du 创建EventTypeConst.java
 * [1.0]20170828 Karen add 增加出口进口相关交易的交易型态常量<br>
 */
public class EventTypeConst {
	/**
	 * 开票信息
	 */
	public static final int EVENTTYPE_ISSUE_VBTXTAXM = 724;
	/**
	 * 税金发票
	 */
	public static final int EVENTTYPE_ISSUE_VBTXTAXINVM = 725;
	
	/**
	 * 资产销售
	 */
	public static final int EVENTTYPE_ASSETSALE = 726;

    // =========================保理业务模块交易型态常量begin=====================//
    /**
     * EF-发票转让
     */
    public static final int EVENTTYPE_EF_INVTRANS = 1;

    /**
     * EF-买方还款
     */
    public static final int EVENTTYPE_EF_BUYERPAID = 3;

    /**
     * EF-商纠设定
     */
    public static final int EVENTTYPE_EF_DISPUTE = 4;

    /**
     * EF-商纠解除
     */
    public static final int EVENTTYPE_EF_RESOLVE = 5;
    /**
     * PIT-应收账款转让
     */
    public static final int INI_PIT_INVTRANS = 762;
    /**
     * PIT-应收账款确认
     */
    public static final int INI_PIT_INVCONFIRM = 763;
    /**
     * EF-转呆交易
     */
//    public static final int EVENTTYPE_EF_TXCHGBAD = 7;

    /**
     * EF-应收账款调整
     */
    public static final int EVENTTYPE_EF_INVEXP = 8;

    /**
     * EF-管理费汇出
     */
    public static final int EVENTTYPE_EF_MAGFEEOUT = 9;

    /**
     * EF-担保付款
     */
    public static final int EVENTTYPE_EF_ASSPAY = 12;

    /**
     * EF-资料变更
     */
    public static final int EVENTTYPE_EF_DOCCHG = 15;

    /**
     * EF-管理费汇出—WAIVED
     */
    public static final int EVENTTYPE_EF_MAGFEEOUT_WAIVED = 16;

    /**
     * EF-贷项通知
     */
    public static final int EVENTTYPE_EF_INVNOTICE = 18;

    /**
     * EF-账款买回
     */
    public static final int EVENTTYPE_EF_ACCOUNTSBUYBACK = 19;

    /**
     * EF-间接还款
     */
    public static final int EVENTTYPE_EF_BINDIRECTPAID = 20;

    /**
     * EF-费用管理
     */
    public static final int EVENTTYPE_EF_TXFEECHG = 21;
    
	    /**
	     * EF-费用管理-调整
	     */
	    public static final int EF_TXFEECHG_ITEMID_MOD = 1;
	    
	    /**
	     * EF-费用管理-新增
	     */
	    public static final int EF_TXFEECHG_ITEMID_ADD = 2;
	    
	    /**
	     * EF-费用管理-收/支
	     */
	    public static final int EF_TXFEECHG_ITEMID_COLLECT = 3;
    
	    /**
	     * EF-费用管理-退费
	     */
	    public static final int EF_TXFEECHG_ITEMID_REFUND = 4;
	    
	    /**
	     * EF-费用管理-费用索付(生成报文)
	     */
	    public static final int EF_TXFEECHG_ITEMID_GENERATE = 5;

    /**
     * EF-受让融资
     */
    public static final int EVENTTYPE_EF_INVREGLOAN = 22;


    /**
     * EF-发票管理
     */
    public static final int EVENTTYPE_EF_INVMGR = 26;
    
    /**
     * 应收账款确认
     */
    public static final int EVENTTYPE_EF_INVCONFIRM = 651;
    
    /**
     * 担保关系维护
     */
    public static final int EVENTTYPE_EF_GURM = 30;
    
    /**
     * 人行登记记录维护
     */
    public static final int EVENTTYPE_INV_CREDIT_REGIST = 652;
    
    /**尾款划转
     */
    public static final int EVENTTYPE_EF_RETAINAGE_TRANS = 653;
    
    /**
     * 补转让
     */
    public static final int EVENTTYPE_EF_RETRANS = 654;
    
    /**
     * 坏账核销
     */
    public static final int EVENTTYPE_EF_CTCB = 656;
    
    // =========================保理业务模块交易型态常量end=====================//
    
    
    // =========================放款管理交易型态常量begin=====================//
    /**
     * 放款申请
     */
    public static final int EVENTTYPE_LAM_LOAN = 2;
    
	    /**
	     * 放款申请-新增
	     */
	    public static final int LAM_LOAN_ITEMID_NEW = 1;
	    
	    /**
	     * 放款申请-修改
	     */
	    public static final int LAM_LOAN_ITEMID_MOD = 2;
	    
	    /**
	     * 放款申请-删除
	     */
	    public static final int LAM_LOAN_ITEMID_DEL = 3;

    /**
     * 申请受理
     */
    public static final int EVENTTYPE_LAM_APPLYACCEPT = 17;
    
    
	    /**
	     * 申请受理-同意/成功
	     */
	    public static final int LAM_APPLYACCEPT_ITEMID_SUCCESS = 1;
	    
	    /**
	     * 申请受理-有条件同意
	     */
	    public static final int LAM_APPLYACCEPT_ITEMID_CONITIONALACCEPT = 2;
	    
	    /**
	     * 申请受理-拒绝/失败
	     */
	    public static final int LAM_APPLYACCEPT_ITEMID_FAIL = 3;
	    
	    /**
	     * 成功并且 利息本金外扣收标记4
	     */
	    public static final int LAM_APPLYACCEPT_ITEMID_SUCCESS_OUT_INT = 4;

    

    /**
     * 结果录入
     */
    public static final int EVENTTYPE_LAM_RESULTINPUT = 27;

	    /**
	     * 结果录入-放款成功
	     */
	    public static final int LAM_RESULTINPUT_ITEMID_SUCCESS = 1;
	
	    /**
	     * 结果录入-放款失败
	     */
	    public static final int LAM_RESULTINPUT_ITEMID_FAILUE = 2;
    
    
    /**
     * 放款信息补录
     */
    public static final int EVENTTYPE_LAM_LOANAPPLYSUPPLY= 657;
    
    /**
     * 放款申请并受理
     */
    public static final int EVENTTYPE_LAM_APPLYANDACCEPT = 660;
    
	    /**
	     * 放款申请并受理-同意
	     */
	    public static final int LAM_APPLYANDACCEPT_ITEMID_SUCCESS = 1;
	    
	    /**
	     * 放款申请并受理-有条件同意
	     */
	    public static final int LAM_APPLYANDACCEPT_ITEMID_CONITIONALACCEPT = 2;
	    
	    /**
	     * 放款申请并受理-拒绝
	     */
	    public static final int LAM_APPLYANDACCEPT_ITEMID_FAIL = 3;
    
    /**
     * 垫款发放
     */
    public static final int EVENTTYPE_ADV_HANDOUT = 658;
    
    /**
     * 垫款收回
     */
    public static final int EVENTTYPE_ADV_PAID = 659;
    

    // =========================放款管理交易型态常量end=====================//

    // =========================贷后管理交易型态常量begin=====================//

    /**
     * 借款人还款
     */
    public static final int EVENTTYPE_LSM_SELLERPAID = 6;

    /**
     * 利率变更
     */
    public static final int EVENTTYPE_LSM_RATECHG = 10;

    /**
     * 利息调整
     */
    public static final int EVENTTYPE_LSM_INT_ADJUST = 11;

    /**
     * 融资转型态
     */
    public static final int EVENTTYPE_LSM_LOAN_ALTER = 13;

    /**
     * 风险分类
     */
    public static final int EVENTTYPE_LSM_INVFIVETYPE = 14;

    /**
     * 展期
     */
    public static final int EVENTTYPE_LSM_LOANEXTEND = 504;

    /**
     * 放款转呆
     */
    public static final int EVENTTYPE_LSM_LOANCHGBAD = 721;
    
    /**
     * 放款检查记录
     */
    public static final int EVENTTYPE_LSM_LOANCHKRECORD = 722;

    /**
     * 融资到期日调整
     */
    public static final int EVENTTYPE_LSM_LOANDUEDATECHG = 655;
    
    /**
     * 客户检查记录
     */
    public static final int EVENTTYPE_LSM_CUSTCHECK = 723;
    

    // =========================贷后管理交易型态常量end=====================//

    // =========================贷前模块交易型态常量begin=====================//
    /**
     * LBM客户营销
     */
    public static final int EVENTTYPE_LBM_CUSTOMMARKED = 700;

    /**
     * LBM业务申请
     */
    public static final int EVENTTYPE_LBM_APPL = 701;

    /**
     * LBM调查报告
     */
    public static final int EVENTTYPE_LBM_INQ = 702;

    /**
     * LBM额度审批
     */
    public static final int EVENTTYPE_LBM_APPCL = 703;

    /**
     * LBM业务方案
     */
    public static final int EVENTTYPE_LBM_BUSPLAN = 704;

    /**
     * 业务合同
     */
    public static final int EVENTTYPE_LBM_BUSCONTRACT = 705;
    
    /**
     * 授信调查文审
     */
    public static final int EVENTTYPE_LBM_INQCHECK = 706;
    

    // =========================贷前模块交易型态常量end=====================//
    
    // =========================客户管理快速通道交易型态常量begin=====================//
    /**
     * LBM客户营销
     */
    public static final int EVENTTYPE_BPA_FUD = 741;

    // =========================客户管理快速通道交易型态常量end=====================//
    
    // =========================保理票据交易型态常量 Start =====================//
    /**
     * EF-票据兑付
     */
    public static final int EVENTTYPE_EF_BILLCASH = 24;

    /**
     * EF-票据管理
     */
    public static final int EVENTTYPE_EF_BILLMGR = 25;
    
	    /**
	     * 票据管理-新增
	     */
	    public static final int EF_BILLMGR_ITEMID_NEW = 1;
	    
	    /**
	     * 票据管理-修改
	     */
	    public static final int EF_BILLMGR_ITEMID_MOD = 2;
	    
	    /**
	     * 票据管理-删除
	     */
	    public static final int EF_BILLMGR_ITEMID_DEL = 3;
	    
	    /**
	     * 票据管理-电查
	     */
	    public static final int EF_BILLMGR_ITEMID_ELECTRICCHECK = 4;
	    
	    /**
	     * 发票回款冲销[BILL]
	     */
	    public static final int BILL_BUYERPAID = 160;
	    
	    
	    /**
	     * 间接还款[BILL]
	     */
	    public static final int BILL_INDIRECT_PAY = 161;
	    
	    /**
	     * 账款买回[BILL]
	     */
	    public static final int BILL_ACCOUNTSBUYBACK = 162;
	    
	    /**
	     * 担保付款[BILL]
	     */
	    public static final int BILL_ASSPAY = 163;
	    
	    /**
	     * 坏账核销[BILL]
	     */
	    public static final int BILL_TXCHGBAD = 164;
	    
	// =========================保理票据交易型态常量 end =====================// 

    // =========================反向保理模块交易形态常量begin==================//
	    /**
	     * 电子签章确认[反向保理]2017-05-08
	     */
	    public static final int EVENTTYPE_RF_EDOCCONFIRM= 61;
	    
	    /**
	     * 电子函证回款冲销[反向保理]
	     */
	    public static final int EVENTTYPE_RF_BUYERPAID = 62;
	    
	    /**
	     * 电子函证回款拆分[反向保理]
	     */
	    public static final int EVENTTYPE_RF_BREAKUP = 63;
	    
	 // =========================反向保理模块交易形态常量end====================//   
	    
	 // =========================信保保理交易型态常量 begin =====================//     
	    
	    /**
	     * 发票回款冲销[信保]
	     */
	    public static final int INS_BUYERPAID = 507;
	    
	    /**
	     * 间接付款[信保]
	     */
	    public static final int INS_BINDIRECTPAID = 508;
	    
	    /**
	     * 账款买回[信保]
	     */
	    public static final int INS_ACCOUNTSBUYBACK = 509;
	    
	    /**
	     * 担保付款[信保]
	     */
	    public static final int INS_ASSPAY = 510;
	    
	    /**
	     * 申请保险理赔[信保]
	     */
	    public static final int INS_APPISURANCEPAY = 500;
	    
	    /**
	     * 申请保险理赔补充或变更[信保]
	     */
	    public static final int INS_APPISURANCEPAY_CHG = 501;
	    
	    /**
	     * 保险公司赔款[信保]
	     */
	    public static final int INS_INCPAID = 511;
	    
	    /**
	     * 保险免责[信保]
	     */
	    public static final int INS_ISIMPUNITY = 502;
	    
	    /**
	     * 保险免责变更[信保]
	     */
	    public static final int INS_ISIMPUNITY_CHG = 503;
	    
	    
	 // =========================信保保理交易型态常量 end =====================// 
    
    

    // =========================ARFP模块交易型态常量begin=====================//

    /**
     * 发票转让/质押入池
     */
    public static final int EVENTTYPE_ARFP_INVTRANS = 101;

    /**
     * 强制入池
     */
    public static final int EVENTTYPE_ARFP_INVALIDINVTRANS = 102;

    /**
     * 强制出池[ARFP]
     */
    public static final int EVENTTYPE_ARFP_FORCEOUTPOOL = 103;

    /**
     * 池水位监控
     */
    public static final int EVENTTYPE_ARFP_CASHACTCHG = 104;

    /**
     * 现金池资金支取
     */
    public static final int EVENTTYPE_ARFP_CASHMONEYDRAW = 105;
    /**
     * 发票回款冲销[池融资]
     */
    public static final int ARFP_BUYERPAID = 106;
    /**
     * 发票回款冲销[收益权]
     */
    public static final int PIT_BUYERPAID = 110;
    /**
     * 应收账款余额更新[收益权]
     */
    public static final int INI_PIT_BALANCERENEWAL = 761;
    /**
     * 间接付款[池融资]
     */
    public static final int ARFP_BINDIRECTPAID = 107;
    
    /**
     * 账款买回[池融资]
     */
    public static final int ARFP_ACCOUNTSBUYBACK = 108;
    
    /**
     * 担保付款[池融资]
     */
    public static final int ARFP_ASSPAY = 109;
    
    /**
     * 担保付款[收益权]
     */
    public static final int PIT_ASSPAY = 111;

    // =========================ARFP模块交易型态常量end=====================//

    // =========================帐款模块交易型态常量begin=====================//
    /**
     * 客户额度设定
     */
    public static final int EVENTTYPE_CL_CUSTCL = 28;

	    /**
	     * 客户额度设定－新增
	     */
	    public static final int CL_CUSTCL_ITEMID_NEW = 1;
	
	    /**
	     * 客户额度设定－修改
	     */
	    public static final int CL_CUSCL_ITEMID_MOD = 2;
	
	    /**
	     * 客户额度设定－删除
	     */
	    public static final int CL_CUSCL_ITEMID_DEL = 3;
	
	    /**
	     * 客户额度设定－额度到期
	     */
	    public static final int CL_CUSCL_ITEMID_EXPIRY = 4;

    /**
     * 第三方额度设定
     */
    public static final int EVENTTYPE_CL_IMPCL = 29;
    
	    /**
	     * 帐款管理商额度－新增
	     */
	    public static final int CL_IMPCL_ITEMID_NEW = 1;
	
	    /**
	     * 帐款管理商额度－修改
	     */
	    public static final int CL_IMPCL_ITEMID_MOD = 2;
	
	    /**
	     * 帐款管理商额度－删除
	     */
	    public static final int CL_IMPCL_ITEMID_DEL = 3;
	
	    /**
	     * 帐款管理商额度－额度到期
	     */
	    public static final int CL_IMPCL_ITEMID_EXPIRY = 4;
    


    // =========================帐款模块交易型态常量end=====================//

    // =========================日终交易型态常量begin=====================//
    /**
     * 风险分类(日终)
     */
    public static final int EVENTTYPE_DT_RISKTYPE = 91;

    /**
     * 结息
     */
    public static final int EVENTTYPE_DT_DAILYTASK = 92;

    /**
     * EF-欠息90天结转处理
     */
    public static final int EVENTTYPE_DT_DEBITINT = 93;

    /**
     * 卖方还款(日终)
     */
    public static final int EVENTTYPE_DT_SELLERPAID = 94;

    /**
     * 融资转型态(日终)
     */
    public static final int EVENTTYPE_DT_LOAN_ALTER = 95;

    /**
     * EF-IF额度到期处理
     */
    public static final int EVENTTYPE_DT_EFIFCL_EXPIRY = 96;

    /**
     * EF-客户额度到期处理
     */
    public static final int EVENTTYPE_DT_EFCUSTCL_EXPIRY = 97;

    /**
     * 保理商额度设定－额度到期
     */
    public static final int CL_IMP_ITEMID_EXPIRY = 4;

    /**
     * 融资池额度到期
     */
    public static final int EVENTTYPE_DT_ARFPCUSTCL_EXPIRY = 112;

    /**
     * 预收利息分摊处理
     */
    public static final int EVENTTYPE_DT_CUSCRLNDUE = 98;

    /**
     * 利息提列处理
     */
    public static final int EVENTTYPE_DT_MEND_ACCRUAL = 99;

    /**
     * 自动出池[ARFP]
     */
    public static final int EVENTTYPE_DT_AUTOOUTPOOL = 113;

    // =========================日终交易型态常量end=====================//
    
    //=========================[1.0]EDI交易型态常量end=====================//
    public static final int EVENTTYPE_EDI_EFI_BEFOREAPPLY = 313;//出口-额度申请-预申请
    public static final int EVENTTYPE_EDI_EFI_FORMALAPPLY = 314;//出口-额度申请-正式申请
    public static final int EVENTTYPE_EDI_EFI_CLREPLAY =315;//出口-额度申请-初评回复
    public static final int EVENTTYPE_EDI_EFI_CLAPPROVE = 316;//出口-额度申请-正式核准
    public static final int EVENTTYPE_EDI_EFI_CHANGE_APP= 317;//出口-额度变更-变更申请 
    public static final int EVENTTYPE_EDI_EFI_CHANGE_REG = 318;//出口-额度变更-变更登记
    public static final int EVENTTYPE_EDI_EFI_BJTZ = 319;//出口-报价调整
    public static final int EVENTTYPE_EDI_EFI_FPMSGDR = 320;//出口-发票MSG导入
    public static final int EVENTTYPE_EDI_EFI_DEBTCLT = 321;//出口-账款催收
    
    public static final int EVENTTYPE_EDI_IFI_BEFOREAPPLY = 350;//进口-额度申请-预申请
    public static final int EVENTTYPE_EDI_IFI_FORMALAPPLY = 351;//进口-额度申请-正式申请
    public static final int EVENTTYPE_EDI_IFI_CLREPLAY = 352;//进口-额度申请-初步核准
    public static final int EVENTTYPE_EDI_IFI_CLAPPROVE = 353;//进口-额度申请-正式核准
    public static final int EVENTTYPE_EDI_IFI_CHANGE_APP= 354;//进口-额度变更-变更受理 
    public static final int EVENTTYPE_EDI_IFI_CHANGE_REG = 355;//进口-额度变更-变更登记
    public static final int EVENTTYPE_EDI_IFI_BJTZ = 356;//进口-报价调整
    
    //=========================EDI交易型态常量end=====================// 
    
    /**
     * LSM-买方利息还款
     */
    public static final int EVENTTYPE_LSM_BUYPAIDINT = 767;
    
    /**
     * 月头利息反冲
     */
    public static final int EVENTTYPE_LSM_YTLXFC = 768;
    
    /**
     * 卖出保理资产
     */
    public static final int EVENTTYPE_LSM_MCBLZC = 769;
    
    /**
     * 收对价款
     */
    public static final int EVENTTYPE_LSM_SDJK = 770;
    
    /**
     *  项目回款
     */
    public static final int EVENTTYPE_LSM_XMHK = 771;
    
    /**
     * 转付价款
     */
    public static final int EVENTTYPE_LSM_ZFJK = 772;
}
