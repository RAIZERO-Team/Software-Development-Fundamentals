'''Mo aT aZ  Da Hy'''

import mysql.connector
from mysql.connector import Error

try:
    connection = mysql.connector.connect(
        host='127.0.0.1',
        user='root',
        password='',  
        database='testtt20',
        charset='utf8'  
    )
    
    if connection.is_connected():
        
        print("Successfully connected to MySQL database")
        
except Error as e:
    
    print(f"Error: {e}")
    
finally:
    
    try:
        
        if connection.is_connected():
            
            connection.close()
            
            print("MySQL connection is closed")
            
    except NameError:
        
        print("Connection was never established")


