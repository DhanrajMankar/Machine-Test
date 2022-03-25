package JDBCmaven.onetomany;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory s = new Configuration().configure().buildSessionFactory();
    	Session ses = s.openSession();
    	Transaction t  = ses.beginTransaction();
    	
    
    	Answer a=new Answer();
    	a.setAns("It is a Programming Language");
    	a.setId(1);
    	a.setName("Dhanraj");
    	
    	Answer a1=new Answer();
    	a1.setAns("It is a object oriented programming language");
    	a1.setId(2);
    	a1.setName("Dhanraj");
    	
    	ArrayList<Answer>list2=new ArrayList<Answer>();
    	
    	list2.add(a);
    	list2.add(a1);
    	
    	question q = new question();
    	q.setId(1);
    	q.setQname("What is java ???");
        q.setAnswer(list2);
        
        ses.save(q);
    	s.close();
    	ses.close();
    }
}
