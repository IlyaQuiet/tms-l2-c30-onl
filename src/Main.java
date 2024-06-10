public class Main {
    public static void main(String[] args) {

        int num = 123;

        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;
        }

        int minNum = 9;
        int maxNum = 0;

        while (num != 0) {
            int num1 = num % 10;
            if (num1 > maxNum) {
                maxNum = num1;
            }
            if (num1 < minNum) {
                minNum = num1;
            }
            num /= 10;
        }
        System.out.println(minNum);
        System.out.println(maxNum);

        int number = 0;

        while (num != 0) {
            int num2 = num % 10;
            int num3 = 1 << num2;
            if ((number & num3) != 0) {

                System.out.println("break");
                break;
            }
            number |= num3;
            num /= 10;
        }

        int a = num % 10;


    }

}
