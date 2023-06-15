import java.util.Scanner;

public class Home {

    //This is the main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int navSelect;

        String acquiesceUser,acquiescePassword;


        while (true){

            System.out.print("[please input acqueisce username] > ");
            acquiesceUser = scanner.next();
            System.out.print("[please input acqueisce userpassword] > ");
            acquiescePassword = scanner.next();

            if (acquiesceUser.equals("admin") && acquiescePassword.equals("admin")){

                System.out.println("[Welcome to you] > " + acquiesceUser);
                System.out.println("[In order to ensure the security" +
                        " of the account, please register a regular account as soon" +
                        " as possible]");

                sugnUp();
                break;
            }else {

                System.out.println("[Sorry, your account or password is incorrect!]");
            }

        }

    }

    /*Here is to create a low permission
    account for account security after logging in to the default account for the first time
     */
    public static void sugnUp(){
        Scanner scanner = new Scanner(System.in);

        String inputUserName,inputNamePassword,inputUserPhone;

        System.out.print("[Please enter your username] > ");
        inputUserName = scanner.next();
        System.out.print("[Please enter your account password] > ");
        inputNamePassword = scanner.next();
        System.out.print("[Please enter your account phone number] > ");
        inputUserPhone = scanner.next();

        System.out.println("Congratulations on your registration!");

        registeredStatus(inputUserName,inputNamePassword,inputUserPhone);
    }

    /*
    After the user selects the login module, the registration option will be hidden after the account is registered
     */
    public static void registeredStatus(String username,String userpassword,String userphone){

        Scanner scanner = new Scanner(System.in);

        int navSelects;

        System.out.println("[--------------\n1.Log in\n" +
                "2.Do not login visitors to view\n--------------]");

        System.out.print("[please input navSelect] > ");
        navSelects = scanner.nextInt();

        if (navSelects == 1){
            logIn(username,userphone,userpassword);
        } else if (navSelects == 2) {

        }else {
            System.out.println("Error: You performed " +
                    "the wrong action, this option is not available in the navigation!" +
                    " [0x1010]");
        }

    }

    /*
    Users log in here
     */
    public static void logIn(String userName,String userPhone,String userPassword){

        Scanner scanner = new Scanner(System.in);

        String loginUserNameOrPhone,loginUserPassword;

        System.out.print("[Please enter your account number or phone number] > ");
        loginUserNameOrPhone = scanner.next();
        System.out.print("[Please enter your login password] > ");
        loginUserPassword = scanner.next();

        /*
        When the user enters the correct mobile phone number and user name, the password can be successfully logged in, so as to solve the
        problem of forgetting the user name and improve the diversity of the user name.
         */
        if (loginUserNameOrPhone.equals(userName) && loginUserPassword.equals(userPassword)){

            System.out.println("Congratulations login success! \n" +
                    "the current login account is > " + "[ " + userName + " ]");
        }else if (loginUserNameOrPhone.equals(userPhone) && loginUserPassword.equals(userPassword)){

            System.out.println("Congratulations login success! \n" +
                    "the current login account is > " + "[ " + userName + " ]");
        }else {
            System.out.println("The account or password is incorrect!");
        }

    }
}
