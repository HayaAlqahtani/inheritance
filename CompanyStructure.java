

public class CompanyStructure {
      public static void main(String[] args) throws Exception {
        String[] RazanSkills = {"Java", "Python","SQL"};
        Employee haya = new Employee("haya", "IT", 4000); 
        Director jamal = new Director("Jamal", "IT", 3500, 25000);
        SalesPerson awdah = new SalesPerson("awdah","Accounting", 1800, 170);
        Engineer razan = new Engineer("razan", "IT", 2300, RazanSkills);

        System.out.println(haya);
        System.out.println(jamal);
        System.out.println(awdah);
        System.out.println(razan);
    }
}