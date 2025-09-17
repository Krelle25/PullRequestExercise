public class TestAfPullRequest {
    private String test;
    private int number;
    private boolean isActive;

    public TestAfPullRequest() {
    }

    public TestAfPullRequest(String test, int number, boolean isActive) {
        this.test = test;
        this.number = number;
        this.isActive = isActive;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
