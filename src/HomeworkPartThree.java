public class HomeworkPartThree{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Круг " + i);
            if (i % 2 != 0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.println("  Отжимаемся " + j);
                }
            } else {
                for (int k = 1; k < 4; k++) {
                    System.out.println("  Приседаем " + k);
                }
            }
            for (int a = 1; a <= 7; a++) {
                System.out.println("  Качаем пресс " + a);
            }
            System.out.println("Хороший темп, так держать!");
        }
        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}
       /*     // Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
            // Если да, то присесть 5 раз
            /*System.out.println("  Приседаем " + ...);

            // Иначе нужно отжаться 3 раза
        ;

            // Независимо от номера круга качаем пресс 7 раз
            System.out.println("  Качаем пресс " + ...);

            // Небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");

            System.out.println("Отлично позанимались сегодня! Вы - молодец!");
        } */