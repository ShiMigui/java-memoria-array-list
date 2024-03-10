package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        setName(name);
        this.salary = salary;
    }
    
    public String toString() {
        return id + " - " + name + " - " + String.format("%.2f", salary);
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    public Double getSalary() {
        return salary;
    }
    public void increaseSalary(Double percentage) {
        this.salary *= 1 + (percentage/100);
    }
}
