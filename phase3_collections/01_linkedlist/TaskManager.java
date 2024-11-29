import java.util.LinkedList;

public class TaskManager {
    LinkedList<String> tasks;

    public TaskManager(LinkedList<String> tasks) {
        this.tasks = tasks;
    }

    public void markTaskAsCompleted(){
        System.out.println("Task " + tasks.getFirst() + " marked as completed");
        System.out.println(tasks.size() + " pending tasks ");
        tasks.removeFirst();
    }

    public void viewTasks(){
        System.out.println("Pending tasks: " + tasks);
    }

    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        TaskManager myTasks = new TaskManager(tasks);
        tasks.add("Study Java");
        tasks.add("Practise Java Coding");
        tasks.add("Review LinkedList");
        myTasks.viewTasks();
        myTasks.markTaskAsCompleted();
        tasks.addFirst("Sleep for at least 8 hours");
        myTasks.viewTasks();

    }
}
