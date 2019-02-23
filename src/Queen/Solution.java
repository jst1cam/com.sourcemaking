import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Util{
    
    static boolean isLeftBorder(int pos){
        if(pos % 10 == 1){
            return true;
        } else {
            return false;
        }
    }
    
    static boolean isBottomBorder(int pos){
        if(pos / 10 == 1){
            return true;
        } else {
            return false;
        }
    }
      
    static boolean isRightBorder(int pos, int n){
        if(pos % 10 == n){
            return true;
        } else {
            return false;
        }
    }
    
    static boolean isTopBorder(int pos, int n){
        if(pos / (n * 10) == 1){
            return true;
        } else {
            return false;
        }
    }
    
 
    static int getPos(int x, int y){
        return (x * 10) + y;
    }
    
    static int getStep(int r_q, int c_q, int qPos,int n,int k, int[] ob, int reverse){
        
        int steps1 = 0;
        int steps2 = 0;
        
        int distanceFromObstacles1 = 0;
        int distanceFromObstacles2 = 0;
        int actualObstacles1 = 0;
        int actualObstacles2 = 0;
        int closerObstacles1 = 0;
        int closerObstacles2 = 0;

        
        boolean dir1 = Util.isLeftBorder(qPos);
        boolean dir2 = Util.isRightBorder(qPos, n);
        
        boolean dir3 = Util.isTopBorder(qPos, n);
        boolean dir4 = Util.isBottomBorder(qPos);
        
        boolean dir5 = Util.isTopBorder(qPos, n) && Util.isRightBorder(qPos, n);
        boolean dir6 = Util.isBottomBorder(qPos) && Util.isLeftBorder(qPos);
   
        //balra OK
        closerObstacles1 = (r_q) * 10 + 1;
        actualObstacles1 = 0;
        distanceFromObstacles1 = n;  
        
        //jobbra ok     
        closerObstacles2 = (r_q) * 10 + n;
        actualObstacles2 = 0;
        distanceFromObstacles2 = n;  
  
            if(k != 0){
                for(int r = 0; r < k; r++ ){
                    
                    if(!dir1){ 
                        actualObstacles1 = qPos - ob[r];
                        if(  ( actualObstacles1 > 0 && actualObstacles1 % 1 == 0) 
                           && actualObstacles1 < distanceFromObstacles1  ){
                            closerObstacles1 = ob[r] + 1;
                            distanceFromObstacles1 = actualObstacles1;  
                        }
                        
                    }
                                      
                    if(!dir2){ 
                        actualObstacles2 = ob[r] - qPos;
                        if(  ( actualObstacles2 > 0 && actualObstacles2 % 1 == 0)
                           && actualObstacles2 < distanceFromObstacles2  ){
                            closerObstacles2 = ob[r] - 1;
                            distanceFromObstacles2 = actualObstacles2;
                        }                      
                    }
         
                }
    
            }  
        
         steps1 = qPos - closerObstacles1;
         steps2 = Math.abs(qPos - closerObstacles2);
        

        System.out.println("step1: " + steps1);
        System.out.println("step2: " + steps2);
        return steps1 + steps2 ;
    }
        
        
        
  

    
    static int getStep2(int qPos,int n,int k, int[] ob){
        
        int steps = 0;
        int pos1 = qPos;
        int pos2 = qPos;
        int distanceFromObstacles = 0;
        int actualObstacles = 0;
        int closerObstacles = 0;  
        
        closerObstacles = 0;
        actualObstacles = 0;
        distanceFromObstacles = qPos;  
          
        if(!Util.isLeftBorder(pos1) && !Util.isBottomBorder(pos1)){
            if(k != 0){
                for(int r = 0; r < k; r++ ){  
                    actualObstacles = qPos - ob[r];
                    if(   ( (actualObstacles > 0 && actualObstacles % 11 == 0) || actualObstacles == 0 ) 
                       && actualObstacles < distanceFromObstacles  ){
                        closerObstacles = ob[r];
                        distanceFromObstacles = actualObstacles;
                    }
                }                
            }
            
            
            while((!Util.isLeftBorder(pos1) && !Util.isBottomBorder(pos1)) && pos1 != closerObstacles + 11 ){         
                pos1 -= 11;
                System.out.println("steps to direction3: " + pos1);
                
                steps++;  
            }        
        }
        
        closerObstacles = 0;
        actualObstacles = 0;
        distanceFromObstacles = qPos;  
               
        if(!Util.isRightBorder(pos2, n) && !Util.isTopBorder(pos2, n)){
            if(k != 0){
                for(int r = 0; r < k; r++ ){  
                    actualObstacles = ob[r] - qPos;
                    if(   ( (actualObstacles > 0 && actualObstacles % 11 == 0) || actualObstacles == 0 ) 
                       && actualObstacles < distanceFromObstacles  ){
                        closerObstacles = ob[r];
                        distanceFromObstacles = actualObstacles;
                    }
                }                
            }
                      
            while((!Util.isRightBorder(pos2, n) && !Util.isTopBorder(pos2, n)) && pos2 != closerObstacles - 11 ){      
                pos2 += 11;
                System.out.println("steps to direction4: " + pos2);
                
                steps++;  
            }        
        }

        return steps;
    }
    
    
        
    static int getStep3(int qPos,int n,int k, int[] ob){
        
        int steps = 0;
        int pos1 = qPos;
        int pos2 = qPos;
        int distanceFromObstacles = 0;
        int actualObstacles = 0;
        int closerObstacles = 0;  
        
        
        //********STEP 3 ********//
        
        closerObstacles = 0;
        actualObstacles = 0;
        distanceFromObstacles = (n * 10) + n;  //15
          
        if(!Util.isLeftBorder(pos1) && !Util.isTopBorder(pos1, n)){
            if(k != 0){
                for(int r = 0; r < k; r++ ){  
                    actualObstacles =  ob[r] - qPos;
              //      System.out.println("actualObstacles: " + actualObstacles);
                    if(   ( (actualObstacles > 0 && actualObstacles % 9 == 0) || actualObstacles == 0 ) 
                       && actualObstacles < distanceFromObstacles  ){
                        closerObstacles = ob[r];
                        distanceFromObstacles = actualObstacles;
                    }
                }                
            }
            //System.out.println("closerObstacles: " + closerObstacles);
            
            while((!Util.isLeftBorder(pos1) && !Util.isTopBorder(pos1, n)) && pos1 != closerObstacles - 9 ){         
                pos1 += 9;
                System.out.println("steps to direction5: " + pos1);
                
                steps++;  
            }        
        }
        
        
        
        //********STEP 4 ********//
        closerObstacles = 0;
        actualObstacles = 0;
        distanceFromObstacles = (n * 10) + n;
          
        if(!Util.isRightBorder(pos2, n) && !Util.isBottomBorder(pos2)){
            if(k != 0){
                for(int r = 0; r < k; r++ ){  
                    actualObstacles = qPos - ob[r];
                    System.out.println("actualObstacles: " + actualObstacles);
                    if(   ( (actualObstacles > 0 && actualObstacles % 9 == 0) || actualObstacles == 0 ) 
                       && actualObstacles < distanceFromObstacles  ){
                        closerObstacles = ob[r];
                        distanceFromObstacles = actualObstacles;
                    }
                }                
            }
            //System.out.println("closerObstacles: " + closerObstacles);
            
            while((!Util.isRightBorder(pos2, n) && !Util.isBottomBorder(pos2)) && pos2 != closerObstacles + 9 ){     
                pos2 -= 9;
                System.out.println("steps to direction6: " + pos2);
                
                steps++;  
            }        
        }
        
        return 0;
    }
    
    

}



public class Solution{
    
       
    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        
        int qPos = Util.getPos(r_q, c_q);//(r_q * 10) + c_q;
        int qPos_reversed = Util.getPos(c_q, r_q);
        int[] ob_horizontal = new int[k];
        int[] ob_vertical = new int[k];
        

        int stepCount = 0;
        
             
        for(int i = 0; i < obstacles.length; i++){
            ob_horizontal[i] = Util.getPos(obstacles[i][0], obstacles[i][1]);       
            ob_vertical[i] = Util.getPos(obstacles[i][1], obstacles[i][0]);
     
        }
    
        //left and right
        stepCount += Util.getStep(r_q, c_q, qPos, n, k, ob_horizontal, 0);
        
        //up and down
        //stepCount += Util.getStep(c_q, r_q, qPos_reversed, n, k, ob_vertical, 1);
        
        //leftdown and rightup
        //stepCount += Util.getStep2(qPos, n, k, ob_horizontal);
        
        //leftup and rightdown
        //stepCount += Util.getStep3(qPos, n, k, ob_horizontal);
        

        return stepCount;

    }
    


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
