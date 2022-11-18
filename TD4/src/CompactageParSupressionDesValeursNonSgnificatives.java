import java.util.Scanner;
public class CompactageParSupressionDesValeursNonSgnificatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        for (int i = 0; i < 10; i++) {
            tab[i] = scanner.nextInt();
        }
        int[] tab2 = new int[10];
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (tab[i] != 0) {
                tab2[j] = tab[i];
                j++;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(tab2[i] + " ");
        }
    }
}