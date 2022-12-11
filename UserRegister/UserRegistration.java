package UserRegister;


import java.util.regex.Pattern;

@FunctionalInterface
interface Verify {
    boolean verify(String regex, String details);

    static void print(Verify obj, String regex, String details) {
        if(obj.verify(regex, details)) {
            System.out.println(details + " is Valid ");
        }
        else {
            System.out.println(details + " is Invalid ");
        }
    }
}

public class UserRegistration {
            public static void main(String[] args) {
                Verify details = Pattern::matches;
                System.out.println("First Name :");
                Verify.print(details,"^[A-Z][a-z]{2,}","Mouli");
                Verify.print(details,"^[A-Z][a-z]{2,}","mouli");
                System.out.println();

                System.out.println("Last Name :");
                Verify.print(details,"^[A-Z][a-z]{2,}","Dharan");
                Verify.print(details,"^[A-Z][a-z]{2,}","dharan");
                System.out.println();

                System.out.println("Email :");
                Verify.print(details,"^[a-z0-9]+([.+_-]?[a-z0-9+])?@[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}","moulidharan2000@gmail.com");
                Verify.print(details,"^[a-z0-9]+([.+_-]?[a-z0-9+])?@[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}","MouliDharan@2000@gmail.com");
                System.out.println();

                System.out.println("Phone Number :");
                Verify.print(details,"^[0-9]{1,2} [0-9]{10}","91 9874563210");
                Verify.print(details,"^[0-9]{1,2} [0-9]{10}","919874563210");
                System.out.println();

                System.out.println("Password :");
                Verify.print(details,"^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "Mouli@123");
                Verify.print(details,"^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "mouli123");
            }

}
