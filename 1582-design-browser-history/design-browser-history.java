class BrowserHistory {
    String homePage = "";
    Stack<String>history = new Stack<>();
    Stack<String>stepsBack = new Stack<>();

    public BrowserHistory(String homepage) {
        homePage = homepage;
    }
    
    public void visit(String url) {
        history.add(url);
        stepsBack.clear();
    }
    
    public String back(int steps) {
        while(steps > 0 && !history.isEmpty()){
            steps--;
            stepsBack.add(history.pop());
        }

        if(history.isEmpty())
            return homePage;
        
        return history.peek();
    }
    
    public String forward(int steps) {
        while(steps > 0 && !stepsBack.isEmpty()){
            steps--;
            history.add(stepsBack.pop());
        }

        if(history.isEmpty())
            return homePage;

        return history.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */