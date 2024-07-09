#include <iostream>
#include<algorithm>
#include<string>
using namespace std;

class Calculator
{
public:
    int add(int n1,int n2){cout<<"add_int = ";cout<<n1+n2<<endl;}
    double add (double n1,double n2,double n3){cout<<"add_Double = ";cout<<n1+n2+n3<<endl;}
    int add (int arr[],int Size)
    {
        int sum =0;
        for (int i=0;i<Size;i++)
        {
            sum+=arr[i];
        }
        cout<<"Array_int = ";
        cout<<sum<<endl;
    }
    double add(double arr[],int Sizee)
    {
        int sum =0;
        for (int i=0;i<Sizee;i++)
        {
            sum +=arr[i];
        }
        cout<<"Array_Double = ";
        cout<<sum<<endl;
    }
};

int main()
{
    Calculator Calc;
    Calc.add(20,10);
    cout<<"####################"<<endl;
    Calc.add(10.2,50.2,12.2);
    cout<<"####################"<<endl;
    int Size;
    cin>>Size;
    int arr[Size];
    for(int i=0;i<Size;i++)
    {
        cin>>arr[i];
    }
    Calc.add(arr,Size);
    cout<<"######################333"<<endl;
    double arrr[]={1.2,2.4,1.2,15.2,1.0};
    int Sizee=sizeof(arr)/sizeof(arr[0]);
    Calc.add(arrr,Sizee);
    return 0;
}
