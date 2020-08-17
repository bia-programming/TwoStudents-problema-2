
package com.company;

    public class TwoStudents {
        private String name;
        private int roll;
        private int number_phone;
        private String address;

        public TwoStudents() {
        }

        public TwoStudents(String name, int roll, int number_phone, String address) {
            this.name = name;
            this.number_phone = number_phone;
            this.roll = roll;
            this.address = address;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoll() {
            return this.roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public int getNumber_phone() {
            return this.number_phone;
        }

        public void setNumber_phone(int number_phone) {
            this.number_phone = number_phone;
        }

        public String getAddress() {
            return this.address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }


