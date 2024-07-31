package com.bywin.baoli.clinet.nc.vo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 供应商xml
 */
@XmlRootElement(name = "ufinterface")
public class SupplierUfinterfaceVo {


    @XmlAttribute(name = "account")
    private String account;

    @XmlAttribute(name = "billtype")
    private String billtype;

    @XmlAttribute(name = "filename")
    private String filename;

    @XmlAttribute(name = "groupcode")
    private String groupcode;

    @XmlAttribute(name = "replace")
    private String replace;

    @XmlAttribute(name = "roottag")
    private String roottag;

    @XmlAttribute(name = "isexchange")
    private String isexchange;

    @XmlAttribute(name = "sender")
    private String sender;

    @XmlElement(name = "bill")
    private Bill bill;


    public static class Bill {
        @XmlAttribute(name = "id")
        private String id;

        @XmlElement(name = "billhead")
        private BillHead billhead;

        public static final class BillBuilder {
            private String id;
            private BillHead billhead;

            private BillBuilder() {
            }

            public static BillBuilder Bill() {
                return new BillBuilder();
            }

            public BillBuilder id(String id) {
                this.id = id;
                return this;
            }

            public BillBuilder billhead(BillHead billhead) {
                this.billhead = billhead;
                return this;
            }

            public Bill build() {
                Bill bill = new Bill();
                bill.id = this.id;
                bill.billhead = this.billhead;
                return bill;
            }
        }

        public static class BillHead {


            @XmlElement(name = "pk_group")
            private String pk_group;

            @XmlElement(name = "pk_org")
            private String pk_org;

            @XmlElement(name = "code")
            private String code;

            @XmlElement(name = "name")
            private String name;

            @XmlElement(name = "shortname")
            private String shortname;

            @XmlElement(name = "ename")
            private String ename;

            @XmlElement(name = "mnecode")
            private String mnecode;

            @XmlElement(name = "trade")
            private String trade;

            @XmlElement(name = "pk_supplier_main")
            private String pk_supplier_main;

            @XmlElement(name = "memo")
            private String memo;

            @XmlElement(name = "supprop")
            private String supprop;

            @XmlElement(name = "pk_areacl")
            private String pk_areacl;

            @XmlElement(name = "pk_supplierclass")
            private String pk_supplierclass;

            @XmlElement(name = "iscustomer")
            private String iscustomer;

            @XmlElement(name = "corcustomer")
            private String corcustomer;

            @XmlElement(name = "isfreecust")
            private String isfreecust;

            @XmlElement(name = "isoutcheck")
            private String isoutcheck;

            @XmlElement(name = "pk_financeorg")
            private String pk_financeorg;

            @XmlElement(name = "taxpayerid")
            private String taxpayerid;

            @XmlElement(name = "registerfund")
            private String registerfund;

            @XmlElement(name = "legalbody")
            private String legalbody;

            @XmlElement(name = "ecotypesincevfive")
            private String ecotypesincevfive;

            @XmlElement(name = "pk_suptaxes")
            private String pk_suptaxes;

            @XmlElement(name = "zipcode")
            private String zipcode;

            @XmlElement(name = "url")
            private String url;


            @XmlElement(name = "tel1")
            private String tel1;

            @XmlElement(name = "tel2")
            private String tel2;

            @XmlElement(name = "tel3")
            private String tel3;

            @XmlElement(name = "fax1")
            private String fax1;

            @XmlElement(name = "fax2")
            private String fax2;

            @XmlElement(name = "email")
            private String email;

            @XmlElement(name = "pk_country")
            private String pk_country;

            @XmlElement(name = "pk_timezone")
            private String pk_timezone;

            @XmlElement(name = "pk_format")
            private String pk_format;

            @XmlElement(name = "enablestate")
            private String enablestate;


            public static final class BillHeadBuilder {
                private String pk_group;
                private String pk_org;
                private String code;
                private String name;
                private String shortname;
                private String ename;
                private String mnecode;
                private String trade;
                private String pk_supplier_main;
                private String memo;
                private String supprop;
                private String pk_areacl;
                private String pk_supplierclass;
                private String iscustomer;
                private String corcustomer;
                private String isfreecust;
                private String isoutcheck;
                private String pk_financeorg;
                private String taxpayerid;
                private String registerfund;
                private String legalbody;
                private String ecotypesincevfive;
                private String pk_suptaxes;
                private String zipcode;
                private String url;
                private String tel1;
                private String tel2;
                private String tel3;
                private String fax1;
                private String fax2;
                private String email;
                private String pk_country;
                private String pk_timezone;
                private String pk_format;
                private String enablestate;

