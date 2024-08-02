
from abc import ABC , abstractmethod

class Message(ABC) : 

    @abstractmethod
    def  send(self , recipient) : 
        ...

    @abstractmethod
    def getMessageType() : 
        ...

class TextMessage(Message) :

    def __init__(self , text) -> None:
        self.__text = text

    def setText(self , text) : 
        self.__text = text

    def getText(self) :
        return self.__text
    
    def getMessageType(self) :
        return "Text"    
    
    def  send(self , recipient) : 
        return f"sending text messege to {recipient}" 


class VoiceMessage(Message) :

    def __init__(self , voice) -> None:
        self.__voice = voice

    def setVoice(self , voice) : 
        self.__voice = voice

    def getVoice(self) :
        return self.__voice

    def getMessageType(self) :
        return "Voice"

    def  send(self , recipient) : 
        return f"sending voice messege to {recipient}"    

class MessagingApp:
    def __init__(self):
        self.messages = []

    def pushMessage(self, message):
        self.messages.append(message)

    def process_messages(self, recipient):
        for message in self.messages:
            message.send(recipient)
            print(f"Message Type: {message.getMessageType()}")
            if isinstance(message, TextMessage):
                print(f"Content: {message.getText()}" , end="\n")
            elif isinstance(message, VoiceMessage):
                print(f"Content: {message.getVoice()}" , end="\n")
           

textmessage = TextMessage("hi , how about you")

voicemessage = VoiceMessage("good morning bro")

messagingapp = MessagingApp()
messagingapp.pushMessage(textmessage)
messagingapp.pushMessage(voicemessage)

messagingapp.process_messages("khalifa")



    


