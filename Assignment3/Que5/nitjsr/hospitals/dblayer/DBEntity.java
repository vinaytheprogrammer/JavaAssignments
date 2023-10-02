package nitjsr.hospitals.dblayer;
// Define the DBEntity interface
public abstract class DBEntity {
    abstract void insert(DBEntity entity);
    abstract void delete(int id);
    abstract void update(int id, DBEntity entity);

    public static DBEntity getEntity(String s)
    {
        switch(s)
        {
            case "doctor" : return new Doctor();
            default : return null;
        }
    }

    public void alter()
    {
        System.out.println("Alter");
    }
}