public class Fibonacchi_do_while {
    private static void main(String[] args) {
        int max = 10, prev = 0, next = 1;
        int i = 1;
        do {
            System.out.println(prev);
            int sum = prev + next;
            prev = next;
            next = sum;
            i++;
        } while (i <= max);
    }
}
