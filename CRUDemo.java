  import java.util.*;

import javax.lang.model.util.ElementScanner14;

import org.w3c.dom.css.ElementCSSInlineStyle;
   
  class Student
{
    private int sno;
    private String sname;
    private int birthdate;

    Student (int sno , String sname , int birthdate)
    {
        this.sno = sno;
        this. sname = sname;
        this.birthdate = birthdate;
    }
    public int getSno()
    {
        return sno;
    }
    public String getSname()
    {
        return sname;
    
    }
    public int getbirthdate()
    {
        return birthdate;
    }

    public String toString()
    {
        return sno+" "+sname+" "+birthdate;
    }
}

class CRUDemo
{
    public static void main(String [] args)
    {
        List<Student> c = new ArrayList<Student>();
    Scanner s = new Scanner (System.in);
    Scanner s1 = new Scanner (System.in);
    int ch;
        do{
                System.out.println("1.INSERT");
                System.out.println("2.DISPLAY");
                System.out.println("3.SEARCH");
                System.out.println("4.DELETE");
                System.out.println("5.UPDATE");
                System.out.println("Enter Yout Choice :");
                ch = s.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("enter no : ");
                        int sno = s.nextInt();
                        System.out.print("enter name :");
                        var sname = s1.nextLine();
                        System.out.print("enter birthdate :");
                        int birthdate = s.nextInt();
                        

                        c.add(new Student(sno,sname,birthdate));
                        break;
                    case 2:
                        Iterator <Student> i = c.iterator();
                        while(i.hasNext())
                        {
                            Student st = i.next();
                            System.out.println(st);
                        }
                        break;  

                    case 3:
                        boolean found = false;
                        System.out.println("enter sno to search:");
                        int Sno = s.nextInt();
                        i = c . iterator();
                        while(i.hasNext()) 
                        {
                            Student st = i.next();
                            if(st.getSno() == Sno)
                            {
                                System.out.println(st);
                                found = true;
                            }
                        }   
                        if(!found)
                        {
                            System.out.println("not founded");
                        }
                        break;

                        case 4:
                         found = false;
                        System.out.println("enter sno to delete:");
                         Sno = s.nextInt();
                        i = c . iterator();
                        while(i.hasNext()) 
                        {
                            Student st = i.next();
                            if(st.getSno() == Sno)
                            {
                                i.remove();
                                found = true;
                            }
                        }   
                        if(!found)
                        {
                            System.out.println("record not founded");
                        }
                        else
                        {
                            System.out.println("record deleted");
                        }
                        break;

                        case 5:
                        found = false;
                       System.out.println("enter student no to update:");
                        Sno = s.nextInt();
                       ListIterator<Student> li = c.listIterator();
                       while(li.hasNext()) 
                       {
                           Student st = li.next();
                           if(st.getSno() == Sno)
                           {
                            System.out.println("enter new no :");
                            sno = s1.nextInt();

                               System.out.println("enter new name :");
                                sname = s1.nextLine();

                                System.out.println("enter birthdate :");
                                birthdate = s1.nextInt();
                                 li.set(new Student(sno,sname,birthdate));
                               found = true;
                           }
                       }   
                       if(!found)
                       {
                           System.out.println("record not founded");
                       }
                       else
                       {
                           System.out.println("record updated");
                       }
                       break;
                 }
            }while(ch!=0);
    }
}