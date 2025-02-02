import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Exercise> list = new ArrayList<Exercise>();



        while(true){

            System.out.println("Menu");
            System.out.println("[1] Add Workout");
            System.out.println("[2] Delete Workout");
            System.out.println("[3] View Workouts");

            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            switch (choice){
                case 1 -> addWorkout(list);
                case 2-> deleteWorkout(list);
                case 3 -> printList(list);
            }
        }



    }

    public static void addWorkout(ArrayList<Exercise> list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Workout Name: ");
        String workout = input.nextLine();
        System.out.println("Enter number of sets: ");
        int sets = input .nextInt();
        System.out.println("Enter number of reps: ");
        int reps = input.nextInt();

        list.add(new Exercise(workout, sets, reps));

        System.out.println("Workout Added Successfully!!!!!!!!!");

    }

    public static void deleteWorkout(ArrayList<Exercise> list){
        Scanner input = new Scanner(System.in);
        printList(list);
        System.out.println("Which workout would you like to delete: ");
        int deletion = input.nextInt();
        deletion = deletion-1;
        list.remove(deletion);


        System.out.println("Workout Deleted Successfully!!!1");
    }

    public static void printList(ArrayList<Exercise> list){
        for(Exercise exercise : list){
            System.out.println("[" + (list.indexOf(exercise)+1) +"]" + " " + exercise);
        }

    }

}