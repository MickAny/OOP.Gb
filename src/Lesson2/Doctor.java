package Lesson2;

public class Doctor extends Nurse{
    private String name;
    private String setDiagnosis;
    private boolean procedure;

    public Doctor(String name) {
        this.name = name;
    }

    public void doExplore(Animal animal, String diagnosis, boolean doMedicalProcedure){
        this.setDiagnosis = diagnosis;
        this.procedure = doMedicalProcedure;
        System.out.println("Doctor " + name + "'s examined " + animal.getName() + "(Owner:" + animal.getOwner() + ")");

        if(doMedicalProcedure){
            doNurseStuff();
            System.out.printf("(%s)", diagnosis);
            System.out.println();
        }else{
            System.out.println("No work for Nurse");
        }
        System.out.println("-".repeat(30));
    }
}

