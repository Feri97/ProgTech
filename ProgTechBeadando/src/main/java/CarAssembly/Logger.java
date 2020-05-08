/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Feri
 */
public class Logger {
    private static Logger logger = null;
    
    private int orderid = 1;
    
    public static synchronized Logger getInstance(){
    if(logger == null)
        logger = new Logger();
    return logger;
}
    
    private final String logFile = "log.txt";
    private PrintWriter writer;
    private PrintWriter procurers;
    private Logger() {
        try {
            FileWriter fw = new FileWriter(logFile, true);
            writer = new PrintWriter(fw, true);
            FileWriter fwp = new FileWriter("orders.txt", true);
            procurers = new PrintWriter(fwp, true);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void logOrder (String car, int price, String firstname, String lastname, String email) {
        orderid++;
        writer.println(orderid + " New order (" + car + ")"+" price: " + price + "$");
        procurers.println(orderid + " Firstname: " + firstname + " Lastname: " + lastname + " E-mail: " + email);
    }
    public void logOrderPartialPay (String car, int price, int parts, String firstname, String lastname, String email) {
        orderid++;
        writer.println(orderid + " New order (" + car + ")"+" price: " + price + "$" + " for: " + parts + " months");
        procurers.println(orderid + " Firstname: " + firstname + " Lastname: " + lastname + " E-mail: " + email);
    }
    public void logFailure (String order, String msg) {
        writer.println("Failed attempt (" + order + ")" + msg);
    }
}
