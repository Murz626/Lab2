import java.util.Arrays;
import java.util.Random;

public class Lab2 {
    public static void main(String[] args) {
        Random random = new Random();
        int len = 10;
        int[] n = new int[len];
        for (int i = 0; i < len; i++) {
            n[i] = random.nextInt(200) - 100;
        }
        System.out.println(Arrays.toString(n));

        System.out.println("Tusk #1");
        int sum = 0;
        for (Object i : n){
            sum += (int)i;
        }
        System.out.println(sum);

        System.out.println("Tusk #2");
        int max = 0;
        for(Object i : n){
            if ((int)i > max){
                max = (int)i;
            }

        }
        System.out.println(max);

        System.out.println("Tusk #3");
        int count = 0;
        for (int i : n){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Tusk #4");
        int tmp = n[0];
        n[0] = n[n.length-1];
        n[n.length-1] = tmp;
        System.out.println(Arrays.toString(n));

        System.out.println("Tusk #5");
        int sum1 = 0;
        for (Object i : n){
            sum1 += (int)i;
        }
        System.out.println(sum1/n.length);

        System.out.println("Tusk #6");
        for (int g = 1; g <= 100; g++) {
            if (g % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (g % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (g % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(g);
            }
        }
    }
}