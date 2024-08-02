//Author: Shahd Mahmoud
package task16oop;

import java.util.ArrayList;
import java.util.List;

public class Task16oop {

    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        TextMessageImpl message1 = new TextMessageImpl();
        message1.setText("This is a text message , Are you ready to open it?");
        VoiceMessageImpl message2 = new VoiceMessageImpl();
        message2.setVoice("This is a voice message , Are you ready to open it?");
        messages.add(message1);
        messages.add(message2);

        for (int i = 0; i < messages.size(); i++) {

            System.out.println("Message Type: " + messages.get(i).getMessageType() + "\n"
                    + "Content : " + messages.get(i).getContent());

        }
    }

}

interface Message {

    void send(String recipient);

    String getMessageType();

    String getContent();

}

interface TextMessage extends Message {

    void setText(String text);
}

interface VoiceMessage extends Message {

    void setVoice(String Voice);

}

class TextMessageImpl implements TextMessage {

    String text;

    @Override
    public String getMessageType() {

        return "Text";
    }

    @Override
    public void send(String recipient) {

    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }

}

class VoiceMessageImpl implements VoiceMessage {

    String voice;

    @Override
    public void setVoice(String Voice) {
        this.voice = Voice;
    }

    @Override
    public String getContent() {
        return voice;
    }

    @Override
    public void send(String recipient) {
    }

    @Override
    public String getMessageType() {
        return "Voice";
    }

}
