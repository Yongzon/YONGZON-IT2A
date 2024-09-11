package yongzon.it2a;
import java.util.Scanner;
public class YONGZONIT2A {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       Record[] rc = new Record [100];
       
       int i, no, id;
       
        System.out.println("Enter number of Application: ");
        no = in.nextInt();
        
        for(i = 0; i < no; i++){
            
            boolean identi;
            System.out.println("Enter details of application " + (i + 1) + ": ");
            while (true) {
                System.out.print("Enter ID: ");
                id = in.nextInt();
                identi = false;

                for (int x = 0; x < i; x++) {
                    if (rc[x] != null && rc[x].id == id) {
                        identi = true;
                        break;
                    }
                }

                if (identi) {
                    System.out.println("ID already exists. Try another one");
                } else {
                   
                    rc[i].id = id;
                    break;
                }
            }
            System.out.println("Name: ");
            String nm = in.next();
            System.out.println("Age: ");
            int age = in.nextInt();
            System.out.println("BMI: ");
            float bmi = in.nextFloat();
            System.out.println("Fitness Goals: ");
            String fGoals = in.next();
            rc[i] = new Record();
            rc[i].addApplications(id, nm, age, bmi, fGoals);
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-20s %-20s\n","ID", "Name", "Age", "BMI", "Fitness Goals", "Eligibility Status");
            for (i = 0; i < no; i++) {
            rc[i].viewInfo();
            System.out.println("");
        }
    }
}
