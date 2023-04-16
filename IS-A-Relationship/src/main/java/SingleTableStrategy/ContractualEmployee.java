package SingleTableStrategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("child1_employee")
public class ContractualEmployee  extends Employee{

	private int no_of_workingDays;
	private int cost_per_day;
	public int getNo_of_workingDays() {
		return no_of_workingDays;
	}
	public void setNo_of_workingDays(int no_of_workingDays) {
		this.no_of_workingDays = no_of_workingDays;
	}
	public int getCost_per_day() {
		return cost_per_day;
	}
	public void setCost_per_day(int cost_per_day) {
		this.cost_per_day = cost_per_day;
	}
	
}
