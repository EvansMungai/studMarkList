import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        int studentRollNo[] = new int[4];
        int studentMarks[][] = new int[4][4];
        String studentName[] = new String[4];
        String grade[]= new String[4], result[]=new String[4];
        Double average[] = new Double[4];
        int studentTotal[] = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the Student Roll Number: ");
            studentRollNo[i] = in.nextInt();
            System.out.print("Enter the Student Name: ");
            studentName[i] = in.next();
            System.out.println("Enter the three marks");
            for (int j = 0; j < 3; j++) {
                studentMarks[i][j] = in.nextInt();
                studentTotal[i] += studentMarks[i][j];
                average[i] = studentTotal[i] / 3.0;
            }
        }
        in.close();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (studentMarks[i][j] > 50) {
                    result[i] = "P";
                } else {
                    result[i] = "F";
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (studentMarks[i][j] > 70) {
                    grade[i] = "A";
                } else if (studentMarks[i][j] > 49) {
                    grade[i] = "B";
                } else {
                    grade[i] = "C";
                }
            }
        }
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("******************************************************************************************************");
        System.out.println("\t\t\t\t STUDENT MARKLIST");
        System.out.println("******************************************************************************************************");
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");

        for (int i = 0; i < 4; i++) {
            int j = 0;
            System.out.println(studentRollNo[i] + "\t" + studentName[i] + "\t" + studentMarks[i][j] + "\t"+ studentMarks[i][++j] + "\t" + studentMarks[i][++j] + "\t" + studentTotal[i] + "\t" + result[i] + "\t"+ df.format(average[i]) + "\t" + grade[i]);
        }
    }
}
