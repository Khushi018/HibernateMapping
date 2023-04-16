package SingleTableStrategy;

import javax.persistence.EntityManager;

import com.util.EMUtil;

public class Main {

	public static void main(String[] args) {

		EntityManager em = EMUtil.getConn();

//		Employee emp = new Employee();
//
//		emp.setEname("Khushi");

		SalariedEmployee semp = new SalariedEmployee();

		semp.setEname("Geeta");
		semp.setSalary(1999);

		ContractualEmployee cemp = new ContractualEmployee();

		cemp.setEname("Ravi");
		cemp.setNo_of_workingDays(2);
		cemp.setCost_per_day(100);

		em.getTransaction().begin();

//		em.persist(emp);

		em.persist(semp);
		em.persist(cemp);
		
		em.getTransaction().commit();
		
		em.close();
	}

}
