public interface Iface2 {
    void im1();

    void im2();

    default void dm1() {
        System.out.println("I'm dm1() of Iface2");
    }
}