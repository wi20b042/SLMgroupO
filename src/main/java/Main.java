
import com.sun.net.httpserver.HttpServer;
// import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
// import org.glassfish.jersey.server.ResourceConfig;

import org.glassfish.jersey.*;


import java.io.IOException;
import java.net.URI;

public class Main {
    public static void main(String[] args) {

        ResourceConfig rc = new ResourceConfig()
                .packages("swlcm.controllers");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("server started");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        server.stop(0);
    }
}

// https://github.com/kienboec/SWLCM-Samples2/blob/main/src/main/java/Main.java, angepasst