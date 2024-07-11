
class Calculator:
    def add(self, *args) :
        """Add numbers"""
        if len(args) == 2 and all(isinstance(x, int) for x in args):
            return args[0] + args[1]
        
        elif len(args) == 3 and all(isinstance(x, (int, float)) for x in args):
            return sum(args)
        
        elif isinstance(args[0], list) and all(isinstance(x, int) for x in args[0]):
            return sum(args[0])
        
        elif isinstance(args[0], list) and all(isinstance(x, (int, float)) for x in args[0]):
            return sum(args[0])
        else:
            raise ValueError("Invalid arguments")



calculator = Calculator()

print("Add two integers           :", calculator.add(10, 20))

print("Add three doubles          :", calculator.add(10.5, 20.7, 30.9))

print("Add all integers in a list :", calculator.add([10, 20, 30, 40, 50]))

print("Add all doubles in a list  :", calculator.add([10.5, 20.7, 30.9, 40.1, 50.3]))


