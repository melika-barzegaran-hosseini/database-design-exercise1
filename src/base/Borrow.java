package base;

import java.util.Date;

public class Borrow
{
    private int sid;
    private int bid;
    private Date date;

    public Borrow(int sid, int bid, Date date)
    {
        this.sid = sid;
        this.bid = bid;
        this.date = date;
    }

    public int getSid()
    {
        return sid;
    }

    public void setSid(int sid)
    {
        this.sid = sid;
    }

    public int getBid()
    {
        return bid;
    }

    public void setBid(int bid)
    {
        this.bid = bid;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "Borrow{" +
                "sid=" + sid + ", " +
                "bid=" + bid + ", " +
                "date=" + date +
                "}";
    }
}