public class Fibonacchi_while {
    private static void main(String[] args) {
        int max = 10, prev = 0, next = 1;
        int i = 1;
        while (i <= max) {
            System.out.println(prev);
            int sum = prev + next;
            prev = next;
            next = sum;
            i++;
            }
        }
    }