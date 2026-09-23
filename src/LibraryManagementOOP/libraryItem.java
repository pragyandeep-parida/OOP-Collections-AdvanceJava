package LibraryManagementOOP;

public abstract class libraryItem
{
    private int id;
    private String title;
    private static int totalitems;

    public libraryItem( int id, String title)
    {
        this.id = id;
        this.title = title;
        totalitems++;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public abstract void displayInfo();

    public static void showTotalitems()
    {
        System.out.println("The total items are : "+ totalitems);
    }

}
