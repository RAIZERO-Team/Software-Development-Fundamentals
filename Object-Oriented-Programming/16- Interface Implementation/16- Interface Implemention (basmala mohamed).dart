// Author: basmala mohamed
void main() {
  TextMessageImpl text = TextMessageImpl('Hello, this is a test message');
  VoiceMessageImpl voice = VoiceMessageImpl('Hello, this is a voice message');
  text.send('basmala');
  print('Text Message');
  print('Message Type: ${text.getMessageType()}');
  print('Content: ${text.getContent()}');

  print(' ');

  voice.send('basmala');
  print('Voice Message');
  print('Message Type: ${voice.getMessageType()}');
  print('Content: ${voice.getContent()}');
}

abstract class Message {
  void send(String recipient);
  String getMessageType();
  String getContent();
}

abstract class TextMessage implements Message {
  void setText(String text);
}

abstract class VoiceMessage implements Message {
  void setVoice(String voice);
}

class TextMessageImpl implements TextMessage {
  String _text;

  TextMessageImpl(this._text);

  @override
  String getMessageType() => 'Text Message';

  @override
  void send(String recipient) {
    print('Sending text message to $recipient');
  }

  @override
  void setText(String text) => _text = text;

  @override
  String getContent() => _text;
}

class VoiceMessageImpl implements VoiceMessage {
  String _voice;

  VoiceMessageImpl(this._voice);

  @override
  String getMessageType() => 'Voice Message';

  @override
  void send(String recipient) {
    print('Sending voice message to $recipient');
  }

  @override
  void setVoice(String voice) => _voice = voice;

  @override
  String getContent() => _voice;
}