package design_patterns.behavioral.chain_of_responsibility;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Runner {

    public static void main(String[] args) {
        Server server = new Server();
        Middleware middleware = new UserExistsMiddleware();
        middleware.linkwith(new RoleMiddleware());

        server.setMiddleware(middleware);
        Boolean login = server.login("test", "test");
        if (login) System.out.println("Login Successful");
    }
}


