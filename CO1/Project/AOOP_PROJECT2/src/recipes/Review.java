package recipes;

public class Review {
    private String user;
    private String comment;

    public Review(String user, String comment) {
        this.user = user;
        this.comment = comment;
    }

    public String getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }
}
