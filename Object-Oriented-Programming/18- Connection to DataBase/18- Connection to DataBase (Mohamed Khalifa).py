import mysql.connector


from mysql.connector import Error

# Establishing the connection
try : 
        conn = mysql.connector.connect(
            user='root',
            password='',
            host='127.0.0.1',
            database='mydb1')

        # Creating a cursor object using the cursor() method
        cursor = conn.cursor()

        #  create table "employees"
        create_table_query = '''
        CREATE TABLE if not exists employees (
            id INT AUTO_INCREMENT PRIMARY KEY,
            first_name VARCHAR(50) NOT NULL,
            last_name VARCHAR(50) NOT NULL
        
        )
        '''
        cursor.execute(create_table_query)



        # insert 
        insert_query = "INSERT INTO employees( first_name , last_name)VALUES (%s, %s);"
        value = ("mohamed" , "khalifa")
        # cursor.execute(insert_query, value)
        # conn.commit()
        

        # select
        select_query = "SELECT * FROM employees"
        cursor.execute(select_query)
        employees = cursor.fetchall()
        for employee in employees:
            print("ID:", employee[0])
            print("First Name:", employee[1])
            print("Last Name:", employee[2])
            print("------------")
except Error as e : 
        print("error ", e)
            


cursor.close()
conn.close()
