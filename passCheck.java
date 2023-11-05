import java.util.Scanner;


public class passCheck {
    public void Checks(String login, String password, String confPass){
        char[] array1 = login.toCharArray();
        try {
            for (char c : array1) {
                if (!Character.isLetterOrDigit(c) && c != '_') {
                    throw new WrongLoginException("WrongLoginException");
                } else if (array1.length > 19) {
                    throw new WrongLoginException("WrongLoginException");
                }
            }

            char[] array2 = password.toCharArray();
            for (char c : array2) {
                if (!Character.isLetterOrDigit(c) && c != '_') {
                    throw new WrongPasswordException("WrongPasswordException");
                } else if (array2.length > 19) {
                    throw new WrongPasswordException("WrongPasswordException");
                }
            }

            char[] array3 = confPass.toCharArray();
            for (char c : array3) {
                if (!Character.isLetterOrDigit(c) && c != '_') {
                    throw new WrongPasswordException("WrongPasswordException");
                } else if (array3.length > 19) {
                    throw new WrongPasswordException("WrongPasswordException");
                } else if (!confPass.equals(password)) {
                    throw new WrongPasswordException("WrongPasswordException");
                }
            }
            System.out.println( "\u001B[32m" + "Все проверки прошли успешно.)!" + "\u001B[32m" );

        }catch(WrongLoginException | WrongPasswordException e){
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        passCheck passs = new passCheck();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scanner.nextLine();
        System.out.print("Подтвердите пароль: ");
        String passCheck = scanner.nextLine();


        passs.Checks(login, pass, passCheck);



    }
}
