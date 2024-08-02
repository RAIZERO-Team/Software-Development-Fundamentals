#include <iostream>
#include <algorithm>
#include<math.h>
using namespace std;

class Date
{
private:
    int day;
    int month;
    int year;
public:
    Date(int day,int month,int year)
    {
        this->day=day;
        this->month=month;
        this->year=year;
    }
    void setDay(int day)
    {
        this->day=day;
    }
    int getDay()
    {
        return day;
    }
    void setMonth(int month)
    {
        this->month=month;
    }
    int setMonth()
    {
        return month;
    }
    void setYear(int year)
    {
        this->year=year;
    }
    int getYear()
    {
        return year;
    }
    int subtractDate(Date D1 ,Date D2)
    {
        int days1=D1.day+  D1.month*30 + D1.year*365;
        int days2=D2.day+  D2.month*30 + D2.year*365;
        int  difference= abs(days2-days1);
        return difference;
    }

};


int main()
{

   Date D1(20,6,2018);
   Date D2(21,7,2019);
  cout<< D1.subtractDate(D1,D2);

    return 0;
}



