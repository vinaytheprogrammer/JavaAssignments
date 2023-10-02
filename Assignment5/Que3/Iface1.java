public interface Iface1 {
    void im1();

    private void choice() {
        System.out.println("I'm Choice() inside Ifaca1");
    }

    default void dm1() {
        System.out.println("I'm dm1() of Iface1");
        choice();
    }

    static Iface1 getType(String s) {
        switch (s) {
            case "Concrete":
                return new Concrete();
            case "Concrete2":
                return new Concrete2();
            default:
                return null;
        }
    }

}