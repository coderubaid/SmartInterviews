/*
Print Right Angled Triangle Pattern
Print mirror image of right-angled triangle using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single integer N - the size of the pattern.

Constraints

1 <= T <= 100
1 <= N <= 100

Output Format

For each test case, print the test case number as shown, followed by the pattern, separated by newline.

Sample Input 0

4
2
1
5
10
Sample Output 0

Case #1:
 *
**
Case #2:
*
Case #3:
    *
   **
  ***
 ****
*****
Case #4:
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
*/
import java.io.*;
import java.util.*;

public class RightAngledTrianglePattern {
    static String staircase(int n) {
          int i, j,k;
        String s="";
        for(i=1 ; i<=n ; i++)
    {
        for(j=1 ; j<=n-i ; j++)
        {
            s=s+" ";
            // System.out.print(" ");
        }   
            

        for(k=1 ; k<=i; k++)
        {
            s=s+"*";
            // System.out.print("*");
        }
            s=s+"\n";
        // System.out.println();
    }
        return s;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        String[] r=new String[n];
        
          for(int i=0;i<n;i++){
            System.out.println("Case"+" "+"#"+(i+1)+":"); 
            System.out.print(staircase(arr[i]));
        }
        
//           for(int i=0;i<n;i++){
//             System.out.println(r[i]+"\n");
//         }
        

        scanner.close();    
    }
}