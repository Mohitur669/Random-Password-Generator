import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int digit = input.nextInt();
        String lowerCases = "abcdefghijklmnopqrstuvwxyz";
        String upperCases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-+";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < digit; i++) {
            int rand = (int) (Math.random() * 4);
            switch (rand) {
                case 0 -> password.append(lowerCases.charAt((int) (Math.random() * lowerCases.length())));
                case 1 -> password.append(upperCases.charAt((int) (Math.random() * upperCases.length())));
                case 2 -> password.append(digits.charAt((int) (Math.random() * digits.length())));
                case 3 -> password.append(specialCharacters.charAt((int) (Math.random() * specialCharacters.length())));
            }
        }
        System.out.println("Your password is: " + password);
    }
}