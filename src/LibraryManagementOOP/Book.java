package LibraryManagementOOP;

public class Book extends libraryItem implements Borrowable
{
    private String author;
    private boolean borrowed;

    public Book(int id, String title, String author, boolean borrowed)
    {
        super( id, title);
        this.author =author;
        this.borrowed = borrowed;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("id:  " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("author:  " + author );
        System.out.println("borrowed: " + borrowed);

    }

    @Override
    public void borrowItem()
    {
        if(borrowed)
        {
            System.out.println("The book is already borrowed");
        }
        else
        {
            borrowed = true;
            System.out.println("Book borrowed successfully");
        }
    }

    @Override
    public void returnItem()
    {
        if (!borrowed)
        {
            System.out.println(" The Book is already available");
        }
        else
        {
            borrowed= false;
            System.out.println("The Book is not available");
        }

    }

}
