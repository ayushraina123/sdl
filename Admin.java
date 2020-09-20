import java.util.*;
import java.util.Map.Entry;

public class Admin extends adminoptions {
    static Scanner sc = new Scanner(System.in);
    public static String Id;
    public static String password;
    public static HashMap<String, String> dep = new HashMap<String, String>();

    public static void adddep(String id, String pin) {
        dep.put(Id, password);
    }

    public static void setId(String id) {
        Id = id;
    }

    public static String getId() {
        return Id;
    }

    public static void setpass(String pass) {
        password = pass;
    }

    public static String getpass() {
        return password;
    }

    boolean validLogin = false;

    public static void deplogin() {
        System.out.println("Welcome to Department login");
        String id, pass;

        do {
            System.out.println("Please enter your Id");
            id = sc.nextLine();
        } while (dep.containsKey(id));
        setId(id);
        System.out.println("Please enter your Password");
        pass = sc.nextLine();
        setpass(pass);

        adddep(Id, password);
    }

    public static void login() {
        System.out.println("Please enter your ID");
        String identity = sc.nextLine();
        System.out.println("Please enter your password");
        String ps = sc.nextLine();
        boolean valid = false;

        for (Entry<String, String> entry : dep.entrySet()) {
            if (entry.getKey().equals(identity) && entry.getValue().equals(ps)) {
                System.out.println("Successfully logged in");
                valid = true;
                break;
            }

        }

        if (!valid) {
            System.out.println("Invalid login credentials");
        } else {
            System.out.print("Do you want to see all complaints(y/n): ");
            char ch = sc.next().charAt(0);
            if (ch == 'y') {
                // SHOW ALLL COMPLAINTS
                Vector<client.Details> list = client.v1;
                if (list.isEmpty()) {
                    System.out.println("No Complaints found!\n");
                    return;
                }
                System.out.println("Name\t\tMobile Number\t\tAddress\t\tComplaint\n");
                list.forEach((n) -> System.out
                        .println(n.Name + "\t\t" + n.MobileNumber + "\t\t" + n.Address + "\t\t" + n.complaint));
                System.out.println("\n");
            }
        }
    }
}