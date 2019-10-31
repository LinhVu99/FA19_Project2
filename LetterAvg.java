import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetterAvg
{
	private char letter;
	private String[] stID = new String[120];
	
	public LetterAvg(char letter)
	{
		this.letter = letter;
		
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
			stID[index] = stations.substring(1,5);
			index++;
			
			stations = br.readLine();
		}
		
		br.close();
	}
	
	public int numberOfStationWithLetterAvg()
	{
		int numStations = 0;
		for (int i = 0; i < stID.length; ++i)
		{
			if (stID[i].charAt(0) == letter)
				numStations++;
		}
		return numStations;
	}
		
	public String stationsStartingWith()
	{
		String stations = "";
		for (int i = 0; i < stID.length; ++i)
		{
			if (stID[i].charAt(0) == this.letter)
			{
				if (stID[i+1].charAt(0) != this.letter)
				{
					stations = stations + stID[i];
					break;
				}
				else
					stations = stations + stID[i] + "\n";
			}
		}
		return stations;
	}
	
	public String toString()
	{
		return "\nThey are:\n" + stationsStartingWith();
	}
}
