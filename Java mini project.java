import java.util.Scanner;

public class AttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int days, students, choice;

        // Input total working days
        System.out.print("Enter the total number of days: ");
        days = sc.nextInt();

        // Input total students in class
        System.out.print("Enter the total number of students: ");
        students = sc.nextInt();

        // Array to store roll numbers
        int[] rollno = new int[students];

        // Array to store student names
        String[] name = new String[students];

        // 2D array to store attendance
        // attendance[i][j] → i = student index, j = day index
        int[][] attendance = new int[students][days];

        // Boolean array to track whether a particular day is marked or not
        // dayMarked[j] = true → attendance marked for day j
        boolean[] dayMarked = new boolean[days];

        // Variable to count how many days have been marked
        int markedDays = 0;

        // Initialize attendance with -1 (means not marked yet)
        for(int i = 0; i < students; i++) {
            for(int j = 0; j < days; j++) {
                attendance[i][j] = -1;
            }
        }

        System.out.println("\nEnter details of students");

        // Input student details
        for(int i = 0; i < students; i++) {

            System.out.print("Enter roll number: ");
            rollno[i] = sc.nextInt();

            sc.nextLine(); // Clear input buffer

            System.out.print("Enter the name: ");
            name[i] = sc.nextLine();
        }

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. View Attendance Record");
            System.out.println("3. Attendance Percentage & Shortage");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                // -------------------------------
                // CASE 1 → MARK ATTENDANCE
                // -------------------------------
                case 1:

                    // dayNumber → which day user wants to mark
                    System.out.print("Enter day number (1 to " + days + "): ");
                    int dayNumber = sc.nextInt();

                    // Validate day number
                    if(dayNumber < 1 || dayNumber > days) {
                        System.out.println("Invalid Day!");
                        break;
                    }

                    // Check if attendance already marked for that day
                    if(dayMarked[dayNumber - 1]) {
                        System.out.println("Attendance already marked for this day!");
                        break;
                    }

                    System.out.println("\nMarking Attendance for Day " + dayNumber);

                    // Loop through all students and mark attendance
                    for(int i = 0; i < students; i++) {

                        System.out.print("Roll No " + rollno[i] +
                                " (" + name[i] + ") - Present(1) / Absent(0): ");

                        // Store attendance for that student on that day
                        attendance[i][dayNumber - 1] = sc.nextInt();
                    }

                    // Mark this day as completed
                    dayMarked[dayNumber - 1] = true;

                    // Increase count of marked days
                    markedDays++;

                    break;


                // -------------------------------
                // CASE 2 → VIEW ATTENDANCE RECORD
                // -------------------------------
                case 2:

                    System.out.println("\nAttendance Record");

                    for(int i = 0; i < students; i++) {

                        System.out.println("Roll No: " + rollno[i] +
                                " Name: " + name[i]);

                        for(int j = 0; j < days; j++) {

                            // If day is marked, show attendance
                            if(dayMarked[j])
                                System.out.println("Day " + (j+1) +
                                        ": " + attendance[i][j]);

                            // If not marked, show Not Marked
                            else
                                System.out.println("Day " + (j+1) +
                                        ": Not Marked");
                        }
                        System.out.println();
                    }
                    break;


                // -------------------------------
                // CASE 3 → CALCULATE PERCENTAGE & SHORTAGE
                // -------------------------------
                case 3:

                    // If no day marked, cannot calculate percentage
                    if(markedDays == 0) {
                        System.out.println("No attendance marked yet!");
                        break;
                    }

                    System.out.println("\nAttendance Percentage Report");

                    for(int i = 0; i < students; i++) {

                        // presentCount → counts how many days student was present
                        int presentCount = 0;

                        for(int j = 0; j < days; j++) {

                            // Count only marked days
                            if(dayMarked[j] && attendance[i][j] == 1)
                                presentCount++;
                        }

                        // Percentage formula:
                        // Present Days / Marked Days × 100
                        double percentage =
                                (presentCount * 100.0) / markedDays;

                        System.out.printf("Roll No: %d Name: %s -> %.2f%%",
                                rollno[i], name[i], percentage);

                        // If attendance less than 75% → shortage
                        if(percentage < 75)
                            System.out.print("  **SHORTAGE**");

                        System.out.println();
                    }

                    break;


                // -------------------------------
                // CASE 4 → EXIT PROGRAM
                // -------------------------------
                case 4:
                    System.out.println("Exiting Program...");
                    break;


                // -------------------------------
                // DEFAULT CASE → INVALID INPUT
                // -------------------------------
                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}
