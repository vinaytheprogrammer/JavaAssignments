package nitjsr.hospitals.dblayer;
// Define the DBEntity interface
public interface DBEntity {
    void insert(DBEntity entity);
    void delete(int id);
    void update(int id, DBEntity entity);

    static DBEntity getEntity(String s)
    {
        switch(s)
        {
            case "doctor" : return new Doctor();
            default : return null;
        }
    }
}