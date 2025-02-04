import java.util.Arrays;
import java.util.Scanner;

public class Livelihood extends Thread {
    static Human[] humans = new Human[90000];
    @Override
    public void run(){
        for (int i = 0; i<humans.length; i++){
            if (humans[i]==null){
                continue;
            }
            humans[i].Eat();
            humans[i].Drink();
            humans[i].Sleep();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = scanner.next();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();

        SalesEmployee seller = new SalesEmployee(name, age, "Female");
        seller.setPreferences(new String[]{"Loves Sleeping", "Loves Drinking"});
        humans[0] = seller;
        Livelihood livelihood = new Livelihood();
        livelihood.start();
        livelihood.join();
        Company company = new Company(seller);
        company.start();
        company.join();
        System.out.println(Arrays.toString(seller.getPreferences()));



        try{
            System.out.println("Test");
        } catch (Exception ex){
            //Unlike C# you cannot js write catch block like: catch (Exception){}
        }
    }
}