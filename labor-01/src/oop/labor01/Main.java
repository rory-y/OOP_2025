package oop.labor01;

public class Main {
    public static void main(String[] args) {
        // 0. feladat
        System.out.println("ARGS: ");
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        // 1. feladat
        System.out.println("wassup " + "hello!");
        // 2. feladat
        String name = "TREE";
        System.out.println("split into characters:");

        int nameLength = name.length();
        for(int i = 0; i < nameLength; i++) {
            System.out.println(name.charAt(i));
        }
        // 3. feladat
        System.out.println("split into words");
//        String regex = "[.\\,\\s]"
        String[] result = name.split(" ");
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i].trim());
        }
        // 4. feladat
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.substring(0,i+1));
        }
        // 5. feladat
        double[] x ={ 7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));
        // 6. feladat
        System.out.println("a 13-as 2. bitje: " + getBit(13,1));

    }
    //
    public static double maxElement(double[] array) {
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0;i<array.length;++i) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static byte getBit(int number, int order) {
        return (byte)((number >> order) & 1);
    }

//    public static byte countBits(int number) {
//
//    }
}
