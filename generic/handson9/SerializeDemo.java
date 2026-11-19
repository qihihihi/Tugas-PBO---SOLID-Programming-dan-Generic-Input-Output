import java.io.*;

public class SerializeDemo {

    static void serialize(Employee e, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(e);
            System.out.println("Serialized successfully: " + e);
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    static Employee deserialize(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Employee restored = (Employee) ois.readObject();
            System.out.println("Deserialized: " + restored);
            return restored;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        // Uji dengan beberapa objek berbeda
        Employee[] employees = {
            new Employee("John", 30),
            new Employee("Siti", 25),
            new Employee("Budi", 41)
        };

        for (int i = 0; i < employees.length; i++) {
            String file = "emp" + (i + 1) + ".ser";
            serialize(employees[i], file);
            deserialize(file);
            System.out.println();
        }
    }
}
