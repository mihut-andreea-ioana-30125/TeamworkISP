package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class NoTicketAvailableException extends RuntimeException {
    public NoTicketAvailableException()
    {
        System.out.println("NoTicketAvailableException");
    }
}