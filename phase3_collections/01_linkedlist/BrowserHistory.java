import java.util.LinkedList;

public class BrowserHistory {
    private final LinkedList<String> history;

    public BrowserHistory() {
        history = new LinkedList<>();
    }

    public void visit(String url) {
        history.addLast(url);
        System.out.println("Visiting: " + url);
        displayHistory();
    }

    public void goBack() {
        if (!history.isEmpty()) {
            String lastVisited = history.removeLast();
            System.out.println("Going back from: " + lastVisited);
        } else {
            System.out.println("No history to go back to.");
        }
        displayHistory();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("History is empty.");
        } else {
            System.out.println("Current history: " + history);
            System.out.println("Current URL: " + history.getLast());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.visit("https://github.com/brunombs");
        browserHistory.visit("https://chat.openai.com/");
        browserHistory.visit("https://w3resource.com/java-exercises");
        browserHistory.visit("https://www.google.com/");
        browserHistory.visit("https://www.x.com/");

        browserHistory.goBack();
        browserHistory.goBack();
        browserHistory.goBack();
    }
}