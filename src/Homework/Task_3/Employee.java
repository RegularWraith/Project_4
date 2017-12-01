package Homework.Task_3;

import java.util.Scanner;

public class Employee {
    public enum Departament {Business_Office, Facility_Operations_and_Planning, University_Relations}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String department_name = null;
        int salary = 0;
        int i;
        String[] arr_names = new String[5];
        String[] arr_dep_names = new String[5];
        int[] arr_salary = new int[5];
        System.out.println("Insert array elements: ");
        for (i = 0; i < 5; i++) {
            arr_names[i] = sc.nextLine();
        }
        System.out.println("Inserted array elements: ");
        for (i = 0; i < 5; i++) {
            System.out.print(" | " + arr_names[i]); 
        }
        System.out.println(" ");
        System.out.println("Insert array elements: ");
        for (i = 0; i < 5; i++) {
            arr_dep_names[i] = sc.nextLine();
            Departament dep_name;
            switch (arr_dep_names[i]) {
                case "Business Office Accounting":
                case "Accounts Payable":
                case "USI Campus Store":
                    dep_name = Departament.Business_Office;
                    System.out.println("This is Business_Office");
                    break;
                case "Grounds":
                case "Custodial Services":
                case "Distribution Services":
                    dep_name = Departament.Facility_Operations_and_Planning;
                    System.out.println("This is Facility_Operations_and_Planning");
                    break;
                case "Academic Skills":
                case "Career Counseling":
                case "Disability Resources":
                    dep_name = Departament.University_Relations;
                    System.out.println("This is University_Relations");
                    break;
                default:
                    System.out.println("No this departament");
            }
        }
        System.out.println("Inserted array elements: ");
        for (i = 0; i < 5; i++) {
            System.out.print(" | " + arr_dep_names[i]);
            
        }
        System.out.println(" ");
        System.out.println("Insert array elements: ");

        for (i = 0; i < 5; i++) {
            arr_salary[i] = sc.nextInt();
        }
        int last = 5;

        for ( boolean sorted = last == 0; !sorted; --last )
        {
            sorted = true;
            for (  i = 1; i < last; ++i )
            {
                if ( arr_salary[i-1] < arr_salary[i] )
                {
                    sorted = false;

                    int tmp = arr_salary[i-1];
                    arr_salary[i-1] = arr_salary[i];
                    arr_salary[i] = tmp;
                }
            }
        }
        System.out.println("");
       System.out.println("Inserted array elements: ");
        for (i = 0; i < 5; i++) {
            System.out.print(" | " + arr_salary[i]);
        }
        for(i = 1; i < 5; i++)
        {
            for(int j = i; (j >= 1) && (arr_salary[j] < arr_salary[j - 1]); j--)
            {
                int a = arr_salary[j];
                arr_salary[j] = arr_salary[j-1];
                arr_salary[j-1] = a;
            }
        }
        System.out.println("");
        System.out.println("Inserted array elements: ");
        for (i = 0; i < 5; i++) {
            System.out.print(" | " + arr_salary[i]);
        }
    }
}
