package base;

public class Book
{
    private int bid;
    private String title;
    private String author;
    private String category;
    private int year;
    private String location;

    public Book(int bid, String title, String author, String category, int year, String location)
    {
        this.bid = bid;
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.location = location;
    }

    public int getBid()
    {
        return bid;
    }

    public void setBid(int bid)
    {
        this.bid = bid;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "bid=" + bid + ", " +
                "title='" + title + "', " +
                "author='" + author + "', " +
                "category='" + category + "', " +
                "year=" + year + ", " +
                "location='" + location + "'" +
                "}";
    }
}