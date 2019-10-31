import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PosAvg 
{	
	private String[] stationID = new String[120];
	
	private String stID;
	
	public PosAvg (String stID)
	{
		this.stID = stID;
		
		try
		{
		read("Mesonet.txt");
		}
		catch(IOException e)
    	{
    		System.out.println("Error reading from file!\n");
    		e.printStackTrace();
    	}
	}
	
	public void read(String filename) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String stations = br.readLine();
		
		for (int i = 0; i < 3; ++i)
			stations = br.readLine();
		
		int index = 0;
		while (stations != null)
		{
			stationID[index] = stations.substring(1,5);
			index++;
			
			stations = br.readLine();
		}
		
		br.close();
	}
	
	public int indexOfStation()
	{
		int index = 0;
		for (int i = 0; i < stationID.length; ++i)
			if (stationID[i].equals(stID))
			{
				index = i + 1;
				break;
			}
		return index;
	}
	
	public String averageOf(int steps)
	{
		String twoStations = "";
		for (int i = 0; i < stationID.length; ++i)
			if (stationID[i].equals(stID))
			{
				twoStations = stationID[i-steps] + " and " + stationID[i+steps];
				break;
			}
		return twoStations;
	}
	
	public String toString()
	{
		return String.format("This index is average of %s, %s, and so on.", averageOf(1), averageOf(2));
	}
}
