#include <iostream>
using namespace std;

class Date{
private:
  int day;
  int month;
  int year;
public:
  Date(){
    day = 0;
    month = 0;
    year = 0;
  }

  Date(int day, int month, int year){
    this -> day = day;
    this -> month = month;
    this -> year = year;
  }

  int getDay(){
    return day;
  }

  void setDay(int day){
    this -> day = day;
  }

  int getMonth(){
    return month;
  }

  void setMonth(int month){
    this -> month = month;
  }

  int getYear(){
    return year;
  }

  void setYear(int year){
    this -> year = year;
  }

  void subtractDate(Date D){
    this -> day = day - D.day;
    if (day < 0) {
      day*= -1;
    }
  }

  void printSubtractDate(){
    cout << "The Subtract Date in Days is: " << day;
  }

  void printDate(){
    // cout << day + "/" + month;
    cout << day << "/" << month << "/" << year;
  }
};

/*
Date 1: 20/6/2018
Date 2: 21/7/2019

The Subtract Date in Days is: 1
*/

int main(){
  Date date1(20,6,2018);

  Date date2;
  date2.setDay(21);
  date2.setMonth(7);
  date2.setYear(2019);

  date1.subtractDate(date2);
  date1.printSubtractDate();

  return 0;
}