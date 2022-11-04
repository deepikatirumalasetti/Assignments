package javaprojects;

public class contactList {
  private String name;

  private String gender;

  public contactList(String name, String gender) {

    super();
    this.name = name;
    this.gender = gender;
  }

  public String getName() {

    return this.name;
  }

  public String getGender() {

    return this.gender;
  }

  @Override
  public String toString() {

    return "contactList[ name = " + this.name + " , gender = " + this.gender + " ]";
  }
}