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
public class EmptyStringException extends Exception {

    /**
     * Creates a new instance of <code>EmptyStringException</code> without
     * detail message.
     */
    public EmptyStringException() {
    }

    /**
     * Constructs an instance of <code>EmptyStringException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyStringException(String msg) {
        super(msg);
    }
}
