package sample.csv.reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ClassProject {

public static void main(String[] args) {
     
        String line    = "";
        String splitBy = ",";
        // read input by Scan
        //Scanner scan = new Scanner(System.in);
        //String fileInput = scan.nextLine();
        double numTotal = 0;
        //read input by swing
        String fileInput = JOptionPane.showInputDialog("Enter you file Path: ");
        System.out.println("Path for file: " + fileInput);
       
        // \Users\Patrick Rufino\Desktop\class_roster_project.csv
        HashMap <String, String> EmploID = new HashMap<String, String>();
        HashMap <String, Double> TestScore = new HashMap<String, Double>();
       
        try{
            FileReader fileRead = new FileReader( fileInput );
            BufferedReader br   = new BufferedReader( fileRead );
            boolean isFirstLine = true;
           
            while ( (line = br.readLine())  != null) {
                String[] reader = line.split( splitBy );
               
                if (isFirstLine){
            isFirstLine = false;
                } else {
                //ID
                    System.out.print( reader[ 0 ] + " ");
                   
                    //Name
                    System.out.print( reader[ 1 ] + " ");
                   
                    //Quiz 1
                    System.out.print( reader[ 2 ] + " " );
                   
                    //Test 1
                    System.out.print( reader[ 3 ] + " " );
                   
                    //Mid
                    System.out.print( reader[ 4 ] + " " );
                   
                    //Test 3
                    System.out.print( reader[ 5 ] + " ");
                   
                    //Final
                    System.out.print( reader[ 6 ] + " ");
                   
                    //Presentation
                    System.out.print( reader[ 7 ] + " ");
                   
                    //Coding
                    System.out.print( reader[ 8 ] + " " );
                   
                    //System.out.print( reader[ 9 ] + " ");
                   
                    System.out.println( );
               
               
               
                EmploID.put(reader [ 0 ], reader [2]);
               
                //String reader[3] = next.Double();
               


Double num1 = Double.parseDouble(reader[3]);
double test1 = num1 * (.2);
//TestScore.put( reader [1], num1);

Double num2 = Double.parseDouble(reader[4]);
double test2 = num2 * (.6);
//TestScore.put( reader [1], num2);

Double num3 = Double.parseDouble(reader[5]);
double test3 = num3 * (.33);

Double num4 = Double.parseDouble(reader[6]);
double test4 = num4 * (.8);

Double num5 = Double.parseDouble(reader[2]);
double test5 = num5 * (.02);

Double num6 = Double.parseDouble(reader[7]);
double test6 = num6 * (.02);

Double num7 = Double.parseDouble(reader[8]);
double test7 = num7 * (.06);

numTotal = test1 + test2 + test3+ test4 + test5 + test6 +test7;
System.out.println(numTotal);

if(numTotal >= 90 && numTotal <= 100) {
System.out.print("a");
}

else if(numTotal >= 80 && numTotal <= 90) {
System.out.println("B");
}

else if(numTotal >= 70 && numTotal <= 80) {
System.out.println("C");
}

else if(numTotal >= 60 && numTotal <= 70) {
System.out.println("D");
}

else {
System.out.println("F");
}

            }
            }

        } catch( Exception e ){
            e.printStackTrace();
           
           
        }  
        //System.out.println(EmploID);
        //System.out.println(TestScore);
        //for ( int i = 1; i< 24; i++) {
        //System.out.println(numTotal);
       
    }

}