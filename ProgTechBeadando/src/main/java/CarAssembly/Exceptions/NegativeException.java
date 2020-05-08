/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarAssembly.Exceptions;

/**
 *
 * @author Feri
 */
public class NegativeException extends Exception {

    /**
     * Creates a new instance of <code>NegativeException</code> without detail
     * message.
     */
    public NegativeException() {
        
    }

    /**
     * Constructs an instance of <code>NegativeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NegativeException(String msg) {
        super(msg);
    }
}
