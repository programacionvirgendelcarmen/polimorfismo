package teoria.interfaceComparable;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo1 {
    public static void main(String[] args) {
        double[] numbers =
                new Random().doubles(0,350).limit(10).toArray();
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] cadenas = {"hola", "mundo", "fernando", "amén"};
        System.out.println(Arrays.toString(cadenas));
        Arrays.sort(cadenas);
        System.out.println(Arrays.toString(cadenas));

    }
}
