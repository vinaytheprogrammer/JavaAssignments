import nitjsr.hospitals.dblayer.*;

class Main{

    public static void main(String[] args) {
        Doctor d = (Doctor)DBEntity.getEntity("doctor");
    d.setId(1);
    d.setName("A");
    d.setSpecialization("Neuro");
    d.insert(d);

    d.alter();
    }

}