import java.util.Scanner;
import java.util.Random;

public class Janken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] hands = {"グー", "チョキ", "パー"};

        System.out.println("じゃんけんゲーム！");
        System.out.println("0: グー, 1: チョキ, 2: パー");
        System.out.print("選んでください: ");

        int player = scanner.nextInt();
        int cpu = random.nextInt(3);

        System.out.println("あなた: " + hands[player]);
        System.out.println("CPU: " + hands[cpu]);

        if (player == cpu) {
            System.out.println("結果: あいこ！");
        } else if ((player == 0 && cpu == 1) ||
                   (player == 1 && cpu == 2) ||
                   (player == 2 && cpu == 0)) {
            System.out.println("結果: あなたの勝ち！");
        } else {
            System.out.println("結果: あなたの負け！");
        }

        scanner.close();
    }
}