                private BillHeadBuilder() {
                }

                public static BillHeadBuilder BillHead() {
                    return new BillHeadBuilder();
                }

                public BillHeadBuilder pk_group(String pk_group) {
                    this.pk_group = pk_group;
                    return this;
                }

                public BillHeadBuilder pk_org(String pk_org) {
                    this.pk_org = pk_org;
                    return this;
                }

                public BillHeadBuilder code(String code) {
                    this.code = code;
                    return this;
                }

                public BillHeadBuilder name(String name) {
                    this.name = name;
                    return this;
                }

                public BillHeadBuilder shortname(String shortname) {
                    this.shortname = shortname;
                    return this;
                }

                public BillHeadBuilder ename(String ename) {
                    this.ename = ename;
                    return this;
                }

                public BillHeadBuilder mnecode(String mnecode) {
                    this.mnecode = mnecode;
                    return this;
                }

                public BillHeadBuilder trade(String trade) {
                    this.trade = trade;
                    return this;
                }

                public BillHeadBuilder pk_supplier_main(String pk_supplier_main) {
                    this.pk_supplier_main = pk_supplier_main;
                    return this;
                }

                public BillHeadBuilder memo(String memo) {
                    this.memo = memo;
                    return this;
                }

                public BillHeadBuilder supprop(String supprop) {
                    this.supprop = supprop;
                    return this;
                }

                public BillHeadBuilder pk_areacl(String pk_areacl) {
                    this.pk_areacl = pk_areacl;
                    return this;
                }

                public BillHeadBuilder pk_supplierclass(String pk_supplierclass) {
                    this.pk_supplierclass = pk_supplierclass;
                    return this;
                }

                public BillHeadBuilder iscustomer(String iscustomer) {
                    this.iscustomer = iscustomer;
                    return this;
                }

                public BillHeadBuilder corcustomer(String corcustomer) {
                    this.corcustomer = corcustomer;
                    return this;
                }

                public BillHeadBuilder isfreecust(String isfreecust) {
                    this.isfreecust = isfreecust;
                    return this;
                }

                public BillHeadBuilder isoutcheck(String isoutcheck) {
                    this.isoutcheck = isoutcheck;
                    return this;
                }

                public BillHeadBuilder pk_financeorg(String pk_financeorg) {
                    this.pk_financeorg = pk_financeorg;
                    return this;
                }

                public BillHeadBuilder taxpayerid(String taxpayerid) {
                    this.taxpayerid = taxpayerid;
                    return this;
                }

                public BillHeadBuilder registerfund(String registerfund) {
                    this.registerfund = registerfund;
                    return this;
                }

                public BillHeadBuilder legalbody(String legalbody) {
                    this.legalbody = legalbody;
                    return this;
                }

                public BillHeadBuilder ecotypesincevfive(String ecotypesincevfive) {
                    this.ecotypesincevfive = ecotypesincevfive;
                    return this;
                }

                public BillHeadBuilder pk_suptaxes(String pk_suptaxes) {
                    this.pk_suptaxes = pk_suptaxes;
                    return this;
                }

                public BillHeadBuilder zipcode(String zipcode) {
                    this.zipcode = zipcode;
                    return this;
                }

                public BillHeadBuilder url(String url) {
                    this.url = url;
                    return this;
                }

                public BillHeadBuilder tel1(String tel1) {
                    this.tel1 = tel1;
                    return this;
                }

                public BillHeadBuilder tel2(String tel2) {
                    this.tel2 = tel2;
                    return this;
                }

                public BillHeadBuilder tel3(String tel3) {
                    this.tel3 = tel3;
                    return this;
                }

                public BillHeadBuilder fax1(String fax1) {
                    this.fax1 = fax1;
                    return this;
                }

                public BillHeadBuilder fax2(String fax2) {
                    this.fax2 = fax2;
                    return this;
                }

                public BillHeadBuilder email(String email) {
                    this.email = email;
                    return this;
                }

                public BillHeadBuilder pk_country(String pk_country) {
                    this.pk_country = pk_country;
                    return this;
                }

