package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name == "" || name.length() > 40){
            throw new IllegalArgumentException("Please provide a valid name");
        }
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Please enter an age between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }
}
