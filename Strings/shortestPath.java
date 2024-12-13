
public class shortestPath {

    public static float shortpathFind(String path){
        int x=0, y=0;                   //initialize x and y axis

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);      // take the signle character from string

            
            if(dir == 'S'){            //South - Downwards    
                y--;
            }
            else if(dir == 'N'){        //North - Upwards
                y++;
            }
            else if(dir == 'W'){       //West - Left Side
                x--;
            }
            else{       //East - Right Side
                x++;
            }
        }

        int Xsq = x*x;
        int Ysq = y*y;

        return (float)Math.sqrt(Xsq+Ysq); // typecasting int to float Formula: = SqRt of (x)^2 +(y)^2       
    }
    public static void main(String[] args) {

        String str = "WNEENESENNN";
        System.out.println(shortpathFind(str));
    }
}
