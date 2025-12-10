import java.util.Scanner;
public class AgeStage {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    String stage = "NA";
    if (age <= 12){ stage = "Child"; }
    else if (13 <= age && age <= 17) { stage = "Teenager";}
    else if (18 <= age && age <= 59) { stage = "Adult";}
    else {stage = "Senior Citizen";}
    sc.close();

    System.out.println(stage);
  }
}