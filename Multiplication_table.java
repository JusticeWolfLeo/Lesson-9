public class Multiplication_table {
    private static void main(String[] args) { // таблица умножения
        for (int i = 1; i < 11; i++)
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
                if (j % 10 == 0) { //столбики делаем аккуратные и тренируемся
                    System.out.println("");
                }
            }
    }
}