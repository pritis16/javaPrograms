package thursday_lab;

class CountryNotValidException extends Exception
{
	public CountryNotValidException()
	{
		super("The employee should be an Indian citizen for calculating tax");
	}
}

class EmployeeNameInvalidException extends Exception   //costomize exception
{
	public EmployeeNameInvalidException()
	{
		super("The employee name cannot be empty");
	}
}

class TaxNotEligibleException extends Exception
{
	public TaxNotEligibleException()
	{
		super("The employee does not need to pay tax");

	}
}