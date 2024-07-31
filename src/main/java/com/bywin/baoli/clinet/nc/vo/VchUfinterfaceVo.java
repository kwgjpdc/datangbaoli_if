package com.bywin.baoli.clinet.nc.vo;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="ufinterface")
public class VchUfinterfaceVo {

    /**
     * 无参构造器
     */
    public VchUfinterfaceVo() {

    };

    @XmlAttribute
    private static final String account = "003";


    @XmlAttribute
    private static final String billtype = "vouchergl";

    @XmlAttribute
    private String businessunitcode = "";

    @XmlAttribute
    private String filename = "";

    @XmlAttribute
    private static final String groupcode = "1";

    @XmlAttribute
    private static final String isexchange = "Y";

    @XmlAttribute
    private String orgcode = "";

    @XmlAttribute
    private String receiver = "";

    @XmlAttribute
    private static final String replace="Y";

    @XmlAttribute
    private static final String roottag = "voucher";

    @XmlAttribute
    private static final String sender="DTBL01";

    @XmlElement
    private Voucher voucher;

    private VchUfinterfaceVo(Builder builder) {
        this.filename = builder.filename;
        this.receiver = builder.receiver;
        this.voucher = builder.voucher;
        this.orgcode = builder.orgcode;
        this.businessunitcode = builder.businessunitcode;
    }

    public static Builder newUfinterfaceVo() {
        return new Builder();
    }


    public static class Voucher{

        @XmlAttribute
        private String id;

        @XmlElement(name="voucher_head")
        private VoucherHead voucherHead;

        private Voucher(Builder builder) {
            this.id = builder.id;
            this.voucherHead = builder.voucherHead;
        }

        public static Builder newVoucher() {
            return new Builder();
        }


        public static class VoucherHead{

            @XmlElement(name="pk_vouchertype")
            private static final String pkVouchertype = "01";

            @XmlElement(name="year")
            private String year;

            @XmlElement(name="pk_system")
            private static final String pkSystem = "GL";

            @XmlElement(name="voucherkind")
            private static final String voucherKind = "0";

            @XmlElement(name = "pk_accountingbook")
            private String pkAccountingbook;

            @XmlElement(name = "discardflag")
            private static final String discardflag = "";

            @XmlElement(name = "period")
            private String period = "";

            @XmlElement(name = "attachment")
            private String attachment = "";

            @XmlElement(name = "prepareddate")
            private String prepareddate;

            @XmlElement(name = "pk_prepared")
            private String pkPrepared;

            @XmlElement(name = "pk_org")
            private String pkOrg;

            @XmlElement(name = "pk_org_v")
            private String pkOrgV;

            @XmlElement(name = "pk_group")
            private String pkGroup;


            @XmlElement(name = "details")
            private Details details;

            private VoucherHead(Builder builder) {
                this.year = builder.year;
                this.pkAccountingbook = builder.pkAccountingbook;
                this.period = builder.period;
                this.prepareddate = builder.prepareddate;
                this.attachment = builder.attachment;
                this.pkPrepared = builder.pkPrepared;
                this.pkOrg = builder.pkOrg;
                this.pkOrgV = builder.pkOrgV;
                this.pkGroup = builder.pkGroup;
                this.details = builder.details;
            }

            public static Builder newVoucherHead() {
                return new Builder();
            }


            public static final class Builder {
                private String pkVouchertype;
                private String year;
                private String voucherKind;
                private String pkAccountingbook;
                private String period;
                private String prepareddate;
                private String attachment;
                private String pkPrepared;
                private String pkOrg;
                private String pkOrgV;
                private String pkGroup;
                private Details details;

                private Builder() {
                }

                public VoucherHead build() {
                    return new VoucherHead(this);
                }

                public Builder pkVouchertype(String pkVouchertype) {
                    this.pkVouchertype = pkVouchertype;
                    return this;
                }

                public Builder year(String year) {
                    this.year = year;
                    return this;
                }


                public Builder voucherKind(String voucherKind) {
                    this.voucherKind = voucherKind;
                    return this;
                }

                public Builder pkAccountingbook(String pkAccountingbook) {
                    this.pkAccountingbook = pkAccountingbook;
                    return this;
                }
                
                public Builder period(String period) {
                	this.period = period;
                	return this;
                }

                public Builder prepareddate(String prepareddate) {
                    this.prepareddate = prepareddate;
                    return this;
                }

                public Builder pkPrepared(String pkPrepared) {
                    this.pkPrepared = pkPrepared;
                    return this;
                }
                public Builder attachment(String attachment) {
                	this.attachment = attachment;
                	return this;
                }

                public Builder pkOrg(String pkOrg) {
                    this.pkOrg = pkOrg;
                    return this;
                }

                public Builder pkOrgV(String pkOrgV) {
                    this.pkOrgV = pkOrgV;
                    return this;
                }

