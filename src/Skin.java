public class Skin extends Organ{
    public Skin(String organName, String medicalCondition) {
        super(organName, medicalCondition);
    }
    public String toString(){
        String str = "";
        str += "Name: Skin" + "\n";
        str += "Medical condition: " + getMedicalCondition() + "\n";
        return str;
    }
}
