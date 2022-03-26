import java.util.Scanner;

/**
 * @description: 1003 我要通过！
 * @author: Feirouz
 * @date: 2022-02-18 18:00
 * 第一版本 - 15分版本
 */

public class Test1003_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            String input = scanner.next();
            String result = pass(input);
            System.out.println(result);
        }
    }


    // 满足的有 PAT 、 PAAT 、 AAPATAA 、 AAPAATAAAA
    public static String pass(String str) {
        if (str.length() < 3) {
            return "NO";
        }
        int delCount = 0;
        if (str.charAt(0) == 'P') {
            if (check(str)) {
                return "YES";
            }
        } else if (str.charAt(0) == 'A') {
            int i;
            for (i = 0; str.charAt(i) == 'A'; i++) {
                delCount++;
            }
            // 截取
            String newStr = str.substring(i, str.length() - i);
            if (check(newStr)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static boolean check(String str) {
        if (str.length() < 3) {
            return false;
        }
        // 那么到了这里，那么首字母肯定是P
        if (str.charAt(0) != 'P') {
            return false;
        }
        if ("PAT".equals(str) || "PAAT".equals(str)) {
            return true;
        } else {
            // 正向取A和反向取A
            int i = 1;
            int leftCount = 0;
            while (str.charAt(i) == 'A') {
                i++;
                leftCount++;
            }
            int j = str.length() - 1;
            int rightCount = 0;
            while (str.charAt(j) == 'A') {
                j--;
                rightCount++;
            }
            if (leftCount == rightCount && str.charAt(i) == 'T' && str.charAt(j) == 'T' && i == j) {
                return true;
            }
        }
        return false;
    }
}