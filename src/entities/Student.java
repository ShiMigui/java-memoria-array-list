package entities;

public class Student extends Person {
    private float[] grades;
    private String mail;

    public Student(String name, float[] grades) {
        setGrades(grades);
        setName(name);
    }

    public Student(String name, String mail) {
        setName(name);
        setMail(mail);
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail.toLowerCase();
    }

    public float media() {
        float media = 0;
        for (int i = 0; i < grades.length; i++)
            media += grades[i];
        return (media /= grades.length);
    }

    public String toString() {
        return getName() + " - " + this.mail;
    }
    
}
