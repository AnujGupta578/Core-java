package practice;

//We use the integers , , and  to create the following series:


import java.util.Scanner;

public class NSeries {
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    System.out.println("Please enter the queries: ");

    int t = in.nextInt();

    if(t>=0 && t<= 500) {
      for(int i=0; i<t; i++) {
        System.out.println("Please enter the value of a b n");
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        if(a>=0 && a<=50 && b>=0 && b<=50 ) {
          if(n>=1 && n<=15) {
            String numSeries = "";
            for(int k = 1; k <= n; k++ ) {
              int midSeriesEle = 0;
              for(int j = 0; j <k; j++) {
                midSeriesEle += (int)(Math.pow(2, j) * b);
              }
              int seriesEle = (int)(a + midSeriesEle);

              numSeries +=String.valueOf(seriesEle);
              numSeries += " ";
            }
            System.out.println(numSeries);
          }
        }

      }
    }

  }
}
