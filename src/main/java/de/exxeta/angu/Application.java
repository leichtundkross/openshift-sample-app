package de.exxeta.angu;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

   @RequestMapping("/")
   public String home() {
      return "Hello Openshift World";
   }

   @RequestMapping("/ip")
   public String getIp() throws UnknownHostException, InterruptedException {
      Thread.sleep(1000);
      InetAddress inetAddress = InetAddress.getLocalHost();
      return inetAddress.getHostAddress();
   }

   public static void main( String[] args ) {
      SpringApplication.run(Application.class, args);
   }
}
