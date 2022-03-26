import java.util.Scanner;

/**
 * @description: 素数对猜想
 * @author: Feirouz
 * @date: 2022-02-20 22:19
 */
public class Test1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = getCount(N);
        System.out.println(count);
    }

    public static int getCount(int n) {
        int count = 0;
        int p1 = 0, p2 = 0;
        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) {
                p2 = i;
                if (p2 - p1 == 2) {
                    count++;
                }
                p1 = p2;
            }
        }
        return count;
    }

    // 判断素数 -- 还是不够快，超时了
//    public static boolean isPrime(int num) {
//        if (num % 2 == 0) {
//            return false;
//        }
//        for (int i = 2; i <= num/2; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    // 判断素数 -- 快速比较版本 *** 六素数法
    public static boolean isPrime(int num) {
        if (num == 2 || num == 3)  {
            return true;
        }
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        for (int i = 5; i*i <= num; i += 6) {
            if (num % i == 0 || num % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }
}
