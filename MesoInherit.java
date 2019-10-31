
public class MesoInherit extends MesoAbstract
{
	private MesoStation MS; 
	
	public MesoInherit(MesoStation MS)
	{
		this.MS = MS;
	}
	
	public int sumASCII()
	{
		int sum = 0;
		for (int i = 0; i < 4; ++i)
			sum = sum + (int)MS.getStID().charAt(i);
		return sum;
	}
	
	@Override
	protected int[] calAverage()
	{
		int[] average = new int[3];
		double fpAverage = (double)sumASCII() / 4;
		average[0] = (int)fpAverage + 1;
		average[1] = (int)fpAverage;
		if ((double)average[0] - fpAverage <= 0.5)
			average[2] = average[0];
		else
			average[2] = average[1];
		return average;
	}
	
	@Override
	protected char letterAverage()
	{
		return (char)calAverage()[2];
	}
}
