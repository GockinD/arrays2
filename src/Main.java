public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Задача 1");
        int [] expenses = new int[5];
        expenses[0] = 12568;
        expenses[1] = 56468;
        expenses[2] = 21654;
        expenses[3] = 34844;
        expenses[4] = 56487;
        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Задача 2");
        int min = expenses[0];
        int max = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] < min) {
                min = expenses[i];
            }
        }
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > max) {
                max = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println();
        System.out.println("Задача 3");
        double average = (double) sum / expenses.length;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = 0; i < (reverseFullName.length/2); i++) {
            char temporary = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temporary;
        }
        System.out.println(reverseFullName);
    }
}