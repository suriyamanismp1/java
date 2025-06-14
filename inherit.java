package Dk001;

class inherit {
    public static void main(String[] args) {
        a.B cc=new a.B();
        cc.ad();
        cc.Bd();
        cc.m();

    }
}

class a {
    public void ad() {
        int a = 10 + 233445 + 12 - 3;
    }

    static class B extends a {
        public void Bd() {
            int b = 29;
        }

        void m() {
            System.out.println("khegtyk");
            System.out.println("dfgfjytseki");
        }
    }
}