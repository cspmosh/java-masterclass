import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){

        Player frodo = new Player("Frodo Baggins", 1, 1, "Sting");
        Player gandalf = new Player();

        System.out.println(frodo);

        saveObjec(frodo);

        frodo.setHitPoints(2);
        System.out.println(frodo);

        loadObject(gandalf);
        System.out.println(gandalf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObjec(Saveable object){
        for (int i = 0; i < object.save().size(); i++){
            System.out.println("saving " + object.save().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable object){
        ArrayList<String> values = readValues();
        object.restore(values);
    }
}
