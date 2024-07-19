'''Moataz Dahy'''

from abc import ABC, abstractmethod


class Messager(ABC):
    @abstractmethod
    def send(self, message):
        pass

    @abstractmethod
    def get_messagetype(self):
        pass

class TextMessage(Messager):
    def __init__(self, text):
        self.text = text

    def send(self, recipient):
        print(f"Sending text message to {recipient}: {self.text}")

    def get_messagetype(self):
        return "text"

    def get_text(self):
        return self.text

class VoiceMessage(Messager):
    def __init__(self, voice):
        self.voice = voice

    def send(self, recipient):
        print(f"Sending voice message to {recipient}: {self.voice}")

    def get_messagetype(self):
        return "voice"

    def get_voice(self):
        return self.voice

class MessagingApp:
    def __init__(self):
        self.messages = []

    def add_message(self, message: Messager):
        self.messages.append(message)

    def send_messages(self, recipient):
        for message in self.messages:
            message.send(recipient)
            print(f"Message Type: {message.get_messagetype()}\n")


app = MessagingApp()

text_msg = TextMessage("Hi, Everyone!")
app.add_message(text_msg)

voice_msg = VoiceMessage("blah blah blah")
app.add_message(voice_msg)

app.send_messages("Moataz")
