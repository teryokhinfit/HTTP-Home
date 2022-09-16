import com.fasterxml.jackson.annotation.JsonProperty;


public class Cats {

    public String id;
    public String text;
    public String type;
    public String user;
    public int upvotes;

    public Cats(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") int upvotes
    ) {

        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;

    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return " User Id : " + id
                + "\n User : " + user
                + "\n Type : " + type
                + "\n Text : " + text
                + "\n Upvotes : " + upvotes;
    }
}