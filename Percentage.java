import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
        double maxMarks = 0, obtainedMarks = 0, percentage;
        Scanner read = new Scanner(System.in);

        
        do {
            System.out.println("Enter maximum marks: ");
            maxMarks = read.nextDouble();
            if (maxMarks <= 0) {
                System.out.println("Maximum marks cannot be zero or negative. Please enter again!");
            }
        } while (maxMarks <= 0);

        // Loop for valid obtained marks
        do {
            System.out.print("Enter obtained marks: ");
            obtainedMarks = read.nextDouble();
            if (obtainedMarks > maxMarks) {
                System.out.println("Obtained marks can't be greater than maximum marks! Please enter again.");
            } 
        } while (obtainedMarks > maxMarks );

        // Calculate percentage
        percentage = (obtainedMarks / maxMarks) * 100;
        System.out.println("Percentage: " + percentage + "%");

        read.close();
    }
}
