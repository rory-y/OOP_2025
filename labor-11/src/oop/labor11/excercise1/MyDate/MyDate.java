package oop.labor11.excercise1.MyDate;
import oop.labor11.excercise1.DateUtil.DateUtil;

public class MyDate implements Comparable<MyDate> {
  private int year;
  private int month;
  private int day;

  // constructor
  public MyDate(int year, int month, int day) {
    if (DateUtil.isValidDate(year, month, day)) {
      this.year = year;
      this.month = month;
      this.day = day;
    }
  }

  // gets
  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  // compare rule | implement Comparable methods
  @Override
  public int compareTo(MyDate that) {
    // this > < = that
    if(this.year == that.year){
      if(this.month == that.month){
        return this.day - that.day;
      }
      return this.month - that.month;
    }
    return this.year - that.year;
  }

  @Override
  // toString
  public String toString() {
    return "YYYY/MM/DD: " + year + "/" + month + "/" + day;
  }
}
