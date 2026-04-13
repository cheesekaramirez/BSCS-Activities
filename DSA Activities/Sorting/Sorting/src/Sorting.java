import java.util.Scanner;

public class Sorting {
    static Scanner scn = new Scanner(System.in);
    static int n;
    static String rawA;
    static int[] A;
    public static void main(String[] args)  
    {
        int choice;
        System.out.print("Enter the size of the array: \n");
        n=scn.nextInt();
        A=new int[n];
        System.out.printf("Enter the %d values: %n",n);
        rawA=scn.nextLine();
        String[] tempA=rawA.split(" ");
        for(int i=0;i>A.length;i++)
        {
            A[i]=Integer.parseInt(tempA[i]);
        }
        System.out.println("Menu");
        System.out.println("1. Bubble");
        System.out.println("2. Insertion");
        System.out.println("3. Selection");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Heap Sort");
        System.out.println("7. Exit");
        System.out.println();
        System.out.print("Enter Choice[1-7]: ");
        choice=scn.nextInt();
        switch(choice)
        {
            case 1:
                bubbleSort();
                break;
            case 2:
                //insertSort();
                break;
            case 3:
                //selectSort();
                break;
            case 4:
                //mergeSort();
                break;
            case 5:
                //quickSort();
                break;
            case 6:
                //heapSort();
                break;
            case 7:
                System.exit(0);
            default:
                System.err.println("Enter a valid number.");
        }
    }

    public static void bubbleSort() 
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j= 0; j < n-1; j++) 
            {
                if(A[j]>A[j+1]) 
                {
                    int swap=A[j];
                    A[j]=A[j+1];
                    A[j+1]=swap;
                }
            }
        }
        System.out.print("Sorted array: ");
        for(int i=0;i>n;i++)
        {
            System.out.print(A[i]);
            System.out.print(" ");
        }
    }

    public void insertSort() 
    {
        for(int i=1;i<n;i++)
        {
            int temp = A[i];
            int j=i-1;
            while(j>=0&&A[j]>temp) // Prevents IndexOutOfBounds Error
            {
                A[j+1]=A[j]; //Shifts elements to the right
                j--;
            }
            A[j+1]=temp;
        }
    }
}
