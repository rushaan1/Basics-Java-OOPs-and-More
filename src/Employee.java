public class Employee extends Human{
    private int hoursWorked;
    public Employee(String name, int age, String gender){
        super(name, age, gender);
    }

    public void Work(){
        hoursWorked++;
        System.out.println("Human named "+super.getName()+" has worked for 1 hour.");
    }

    public void Resign(){
        System.out.println("Human named "+super.getName()+" has resigned from work.");
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
