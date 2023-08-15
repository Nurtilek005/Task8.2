import java.util.Arrays;

public class MyClass {
    String Name;
    int age;
    String [] subjects;
    String favoriteDish;


    public MyClass(String fullName, int age, String[] subjects, String favoriteDish) {
        this.Name = fullName;
        this.age = age;
        this.subjects = subjects;
        this.favoriteDish = favoriteDish;
    }

    public MyClass(){
    }

    @Override
    public String toString() {
        return "Person " +
                "fullName = " + Name + '\'' +
                ", age = " + age +
                ", subjects = " + Arrays.toString(subjects) +
                ", favoriteDish = " + favoriteDish + '\'';
    }
}

