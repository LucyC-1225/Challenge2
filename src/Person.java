public class Person {
    Eye leftEye;
    Eye rightEye;
    Heart heart;
    Stomach stomach;
    Skin skin;
    String name;
    int age;
    Person(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin){
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
