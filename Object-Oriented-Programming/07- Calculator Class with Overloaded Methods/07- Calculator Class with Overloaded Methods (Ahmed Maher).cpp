#include <iostream>
using namespace std;

class Calculatorr
{
public:
    int add (int num1, int num2 )

    {
        return num1 +  num2 ;
    }

    double add (double num1, double num2, double num3 )
    {
        return num1 +  num2 + num3;

    }

    int add (int arr [],int Size)
    {
        int sum = 0;
        for (int i = 0 ; i <Size ; i++)
        {
            sum += arr[i] ;

        }
        return sum;
    }


    double add (double arr [],int Size )
    {
        int sum = 0;
        for (int i = 0 ; i < Size ; i++)
        {
            sum += arr[i] ;
        }
        return sum;
    }
};



int main()
{
    Calculatorr c1;

    cout<< "the summation of function one : " << c1.add(5, 10) << endl;
    cout<< "the summation of function two : " << c1.add(62.5, 7.75, 8.5) << endl;

    cout << "Enter The size of array : ";
    int Size;
    cin>>Size;
    int arr[Size];
    for(int i=0; i<Size; i++)
    {
        cout << "Enter The element " << i + 1 << " : ";
        cin>>arr[i];
    }

    cout<< "the summation of function three : " <<c1.add(arr,Size) << endl;

}