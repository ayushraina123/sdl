import java.util.*;

public class adminoptions
{
    static Scanner sc = new Scanner(System.in);
    public static void display() 
    {
        System.out.println("1. Sign Up");
        System.out.println("2. Login");
        System.out.println("3. Logout");
        int ch = sc.nextInt();
        
        switch(ch)
        {
            case 1: Admin.deplogin();

            break;

            case 2: Admin.login();

            break;
            case 3: Admin.logout();

            break;

        }
        /*System.out.println("\n1. List all Complaints registered");
        System.out.println("2. List completed Complaints");
        System.out.println("3. List in Progress Complaints");
        System.out.println("4. List criminal records");
        System.out.println("5. EXIT");
        System.out.print("Choose one of the above:");
        String choice = sc.nextLine();
        switch (choice) 
        {
            case "1":
                listcomplaints();
                break;
            case "2":
                listcomplete();
                break;
            case "3":
                listinprogress();
                break;
            case "4":
                listrecord();
                break;
            case "5":
                Exit();
            default:
                System.out.println("Invalid choice :( Please select a valid choice :) \n");
        }*/
    }
}        

