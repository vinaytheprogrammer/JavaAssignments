package nitjsr.hospitals.dblayer;

// Implement the DBEntity interface in the Staff class
public class Staff implements DBEntity {
    private int id;
   // @Override
    public void insert(DBEntity entity) {
        System.out.println("From insert method of Staff class");
    }

   // @Override
    public void delete(int id) {
        System.out.println("From delete method of Staff class");
    }

    //@Override
    public void update(int id, DBEntity entity) {
        System.out.println("From update method of Staff class");
    }
}
