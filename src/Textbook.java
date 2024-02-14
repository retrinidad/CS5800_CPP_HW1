public class Textbook {
    private String Title;
    private String AuthorName;
    private String Publisher;

    Textbook(String Title, String AuthorName, String Publisher){
        this.Title = Title;
        this.AuthorName = AuthorName;
        this.Publisher = Publisher;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }
}
