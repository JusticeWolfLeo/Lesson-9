public class ConsoleSum_DoWhile {
    private static void main(String[] args) {
        int num = 32148;
        do {
            int sum = 0;
            sum = sum + num % 10;
            num = num / 10;
        } while (num > 0);
        //System.out.println(sum); // почему-то не хочет работать вывод.
    }
}