package generics.inheritance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BasicInheritance {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add("Hello");
        objects.add(LocalDate.now());
        objects.add(3);

        System.out.println(objects);  // [Hello, 2016-11-08, 3]

        List<String> strings = new ArrayList<>();
        Object object = "Hello";  // okay
        // strings.add(object); // Does not compile
    }

}
