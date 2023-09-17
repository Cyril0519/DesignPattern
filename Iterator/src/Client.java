public class Client {
    public static void main(String[] args) {
        StudentAggregate aggregate = new StudentAggregateImpl();
        for (int i = 0; i < 10; i++) {
            aggregate.addStudent(new Student(i + "name", i + "sno"));
        }
        StudentIterator studentIterator = aggregate.getStudentIterator();
        while (studentIterator.hashNext()) {
            Student next = studentIterator.next();
            System.out.println(next);
        }
    }
}