using System;

namespace StuckInATimeLoop
{
    class MainClass
    {
        public static void Main(string[] args)
        {
			String userInput = Console.ReadLine();
			int intUserInput = Convert.ToInt32(userInput);
			for (int i = 0; i < intUserInput; i++) 
			{
				Console.WriteLine(i+1 + " Abracadabra");	
			}
        }
    }
}
