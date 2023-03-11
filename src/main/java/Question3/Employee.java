package Question3;

public class Employee {
        private static int nextId = 1;
        private int id;

        public Employee()
        {
            id = nextId;
            nextId++;
        }

        public int getId()
        {
            return id;
        }
        public static void main(String[] args)
        {
            Employee emp1 = new Employee();
            Employee emp2 = new Employee();
            System.out.println(emp1.getId());
            System.out.println(emp2.getId());
        }
}


