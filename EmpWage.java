class EmpWageSalary {
        //constant
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;

        public void empSalary(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth ) {
                //variables

				int empHrs = 0;
				int totalEmpHrs = 0;
				int totalWorkingDays = 0;
				while (totalEmpHrs <= maxHrPerMonth && totalWorkingDays < numberOfWorkingDays) {
					totalWorkingDays++;
					double empCheck = Math.floor(Math.random() * 10) % 3;
					switch ((int)empCheck)
                        {
                                case IS_FULL_TIME :
                                        empHrs = 8;
                                        break;
                                case IS_PART_TIME :
                                        empHrs = 4;
                                        break;
                                default :
                                        empHrs = 0;

                        }//switch
						totalEmpHrs += empHrs;
						System.out.println(totalWorkingDays+" "+totalEmpHrs);
				}//while

                        int totalEmpWage = totalEmpHrs * empRatePerHr;
                        System.out.println(company+" "+totalEmpWage);

        }//empSalary()
}
public class EmpWage {

        public static void main(String[] args) {
		System.out.println("Welcome To Compute Wage Problrem");
                EmpWageSalary empWage = new EmpWageSalary();
                empWage.empSalary("DMart", 20, 20, 100);
				empWage.empSalary("icici", 50, 20, 100);
        }//main()
}//mainclass
