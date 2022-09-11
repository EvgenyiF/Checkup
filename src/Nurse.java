import java.util.ArrayList;
import java.util.Map;

public class Nurse implements Speaker {
    private ArrayList<Student> students;
    private Map<String, Integer> pillows;

    public Nurse(ArrayList<Student> students, Map<String, Integer> pillows) {
        this.students = students;
        this.pillows = pillows;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Map<String, Integer> getPillows() {
        return pillows;
    }

    @Override
    public void goToCheckup(ArrayList<Student> students) {
        for (Student student : students){
            if (student.isIllness()) {
                switch (student.getIlness()){
                    case temperature -> System.out.println(student.getName() + " бегом за Аспирином");
                    case cough -> System.out.println(student.getName() + " бегом за таблеткой");
                    case abrasions -> System.out.println(student.getName() + " бегом за зеленкой");
                }
            }
        }

    }
}