public class Stomach extends Organ{
    public Stomach(String organName, String medicalCondition) {
        super(organName, medicalCondition);
    }
    public void digest(){
        System.out.println("Digesting begins...");
    }
    public String toString(){
        String str = "";
        str += "Name: Stomach" + "\n";
        str += "Medical condition: " + getMedicalCondition() + "\n";
        str += "Need to be fed" + "\n";
        str += "1. Digest";
        return str;
    }
}
