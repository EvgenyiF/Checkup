import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Map<String, Integer> pillows = new HashMap<>();


        Student student1 = new Student("Иванов", 8, true, Ilness.temperature);
        Student student2 = new Student("Петров", 10, false, Ilness.none);
        Student student3 = new Student("Сидоров", 12, true, Ilness.abrasions);
        Student student4 = new Student("Чапаев", 20, false, Ilness.none);
        Student student5 = new Student("Баранов", 15, true, Ilness.cough);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        pillows.put("Уголь", 100000);
        pillows.put("Аспирин", 10);
        pillows.put("Зеленка", 100);


        Nurse nurse = new Nurse(students, pillows);

        ComparatorByAge comparatorByAge = new ComparatorByAge();
        students.sort(comparatorByAge);

        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println("---------------");
        //Удаление методом removeIf
        students.removeIf(student -> student.getAge() > 13);
        for (Student student : students) {
            System.out.println(student.getName());
        }

        System.out.println("---------------");

        nurse.goToCheckup(nurse.getStudents());

        System.out.println("---------------");
//        Iterator
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student studen = iter.next();
            if (studen.getAge() > 13) {
                iter.remove();
            }
        }
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

