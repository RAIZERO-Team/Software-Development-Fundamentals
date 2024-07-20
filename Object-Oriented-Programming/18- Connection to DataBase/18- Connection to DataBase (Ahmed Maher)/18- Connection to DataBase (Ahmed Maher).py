# Author: Ahmed Maher

import mysql.connector
from mysql.connector import Error

class DatabaseManager:
    def __init__(self, host, user, password, database, port=3306):
        self.host = host
        self.user = user
        self.password = password
        self.database = database
        self.port = port
        self.connection = None

    def connect(self):
        try:
            self.connection = mysql.connector.connect(
                host=self.host,
                user=self.user,
                password=self.password,
                database=self.database,
                port=self.port,
                charset='utf8'  # Specify a character set supported by your MySQL server
            )
            if self.connection.is_connected():
                print("Successfully connected to the database")
        except Error as e:
            print(f"Error: {e}!!")

    def close_connection(self):
        if self.connection and self.connection.is_connected():
            self.connection.close()
            print("Connection closed")

manage = DatabaseManager('127.0.0.1', 'root', 'mody', 'film_database')
manage.connect()
manage.close_connection()
