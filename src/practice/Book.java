package practice;

abstract class AbsBook {
  String title;

  abstract void setTitle(String s);

  String getTitle() {
    return title;
  }

}

class ImplBook extends AbsBook {

   void setTitle(String txt) {
    title = txt;
  }

}

public class Book {
  public static void main(String[] args) {
    ImplBook myBook = new ImplBook();

    myBook.setTitle("Pump like a iron rod");

    System.out.println(myBook.getTitle());
  }
}

