# 'FALL 2019 PROJECT 2' - linhv	
	PosAvg Class
		- Read "Mesonet.txt" file using BufferedReader
		- Store the names of stations into stationID array
		- Find the index of the station, adding 1 to the index because the index in the file starts from 1
		- Find 2 pairs of stations which also have the same average index by adding 1 (or 2) and subtracting 1 (or 2) to the index of the station 
		
	MesoInherit Class
		- Find the sum of the ASCII values of 4 letters of the station ID
		- Create the average array with the length of 3 and store the value of ASCII ceiling at index 0, ASCII floor at index 1, and ASCII average at index 2
		- Find letter average by returning the char value at index 2 of calAverage()
		
	LetterAvg Class
		- Read "Mesonet.txt" file using BufferedReader
		- Store the names of stations into stationID array
		- Use for loop through the stID array to count how many stations has the first letter as the same as the average letter
		- Store those stations into a string and print it out 