                public BillHeadBuilder pk_timezone(String pk_timezone) {
                    this.pk_timezone = pk_timezone;
                    return this;
                }

                public BillHeadBuilder pk_format(String pk_format) {
                    this.pk_format = pk_format;
                    return this;
                }

                public BillHeadBuilder enablestate(String enablestate) {
                    this.enablestate = enablestate;
                    return this;
                }

                public BillHead build() {
                    BillHead billHead = new BillHead();
                    billHead.pk_suptaxes = this.pk_suptaxes;
                    billHead.code = this.code;
                    billHead.corcustomer = this.corcustomer;
                    billHead.pk_financeorg = this.pk_financeorg;
                    billHead.pk_org = this.pk_org;
                    billHead.tel3 = this.tel3;
                    billHead.pk_supplier_main = this.pk_supplier_main;
                    billHead.isoutcheck = this.isoutcheck;
                    billHead.pk_timezone = this.pk_timezone;
                    billHead.name = this.name;
                    billHead.pk_country = this.pk_country;
                    billHead.ename = this.ename;
                    billHead.mnecode = this.mnecode;
                    billHead.ecotypesincevfive = this.ecotypesincevfive;
                    billHead.fax2 = this.fax2;
                    billHead.enablestate = this.enablestate;
                    billHead.supprop = this.supprop;
                    billHead.tel1 = this.tel1;
                    billHead.email = this.email;
                    billHead.pk_group = this.pk_group;
                    billHead.url = this.url;
                    billHead.pk_format = this.pk_format;
                    billHead.taxpayerid = this.taxpayerid;
                    billHead.iscustomer = this.iscustomer;
                    billHead.pk_supplierclass = this.pk_supplierclass;
                    billHead.shortname = this.shortname;
                    billHead.legalbody = this.legalbody;
                    billHead.isfreecust = this.isfreecust;
                    billHead.zipcode = this.zipcode;
                    billHead.trade = this.trade;
                    billHead.memo = this.memo;
                    billHead.pk_areacl = this.pk_areacl;
                    billHead.memo = this.memo;
                    billHead.fax1 = this.fax1;
                    billHead.tel2 = this.tel2;
                    billHead.registerfund = this.registerfund;
                    return billHead;
                }
            }

        }

    }


    public static final class SupplierUfinterfaceVoBuilder {
        private String account;
        private String billtype;
        private String filename;
        private String groupcode;
        private String replace;
        private String roottag;
        private String isexchange;
        private String sender;
        private Bill bill;

        private SupplierUfinterfaceVoBuilder() {
        }

        public static SupplierUfinterfaceVoBuilder SupplierUfinterfaceVo() {
            return new SupplierUfinterfaceVoBuilder();
        }

        public SupplierUfinterfaceVoBuilder account(String account) {
            this.account = account;
            return this;
        }

        public SupplierUfinterfaceVoBuilder billtype(String billtype) {
            this.billtype = billtype;
            return this;
        }

        public SupplierUfinterfaceVoBuilder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public SupplierUfinterfaceVoBuilder groupcode(String groupcode) {
            this.groupcode = groupcode;
            return this;
        }

        public SupplierUfinterfaceVoBuilder replace(String replace) {
            this.replace = replace;
            return this;
        }

        public SupplierUfinterfaceVoBuilder roottag(String roottag) {
            this.roottag = roottag;
            return this;
        }

        public SupplierUfinterfaceVoBuilder isexchange(String isexchange) {
            this.isexchange = isexchange;
            return this;
        }

        public SupplierUfinterfaceVoBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public SupplierUfinterfaceVoBuilder bill(Bill bill) {
            this.bill = bill;
            return this;
        }

        public SupplierUfinterfaceVo build() {
            SupplierUfinterfaceVo supplierUfinterfaceVo = new SupplierUfinterfaceVo();
            supplierUfinterfaceVo.replace = this.replace;
            supplierUfinterfaceVo.bill = this.bill;
            supplierUfinterfaceVo.sender = this.sender;
            supplierUfinterfaceVo.account = this.account;
            supplierUfinterfaceVo.isexchange = this.isexchange;
            supplierUfinterfaceVo.groupcode = this.groupcode;
            supplierUfinterfaceVo.billtype = this.billtype;
            supplierUfinterfaceVo.filename = this.filename;
            supplierUfinterfaceVo.roottag = this.roottag;
            return supplierUfinterfaceVo;
        }
    }

}

