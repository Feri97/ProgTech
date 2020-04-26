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
    
    private int orderid = 0;
    
    public static synchronized Logger getInstance(){
    if(logger == null)
        logger = new Logger();
    return logger;
}
    
    private final String logFile = "log.txt";
    private PrintWriter writer;
    private Logger() {
        try {
            FileWriter fw = new FileWriter(logFile, true);
            writer = new PrintWriter(fw, true);
        }
        catch (IOException e) {
            
        }
    }
    public void logSuccess (String car, int price) {
        orderid++;
        writer.println("New order (" + car + ")"+" price: " + price + "$");
    }
    public void logFailure (String order) {
        writer.println("Failed attempt (" + order + ")");
    }
}
