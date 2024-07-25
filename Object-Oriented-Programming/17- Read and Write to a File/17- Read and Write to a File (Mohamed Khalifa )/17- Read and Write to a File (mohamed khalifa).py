
# # create new file has name "input.txt"
path = r"F:\RaiZero\Software-Development-Fundamentals\Object-Oriented-Programming\17- Read and Write to a File\17- Read and Write to a File (Mohamed Khalifa )\input.txt"

try : 
    with open(path, 'w') as myfile : 
        myfile.write("hello\n")

    with open(path, 'a') as myfile : 
        myfile.write("line num 2 ")
        
    with open(path , 'r') as myfile  : 
        lines = myfile.readlines()
        for line in lines:
            print(line , end="")

except Exception as exception:
    # print(exception) 
    pass










