package design_patterns.behavioral.chain_of_responsibility;

public class UserExistsMiddleware extends Middleware {
    public boolean check(String user, String password) {
        System.out.println("Check if user exists");
        if (user.equals("")) return false;
        System.out.println("Else pass on request to next middleware");
        return checkNext(user, password);
    }
}
