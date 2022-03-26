import java.util.Scanner;

/**
 * @description: 1001 害死人不偿命的(3n+1)猜想
 * @author: Feirouz
 * @date: 2022-02-18 17:58
 */

public class Test1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(callaz(n));
    }

    public static int callaz(int num) {
        int count = 0;
        while(num > 1) {
            if(num % 2 == 1) {  // 奇数
                num = (num * 3 + 1) / 2;
            } else if(num % 2 == 0) {            // 偶数
                num = num / 2;
            }
            count++;
        }
        return count;
    }
}