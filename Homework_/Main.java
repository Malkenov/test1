import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ClinicQueue clinicQueue = new ClinicQueue();
        while (true) {
            System.out.println("Выберите команду:");
            System.out.println("\n1 Добавить \n2 удалить \n3 вывести весь список, \n4 найти по имени \n5 выход");
            int command = scanner.nextInt();
            scanner.nextLine();
            switch(command){
                case 1 -> {
                    System.out.println("Введите имя пациента: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите возраст: ");
                    int age = scanner.nextInt();
                    System.out.println("Введите статус: ");
                    scanner.nextLine();
                    String status = scanner.nextLine();
                    clinicQueue.addPatient(name,age,status);
                    System.out.println("Пациент добавлен в список");
                }
                case 2 -> {
                    clinicQueue.removeNextPatient();
                }
                case 3 ->{
                    clinicQueue.displayQueue();
                }
                case 4 -> {
                    String name_patient = scanner.nextLine();
                    clinicQueue.findPatient(name_patient);
                }
                case 5 ->{
                    System.out.println("Выход");
                    return;
                }
            }
        }
    }
}
