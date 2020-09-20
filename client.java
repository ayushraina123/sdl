import java.util.*;

public class client extends Mainmenu
{
  
    static Scanner sc = new Scanner(System.in);
    public static class Details
    {
     
        public String Address;
        public String Name;
        public Long MobileNumber;
        public String complaint;
    }

    public static Vector<Details> v1 = new Vector<Details>(); 
    public static void input()
    {
        Details d = new Details();

        System.out.println("Enter your name");
        d.Name = sc.nextLine();
        System.out.println("Enter your mobile number");
        d.MobileNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your Address");
        d.Address = sc.nextLine();
        System.out.println("Enter your complaint");
        d.complaint = sc.nextLine();

        v1.add(d);
       
    }
   
    
}
