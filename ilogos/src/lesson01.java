public class lesson01 {
    public static void main(String[] args) {
        //Завдання 1
        System.out.println("===Задвання 1===");
        byte b = 116;
        short s = 1123;
        int i = 64536;
        long l = 2147483648L;

        double d = 4.12;
        float pi = 3.14f;
        String word = "Hello World";
        boolean yes = true;

        System.out.println("byte Value = " + b);
        System.out.println("short Value = " + s);
        System.out.println("int Value = " + i);
        System.out.println("long Value = " + l);
        System.out.println("double Value = " + d);
        System.out.println("float Value = " + pi);
        System.out.println("String Value = " + word);
        System.out.println("boolean Value = " + yes);

        //Завдання 2
        System.out.println("===Задвання 2===");
        System.out.println("Integer MAX Value = " + Integer.MAX_VALUE);
        System.out.println("Integer MIN Value = " + Integer.MIN_VALUE);
        System.out.println("Double MAX Value = " + Double.MAX_VALUE);
        System.out.println("Double MIN Value = " + Double.MIN_VALUE);
        System.out.println("Float MAX Value = " + Float.MAX_VALUE);
        System.out.println("Float MIN Value = " + Float.MIN_VALUE);
        System.out.println("Byte MAX Value = " + Byte.MAX_VALUE);
        System.out.println("Bite MIN Value = " + Byte.MIN_VALUE);
        System.out.println("Short MAX Value = " + Short.MAX_VALUE);
        System.out.println("Short MIN Value = " + Short.MIN_VALUE);
        System.out.println("Long MAX Value = " + Long.MAX_VALUE);
        System.out.println("Long MIN Value = " + Long.MIN_VALUE);
        System.out.println("Char MAX Value = " + Character.MAX_VALUE);
        System.out.println("Char MIN Value = " + Character.MIN_VALUE);

        //Задвання 3
        System.out.println("===Задвання 3===");
        int[] My_array = new int[10];
        ;
        for (int p = 0; p < 10; p++) {
            My_array[p] = 2 + p + p * 2;
            System.out.println(My_array[p]);
        }

        int max = My_array[0];

        for (int z = 0; z < My_array.length; z++) {
            if (My_array[z] > max) {
                max = My_array[z];
            }
        }

        int min = max;
        for (int k = 0; k < My_array.length; k++) {
            if (My_array[k] < min) {
                min = My_array[k];
            }
        }
        System.out.println("Максимальне число: " + max);
        System.out.println("Мінімальне число: " + min);
    }
}
