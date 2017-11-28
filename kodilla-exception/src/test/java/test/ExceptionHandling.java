package test;

public class ExceptionHandling extends Exception{
    public void secondTest() throws SecondChallenge {
        try {

        } catch (Exception e) {
            throw new SecondChallenge();


    } finally {
            System.out.println("catch this");
        }
    }
}
