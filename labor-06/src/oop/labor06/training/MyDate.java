package oop.labor06.training;

public class MyDate {
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

  @Override
  // toString
  public String toString() {
    return year + "." + month + "." + day;
  }
}
