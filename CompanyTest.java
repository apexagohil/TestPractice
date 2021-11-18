package Encapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        Company obj =new Company();

        obj.setName("Apexa");
        obj.setID(8);
        obj.setSalary(1000);
        obj.setBonus(200);



        System.out.println(obj.getName());
        System.out.println(obj.getID());
        System.out.println(obj.getSalary());
        System.out.println(obj.getBonus());

    }
}
