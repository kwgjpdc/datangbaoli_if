package com.bywin.baoli.clinet.nc.xmlgenerate;


import cn.hutool.core.util.XmlUtil;
import com.bywin.baoli.clinet.nc.dto.NcDto;
import com.bywin.baoli.clinet.nc.vo.BankAccUfinterfaceVo;
import com.bywin.baoli.utils.XmlUtils;

/**
 * 银行账户XML生成器
 */
public class BankAccountGenerator {

    /**
     * 返回银行账号的xml字符
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
     * 转换银行账号xml对应的对象
     *
     * @param code
     * @param name
     * @param billId
     * @param replace
     * @return
     */
    private static BankAccUfinterfaceVo composeInterceVo(NcDto ncDto) {
        BankAccUfinterfaceVo.Bill.BillHead.Bankaccsub.Item item = BankAccUfinterfaceVo.Bill.BillHead.Bankaccsub.Item.ItemBuilder.Item()
                .pk_currtype("CNY")//只做人名币的业务
                .code(ncDto.getCode())
                .name(ncDto.getName())
                .acctype("")//TODO 账户类型，页面可选。分录编号要跟着它走
                .isconcerted("N")
                .fronzenstate("2")
                .payarea("0")
                .istrade("N")
                .build();

        BankAccUfinterfaceVo.Bill.BillHead.Bankaccsub bankAccsub = BankAccUfinterfaceVo.Bill.BillHead.Bankaccsub.BankaccsubBuilder.Bankaccsub()
                .item(item)
                .build();

        BankAccUfinterfaceVo.Bill.BillHead billHead = BankAccUfinterfaceVo.Bill.BillHead.BillHeadBuilder.billHead()
                .pk_group("1")
                .pk_org(ncDto.getPkOrg())
                .accclass("")//TODO 账户分类，待定
                .code(ncDto.getCode())
                .accnum(ncDto.getCode())
                .accname(ncDto.getName())
                .name(ncDto.getName())
                .pk_bankdoc("")//TODO 银行档案的编码 code 待定
                .pk_banktype("")//TODO 银行大行编码 待定
                .memo("")
                .accopendate("")//TODO 开户日，需要页面增加
                .arapprop("")//TODO 收付属性，需要页面增加
                .netqueryflag("2")//默认值2
                .accattribute("")//账户属性，待定
                .genebranprop("2")//总分属性， 默认2
                .accstate("2")
                .accountproperty("0")
                .memo("")//TODO2摘要
                .financeorg(ncDto.getOrgCode())
                .controlorg(ncDto.getOrgCode())
                .enablestate("2")
                .qrybalanceitf("0")
                .bankaccsub(bankAccsub)
                .build();


        BankAccUfinterfaceVo.Bill bill = BankAccUfinterfaceVo.Bill.BillBuilder.Bill()
                .billhead(billHead)
                //取refcode
                .id(ncDto.getBillId())
                .build();

        BankAccUfinterfaceVo res = BankAccUfinterfaceVo.BankAccUfinterfaceVoBuilder.BankAccUfinterfaceVo()
                .account("003")
                .bill(bill)
                .billtype("bankaccbas")
                .filename("")
                .receiver(ncDto.getOrgCode())
                .isexchange("Y")
                .replace(ncDto.getReplace())
                .roottag("rootorg")
                .sender("DTBL01")
                .build();

        return res;
    }
}
