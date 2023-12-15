package com.hspedu.extend;

public class Base {



        public int n1 = 100;
        protected int n2 = 200;
        int n3 = 300;
        private int n4 = 400;
        private Base() {
            System.out.println("base()...");
        }
        public int getN4() {
            return n4;
        }
        public void test100() {
            System.out.println("tee100");
        }
        protected void test200() {
            System.out.println("tee200");
        }
        void test300() {
            System.out.println("tee300");
        }
        private void test400() {
            System.out.println("tee400");





}


}
