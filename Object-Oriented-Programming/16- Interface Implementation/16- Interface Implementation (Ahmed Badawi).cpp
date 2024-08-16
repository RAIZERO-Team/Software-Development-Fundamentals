#include <iostream>
#include <vector>
using namespace std;

class Message {
public:
  virtual string send(string recipient) = 0;
  virtual string getMessageType() = 0;
};

class TextMessage : public Message {
public:
  virtual void setText(string text) = 0;
};

class VoiceMessage : public Message {
public:
  virtual void setVoice(string voice) = 0;
};

class TextMessageImpl : public Message, TextMessage {
public:
  string text;

  string getMessageType() {
    return "It Is Text";
  }

  string send(string recipient) {
    return "Sending text message to " + recipient + " : " + this -> text;
  }

  void setText(string text) {
    this -> text = text;
  }

  string getTextContent(){
    return text;
  }
};

class VoiceMessageImpl : public Message, VoiceMessage {
public:
  string voice;

  string getMessageType() {
    return "It Is voice";
  }

  string send(string recipient) {
    return "Sending voice message to " + recipient + " : " + this -> voice;
  }

  void setVoice(string voice) {
    this -> voice = voice;
  }

  string getVoiceContent(){
    return voice;
  }
};


class MessagingApp {
public:
  vector<Message> messages;

  void addMessage(TextMessageImpl text, VoiceMessageImpl voice) {
    // messages.push_back(text);
    // messages.push_back(voice);
  }

};

int main(){
  TextMessageImpl textMessage;
  VoiceMessageImpl voiceMessage;
  MessagingApp mess;

  textMessage.setText("Hello Badawi!");

  voiceMessage.setVoice("bla bla bla");
}