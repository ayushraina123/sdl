import java.util.*;

public class Mainmenu extends Main
{
    public void show()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Department Login");
        System.out.println("2. Complaint Registration");
        System.out.println("3. Exit");
        System.out.println("Enter choice");

        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: adminoptions.display();

            break;

            case 2: client.input();

            break;

            case 3: Exit();

            default:
            System.out.println("Invalid choice :( Please select a valid choice :).\n");
        }

        sc.close();

    }
        

        public void Exit() 
        {
            try {
                Thread.sleep(1000);
                System.out.print("Exiting in 3...");
                Thread.sleep(1000);
                System.out.print("2...");
                Thread.sleep(1000);
                System.out.println("1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }  
    }    
