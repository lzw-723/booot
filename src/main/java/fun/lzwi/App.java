package fun.lzwi;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8964);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}