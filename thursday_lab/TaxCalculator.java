package thursday_lab;

public class TaxCalculator extends EmployeeDetail
{
	double taxAmount;
	public double calculateTax() throws CountryNotValidException ,EmployeeNameInvalidException, TaxNotEligibleException
	{
		accept();
		if(empName==null || empName.isEmpty())
			throw new EmployeeNameInvalidException();
		if(!isIndian)
			throw new CountryNotValidException();
		else
		{
			if(empSal>=100000)
			{
				taxAmount =empSal *8/100;
			}
			else if(empSal<100000 && empSal>=50000)
			{
				taxAmount =empSal *6/100;
			}
			else if(empSal>=30000 && empSal<50000)
			{
				taxAmount =empSal *5/100;
			}
			else if(empSal>=10000 && empSal<30000)
				taxAmount =empSal *4/100;
			else
				throw new TaxNotEligibleException();
		}
		return taxAmount;
	}
}
