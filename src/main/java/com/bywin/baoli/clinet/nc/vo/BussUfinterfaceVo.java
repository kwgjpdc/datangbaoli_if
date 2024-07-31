package com.bywin.baoli.clinet.nc.vo;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 合同Xml实体类
 */
@XmlRootElement(name = "ufinterface")
public class BussUfinterfaceVo {


    @XmlAttribute(name = "account")
    private String account;

    @XmlAttribute(name = "billtype")
    private String billtype;

    @XmlAttribute(name = "businessunitcode")
    private String businessunitcode;

    @XmlAttribute(name = "filename")
    private String filename;

    @XmlAttribute(name = "groupcode")
    private String groupcode;

    @XmlAttribute(name = "isexchange")
    private String isexchange;

    @XmlAttribute(name = "orgcode")
    private String orgcode;

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

    public BussUfinterfaceVo() {
    }

    private BussUfinterfaceVo(Builder builder) {
        this.account = builder.account;
        this.billtype = builder.billtype;
        this.businessunitcode = builder.businessunitcode;
        this.filename = builder.filename;
        this.groupcode = builder.groupcode;
        this.isexchange = builder.isexchange;
        this.orgcode = builder.orgcode;
        this.receiver = builder.receiver;
        this.replace = builder.replace;
        this.roottag = builder.roottag;
        this.sender = builder.sender;
        this.bill = builder.bill;
    }

    public static Builder newBussUfinterfaceVo() {
        return new Builder();
    }


    public static class Bill {
        @XmlAttribute(name = "id")
        private String id;

        @XmlElement(name = "billhead")
        private BillHead billhead;

        private Bill(Builder builder) {
            this.id = builder.id;
            this.billhead = builder.billhead;
        }

        public static Builder newBill() {
            return new Builder();
        }


        public static class BillHead {
            @XmlElement(name = "pk_defdoclist")
            private String pk_defdoclist;

            @XmlElement(name = "pk_defdoc")
            private String pk_defdoc;

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

            @XmlElement(name = "mnecode")
            private String mnecode;

            @XmlElement(name = "pid")
            private String pid;

            @XmlElement(name = "memo")
            private String memo;

            private BillHead(Builder builder) {
                this.pk_defdoclist = builder.pk_defdoclist;
                this.pk_defdoc = builder.pk_defdoc;
                this.pk_group = builder.pk_group;
                this.pk_org = builder.pk_org;
                this.code = builder.code;
                this.name = builder.name;
                this.shortname = builder.shortname;
                this.mnecode = builder.mnecode;
                this.pid = builder.pid;
                this.memo = builder.memo;
            }

            public static Builder newBillHead() {
                return new Builder();
            }


            public static final class Builder {
                private String pk_defdoclist;
                private String pk_defdoc;
                private String pk_group;
                private String pk_org;
                private String code;
                private String name;
                private String shortname;
                private String mnecode;
                private String pid;
                private String memo;

                private Builder() {
                }

                public BillHead build() {
                    return new BillHead(this);
                }

                public Builder pk_defdoclist(String pk_defdoclist) {
                    this.pk_defdoclist = pk_defdoclist;
                    return this;
                }

                public Builder pk_defdoc(String pk_defdoc) {
                    this.pk_defdoc = pk_defdoc;
                    return this;
                }

                public Builder pk_group(String pk_group) {
                    this.pk_group = pk_group;
                    return this;
                }

                public Builder pk_org(String pk_org) {
                    this.pk_org = pk_org;
                    return this;
                }

                public Builder code(String code) {
                    this.code = code;
                    return this;
                }

                public Builder name(String name) {
                    this.name = name;
                    return this;
                }

                public Builder shortname(String shortname) {
                    this.shortname = shortname;
                    return this;
                }

                public Builder mnecode(String mnecode) {
                    this.mnecode = mnecode;
                    return this;
                }

                public Builder pid(String pid) {
                    this.pid = pid;
                    return this;
                }

                public Builder memo(String memo) {
                    this.memo = memo;
                    return this;
                }
            }
        }


        public static final class Builder {
            private String id;
            private BillHead billhead;

            private Builder() {
            }

            public Bill build() {
                return new Bill(this);
            }

            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Builder billhead(BillHead billhead) {
                this.billhead = billhead;
                return this;
            }
        }
    }

    public static final class Builder {
        private String account;
        private String billtype;
        private String businessunitcode;
        private String filename;
        private String groupcode;
        private String isexchange;
        private String orgcode;
        private String receiver;
        private String replace;
        private String roottag;
        private String sender;
        private Bill bill;

        private Builder() {
        }

        public BussUfinterfaceVo build() {
            return new BussUfinterfaceVo(this);
        }

        public Builder account(String account) {
            this.account = account;
            return this;
        }

        public Builder billtype(String billtype) {
            this.billtype = billtype;
            return this;
        }

        public Builder businessunitcode(String businessunitcode) {
            this.businessunitcode = businessunitcode;
            return this;
        }

        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public Builder groupcode(String groupcode) {
            this.groupcode = groupcode;
            return this;
        }

        public Builder isexchange(String isexchange) {
            this.isexchange = isexchange;
            return this;
        }

        public Builder orgcode(String orgcode) {
            this.orgcode = orgcode;
            return this;
        }

        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public Builder replace(String replace) {
            this.replace = replace;
            return this;
        }

        public Builder roottag(String roottag) {
            this.roottag = roottag;
            return this;
        }

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder bill(Bill bill) {
            this.bill = bill;
            return this;
        }
    }
}
