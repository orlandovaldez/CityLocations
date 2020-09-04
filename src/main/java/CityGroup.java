
public class CityGroup 
{
    City[] cityArray =new City[100];
    int numOfCities;
    
    public CityGroup()
    {
        numOfCities =0;
    }
    
    public void addCity(City newCity)
    {
        cityArray[numOfCities] = newCity;
        numOfCities++;
    }
    
    City findNorthMost()
    {
        City lat = cityArray[0];
        for(int k1 = 0; k1<numOfCities; k1++)
        {
            if(cityArray[k1].compareTo(lat)== 1)
            lat = cityArray[k1];
        }
        return lat;
    }
}
