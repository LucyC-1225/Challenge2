public class Heart extends Organ{
    int heartRate;

    public Heart(String organName, String medicalCondition, int heartRate) {
        super(organName, medicalCondition);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
        System.out.println("Heart rate changed to: " + heartRate);
    }
    public String toString(){
        String str = "";
        str += "Name: Heart" + "\n";
        str += "Medical condition: " + getMedicalCondition() + "\n";
        str += "Heart rate: " + getHeartRate() + "\n";
        str += "1. Change the heart rate";
        return str;
    }
}
