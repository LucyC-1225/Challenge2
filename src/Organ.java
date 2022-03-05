public class Organ {
    String organName;
    String medicalCondition;

    public Organ(String organName, String medicalCondition){
        this.organName = organName;
        this.medicalCondition = medicalCondition;
    }

    public String getOrganName() {
        return organName;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }
}
