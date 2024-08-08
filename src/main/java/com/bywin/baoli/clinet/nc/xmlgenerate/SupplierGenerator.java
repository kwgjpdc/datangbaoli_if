package com.bywin.baoli.clinet.nc.xmlgenerate;

import cn.hutool.core.util.XmlUtil;
import com.bywin.baoli.clinet.nc.dto.NcDto;
import com.bywin.baoli.clinet.nc.vo.SupplierUfinterfaceVo;
import com.bywin.baoli.utils.XmlUtils;

/**
 * 供应商XML生成器
 */
public class SupplierGenerator {

    /**
     * 返回供应商的xml字符
     *
     * @param code
     * @param name
     * @param billId
     * @param replace
     * @return
     */
    public static String getStrXml(NcDto ncDto) {
        String xml = XmlUtils.objCvrt2Str(composeInterceVo(ncDto));
        return XmlUtil.format(xml);
    }


    /**
     * 转换供应商xml对应的对象
     *
     * @param code
     * @param name
     * @param billId
     * @param replace
     * @return
     */
    private static SupplierUfinterfaceVo composeInterceVo(NcDto ncDto) {
        String orgCode = "null";

        SupplierUfinterfaceVo.Bill.BillHead billHead = SupplierUfinterfaceVo.Bill.BillHead.BillHeadBuilder.BillHead()
                .pk_group("1")
                .pk_org(orgCode)
                .code(ncDto.getCode())
                .name(ncDto.getName())
                .supprop("0")
                .pk_supplierclass("12")//TODO 供应商(银行) 基本分类
                .iscustomer("N")
                .isfreecust("N")
                .isoutcheck("N")
                .pk_country("CN")
                .pk_timezone("P0800")
                .pk_format("ZH-CN")
                .enablestate("2")
                .build();


        SupplierUfinterfaceVo.Bill bill = SupplierUfinterfaceVo.Bill.BillBuilder.Bill()
                .billhead(billHead)
                //取refcode
                .id(ncDto.getBillId())
                .build();

        SupplierUfinterfaceVo res = SupplierUfinterfaceVo.SupplierUfinterfaceVoBuilder.SupplierUfinterfaceVo()
                .account("003")
                .bill(bill)
                .billtype("supplier")
                .filename("")
                .groupcode("1")
                .isexchange("Y")
                .replace(ncDto.getReplace())
                .roottag("rootorg")
                .sender("DTBL01")
                .build();

        return res;
    }
}
