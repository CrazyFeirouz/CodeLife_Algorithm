import java.util.Scanner;

/**
 * @description: 1004 成绩排名
 * @author: Feirouz
 * @date: 2022-02-18 22:15
 */
public class Test1004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] namelist = new String[n];
        String[] sublist = new String[n];
        int[] scorelist = new int[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String sub = scanner.next();
            int score = scanner.nextInt();
            namelist[i] = name;
            sublist[i] = sub;
            scorelist[i] = score;
        }

        int[] maxAndMinIndex = getMaxAndMinIndex(scorelist);
        int maxIndex = maxAndMinIndex[0];
        int minIndex = maxAndMinIndex[1];
        System.out.println(namelist[maxIndex] + " " + sublist[maxIndex]);
        System.out.println(namelist[minIndex] + " " + sublist[minIndex]);

    }

    public static int[] getMaxAndMinIndex(int[] arr) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return new int[]{maxIndex, minIndex};
    }

}
