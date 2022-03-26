import java.util.Scanner;

/**
 * @description: 1002 写出这个数
 * @author: Feirouz
 * @date: 2022-02-18 17:59
 */

public class Test1002 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();
        int sum = longNumToShort(numStr);
        System.out.println(numToPin(sum));
    }

    public static int longNumToShort(String numStr) {
        int sum = 0;
        for(int i = 0; i < numStr.length(); i++) {
            int curNum = numStr.charAt(i) - '0';
            sum += curNum;
        }
        return sum;
    }

    public static String numToPin(int num) {
        String pin = "";
        if (num == 0) {
            pin = "ling";
        }
        while(num > 0) {
            int curBin = num % 10;
            switch (curBin) {
                case 0:
                    pin = "ling " + pin;
                    break;
                case 1:
                    pin = "yi " + pin;
                    break;
                case 2:
                    pin = "er " + pin;
                    break;
                case 3:
                    pin = "san " + pin;
                    break;
                case 4:
                    pin = "si " + pin;
                    break;
                case 5:
                    pin = "wu " + pin;
                    break;
                case 6:
                    pin = "liu " + pin;
                    break;
                case 7:
                    pin = "qi " + pin;
                    break;
                case 8:
                    pin = "ba " + pin;
                    break;
                case 9:
                    pin = "jiu " + pin;
                    break;
            }
            num /= 10;
        }
        return pin.trim();
    }

}