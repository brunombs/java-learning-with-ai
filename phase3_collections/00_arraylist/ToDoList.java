import java.util.ArrayList;

public class ToDoList {
    static ArrayList<String> ToDoList = new ArrayList<>();

    public static void main(String[] args) {
        ToDoList.add("Sleep for at least 8 hours");
        ToDoList.add("Walk for 30 minutes");
        ToDoList.add("Study for at least 1 hour");
        ToDoList.add("Eat healthy");
        ToDoList.add("Watch an episode of Friends");

        System.out.println("-----To Do List-----");
        for(String ToDo : ToDoList){
            System.out.println("* " + ToDo);
        }

        System.out.println("\n" + ToDoList.get(2) + " STATUS: done");
        ToDoList.remove(2);

        System.out.println("\n-----UPDATED To Do List-----");
        for(String ToDo : ToDoList){
            System.out.println("* " + ToDo);
        }

    }
}
