package hjgvfhgf;

import java.util.Scanner;

public class gdtrd {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a = 0;
            int b = 1;
            int sum = 0;
            int count = 2;

            if (n == 0){
                count = 0;
                System.out.println(sum);
            } else if (n == 1) {
                count = 1;
                System.out.println(sum + 1);
            }else {
                count = 2;
                while (count <= n){
                    sum = a + b;
                    a = b;
                    b = sum;
                    count += 1;
                }
                System.out.println(sum);
            }
        }
    }