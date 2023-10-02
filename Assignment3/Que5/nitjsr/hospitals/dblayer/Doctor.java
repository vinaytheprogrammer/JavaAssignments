// Implement the DBEntity interface in the Doctor class
package nitjsr.hospitals.dblayer;

public class Doctor extends DBEntity {
    private int id;
    private String name;
    private String specialization;
    private String chamberFloor;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setChamberFloor(String chamberFloor) {
        this.chamberFloor = chamberFloor;
    }

    //@Override
    public void insert(DBEntity entity) {
        Doctor doctor = (Doctor) entity;
        System.out.println("Inserting doctor with id: " + doctor.id + " into database");
    }

   // @Override
    public void delete(int id) {
        System.out.println("Deleting doctor with id: " + id + " from database");
    }

   // @Override
    public void update(int id, DBEntity entity) {
        Doctor doctor = (Doctor) entity;
        System.out.println("Modifying information of doctor with id: " + id + " in database");
    }
}
