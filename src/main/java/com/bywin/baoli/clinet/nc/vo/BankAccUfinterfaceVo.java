package com.bywin.baoli.clinet.nc.vo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ufinterface")
public class BankAccUfinterfaceVo {


    @XmlAttribute(name = "account")
    private String account;

    @XmlAttribute(name = "billtype")
    private String billtype;

    @XmlAttribute(name = "filename")
    private String filename;

    @XmlAttribute(name = "isexchange")
    private String isexchange;

    @XmlAttribute(name = "receiver")
    private String receiver;

    @XmlAttribute(name = "replace")
    private String replace;

    @XmlAttribute(name = "roottag")
    private String roottag;

    @XmlAttribute(name = "sender")
    private String sender;

    @XmlElement(name = "bill")
    private Bill bill;
    
    




    public static class Bill{
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

        public static class BillHead{


            @XmlElement(name = "pk_group")
            private String pk_group;

            @XmlElement(name = "pk_org")
            private String pk_org;

            @XmlElement(name = "code")
            private String code;

            @XmlElement(name = "name")
            private String name;

            @XmlElement(name = "memo")
            private String memo;

            @XmlElement(name = "accclass")
            private String accclass;


            @XmlElement(name = "accnum")
            private String accnum;


            @XmlElement(name = "accname")
            private String accname;


            @XmlElement(name = "pk_bankdoc")
            private String pk_bankdoc;


            @XmlElement(name = "pk_banktype")
            private String pk_banktype;


            @XmlElement(name = "mnecode")
            private String mnecode;


            @XmlElement(name = "accopendate")
            private String accopendate;


            @XmlElement(name = "arapprop")
            private String arapprop;


            @XmlElement(name = "netqueryflag")
            private String netqueryflag;


            @XmlElement(name = "accattribute")
            private String accattribute;

            @XmlElement(name = "genebranprop")
            private String genebranprop;

            @XmlElement(name = "corrgeneaccount")
            private String corrgeneaccount;

            @XmlElement(name = "groupaccount")
            private String groupaccount;

            @XmlElement(name = "accstate")
            private String accstate;

            @XmlElement(name = "accountproperty")
            private String accountproperty;

            @XmlElement(name = "address")
            private String address;

            @XmlElement(name = "contactpsn")
            private String contactpsn;

            @XmlElement(name = "tel")
            private String tel;

            @XmlElement(name = "accxhdate")
            private String accxhdate;

            @XmlElement(name = "pk_netbankinftp")
            private String pk_netbankinftp;

            @XmlElement(name = "areacode")
            private String areacode;

            @XmlElement(name = "combinenum")
            private String combinenum;

            @XmlElement(name = "orgnumber")
            private String orgnumber;

            @XmlElement(name = "bankarea")
            private String bankarea;

            @XmlElement(name = "province")
            private String province;

            @XmlElement(name = "city")
            private String city;

            @XmlElement(name = "customernumber")
            private String customernumber;

            @XmlElement(name = "issigned")
            private String issigned;

            @XmlElement(name = "financeorg")
            private String financeorg;

            @XmlElement(name = "controlorg")
            private String controlorg;

            @XmlElement(name = "enablestate")
            private String enablestate;

            @XmlElement(name = "combineaccname")
            private String combineaccname;

            @XmlElement(name = "qrybalanceitf")
            private String qrybalanceitf;

            @XmlElement(name = "bankaccsub")
            private Bankaccsub bankaccsub;

            
            public static final class BillHeadBuilder {
                private String pk_group;
                private String pk_org;
                private String code;
                private String name;
                private String memo;
                private String accclass;
                private String accnum;
                private String accname;
                private String pk_bankdoc;
                private String pk_banktype;
                private String mnecode;
                private String accopendate;
                private String arapprop;
                private String netqueryflag;
                private String accattribute;
                private String genebranprop;
                private String corrgeneaccount;
                private String groupaccount;
                private String accstate;
                private String accountproperty;
                private String address;
                private String contactpsn;
                private String tel;
                private String accxhdate;
                private String pk_netbankinftp;
                private String areacode;
                private String combinenum;
                private String orgnumber;
                private String bankarea;
                private String province;
                private String city;
                private String customernumber;
                private String issigned;
                private String financeorg;
                private String controlorg;
                private String enablestate;
                private String combineaccname;
                private String qrybalanceitf;
                private Bankaccsub bankaccsub;

