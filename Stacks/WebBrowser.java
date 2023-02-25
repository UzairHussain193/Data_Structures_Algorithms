import java.util.Stack;

public class WebBrowser {

    private Stack<String> forwardStack;
    private Stack<String> backwardStack;
    private String currentPage;

    public WebBrowser() {
        forwardStack = new Stack<>();
        backwardStack = new Stack<>();
        currentPage = "";
    }

    public void visitPage(String page) {
        backwardStack.push(currentPage);
        currentPage = page;
        forwardStack.clear();
    }

    public String goBack() {
        if (!backwardStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backwardStack.pop();
            return currentPage;
        }
        return null;
    }

    public String goForward() {
        if (!forwardStack.isEmpty()) {
            backwardStack.push(currentPage);
            currentPage = forwardStack.pop();
            return currentPage;
        }
        return null;
    }

    public String getCurrentPage() {
        return currentPage;
    }

}