                public Builder pkGroup(String pkGroup) {
                    this.pkGroup = pkGroup;
                    return this;
                }

                public Builder details(Details details) {
                    this.details = details;
                    return this;
                }
            }
        }


        public static final class Builder {
            private String id;
            private VoucherHead voucherHead;

            private Builder() {
            }

            public Voucher build() {
                return new Voucher(this);
            }

            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Builder voucherHead(VoucherHead voucherHead) {
                this.voucherHead = voucherHead;
                return this;
            }
        }
    }



    public static class Details {

        /**
         * 分录
         */
        @XmlElement(name = "item")
        private List<Item> itemList;

        private Details(Builder builder) {
            this.itemList = builder.itemList;
        }

        public static Builder newDetails() {
            return new Builder();
        }


        public static class CashFlow {

            @XmlElement(name = "item")
            private Item item;

            private CashFlow(Builder builder) {
                this.item = builder.item;
            }

            public static Builder newCashFlow() {
                return new Builder();
            }


            public static final class Builder {
                private Item item;

                private Builder() {
                }

                public CashFlow build() {
                    return new CashFlow(this);
                }

                public Builder item(Item item) {
                    this.item = item;
                    return this;
                }
            }
        }

        public static final class Builder {
            private List<Item> itemList;

            private Builder() {
            }

            public Details build() {
                return new Details(this);
            }

            public Builder itemList(List<Item> itemList) {
                this.itemList = itemList;
                return this;
            }
        }
    }


    public static class Item{
        @XmlElement(name = "m_pk_currtype")
        private String mPkCurrtype;

        //TODO 格式化00000000
        @XmlElement(name = "money")
        private String money;

        //TODO 格式化00000000
        @XmlElement(name = "moneyglobal")
        private String moneyglobal;

        @XmlElement(name = "moneygroup")
        private String moneygroup;

        @XmlElement(name = "moneymain")
        private String moneymain;

        @XmlElement(name = "pk_cashflow")
        private String pkCashflow;

        @XmlElement(name = "pk_Checktype")
        private String pkChecktype;

        @XmlElement(name = "pk_Checkvalue")
        private String pkCheckvalue;

        @XmlElement(name = "checktypename")
        private String checktypename;

        @XmlElement(name = "checkvaluecode")
        private String checkvaluecode;

        @XmlElement(name = "detailindex")
        private String detailindex;

        @XmlElement(name = "explanation")
        private String explanation;

        @XmlElement(name = "debitamount")
        private String debitamount;

        @XmlElement(name = "localdebitamount")
        private String localdebitamount;

        @XmlElement(name = "pk_currtype")
        private String pkCurrtype;

        @XmlElement(name = "pk_accasoa")
        private String pkAccasoa;

        @XmlElement(name = "ass")
        private Ass ass;

        @XmlElement(name = "cashFlow")
        private Details.CashFlow cashFlow;


        //贷方部分
        @XmlElement(name = "creditquantity")
        private String creditquantity;

        @XmlElement(name = "creditamount")
        private String creditamount;

        @XmlElement(name = "localcreditamount")
        private String localcreditamount;

        @XmlElement(name = "groupcreditamount")
        private String groupcreditamount;

        @XmlElement(name = "globalcreditamount")
        private String globalcreditamount;

        @XmlElement(name = "verifydate")
        private String verifydate;

        @XmlElement(name = "price")
        private String price;

        @XmlElement(name = "excrate2")
        private String excrate2;

        private Item(Builder builder) {
            this.mPkCurrtype = builder.mPkCurrtype;
            this.money = builder.money;
            this.moneyglobal = builder.moneyglobal;
            this.moneygroup = builder.moneygroup;
            this.moneymain = builder.moneymain;
            this.pkCashflow = builder.pkCashflow;
            this.pkChecktype = builder.pkChecktype;
            this.pkCheckvalue = builder.pkCheckvalue;
            this.checktypename = builder.checktypename;
            this.checkvaluecode = builder.checkvaluecode;
            this.detailindex = builder.detailindex;
            this.explanation = builder.explanation;
            this.debitamount = builder.debitamount;
            this.localdebitamount = builder.localdebitamount;
            this.pkCurrtype = builder.pkCurrtype;
            this.pkAccasoa = builder.pkAccasoa;
            this.ass = builder.ass;
            this.cashFlow = builder.cashFlow;
            this.creditquantity = builder.creditquantity;
            this.creditamount = builder.creditamount;
            this.localcreditamount = builder.localcreditamount;
            this.groupcreditamount = builder.groupcreditamount;
            this.globalcreditamount = builder.globalcreditamount;
            this.verifydate = builder.verifydate;
            this.price = builder.price;
            this.excrate2 = builder.excrate2;
        }

        public static Builder newItem() {
            return new Builder();
        }

