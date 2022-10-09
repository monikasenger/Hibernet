package net.Monika.Dao;

import org.hibernate.Transaction;

import com.mysql.cj.Query;

import net.Monika.Hibernet.Demo;
import net.Monika.session.Session_Factory;

import java.util.List;

import org.hibernate.Session;



public class DemoDao {
	
	
//save method
	public void save_demo(Demo ob ) 
	{
		Transaction t =null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			s.save(ob);
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
		
		
	}
	
	//update method
	public void update_demo(Demo ob ) 
	{
		Transaction t =null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			s.update(ob);
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
	}
	
	
	//search method
	public Demo search_demo(long id) 
	{
		Transaction t =null;
		Demo d = null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			
			// d = s.byId(Demo.class).getReference(id);
			//d= s.load(Demo.class, id);
			d= s.get(Demo.class, id);  
			System.out.println("name: "+d.getUser_name());
	           // System.out.println(d.getUser_email());	
					
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
		return d;
	}
	
	//show all method
	@SuppressWarnings({ "unchecked", "unused" })
	public List<Demo> showAll_demo() 
	{
		
		Transaction t =null;
		List<Demo> l = null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			l = s.createQuery("from Demo").list();
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
		return l;
	}
	
	
	//delete method
	public  void delete_demo(Long id) 
	{
		
		Transaction t =null;
		Demo d = null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			d = s.get(Demo.class, id);
			if (d != null) {
				
                s.delete(d);
                System.out.println(" deleted.....");
            }
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
	
	}
}