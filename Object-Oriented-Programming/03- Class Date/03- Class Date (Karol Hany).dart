
class Date {
  int _day;
  int _month;
  int _year;

  Date({required int day, required int month, required int year})
      : _day = day,
        _month = month,
        _year = year;

  int get day => _day;

  set day(int value) {
    if (value > 0 && value <= 31) {
      _day = value;
    } else {
      print("Invalid Day");
    }
  }

  int get month => _month;

  set month(int value) {
    if (value > 0 && value <= 12) {
      _month = value;
    } else {
      print("Invalid Month");
    }
  }

  int get year => _year;

  set year(int value) {
    _year = value;
  }

  int subtractDate(Date date) {
    final date1 = DateTime(_day, _month, _year);
    final date2 = DateTime(date.day, date.month, date.year);
    final diff = date1.difference(date2).inDays;
    return diff.abs();
  }

  void printDate() {
    print("$_day/$_month/$_year");
  }
}

void main() {
  Date date1 = Date(day: 20, month: 6, year: 2018);
  Date date2 = Date(day: 21, month: 7, year: 2019);
  date1.printDate();
  date2.printDate();
  print("The Differencen Days between two Dates is: ${date1.subtractDate(date2)}");
}
