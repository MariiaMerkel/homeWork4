public class Main {
    public static void main(String[] args) {

        // task 4
        for(int count = 1; count <= 30; count++) {
            System.out.print(count + ": ");
            if (count % 3 == 0) {
                if (count % 5 == 0) System.out.print("ping pong");
                else System.out.print("ping");
                System.out.println("");
                continue;
            }
            if (count % 5 == 0) System.out.print("pong");
            System.out.println("");
        }

        // task 5
        int one = 0;
        int two = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(one + " ");
            two += one;
            one = two - one;
        }
    }
}