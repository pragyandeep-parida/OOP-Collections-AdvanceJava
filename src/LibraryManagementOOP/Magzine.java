package LibraryManagementOOP;

public class Magzine extends libraryItem
{
    private int issueNumber;

    public Magzine(int issueNumber, int id, String title)
    {
        super(id,title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber()
    {
        return  issueNumber;
    }

    public void setIssueNumber(int issueNumber)
    {
        this.issueNumber = issueNumber;
    }

    public void displayInfo()
    {
        System.out.println("Magzine id: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("issue: " + issueNumber);
    }

}
