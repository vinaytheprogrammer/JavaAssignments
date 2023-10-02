
class Concrete implements Iface1, Iface2 {
    public void im1() {
        System.out.println("I'm im1() in Concrete");

    }

    public void im2() {
        System.out.println("I'm im2() in Concrete");
    }

    /*
     * initialy this class gives error because there are two implementations of dm1
     * are coming from both the interfaces
     * and the clas does not have the definition for that function
     * So to correct that we make give a definition to that function in this class
     * as well
     */
    public void dm1() {
        System.out.println("I'm dm1() of Concrete");
    }

}