        /**
         * 辅助计算
         */
        public static class Ass {
            @XmlElement(name = "item")
            private List<Item> SupItemList;

            private Ass(Builder builder) {
                this.SupItemList = builder.SupItemList;
            }

            public static Builder newAss() {
                return new Builder();
            }


            public static final class Builder {
                private List<Item> SupItemList;

                private Builder() {
                }

                public Ass build() {
                    return new Ass(this);
                }

                public Builder SupItemList(List<Item> SupItemList) {
                    this.SupItemList = SupItemList;
                    return this;
                }
            }
        }


        public static final class Builder {
            private String mPkCurrtype;
            private String money;
            private String moneyglobal;
            private String moneygroup;
            private String moneymain;
            private String pkCashflow;
            private String pkChecktype;
            private String pkCheckvalue;
            private String checktypename;
            private String checkvaluecode;
            private String detailindex;
            private String explanation;
            private String debitamount;
            private String localdebitamount;
            private String pkCurrtype;
            private String pkAccasoa;
            private Ass ass;
            private Details.CashFlow cashFlow;
            private String creditquantity;
            private String creditamount;
            private String localcreditamount;
            private String groupcreditamount;
            private String globalcreditamount;
            private String verifydate;
            private String price;
            private String excrate2;

            private Builder() {
            }

            public Item build() {
                return new Item(this);
            }

            public Builder mPkCurrtype(String mPkCurrtype) {
                this.mPkCurrtype = mPkCurrtype;
                return this;
            }

            public Builder money(String money) {
                this.money = money;
                return this;
            }

            public Builder moneyglobal(String moneyglobal) {
                this.moneyglobal = moneyglobal;
                return this;
            }

            public Builder moneygroup(String moneygroup) {
                this.moneygroup = moneygroup;
                return this;
            }

            public Builder moneymain(String moneymain) {
                this.moneymain = moneymain;
                return this;
            }

            public Builder pkCashflow(String pkCashflow) {
                this.pkCashflow = pkCashflow;
                return this;
            }

            public Builder pkChecktype(String pkChecktype) {
                this.pkChecktype = pkChecktype;
                return this;
            }

            public Builder pkCheckvalue(String pkCheckvalue) {
                this.pkCheckvalue = pkCheckvalue;
                return this;
            }
            public Builder checktypename(String checktypename) {
                this.checktypename = checktypename;
                return this;
            }
            public Builder checkvaluecode(String checkvaluecode) {
                this.checkvaluecode = checkvaluecode;
                return this;
            }

            public Builder detailindex(String detailindex) {
                this.detailindex = detailindex;
                return this;
            }

            public Builder explanation(String explanation) {
                this.explanation = explanation;
                return this;
            }

            public Builder debitamount(String debitamount) {
                this.debitamount = debitamount;
                return this;
            }

            public Builder localdebitamount(String localdebitamount) {
                this.localdebitamount = localdebitamount;
                return this;
            }

            public Builder pkCurrtype(String pkCurrtype) {
                this.pkCurrtype = pkCurrtype;
                return this;
            }

            public Builder pkAccasoa(String pkAccasoa) {
                this.pkAccasoa = pkAccasoa;
                return this;
            }

            public Builder ass(Ass ass) {
                this.ass = ass;
                return this;
            }

            public Builder cashFlow(Details.CashFlow cashFlow) {
                this.cashFlow = cashFlow;
                return this;
            }

            public Builder creditquantity(String creditquantity) {
                this.creditquantity = creditquantity;
                return this;
            }

            public Builder creditamount(String creditamount) {
                this.creditamount = creditamount;
                return this;
            }

            public Builder localcreditamount(String localcreditamount) {
                this.localcreditamount = localcreditamount;
                return this;
            }

            public Builder groupcreditamount(String groupcreditamount) {
                this.groupcreditamount = groupcreditamount;
                return this;
            }

            public Builder globalcreditamount(String globalcreditamount) {
                this.globalcreditamount = globalcreditamount;
                return this;
            }

            public Builder verifydate(String verifydate) {
                this.verifydate = verifydate;
                return this;
            }

            public Builder price(String price) {
                this.price = price;
                return this;
            }

            public Builder excrate2(String excrate2) {
                this.excrate2 = excrate2;
                return this;
            }
        }
    }


    public static final class Builder {
        private String filename;
        private Voucher voucher;
        private String businessunitcode;
        private String orgcode;
        private String receiver;
        
        private Builder() {
        }

        public VchUfinterfaceVo build() {
            return new VchUfinterfaceVo(this);
        }


        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }
        
        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        
        public Builder orgcode(String orgcode) {
            this.orgcode = orgcode;
            return this;
        }
        
        public Builder businessunitcode(String businessunitcode) {
            this.businessunitcode = businessunitcode;
            return this;
        }

        public Builder voucher(Voucher voucher) {
            this.voucher = voucher;
            return this;
        }
    }
}



