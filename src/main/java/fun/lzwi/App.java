package fun.lzwi;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        int port = Integer.valueOf(System.getProperty("$PORT", "8964"));
        Javalin app = Javalin.create().start(port);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}