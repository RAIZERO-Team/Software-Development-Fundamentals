# Author: Ahmed Maher

inputFile = r'F:\d\Github\Software\Software-Development-Fundamentals\Object-Oriented-Programming\17- Read and Write to a File\17- Read and Write to a File (Ahmed Maher)\Ma7er.txt'

try:
    with open(inputFile, 'r') as file:
        content = file.read()
        print(content)
except Exception as e:
    print(f"An error in reading the file: {e}")

try:
    with open(inputFile, 'a') as file:
        file.write("\nthis is new line")
except Exception as e:
    print(f"An error in writing to the file: {e}")
