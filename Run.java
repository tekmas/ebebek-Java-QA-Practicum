public class Run {
    public static void main(String[] args)  {
        Employee personel=new Employee("kemal",1000,47,2002);
        personel.Bonus();
        personel.Tax();
        personel.raiseSalary();
        personel.ToString();
    }
    }