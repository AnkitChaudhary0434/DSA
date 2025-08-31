package work;

public class Revaesenum {
    public static void main(String[] args) {

        int n = 12345;

        while (n > 0){
            int lastrev = n % 10;
            System.out.println(lastrev);
            n /= 10;
        }


    }
}
