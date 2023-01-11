import java.util.ArrayList;
public class Material {
    private String title;
    private String picture;

    private ArrayList<String> topics = new ArrayList<String>();

    Material(String title, String picture, String[] topics){
        this.title = title;
        this. picture = picture;
        for(int i = 0; i< topics.length; i++) {
            this.topics.add(topics[i]);
        }
    }

    public String getTitle() {
        return this.title;
    }
    public String getPicture() {
        return this.picture;
    }

    public  ArrayList<String> getTopics() {
        return this.topics;
    }
}
