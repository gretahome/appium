package Android.testNGdemo;

import org.testng.annotations.Test;

import java.util.Arrays;

public class app3 {
    @Test(groups = "Animals")
    public void TestCat(){

        System.out.println("cat");
       // rotateString("12345678",8,4);

    }
    @Test(dependsOnMethods = "TestCat")
    public void TestEat(){

        System.out.println(" Eat ");
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
       // int [] matnew = printMatrix(mat,4,3);
       // for(int i =0;i<matnew.length;i++){
       //     System.out.print(matnew[i]+ " ");

      //  }
        int [] a=  {9,3,1,10};
        int max = findMaxDivision(a,4 );
        //System.out.print(max);


    }
    @Test(groups = "Food",dependsOnGroups = "Animals")
    public void TestFood(){

        System.out.print(" food ");

    }

    public String rotateString(String A, int n, int p) {
        // write code here

        String fortstring =  A.substring(0,p+1);
        String backstring =  A.substring(p+1);

        String newString = backstring + fortstring ;

        System.out.println(fortstring);
        System.out.println(backstring);
        System.out.println(newString);

        return newString;


    }

    public int[] printMatrix(int[][] mat, int n, int m) {
        // write code here
        int [] newnums = new int [n*m];
        int h = 0;
        int count = 0;

        for(int i = 0;i<mat.length;i++){
            for(int j =0;j<mat[i].length;j++){
                if(h%2 == 0){
                    newnums[count++] = mat[i][j];
                }else{
                    newnums[count++] = mat[i][m-1-j];

                }

            }
            h++;
        }

        return newnums;
    }

    public int findMaxDivision(int[] A, int n) {
        // write code here
        int max = 0;
        Arrays.sort(A);
        for(int i = 0;i<A.length-1;i++){
            for(int j = 0 ;j<A.length-1-i;j++){
                if(A[j]> A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;

                }
                int cuttentmax = A[j+1]-A[j];
                if(cuttentmax> max){
                    max = cuttentmax;
                }

            }

        }



        return max;

    }

    public int findMaxDivision1(int[] A, int n) {
        // write code here
        Arrays.sort(A);
        int dis = 0;
        int max = 0;
        for (int i=0;i<n-1;i++){
            dis = A[i+1]-A[i];
            if(dis > max)
            {
                max = dis;
            }
        }
        return max;
    }
    public class Different {
        public boolean checkDifferent(String iniString) {
            // write code her
            char newstr = iniString.charAt(0);
            for(int i = 1;i < iniString.length();i++){
                
                if(newstr == iniString.charAt(i))
                {
                    return false;
                }

            }
            return true;
        }
    }

    @Test(groups = "Animals")
    public void TestDog(){

        System.out.print("dog");

    }
    public int[] reverseStackRecursively(int[] stack, int top) {
        // write code here
        reverse(stack,0);
        return stack;

    }
    public void reverse(int[] stack, int n){
        if(n >stack.length /2){
            return;
        }
        reverse(stack,n+1);
        int temp = stack[n];
        stack[n] = stack[stack.length-1-n];
        stack[stack.length-1-n] = temp;
        return;


    }

}
