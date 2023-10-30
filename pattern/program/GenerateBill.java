package com.pattern.program;
import java.io.*;

abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculatBill(int units) {
		System.out.println(units * rate);
	}
}

class DomesticPlan extends Plan {

	@Override
	void getRate() {
		rate = 3.50;
	}
}

class CommercialPlan extends Plan {

	@Override
	void getRate() {
		rate = 7.50;
	}
}

class InstitutionalPlan extends Plan {

	@Override
	void getRate() {
		rate = 5.50;

	}
}

class GetPlanFactory {
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("Domestic Plan")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("Commercial Plan")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("Institutional Plan")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}


public class GenerateBill {
	public static void main (String arg[]) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		System.out.println("Enter the name of the plan for which the bill will be generated:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		System.out.println("Enter the no of Units for bill will be calculated:");
		int units=Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		System.out.println("Bill amout for " + planName + " of " + units + "units is ");
		p.getRate();
		p.calculatBill(units);
	}
	
	
}
