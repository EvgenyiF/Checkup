public class Student {
    private String name;
    private int age;
    private boolean illness;
    private Ilness ilness;


    public Ilness getIlness() {
        return ilness;
    }

    public void setIlness(Ilness ilness) {
        this.ilness = ilness;
    }

    public Student(String name, int age, boolean illness, Ilness ilness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.ilness = ilness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public boolean isIllness() {
        return illness;
    }

    public void setIllness(boolean illness) {
        this.illness = illness;
    }

}