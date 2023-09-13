package Lab6.exe1;


public class Client {
    /**
     * Constructor for objects of class Client
     */
    public Client() {

    }

    public void doUnchecked(String value) {

        int result=canThrowUncheckedException(value);
        System.out.println("result="+result);
    }

    private int canThrowUncheckedException(String value) {
        return Integer.parseInt(value);
    }

    public void doChecked(String value) {
        try {

            canThrowCheckedException();
            System.out.println("OK");
        }catch(Exception ex) {

            System.out.println(ex);
        }
    }

    private int canThrowCheckedException() throws Exception{
        throw new Exception("Failure");
    }
}


