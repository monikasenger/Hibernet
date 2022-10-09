package Run;
import java.util.List;

import net.Monika.Dao.DemoDao;
import net.Monika.Hibernet.Demo;



public class Start {

	public static void main(String[] args) {
		
		//insert 
		Demo ob = new Demo( "monika","monika123","monika@gmail.com");
		Demo ob3 = new Demo("pia","pi987","pia@gmail.com");
		Demo ob2 = new Demo("tanvi","tanvi987","yanvi@gmail.com");
		Demo ob4 = new Demo("girjesh","girjesh1234","girjesh@gmail.com");
		DemoDao obj = new DemoDao();
		//save
		obj.save_demo(ob);
		obj.save_demo(ob3);
		obj.save_demo(ob2);
		obj.save_demo(ob4);
	
		obj.search_demo(1);
		ob.setUser_name("mona");
		obj.update_demo(ob);//update
	//search
		Demo ob1 = obj.search_demo(ob4.getId());
	List<Demo> l1 = obj.showAll_demo();
		//show all
		l1.forEach(ob5 -> System.out.println(ob5.getId()+" ,"+ob5.getUser_name()+" ,"+ob5.getUser_email()+" ,"+
		ob5.getUser_pass()));
		obj.delete_demo(ob4.getId());
		

	}

}