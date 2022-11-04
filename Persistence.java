package javaprojects;

abstract class Persistence {
  abstract public void str();
}

class filePersistence extends Persistence {
  @Override
  public void str() {

    System.out.println("Data is saved");
  }
}

class databasePersistence extends Persistence {
  @Override
  public void str() {

    System.out.println("data is saved");
  }
}

class main {
  public static void main(String[] args) {

    filePersistence f1 = new filePersistence();
    f1.str();
    databasePersistence d1 = new databasePersistence();
    d1.str();
  }
}