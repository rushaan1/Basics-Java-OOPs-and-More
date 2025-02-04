public class Company extends Thread{
    private final Employee employee;
    public Company(Employee employee){
        this.employee = employee;
    }

    @Override
    public void run(){
        synchronized (employee){
            while (employee.getHoursWorked()!=8){
                employee.Work();
            }
            System.out.println(employee.getName()+" is done working for today!");
            employee.setHoursWorked(0);
        }
    }
}
