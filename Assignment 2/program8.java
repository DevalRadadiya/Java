/* 8. Declare a class called author having author_name as
private data member. Extend author class to have two sub classes called
book_publication & paper_publication. Each of these classes have private
member called title. Show usage of dynamic method dispatch (dynamic
polymorphism) to display book or paper publications of a given author. Use
command line arguments for inputting data. */

import java.util.*;
class author
{
    private String[] author_name ={"Deval","Pratik"};
    void display()
    {
        System.out.println("Author names:");
        for(int i=0;i<author_name.length;i++)
        {
            System.out.println("\t"+author_name[i]);
        }
    }
}
class book_publication extends author
{
    private String[][] title={{"Java programming","Computer design","DAA"},{"Digital Electronics","CG","MP"}};
    void display(int j)
    {
        System.out.println("Books are");
        for(int i=0;i<3;i++)
        {
            System.out.println(title[j][i]);
        }
    }
}
class paper_publication extends author
{
    private String[][] title={{"AAA","BBB"},{"XXX","YYY"}};
    void display(int j)
    {
        System.out.println("Papers Published are:");
        for(int i=0;i<2;i++)
        {
            System.out.println(title[j][i]);
        }
    }
}
class pro8
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        author obj=new author();
        book_publication bookpub=new book_publication();
        paper_publication paperpub=new paper_publication();
        int author_name=0,choice;
        String str;
        System.out.println("enter the author name:");
        str=s.next();
        if(str.equals("Puntambekar"))
            author_name=0;
        else
            author_name=1;
        System.out.println("\n 1.Books published\n 2.Paper published");
        System.out.println("\n Enter ur choice");
        choice=s.nextInt();
        switch(choice)
        {
            case 1:
                bookpub.display(author_name);
                break;
            case 2:
                paperpub.display(author_name);
                break;
            default:
                System.out.println("wrong choice");
                System.exit(0);
        }

    }
}