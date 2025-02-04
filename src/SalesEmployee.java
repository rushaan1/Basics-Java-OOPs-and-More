public class SalesEmployee extends Employee {
    public SalesEmployee(String name, int age, String gender){
        super(name, age, gender);
    }

    @Override
    public void Work(){
        System.out.println("Human named "+super.getName()+" is working at the Sales Department.");
        super.setHoursWorked(super.getHoursWorked()+1);
    }

    @Override
    public void Resign(){
        System.out.println("Human named "+super.getName()+" has resigned from Sales Department Job.");
    }
}
