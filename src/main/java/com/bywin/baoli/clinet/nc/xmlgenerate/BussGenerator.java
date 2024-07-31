package com.bywin.baoli.clinet.nc.xmlgenerate;

import cn.hutool.core.util.XmlUtil;
import com.bywin.baoli.clinet.nc.vo.BussUfinterfaceVo;
import com.bywin.baoli.utils.XmlUtils;

/**
 * 合同XML生成
 */
public class BussGenerator {

    /**
     * 返回合同的xml字符
     *
     * @param code
     * @param name
     * @param billId
     * @param defdoc
     * @param replace
     * @return
     */
    public static String getStrXml(String code, String name, String billId, String defdoc, String replace) {
        String xml = XmlUtils.objCvrt2Str(composeInterceVo(code, name, billId, defdoc, replace));
        return XmlUtil.format(xml);
    }


    /**
     * 转换合同xml对应的对象
     *
     * @param code
     * @param name
     * @param billId
     * @param defdoc
     * @param replace
     * @return
     */
    private static BussUfinterfaceVo composeInterceVo(String code, String name, String billId, String defdoc, String replace) {
        String orgCode = null;
        String sender = null;

        BussUfinterfaceVo.Bill.BillHead billHead = BussUfinterfaceVo.Bill.BillHead.newBillHead()
                .code(code)
                .memo("")
                .mnecode("")
                .name(name)//取合同模板名称
                .pid("")
                .pk_defdoc("")
                .pk_defdoclist(defdoc)
                .pk_group("1")
                .pk_org(orgCode)
                .shortname("")
                .build();


        BussUfinterfaceVo.Bill bill = BussUfinterfaceVo.Bill.newBill()
                .billhead(billHead)
                //取refcode
                .id(billId)
                .build();

        BussUfinterfaceVo res = BussUfinterfaceVo.newBussUfinterfaceVo()
                .account("003")
                .bill(bill)
                .billtype("defdoc")
                .businessunitcode(orgCode)
                .filename("")
                .groupcode("1")
                .isexchange("Y")
                .orgcode(orgCode)
                .receiver(orgCode)
                .replace(replace)
                .roottag("rootorg")
                .sender(sender)
                .build();

        return res;
    }

}
