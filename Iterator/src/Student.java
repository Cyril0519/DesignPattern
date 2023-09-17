/**
 * 学生类
 */
public class Student {
    private String name;
    private String sno;

    public Student(String name, String sno) {
        this.name = name;
        this.sno = sno;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                '}';
    }
}
