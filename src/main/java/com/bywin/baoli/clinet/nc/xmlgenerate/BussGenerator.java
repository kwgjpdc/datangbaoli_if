package com.bywin.baoli.clinet.nc.xmlgenerate;

import cn.hutool.core.util.XmlUtil;
import com.bywin.baoli.clinet.nc.dto.NcDto;
import com.bywin.baoli.clinet.nc.vo.BussUfinterfaceVo;
import com.bywin.baoli.utils.XmlUtils;

/**
 * 合同XML生成
 */
public class BussGenerator {


    /**
     * 返回合同的xml字符
     *
     * @return
     */
    public static String getStrXml(NcDto ncDto) {
        String xml = XmlUtils.objCvrt2Str(composeInterceVo(ncDto));
        return XmlUtil.format(xml);
    }


    /**
     * 转换合同xml对应的对象
     *
     * @return
     */
    private static BussUfinterfaceVo composeInterceVo(NcDto ncDto) {

        BussUfinterfaceVo.Bill.BillHead billHead = BussUfinterfaceVo.Bill.BillHead.newBillHead()
                .code(ncDto.getCode())
                .memo(ncDto.getMemo())
                .mnecode("")
                .name(ncDto.getName())//取合同模板名称
                .pid("")
                .pk_defdoc("")
                .pk_defdoclist(ncDto.getPkDefdoclist())
                .pk_group("1")
                .pk_org(ncDto.getPkOrg())
                .shortname(ncDto.getShortname())
                .build();


        BussUfinterfaceVo.Bill bill = BussUfinterfaceVo.Bill.newBill()
                .billhead(billHead)
                //取refcode
                .id(ncDto.getBillId())
                .build();

        BussUfinterfaceVo res = BussUfinterfaceVo.newBussUfinterfaceVo()
                .account("003")
                .billtype("defdoc")
                .businessunitcode(ncDto.getOrgCode())
                .filename("")
                .groupcode("1")
                .isexchange("Y")
                .orgcode(ncDto.getOrgCode())
                .receiver(ncDto.getOrgCode())
                .replace(ncDto.getReplace())
                .roottag("rootorg")
                //固定值
                .sender("DTBL01")
                .bill(bill)
                .build();

        return res;
    }

}
