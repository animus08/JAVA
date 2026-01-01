//  Write a Java program that reads a list of integers from the user 
// and throws an exception if any numbers are duplicates. 

import java.util.*;

class DuplicateElementException extends Exception {
    public DuplicateElementException(String message) {
        super(message);
    }
}

public class DuplicateElementCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {
                    if (arr[i] == arr[j]) {
                        sc.close();
                        throw new DuplicateElementException("Duplicate element found");
                    }
                }
            }
            System.out.println("No duplicate elements found");
        } 
        catch (DuplicateElementException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}


// import java.util.*;

// class DuplicateElementException extends Exception{
//     public DuplicateElementException(String message){
//         super(message);
//     }
// }
// public class Assignment3SectionBQ2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         HashSet<Integer> numbers = new HashSet<>();
//         try{
//             System.out.println("Enter 5 numbers: ");
//             for(int i = 0; i < 5; i++){
//                 int num = sc.nextInt();
//                 if(!numbers.add(num)){
//                     throw new DuplicateElementException("Duplicate Values Present");
//                 }
//             }
//             System.err.println("All values are unique");
//         }
//         catch(DuplicateElementException e){
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }


