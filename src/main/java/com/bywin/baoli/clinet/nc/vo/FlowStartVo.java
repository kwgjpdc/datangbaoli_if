package com.bywin.baoli.clinet.nc.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FlowStartVo implements Serializable{
	/**
	 * treeid，从哪个树上去取流程key
	 */
	private String stTreeid;
	/**
	 * 
	 */
	private static final long serialVersionUID = -7422902092541954476L;
	
	/**
	 * 流程实例id
	 */
	private String processId;
	
	/**
	 * 流程类型
	 * 参数、静态参数、交易
	 */
	private String processType;
	/**
	 * 任务id
	 */
	private String taskId;
	
	/**
	 * 业务属性描述
	 * (用于流程列表中显示业务关键信息,需要前台传递)
	 */
	private String bussProDesc;
	
	/**
     * 当前功能动作代号
     */
    private String funId;
    
    /**
     * 
     */
    private String submitFunId;
    /**
     * 当前操作者所属分行字串
     */
    private String currentUserBchidStr;
    
    /**
	 * 需保存在流程引擎中的业务属性对应的Key
	 * (其实就是业务对象中的属性名)
	 */
	private List<String> storeFiledList;
	
	/**
	 * 任务类型(待办、打回、拒绝)
	 */
	private String taskType;
	
	/**
	 * 业务功能URL
	 */
	private String formURL;
	
	/**
	 * 业务服务类
	 */
	private String handleService;
	
	/**
	 * 关键内容
	 */
	private String summaryContext;
	/**
	 * 客户名称
	 */
	private String bchdesc;
	
	/**
     * 审核人
     */
    private String approveuser;
    
    /**
     * 审核代理人
     */
    private String appagentuser;

    /**
     * 审核时间
     */
    private Date approvedate;
	
	/**
	 * 获取bchdesc.
	 * @return the bchdesc
	 */
    
    /**
	 * d表操作标记（判断对D表是新增还是修改）
	 */
	private String dflag;
	public String getBchdesc() {
		return bchdesc;
	}

	/**
	 * 设置bchdesc.
	 * @param newbchdesc the bchdesc to set
	 */
	public void setBchdesc(String bchdesc) {
		this.bchdesc = bchdesc;
	}

	/**
	 * 获取processType.
	 * @return the processType
	 */
	public String getProcessType() {
		return processType;
	}

	/**
	 * 设置processType.
	 * @param newprocessType the processType to set
	 */
	public void setProcessType(String processType) {
		this.processType = processType;
	}

	/**
	 * 获取summaryContext.
	 * @return the summaryContext
	 */
	public String getSummaryContext() {
		return summaryContext;
	}

	/**
	 * 设置summaryContext.
	 * @param newsummaryContext the summaryContext to set
	 */
	public void setSummaryContext(String summaryContext) {
		this.summaryContext = summaryContext;
	}

	/**
	 * 获取submitFunId.
	 * @return the submitFunId
	 */
	public String getSubmitFunId() {
		return submitFunId;
	}

	/**
	 * 设置submitFunId.
	 * @param newsubmitFunId the submitFunId to set
	 */
	public void setSubmitFunId(String submitFunId) {
		this.submitFunId = submitFunId;
	}

	/**
	 * @return the processId
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public List<String> getStoreFiledList() {
		return storeFiledList;
	}

	public void setStoreFiledList(List<String> storeFiledList) {
		this.storeFiledList = storeFiledList;
	}

	public String getBussProDesc() {
		return bussProDesc;
	}

	public void setBussProDesc(String bussProDesc) {
		this.bussProDesc = bussProDesc;
	}

	public String getFunId() {
		return funId;
	}

	public void setFunId(String funId) {
		this.funId = funId;
	}

	public String getCurrentUserBchidStr() {
		return currentUserBchidStr;
	}

	public void setCurrentUserBchidStr(String currentUserBchidStr) {
		this.currentUserBchidStr = currentUserBchidStr;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getFormURL() {
		return formURL;
	}

	public void setFormURL(String formURL) {
		this.formURL = formURL;
	}

	public String getHandleService() {
		return handleService;
	}

	public void setHandleService(String handleService) {
		this.handleService = handleService;
	}

	public String getApproveuser() {
		return approveuser;
	}

	public void setApproveuser(String approveuser) {
		this.approveuser = approveuser;
	}

	public String getAppagentuser() {
		return appagentuser;
	}

	public void setAppagentuser(String appagentuser) {
		this.appagentuser = appagentuser;
	}

	public Date getApprovedate() {
		return approvedate;
	}

	public void setApprovedate(Date approvedate) {
		this.approvedate = approvedate;
	}

	/**
	 * @return the dflag
	 */
	public String getDflag() {
		return dflag;
	}

	/**
	 * @param dflag the dflag to set
	 */
	public void setDflag(String dflag) {
		this.dflag = dflag;
	}

	/**
	 * @return the stTreeid
	 */
	public String getStTreeid() {
		return stTreeid;
	}

	/**
	 * @param stTreeid the stTreeid to set
	 */
	public void setStTreeid(String stTreeid) {
		this.stTreeid = stTreeid;
	}

	
}
