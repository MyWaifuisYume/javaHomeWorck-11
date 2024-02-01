public class Meeting extends Task {
    private String topic;
    private String projeck;
    private String start;

    public Meeting(int id, String topic, String projeck, String start) {
        super(id);
        this.topic = topic;
        this.projeck = projeck;
        this.start = start;
    }

    public String getTopic() {
        return topic;
    }

    public String getProjeck() {
        return projeck;
    }

    public String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        } else if (projeck.contains(query)) {
            return true;
        } else {
            return false;
        }
    }
}
