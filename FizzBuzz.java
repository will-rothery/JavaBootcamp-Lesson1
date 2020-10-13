import java.util.*;

public class FizzBuzz {
    
    public static void main(String... args) {
        int maxValue = getMaxValue();
        

        for (int i = 1; i <= maxValue; i++) {
            List<String> strList = new ArrayList<String>();
           
            //  divisible by 3, print "Fizz"
            if (i % 3 == 0) {
                strList.add("Fizz");
            }

            //  divisible by 13, print "Fezz", place before all words starting with "B"
            if (i % 13 == 0) {
                strList.add("Fezz");
            }

            //  divisible by 5, print "Buzz"
            if (i % 5 == 0) {
                strList.add("Buzz");
            }

            //  divisible by 7, print "Bang"
            if (i % 7 == 0) {
                strList.add("Bang");
            }
            
            //  divisible by 11, print "Bong"
            if (i % 11 == 0) {
                strList.clear();

                // exception of 13
                if (i % 13 == 0) {
                    strList.add("FezzBong");
                } else {
                    strList.add("Bong");
                }
            }

            
            if (i % 17 == 0) {
                Collections.reverse(strList); //reverses the current order of all items within the list if divisible by 17
            }
            if (strList.size() == 0) { //if there is nothing within the list, print the number
                System.out.println(i);
            } else { //otherwise, print the joined list (joins with no spaces as a string)
                System.out.println(String.join("",strList));
            }
        }
    }

    private static int getMaxValue() {

        boolean isTyped = false;
        int maxValue = 0;
        
        int count = 0;
        int maxTries = 3;

        while (!isTyped){
            try { 
                Scanner sc = new Scanner(System.in); // initialises scanner object
                System.out.println("Enter max value: "); // prompt for input
                maxValue = sc.nextInt(); // checks for next integer typed
                
                isTyped = true;
                sc.close();
                
            } catch(Exception e) {
                System.out.println("Error, NaN!");
                count ++;
                if(count >= maxTries) { //max tries to prevent infinite loop
                    break;
                }
            }      
        } 
        return maxValue;

    private static int toggleRule() {
        
        boolean b = false;
        try {
            System.out.print("Toggle Rule?");
            Scanner n = new Scanner(System.in);
            boolean bn = n.nextBoolean();
            if (bn == true) {
                // Do shit;
            } else if (bn == false) {
                // Don't do shit;
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        };
    }

    }