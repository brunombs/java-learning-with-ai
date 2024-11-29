import java.util.LinkedList;
import java.util.Scanner;

public class TaskManager {
    LinkedList<String> tasks;

    public TaskManager(LinkedList<String> tasks) {
        this.tasks = tasks;
    }

    public void markTaskAsCompleted(int num){
        System.out.println("Task " + tasks.get(num -1) + " marked as completed");
        tasks.remove(num -1);
    }

    public void viewTasks(){
        System.out.println("Pending tasks: " + tasks);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();
        TaskManager myTasks = new TaskManager(tasks);
        tasks.add("Study Java");
        tasks.add("Practise Java Coding");
        tasks.add("Review LinkedList");
        tasks.addFirst("Sleep for at least 8 hours");
        System.out.println("Which task do you want to mark as completed?: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        int markAsCompleted = scanner.nextInt();
        myTasks.markTaskAsCompleted(markAsCompleted);
        System.out.println("Which task do you want to mark as completed?: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        markAsCompleted = scanner.nextInt();
        myTasks.markTaskAsCompleted(markAsCompleted);
        myTasks.viewTasks();
    }
}
