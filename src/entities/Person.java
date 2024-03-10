package entities;

public class Person {
    private float height;
    private String name;
    private short age;
    private char gender;

    public Person() {
    }

    public Person(float height) {
        setHeight(height);
    }

    public Person(String name, short age) {
        setName(name);
        setAge(age);
    }

    public Person(float height, String name, short age) {
        setHeight(height);
        setName(name);
        setAge(age);
    }
    
    public String toString() {
        return "Person [height=" + height + ", name=" + name + ", age=" + age + "]";
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    public short getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public boolean setGender(char gender) {
        if(gender == 'F' || gender == 'M'){
            this.gender = gender;
            return true;
        }
        return false;
    }
}
