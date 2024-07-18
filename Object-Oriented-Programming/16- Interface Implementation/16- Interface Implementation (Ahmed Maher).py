# Author: Ahmed Maher

from abc import ABC, abstractmethod
class Message(ABC):
    @abstractmethod
    def send(self, recipient):
        pass

    @abstractmethod
    def getMessageType(self):
        pass

class TextMessage(Message):
    @abstractmethod
    def setText(self, text):
        pass

    @abstractmethod
    def getText(self):
        pass

class VoiceMessage(Message):
    @abstractmethod
    def setVoice(self, voice):
        pass

    @abstractmethod
    def getVoice(self):
        pass

class TextMessageImpl(TextMessage):
    def __init__(self):
        self.text = ""
    
    def send(self, recipient):
        return f"Sending text message to {recipient}: {self.text}"
    
    def getMessageType(self):
        return "Text Message"
    
    def setText(self, text):
        self.text = text
    
    def getText(self):
        return self.text

class VoiceMessageImpl(VoiceMessage):
    def __init__(self):
        self.voice = ""
    
    def send(self, recipient):
        return f"Sending voice message to {recipient}: {self.voice}"
    
    def getMessageType(self):
        return "Voice Message"
    
    def setVoice(self, voice):
        self.voice = voice
    
    def getVoice(self):
        return self.voice

class MessagingApp:
    def __init__(self):
        self.messages = []
    
    def addMessage(self, message):
        self.messages.append(message)
    
    def allMessages(self, recipient):
        for message in self.messages:
            print(message.send(recipient))
            print(f"Message Type: {message.getMessageType()}")
            print("*" * 100)

app = MessagingApp()

tM = TextMessageImpl()
tM.setText("Hello, this is my first a text message.")
app.addMessage(tM)

vM = VoiceMessageImpl()
vM.setVoice("Guten Tag, this is my first a voice message.")
app.addMessage(vM)

recipient = "Ahmed Ma7er"
app.allMessages(recipient)