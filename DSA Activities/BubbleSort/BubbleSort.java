package BubbleSort;
import java.util.Scanner;
public class BubbleSort {
 public static void main(String args[]) {
   int[] scores = new int[5];
   Scanner scn = new Scanner(System.in);
   System.out.print("Enter initial scores: ");
   String scoreInp= scn.nextLine();
   String [] scoreTemp = scoreInp.split(" ");
   for(int i=0; i < scores.length;i++)
   {
       scores[i]=Integer.parseInt(scoreTemp[i]);
   }
   System.out.print("Initial scores: ");
   System.out.print("{");
   for(int i=0; i < scores.length;i++)
   {
     System.out.print(scores[i]);
     if(i<scores.length-1){
     System.out.print(", "); 
     }
   }
   System.out.print("} \n");
  
   int n= scores.length;
   for (int i = 0; i < n; i++)
   {
     int swapNum=0;
     for (int j = 0; j < n-i-1; j++)
     {
       if(scores[j]>scores[j+1])
       {
         int temp=scores[j];
         scores[j] = scores[j+1];
         scores[j+1]= temp;
         swapNum++;
       }
     }
     System.out.printf("Pass %d (%d swaps): ",i+1,swapNum);
     System.out.print("{");
     for(int k=0; k < scores.length;k++)
     {
       System.out.print(scores[k]);
       if(k<scores.length-1){
       System.out.print(", "); 
       }
     }
     System.out.print("} \n");
   }
   
   System.out.print("Ordered Scores: ");
   System.out.print("{");
   for(int i=0; i < scores.length;i++)
   {
     System.out.print(scores[i]);
     if(i<scores.length-1){
     System.out.print(", "); 
     }
   }
   System.out.print("}");
   scn.close();
   }
 
 }
