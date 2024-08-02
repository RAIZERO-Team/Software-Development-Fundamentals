// Author: Reem Ezzat

import java.util.ArrayList;
import java.util.List;

public class SW_Development_Fundamentals {
 

    public static void main(String[] args) {
        
               List<Message> messages =new ArrayList<>();
               TextMessageImpl message1=new TextMessageImpl();
               message1.setText("This is a test message , Can you see it?");
               VoiceMessageImpl message2=new VoiceMessageImpl();
               message2.setVoice("This is a voice message , Have you received it?");
               messages.add(message1);
               messages.add(message2);
               
              for (int i = 0; i < messages.size(); i++) {
              messages.get(i).send("reem");
              System.out.println("\nMessage Type: "+messages.get(i).getMessageType()+
                                  "\nContent : "+messages.get(i).getContent()
              );
          
          }
        
        
        
       
} }
interface Message{

    void send(String recipient);
    String getMessageType();
    String getContent();


}

interface TextMessage extends Message{
void setText(String text);
}

interface VoiceMessage extends Message{
void setVoice(String Voice);

}

class TextMessageImpl implements TextMessage{
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
        this.text=text;
    }

@Override
    public String getContent() {
        return text;
    }


}
class VoiceMessageImpl implements VoiceMessage{

    String voice;
    @Override
    public void setVoice(String Voice) {
    this.voice=Voice;
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