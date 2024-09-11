package yongzon.it2a;
public class Record {
    int id;
    int age;
    String name;
    float bmi;
    String fGoals;
    
    public void addApplications (int id, String nm, int age, float bmi, String Fgoals){
        this.id = id;
        this.name = nm;
        this.age = age;
        this.bmi = bmi;
        this.fGoals = Fgoals;
    }
    
    public void viewInfo(){
       String EligibilityS = (this.age >= 18 && this.age <= 65) ? "Eligible" : "Not Eligible (Age too High)";  
       String Goals = (this.fGoals > 18 && this.fGoals < 30) ? "Weight loss" : "Muscle Gain";
       
       System.out.printf("%-10d %-10s %-10d %-10d %-13s\n",this.id,this.name,this.age,this.bmi,Goals, EligibilityS);
    }
}
