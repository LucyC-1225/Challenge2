public class Eye extends Organ{
    String color;
    boolean isLeftEye;
    boolean leftEyeClosed;
    boolean rightEyeClosed;

    public Eye(String organName, String medicalCondition, String color, boolean isLeftEye) {
        super(organName, medicalCondition);
        this.color = color;
        this.isLeftEye = isLeftEye;
    }
    public void closeEye(){
        if (isLeftEye){
            if (!leftEyeClosed){
                System.out.println("Left eye closed");
                leftEyeClosed = true;
            } else {
                System.out.println("The left eye is already closed");
            }
        } else {
            if (!rightEyeClosed){
                System.out.println("Right eye closed");
                rightEyeClosed = true;
            } else {
                System.out.println("Right eye is already closed");
            }
        }
    }
    public String toString(){
        String str = "";
        if (isLeftEye){
            str += "Name: Left eye\n";
        } else {
            str += "Name: Right eye\n";
        }
        str += "Medical condition: " + getMedicalCondition() + "\n";
        str += "Color: " + color + "\n";
        str += "1. Close the eye";
        return str;
    }
}