                private BillHeadBuilder() {
                }

                public static BillHeadBuilder billHead() {
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

                public BillHeadBuilder memo(String memo) {
                    this.memo = memo;
                    return this;
                }

                public BillHeadBuilder accclass(String accclass) {
                    this.accclass = accclass;
                    return this;
                }

                public BillHeadBuilder accnum(String accnum) {
                    this.accnum = accnum;
                    return this;
                }

                public BillHeadBuilder accname(String accname) {
                    this.accname = accname;
                    return this;
                }

                public BillHeadBuilder pk_bankdoc(String pk_bankdoc) {
                    this.pk_bankdoc = pk_bankdoc;
                    return this;
                }

                public BillHeadBuilder pk_banktype(String pk_banktype) {
                    this.pk_banktype = pk_banktype;
                    return this;
                }

                public BillHeadBuilder mnecode(String mnecode) {
                    this.mnecode = mnecode;
                    return this;
                }

                public BillHeadBuilder accopendate(String accopendate) {
                    this.accopendate = accopendate;
                    return this;
                }

                public BillHeadBuilder arapprop(String arapprop) {
                    this.arapprop = arapprop;
                    return this;
                }

                public BillHeadBuilder netqueryflag(String netqueryflag) {
                    this.netqueryflag = netqueryflag;
                    return this;
                }

                public BillHeadBuilder accattribute(String accattribute) {
                    this.accattribute = accattribute;
                    return this;
                }

                public BillHeadBuilder genebranprop(String genebranprop) {
                    this.genebranprop = genebranprop;
                    return this;
                }

                public BillHeadBuilder corrgeneaccount(String corrgeneaccount) {
                    this.corrgeneaccount = corrgeneaccount;
                    return this;
                }

                public BillHeadBuilder groupaccount(String groupaccount) {
                    this.groupaccount = groupaccount;
                    return this;
                }

                public BillHeadBuilder accstate(String accstate) {
                    this.accstate = accstate;
                    return this;
                }

                public BillHeadBuilder accountproperty(String accountproperty) {
                    this.accountproperty = accountproperty;
                    return this;
                }

                public BillHeadBuilder address(String address) {
                    this.address = address;
                    return this;
                }

                public BillHeadBuilder contactpsn(String contactpsn) {
                    this.contactpsn = contactpsn;
                    return this;
                }

                public BillHeadBuilder tel(String tel) {
                    this.tel = tel;
                    return this;
                }

                public BillHeadBuilder accxhdate(String accxhdate) {
                    this.accxhdate = accxhdate;
                    return this;
                }

                public BillHeadBuilder pk_netbankinftp(String pk_netbankinftp) {
                    this.pk_netbankinftp = pk_netbankinftp;
                    return this;
                }

                public BillHeadBuilder areacode(String areacode) {
                    this.areacode = areacode;
                    return this;
                }

                public BillHeadBuilder combinenum(String combinenum) {
                    this.combinenum = combinenum;
                    return this;
                }

                public BillHeadBuilder orgnumber(String orgnumber) {
                    this.orgnumber = orgnumber;
                    return this;
                }

                public BillHeadBuilder bankarea(String bankarea) {
                    this.bankarea = bankarea;
                    return this;
                }

                public BillHeadBuilder province(String province) {
                    this.province = province;
                    return this;
                }

                public BillHeadBuilder city(String city) {
                    this.city = city;
                    return this;
                }

                public BillHeadBuilder customernumber(String customernumber) {
                    this.customernumber = customernumber;
                    return this;
                }

                public BillHeadBuilder issigned(String issigned) {
                    this.issigned = issigned;
                    return this;
                }

                public BillHeadBuilder financeorg(String financeorg) {
                    this.financeorg = financeorg;
                    return this;
                }

                public BillHeadBuilder controlorg(String controlorg) {
                    this.controlorg = controlorg;
                    return this;
                }

                public BillHeadBuilder enablestate(String enablestate) {
                    this.enablestate = enablestate;
                    return this;
                }

                public BillHeadBuilder combineaccname(String combineaccname) {
                    this.combineaccname = combineaccname;
                    return this;
                }

                public BillHeadBuilder qrybalanceitf(String qrybalanceitf) {
                    this.qrybalanceitf = qrybalanceitf;
                    return this;
                }

                public BillHeadBuilder bankaccsub(Bankaccsub bankaccsub) {
                    this.bankaccsub = bankaccsub;
                    return this;
                }

                public BillHead build() {
                    BillHead billHead = new BillHead();
                    billHead.accountproperty = this.accountproperty;
                    billHead.financeorg = this.financeorg;
                    billHead.qrybalanceitf = this.qrybalanceitf;
                    billHead.arapprop = this.arapprop;
                    billHead.accnum = this.accnum;
                    billHead.contactpsn = this.contactpsn;
                    billHead.province = this.province;
                    billHead.pk_bankdoc = this.pk_bankdoc;
                    billHead.customernumber = this.customernumber;
                    billHead.pk_org = this.pk_org;
                    billHead.combinenum = this.combinenum;
                    billHead.memo = this.memo;
                    billHead.genebranprop = this.genebranprop;
                    billHead.code = this.code;
                    billHead.city = this.city;
                    billHead.enablestate = this.enablestate;
                    billHead.accclass = this.accclass;
                    billHead.pk_netbankinftp = this.pk_netbankinftp;
                    billHead.areacode = this.areacode;
                    billHead.mnecode = this.mnecode;
                    billHead.corrgeneaccount = this.corrgeneaccount;
                    billHead.pk_group = this.pk_group;
                    billHead.issigned = this.issigned;
                    billHead.netqueryflag = this.netqueryflag;
                    billHead.pk_banktype = this.pk_banktype;
                    billHead.accopendate = this.accopendate;
                    billHead.groupaccount = this.groupaccount;
                    billHead.accxhdate = this.accxhdate;
                    billHead.accstate = this.accstate;
                    billHead.accname = this.accname;
                    billHead.bankarea = this.bankarea;
                    billHead.name = this.name;
                    billHead.tel = this.tel;
                    billHead.bankaccsub = this.bankaccsub;
                    billHead.orgnumber = this.orgnumber;
                    billHead.controlorg = this.controlorg;
                    billHead.accattribute = this.accattribute;
                    billHead.address = this.address;
                    billHead.combineaccname = this.combineaccname;
                    return billHead;
                }
            }
            
            
            public static class Bankaccsub{

