public class adminoptions {
    public static void display() {
        System.out.println("1. Sign Up");
        System.out.println("2. Login");
        System.out.println("3. Logout");
        String ch = Main.sc.next();
        switch (ch) {
            case "1":
                Admin.deplogin();
                break;
            case "2":
                Admin.login();
                break;
            case "3":
                Admin.logout();
                break;
        }
    }
}
