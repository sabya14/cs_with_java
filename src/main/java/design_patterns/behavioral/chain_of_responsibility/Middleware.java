package design_patterns.behavioral.chain_of_responsibility;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkwith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String user, String password);

    boolean checkNext(String user, String password) {
        if(next == null) {
            return true;
        }
        return next.check(user, password);
    }
}
