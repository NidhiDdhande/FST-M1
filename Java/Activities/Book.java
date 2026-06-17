package Activity;

abstract class Book {

    String title;

    // Abstract method
    abstract void setTitle(String title);

    // Concrete method
    String getTitle() {
        return title;
    }
}