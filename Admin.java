import java.util.*;
import java.util.Map.Entry;

public class Admin extends adminoptions {
    static Scanner sc = new Scanner(System.in);
    public static String Id;
    public static String password;
    public static HashMap<String, String> dep = new HashMap<String, String>();

    public static class cmplts {
        public String name;
        public String crime;
        public String location;
    }

    public static Queue<cmplts> q1 = new LinkedList<cmplts>();

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
            id = sc.next();
        } while (dep.containsKey(id));
        setId(id);
        System.out.println("Please enter your Password");
        pass = sc.next();
        setpass(pass);

        adddep(Id, password);
    }

    public static void logout() {
        int nsb = Main.bs.nextSetBit(0);
        if (nsb == -1) {
            System.out.println("You aren't logged in");
        } else {
            Main.bs.clear(0);
            System.out.println("You are logged out successfully");
        }
    }

    public static void login() {
        boolean valid = false;
        int nsb = Main.bs.nextSetBit(0);
        if (nsb == 0) {
            System.out.println("You are already logged in");
            valid = true;
        } else {
            System.out.println("Please enter your ID");
            String identity = sc.next();
            System.out.println("Please enter your password");
            String ps = sc.next();

            for (Entry<String, String> entry : dep.entrySet()) {
                if (entry.getKey().equals(identity) && entry.getValue().equals(ps)) {
                    System.out.println("Successfully logged in");
                    valid = true;
                    Main.bs.set(0);
                    break;
                }

            }
        }
        if (!valid) {
            System.out.println("Invalid login credentials");
        } else {
            System.out.println("1. CREATE criminal record");
            System.out.println("2. VIEW criminal records");
            System.out.println("3 VIEW all complaints: ");
            String choicee = Main.sc.next();
            switch (choicee) {
                case "1":
                    cmplts c = new cmplts();
                    System.out.println("Enter name, crime and location of crime");
                    c.name = Main.sc.next();
                    c.crime = Main.sc.next();
                    c.location = Main.sc.next();
                    q1.add(c);
                    break;
                case "2":
                    Queue<cmplts> list = q1;
                    if (list.isEmpty()) {
                        System.out.println("No RECORDS found!\n");
                        return;
                    }
                    System.out.println("Name\t\tCrime\t\tLocation\n");
                    list.forEach((n) -> System.out.println(n.name + "\t\t" + n.crime + "\t\t" + n.location));
                    System.out.println("\n");
                    break;
                case "3":
                    Vector<client.Details> lis = client.v1;
                    if (lis.isEmpty()) {
                        System.out.println("No Complaints found!\n");
                        return;
                    }
                    System.out.println("Name\t\tMobile Number\t\tAddress\t\tComplaint\n");
                    lis.forEach((n) -> System.out
                            .println(n.Name + "\t\t" + n.MobileNumber + "\t\t" + n.Address + "\t\t" + n.complaint));
                    System.out.println("\n");
                    break;
            }
        }
    }
}