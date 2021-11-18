package Encapsulation;

public class Company {
    public String name;
    public int id;
    private int salary;
    private int bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getBonus(){
        return bonus;
    }
    public void setBonus(int bonus){
        this.bonus=bonus;
    }


}
