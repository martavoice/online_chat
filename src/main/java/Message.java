/**
 * Created by Марта on 07.04.2017.
 */
public class Message {
    private final MessageType type;
    private final String data;

    public Message(MessageType type, String data) {
        this.type = type;
        this.data = data;
    }

    public Message(MessageType type) {
        this.type = type;
        this.data = null;

    }

    public MessageType getType() {

        return type;
    }

    public String getData() {
        return data;
    }
}
