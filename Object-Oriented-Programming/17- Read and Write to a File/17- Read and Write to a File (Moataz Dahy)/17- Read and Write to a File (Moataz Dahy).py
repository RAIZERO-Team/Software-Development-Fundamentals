'''Mo aT aZ  D a H y'''
try:
    file_path = r'D:\OPP\Software-Development-Fundamentals\Object-Oriented-Programming\17- Read and Write to a File\17- Read and Write to a File (Moataz Dahy)\input.txt'
    
    with open(file_path, 'r') as file:
        original_content = file.read()
        print("Original content:")
        print(original_content)
except FileNotFoundError:
    print("The file 'input.txt' does not exist.")

try:
    file_path = r'D:\OPP\Software-Development-Fundamentals\Object-Oriented-Programming\17- Read and Write to a File\17- Read and Write to a File (Moataz Dahy)\input.txt'
    with open(file_path, 'a') as file:
        file.write("it's very good\n")
        
except Exception:
    print("An error occurred while writing to the file.")