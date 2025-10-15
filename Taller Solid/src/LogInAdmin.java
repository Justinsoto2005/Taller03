public class LogInAdmin implements Authenticator {
    private LogIn logIn = new LogIn();

    public void log(User user) {
        if (verifyIfTheUserIsAdmin(user)) {
            System.out.println("Has access to the website in admin mode");
            logIn.log(user); // reutiliza la lógica de inserción
        } else {
            System.out.println("Access denied: not an admin");
        }
    }

    private boolean verifyIfTheUserIsAdmin(User user) {
        // Logic
        return true;
    }
}