                @XmlElement(name = "item")
                private Item item;

                public static class Item{


                    @XmlElement(name = "pk_currtype")
                    private String pk_currtype;

                    @XmlElement(name = "code")
                    private String code;

                    @XmlElement(name = "name")
                    private String name;

                    @XmlElement(name = "acctype")
                    private String acctype;

                    @XmlElement(name = "isconcerted")
                    private String isconcerted;

                    @XmlElement(name = "concertedmny")
                    private String concertedmny;

                    @XmlElement(name = "fronzenstate")
                    private String fronzenstate;

                    @XmlElement(name = "fronzenmny")
                    private String fronzenmny;

                    @XmlElement(name = "frozendate")
                    private String frozendate;

                    @XmlElement(name = "defrozendate")
                    private String defrozendate;

                    @XmlElement(name = "overdraftmny")
                    private String overdraftmny;

                    @XmlElement(name = "overdrafttype")
                    private String overdrafttype;

                    @XmlElement(name = "payarea")
                    private String payarea;

                    @XmlElement(name = "istrade")
                    private String istrade;

                    public static final class ItemBuilder {
                        private String pk_currtype;
                        private String code;
                        private String name;
                        private String acctype;
                        private String isconcerted;
                        private String concertedmny;
                        private String fronzenstate;
                        private String fronzenmny;
                        private String frozendate;
                        private String defrozendate;
                        private String overdraftmny;
                        private String overdrafttype;
                        private String payarea;
                        private String istrade;

                        private ItemBuilder() {
                        }

                        public static ItemBuilder Item() {
                            return new ItemBuilder();
                        }

                        public ItemBuilder pk_currtype(String pk_currtype) {
                            this.pk_currtype = pk_currtype;
                            return this;
                        }

                        public ItemBuilder code(String code) {
                            this.code = code;
                            return this;
                        }

                        public ItemBuilder name(String name) {
                            this.name = name;
                            return this;
                        }

                        public ItemBuilder acctype(String acctype) {
                            this.acctype = acctype;
                            return this;
                        }

                        public ItemBuilder isconcerted(String isconcerted) {
                            this.isconcerted = isconcerted;
                            return this;
                        }

                        public ItemBuilder concertedmny(String concertedmny) {
                            this.concertedmny = concertedmny;
                            return this;
                        }

