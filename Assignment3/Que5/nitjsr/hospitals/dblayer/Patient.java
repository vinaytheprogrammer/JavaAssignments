package nitjsr.hospitals.dblayer;

// Implement the DBEntity interface in the Patient class
public class Patient extends DBEntity {
    private int id;
    //@Override
    public void insert(DBEntity entity) {
        System.out.println("From insert method of Patient class");
    }

   // @Override
    public void delete(int id) {
        System.out.println("From delete method of Patient class");
    }

   // @Override
    public void update(int id, DBEntity entity) {
        System.out.println("From update method of Patient class");
    }
}
