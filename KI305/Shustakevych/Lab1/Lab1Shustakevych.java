package KI305.Shustakevych.Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/** Клас  Lab1Shustakevych реалізує лабораторну роботу №1
*
* @author Vladyslav Shustakevych
* @version 1.0
* @since version 1.0
*
*/

public class Lab1Shustakevych {
   /**
    *
    * @param args
    * @throws FileNotFoundException
    */
   public static void main(String[] args) throws FileNotFoundException {
       int nRows;
       char[][] arr;
       String filler;
       Scanner in = new Scanner(System.in);
       File dataFile = new File("MyFile.txt");
       PrintWriter fout = new PrintWriter(dataFile);


       System.out.print("Введіть розмір квадратної матриці: ");
       nRows = in.nextInt();
       in.nextLine();


       arr = new char[nRows][nRows];


       System.out.print("\nВведіть символ-заповнювач: ");
       filler = in.nextLine();

       if (filler.length() != 1) {
           System.out.println("Помилка: має бути введено один символ.");
           return;
       }

       char fillChar = filler.charAt(0);


       for (int i = 0; i < nRows; i++) {
           for (int j = 0; j < nRows; j++) {
               if (j > i) {
                   arr[i][nRows - 1 - j] = fillChar;
               }
           }
       }

       for (int i = 0; i < nRows; i++) {
           for (int j = 0; j < nRows; j++) {
               if (arr[i][j] == fillChar) {
                   System.out.print(arr[i][j] + " ");
                   fout.print(arr[i][j] + " ");
               } else {
                   System.out.print("  ");
                   fout.print("  ");
               }
           }
           System.out.print("\n");
           fout.print("\n");
       }

       fout.flush();
       fout.close();
   }
}

