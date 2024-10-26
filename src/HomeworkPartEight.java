import java.util.Scanner;

public class HomeworkPartEight {
    public static void main(String[] args) {
        // Ниже объявите пустой массив expenses для записи трат за неделю
        int[] expenses = new int[7];

        double rateUSD = 450;
        double rateEUR = 500;
        double rateJPY = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 — Конвертировать валюту");
            System.out.println("2 — Получить совет");
            System.out.println("3 - Ввести трату"); // Допишите вывод нового пункта меню
            System.out.println("4 - Показать траты за неделю");
            System.out.println("0 — Выход");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " KZT");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                if (currency == 1) {
                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("Неизвестная валюта");
                }
            } else if (command == 2) {
                if (moneyBeforeSalary < 15_000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 50_000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                    }
                } else if (moneyBeforeSalary < 150_000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    } else {
                        System.out.println("Окей, пора в Макдак!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Отлично! Заказывайте крабов!");
                    } else {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    }
                }
            } else if (command == 3) { // Ещё одно ветвление для обработки новой команды, допишите его условие
                // Допишите код для печати сообщения для пользователя
                // Текст сообщения: "За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?"
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                // Получите из консоли день, за который пользователь хочет указать расходы
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();

                moneyBeforeSalary -= expense; // Уменьшите баланс на сумму введённой траты
                expenses[day - 1] += expense;// Сохраните трату в массив

                System.out.println("Значение сохранено! Ваш текущий баланс в тенге: " + moneyBeforeSalary);

                if (moneyBeforeSalary < 5000) {
                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");// Проверьте текущее значение баланса — не опустилось ли оно ниже отметки в 5000 тенге
                }
            } else if (command == 4) {
                for(int i = 0;i < expenses.length; i++){
                    System.out.println("День " + (i+1) + "." + "Потрачена " + expenses[i] + "тенге");
            }

            // Выведите предупреждение: "На вашем счету осталось совсем немного. Стоит начать экономить!"

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}

