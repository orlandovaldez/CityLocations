import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{

    
    public static void main(String[] args) throws FileNotFoundException 
    {
        CityGroup cg = new CityGroup();
        
        Scanner fileScan=new Scanner(new File("CityData1.csv"));
        Scanner deLimit=null;
        String fileLine=fileScan.nextLine();

        while(fileScan.hasNext()==true)
        {
            fileLine=fileScan.nextLine();
            deLimit=new Scanner(fileLine);
            deLimit.useDelimiter(",");
            while(deLimit.hasNext()==true)
            {
                int zip=deLimit.nextInt();
                String cName=deLimit.next();
                String state=deLimit.next();
                double lat=deLimit.nextDouble();
                double lon=deLimit.nextDouble();
                int zone = deLimit.nextInt();
                boolean yesDay=false;
                String daylightStr=deLimit.nextLine();
                if(daylightStr.charAt(1)=='1')
                yesDay=true;

                City sample= new City(zip,cName,state,lat,lon,zone,yesDay);
                cg.addCity(sample);              
            }
            System.out.println("Northern Most City: " + cg.findNorthMost());    
        }
    }
}
