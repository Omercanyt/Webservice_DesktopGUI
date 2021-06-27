package sample;

public class Comment {
    private String comment;
    private String string;
    private String product;

    public Comment() {
    }

    public Comment(String comment, String string, String product) {
        this.comment = comment;
        this.string = string;
        this.product=product;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
