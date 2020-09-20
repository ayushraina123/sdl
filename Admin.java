import java.util.*;
import java.util.Map.Entry;

public class Admin extends adminoptions
{
    static Scanner sc = new Scanner(System.in);
    public static String Id;
    public static String password;
    public static HashMap<String, String> dep = new HashMap<String, String>();

    public static void adddep(String id, String pin) 
    {
        dep.put(Id, password);
    }

    public static void setId(String id) 
    {
        Id = id;
    }

    public static String getId() 
    {
        return Id;
    }

    public static void setpass(String pass) 
    {
        password = pass;
    }

    public static String getpass() 
    {
        return password;
    }

    boolean validLogin = false;

    public static void deplogin()
    {
        System.out.println("Welcome to Department login");
        String id;

        do
        {   System.out.println("Please enter your Id");
            id = sc.nextLine();
        }while(dep.containsKey(id));
            setId(id);
            System.out.println("Please enter your Password");
            String pass = sc.nextLine();
            setpass(pass);

            adddep(Id,password);
    }

    public static void login()
    {
        System.out.println("Please enter your ID");
        String identity = sc.nextLine();
        System.out.println("Please enter your password");
        String ps = sc.nextLine();
        boolean valid = false;

        for(Entry<String, String> entry : dep.entrySet()) 
        {
            if (entry.getKey().equals(identity) && entry.getValue().equals(ps)) 
            {
                System.out.println("Successfully logged in");
                valid = true;
                break;
            }
            
        }

        if(!valid)
        {
            System.out.println("Invalid login credentials");
        }
        
    }


}