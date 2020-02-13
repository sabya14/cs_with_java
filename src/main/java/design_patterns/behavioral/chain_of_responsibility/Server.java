package design_patterns.behavioral.chain_of_responsibility;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
class Server {
    Middleware middleware;
    public Boolean login(String user, String password) {
        return middleware.check(user, password);
    }
}