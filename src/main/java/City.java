
public class City 
{
    int zipcode;
    String cityName;
    String state;
    double latitude;
    double longitude;
    int timezone;
    boolean yesDaylight;
    
    public City(int zip, String cName, String st, double lat, double lon, int zone, boolean daylight)
    {
      zipcode = zip;
      cityName = cName;
      state = st;
      latitude = lat;
      longitude = lon;
      timezone = zone;
      yesDaylight = daylight;
    }
    
    @Override
    public String toString()
    {
        return cityName + " , " + state;
    }
    
    public int compareTo(City otherCity)
    {
        if(otherCity.latitude == latitude )
            return 0;
        else if (latitude > otherCity.latitude)
            return 1;
        else
            return -1;
    }
            
}
