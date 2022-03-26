import java.util.Scanner;

/**
 * @description: 1011 A+B 和 C
 * @author: Feirouz
 * @date: 2022-02-18 22:36
 * 注意点在 a/b/c 的区间，他给定是闭区间，在2^(-31)到2^31里的整数
 * 但是！int的范围左边符合，右边还要-1（其实是分正负0，多了一个-0给负数了），左闭右开，所以正好碰到那个数就炸了。
 * 改成 long以后，范围延长到 2^63，即[-2^63,2^63) ，左闭右开，问题解决。
 */

public class Test1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            long c = scanner.nextInt();

            System.out.println("Case #" + (i + 1) + ": " + IsGreaterThan(a, b, c));
        }
    }

    public static boolean IsGreaterThan(long a, long b, long c) {
        if (a + b > c) {
            return true;
        }else {
            return false;
        }
    }
}