                        public ItemBuilder fronzenstate(String fronzenstate) {
                            this.fronzenstate = fronzenstate;
                            return this;
                        }

                        public ItemBuilder fronzenmny(String fronzenmny) {
                            this.fronzenmny = fronzenmny;
                            return this;
                        }

                        public ItemBuilder frozendate(String frozendate) {
                            this.frozendate = frozendate;
                            return this;
                        }

                        public ItemBuilder defrozendate(String defrozendate) {
                            this.defrozendate = defrozendate;
                            return this;
                        }

                        public ItemBuilder overdraftmny(String overdraftmny) {
                            this.overdraftmny = overdraftmny;
                            return this;
                        }

                        public ItemBuilder overdrafttype(String overdrafttype) {
                            this.overdrafttype = overdrafttype;
                            return this;
                        }

                        public ItemBuilder payarea(String payarea) {
                            this.payarea = payarea;
                            return this;
                        }

                        public ItemBuilder istrade(String istrade) {
                            this.istrade = istrade;
                            return this;
                        }

                        public Item build() {
                            Item item = new Item();
                            item.payarea = this.payarea;
                            item.concertedmny = this.concertedmny;
                            item.istrade = this.istrade;
                            item.defrozendate = this.defrozendate;
                            item.fronzenstate = this.fronzenstate;
                            item.name = this.name;
                            item.frozendate = this.frozendate;
                            item.code = this.code;
                            item.acctype = this.acctype;
                            item.overdrafttype = this.overdrafttype;
                            item.pk_currtype = this.pk_currtype;
                            item.fronzenmny = this.fronzenmny;
                            item.overdraftmny = this.overdraftmny;
                            item.isconcerted = this.isconcerted;
                            return item;
                        }
                    }

                }



                public static final class BankaccsubBuilder {
                    private Item item;

                    private BankaccsubBuilder() {
                    }

                    public static BankaccsubBuilder Bankaccsub() {
                        return new BankaccsubBuilder();
                    }

                    public BankaccsubBuilder item(Item item) {
                        this.item = item;
                        return this;
                    }

                    public Bankaccsub build() {
                        Bankaccsub bankaccsub = new Bankaccsub();
                        bankaccsub.item = this.item;
                        return bankaccsub;
                    }
                }
            }
        }


    }

    public static final class BankAccUfinterfaceVoBuilder {
        private String account;
        private String billtype;
        private String filename;
        private String isexchange;
        private String receiver;
        private String replace;
        private String roottag;
        private String sender;
        private Bill bill;

        private BankAccUfinterfaceVoBuilder() {
        }

        public static BankAccUfinterfaceVoBuilder BankAccUfinterfaceVo() {
            return new BankAccUfinterfaceVoBuilder();
        }

        public BankAccUfinterfaceVoBuilder account(String account) {
            this.account = account;
            return this;
        }

        public BankAccUfinterfaceVoBuilder billtype(String billtype) {
            this.billtype = billtype;
            return this;
        }

        public BankAccUfinterfaceVoBuilder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public BankAccUfinterfaceVoBuilder isexchange(String isexchange) {
            this.isexchange = isexchange;
            return this;
        }

        public BankAccUfinterfaceVoBuilder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public BankAccUfinterfaceVoBuilder replace(String replace) {
            this.replace = replace;
            return this;
        }

        public BankAccUfinterfaceVoBuilder roottag(String roottag) {
            this.roottag = roottag;
            return this;
        }

        public BankAccUfinterfaceVoBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public BankAccUfinterfaceVoBuilder bill(Bill bill) {
            this.bill = bill;
            return this;
        }

        public BankAccUfinterfaceVo build() {
            BankAccUfinterfaceVo bankAccUfinterfaceVo = new BankAccUfinterfaceVo();
            bankAccUfinterfaceVo.bill = this.bill;
            bankAccUfinterfaceVo.account = this.account;
            bankAccUfinterfaceVo.filename = this.filename;
            bankAccUfinterfaceVo.roottag = this.roottag;
            bankAccUfinterfaceVo.replace = this.replace;
            bankAccUfinterfaceVo.billtype = this.billtype;
            bankAccUfinterfaceVo.isexchange = this.isexchange;
            bankAccUfinterfaceVo.receiver = this.receiver;
            bankAccUfinterfaceVo.sender = this.sender;
            return bankAccUfinterfaceVo;
        }
    }
}
