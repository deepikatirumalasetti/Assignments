package javaprojects;

public class phoneNum {
  private long num;

  public phoneNum(long num) {

    super();
    this.num = num;
  }

  public long getNum(long num) {

    return num;
  }

  @Override
  public String toString() {

    return "phoneNum [ num = " + this.num + " ]";
  }
}