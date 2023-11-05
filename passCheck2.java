public class passCheck2 {
    public void passChecks(String login, String password, String confPass) throws WrongLoginException, WrongPasswordException {
        char[] array1 = login.toCharArray();
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
    }

    public static void main(String[] args) {
        passCheck2 passs = new passCheck2();
        try {
            passs.passChecks("aled", "dw", "dw");
            System.out.println("Все проверки прошли успешно.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
