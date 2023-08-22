package com.vlad.javacore.NestedClass;

public class Letter {
    private String sender;
    public Letter(String sender) {
        this.sender = sender;
    }
    public String toString() {
        return "Letter [sender=" + sender + "]";
    }
    public class Address {
        private int postCode;
        public Address(int postCode) {
            this.postCode = postCode;
        }
        public String toString() {
            return "Address [postCode=" + postCode + "]";
        }
    }

    public class Address2 {
        private int postCode;
        public String getLetterSender() {
            return sender;
        }
        public Address2(int postCode) {
            this.postCode = postCode;
        }
        public String toString() {
            return "Address [postCode=" + postCode + "]";
        }
    }
}
