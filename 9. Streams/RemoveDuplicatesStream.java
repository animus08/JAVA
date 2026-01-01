import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicatesStream{
    public static void main(String[] args) {

        // Create list with duplicates
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);

        // Remove duplicates using stream
        List<Integer> result = list.stream()        // Create stream
                                   .distinct()      // Remove duplicates
                                   .collect(Collectors.toList());   // Collect to list

        // Print result
        System.out.println("List after removing duplicates: " + result);
    }
}
