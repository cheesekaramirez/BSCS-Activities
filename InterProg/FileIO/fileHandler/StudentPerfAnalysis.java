package fileHandler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentPerfAnalysis {
		static Scanner inputFile;
		static PrintWriter outputFile;
		static String rowData;
		static String[] specificRow=new String[6];
		static String name;
		static double studentCount;
		static int log=0,ds=0,eng=0,prog=0;
		static double logAvg=0,dsAvg=0,engAvg=0,progAvg=0;
		static double avgStudent=0;
		static double highestAvg=0,highestsubAvg=0;
		static String topperName;
		static boolean skippedFirstLine= false;
		static double[] allSubScores=new double[4];
		static String subName;
		public static void main(String[] args) throws FileNotFoundException {
			openFile();
			processFile();
			closeFile();
		}
		
		public static void openFile() throws FileNotFoundException 
		{
			inputFile = new Scanner(new FileReader("InterProg/FileIO/files/student_data.csv"));
			outputFile = new PrintWriter("InterProg/FileIO/files/analysis_report.txt");

		}
		
		public static void closeFile()
		{
			inputFile.close();
			outputFile.close();
		}
		
		public static void processFile()
		{
			outputFile.println("--Student Average Grades--");
			while (inputFile.hasNext()) 
			{
				rowData=inputFile.nextLine();
				if(!skippedFirstLine&&rowData.contains("StudentID"))
				{
					skippedFirstLine=true;
					continue;
				}
				specificRow=rowData.split(",");
				name=specificRow[1];
				log=Integer.parseInt(specificRow[2].trim());
				ds=Integer.parseInt(specificRow[3].trim());
				eng=Integer.parseInt(specificRow[4].trim());
				prog=Integer.parseInt(specificRow[5].trim());
				avgStudent=(log+ds+eng+prog)/4.0;

				logAvg+=Integer.parseInt(specificRow[2].trim());
				dsAvg+=Integer.parseInt(specificRow[3].trim());
				engAvg+=Integer.parseInt(specificRow[4].trim());
				progAvg+=Integer.parseInt(specificRow[5].trim());
				studentCount++;
				
				if(avgStudent>highestAvg)
				{
					highestAvg=avgStudent;
					topperName=name;
				}
				
				
				outputFile.printf("%s: %n",name);
				outputFile.printf("\tAverage Grade= %.2f %n",avgStudent);
			}
			logAvg/=studentCount;
			dsAvg/=studentCount;
			engAvg/=studentCount;
			progAvg/=studentCount;
			allSubScores=new double[]{logAvg,dsAvg,engAvg,progAvg};
			for(int i=0;i<allSubScores.length;i++)
			{
				if(allSubScores[i]>highestsubAvg)
				{
					highestsubAvg=allSubScores[i];
					switch(i){
						case 0:
							subName="Logic";
						case 1:
							subName="Data Structures";
						case 2:
							subName="English";
						case 3:
							subName="Programming";
					}
				}
			}
			outputFile.println();
			outputFile.println("--Subject Average Grades--");
			outputFile.printf("Logic: %.2f %n",logAvg);
			outputFile.printf("Data Structures: %.2f %n",dsAvg);
			outputFile.printf("English: %.2f %n",engAvg);
			outputFile.printf("Programming: %.2f %n",progAvg);
			outputFile.println("");
			outputFile.println("--Highest Average Grade--");
			outputFile.printf("%s: %n",topperName);
			outputFile.printf("\tAverage Grade= %.2f %n",highestAvg);
			outputFile.println("");
			outputFile.println("--Highest Average Grade (Subject)--");
			outputFile.printf("%s: %n",subName);
			outputFile.printf("\tAverage Grade= %.2f %n",highestsubAvg);

			System.out.println("Analysis exported successfully!");

		}
		}

	


