import java.io.*;
class Emp implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;
	private String empAdd;
	Emp(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public String toString()
	{
		return "EmpId="+empId+" "+"EmpName="+empName;
	}
	Emp()
	{

	}
}