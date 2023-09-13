package Lab6.exe2;

public class UncheckedException{
    public UncheckedException () throws Exception{
        throw new Exception("ArrayIndexOutOfBoundsException");

    }

    public static void main(String[] args) {
        int i, n = 2;
        int a[] = new int[n];

        //Declare Scanner Object named input

       try {
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (i = 0; i <= n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = input.nextInt();

           }
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }
        }

}
