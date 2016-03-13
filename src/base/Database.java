package base;

import java.util.ArrayList;
import java.util.Date;

public class Database
{
    private ArrayList<Book> bookList;
    private ArrayList<Student> studentList;
    private ArrayList<Borrow> borrowList;
    private ArrayList<Library> libraryList;

    private void fillDatabaseWithMockData()
    {
        //mock data for libraryList
        libraryList = new ArrayList<>();
        libraryList.add(new Library("library1", "computer engineering department, central library"));
        libraryList.add(new Library("library2", "electronic engineering department, central library"));

        //mock data for bookList
        bookList = new ArrayList<>();
        bookList.add(new Book(1, "Database System Concepts", "Silberschatz, et al.", "software engineering", 2011, "library1"));
        bookList.add(new Book(2, "Operating System Concepts", "Silberschatz, et al.", "software engineering", 2013, "library1"));
        bookList.add(new Book(3, "Computer Networking", "Kurose, et al.", "networks", 2013, "library1"));
        bookList.add(new Book(4, "Introduction to Algorithms", "Cormen, et al.", "mathematics", 2009, "library1"));
        bookList.add(new Book(5, "Introduction to Electric Circuits", "Dorf, et al.", "electronic engineering", 2010, "library2"));
        bookList.add(new Book(6, "CMOS VLSI design", "Weste, et al.", "electronic engineering", 2011, "library2"));

        //mockdata for studentList
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Adam Anderson", "computer engineering", true));
        studentList.add(new Student(2, "Bob Bell", "computer engineering", true));
        studentList.add(new Student(3, "Carl Clark", "computer science", true));
        studentList.add(new Student(4, "Dan Davies", "computer science", true));
        studentList.add(new Student(5, "Alice Allan", "electronic engineering", false));
        studentList.add(new Student(6, "Bella Blake", "electronic engineering", false));
        studentList.add(new Student(7, "Caroline Cameron", "mathematics", false));
        studentList.add(new Student(8, "Dorothy Dickens", "mathematics", false));

        //mockdata for borrowList
        borrowList = new ArrayList<>();
        borrowList.add(new Borrow(1, 1, new Date()));
        borrowList.add(new Borrow(1, 2, new Date()));
        borrowList.add(new Borrow(1, 3, new Date()));
        borrowList.add(new Borrow(1, 4, new Date()));
        borrowList.add(new Borrow(1, 5, new Date()));
        borrowList.add(new Borrow(1, 6, new Date()));

        borrowList.add(new Borrow(2, 1, new Date()));
        borrowList.add(new Borrow(2, 2, new Date()));
        borrowList.add(new Borrow(2, 3, new Date()));
        borrowList.add(new Borrow(2, 4, new Date()));

        borrowList.add(new Borrow(3, 1, new Date()));
        borrowList.add(new Borrow(3, 2, new Date()));
        borrowList.add(new Borrow(3, 3, new Date()));
        borrowList.add(new Borrow(3, 4, new Date()));

        borrowList.add(new Borrow(5, 5, new Date()));
        borrowList.add(new Borrow(5, 6, new Date()));

        borrowList.add(new Borrow(6, 5, new Date()));
        borrowList.add(new Borrow(6, 6, new Date()));

        borrowList.add(new Borrow(7, 4, new Date()));
    }

    private void runQuery1()
    {
        System.out.println("the output of query 1:");

        ArrayList<String> names = new ArrayList<>();
        for(Student student : studentList)
        {
            if(student.getMajor().equals("computer science"))
            {
                String name = student.getName();
                if(!names.contains(name))
                {
                    names.add(name);
                    System.out.println(name);
                }
            }
        }

        System.out.println();
    }

    private void runQuery2()
    {
        System.out.println("the output of query 2:");

        ArrayList<String> majors = new ArrayList<>();
        for(Student student : studentList)
        {
            for(Book book : bookList)
            {
                for(Borrow borrow : borrowList)
                {
                    if(borrow.getSid() == student.getSid() && borrow.getBid() == book.getBid() && book.getTitle()
                            .equals("Database System Concepts"))
                    {
                        String major = student.getMajor();
                        if(!majors.contains(major))
                        {
                            majors.add(major);
                            System.out.println(student.getMajor());
                        }
                    }
                }
            }
        }

        System.out.println();
    }

    public static void main(String args[])
    {
        Database database = new Database();
        database.fillDatabaseWithMockData();
        database.runQuery1();
        database.runQuery2();
    }
}