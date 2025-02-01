import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class ClinicQueue {

    List<Patient> extra_patient = new LinkedList<>();
    List<Patient> ordinary_patient = new LinkedList<>();


    public void addPatient(String name, int age, String status) {
        ordinary_patient.add(new Patient(name,age,status));
        if ("экстренный".equals(status)) {
            extra_patient.add(new Patient(name, age, status));
        }
    }

    public void removeNextPatient() {
        if (!extra_patient.isEmpty()) {
            extra_patient.removeFirst();
        } else if (!ordinary_patient.isEmpty()) {
            ordinary_patient.removeFirst();
        } else {
            System.out.println("Списки пустые!");
        }
    }

    public void displayQueue() {
        for (Patient extra_patients : extra_patient) {
            System.out.println(extra_patients);
        }
        for (Patient ordinary_patients : ordinary_patient) {
            System.out.println(ordinary_patients);
        }
    }

    public String findPatient(String name) {
        for (Patient pat : extra_patient) {
            if (pat.getName().equalsIgnoreCase(name)) {
                return name;
            } else {
                System.out.println("Нету такого больного");
            }
        }

        for (Patient patient_1 : ordinary_patient) {
            if (patient_1.getName().equalsIgnoreCase(name)) {
                return name;
            }else{System.out.println("Нету в плановом госпитализации");}
        } return name;
    }
}


