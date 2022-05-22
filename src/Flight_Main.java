public class Flight_Main
{
    static int departCount(Flight[] flightList)
    {
        int MaxCount = 0;
        for (int i = 0; i < flightList.length; i++)
        {
            Flight flight = flightList[i];
            int Count = flight.getCount();
            if (flight.getIs_arriving() == false)
                MaxCount = MaxCount + Count;
        }
        return MaxCount;
    }

    static void largeLanding(Flight[] flightList)
    {
        int count = 0;
        for (int i = 0; i < flightList.length; i++)
        {
            Flight flight = flightList[i];
            if (flight.isLandingAbove(300) == true)
            {
                count++;
            }
        }
        System.out.println(count + " flights");
    }

    static int busyHour(Flight[] flightList)
    {
        int MaxCount = -1;
        int Count = 0;
        int TheHour = -8;
        for (int i = 0; i < flightList.length; i++)
        {
            Count = 0;
            Flight flight = flightList[i];
            int Hour = flight.getHour();
            for (int j = 0; j < flightList.length; j++)
            {
                flight = flightList[j];
                if (flight.getHour() == Hour)
                {
                    Count++;
                    MaxCount = Math.max(MaxCount, Count);
                }
                if (MaxCount <= Count)
                    TheHour = Hour;
            }
        }
        return TheHour;
    }

    static void sortFlights(Flight[] flightList)
    {
        Flight temp;
        for (int i = 0; i < flightList.length; i++)
        {
            for (int j = i + 1; j < flightList.length; j++)
            {
                if (flightList[i].getCount() > flightList[j].getCount())
                {
                    temp = flightList[i];
                    flightList[i] = flightList[j];
                    flightList[j] = temp;
                }
            }

        }
    }
    public static void main(String[] args)
    {
        Flight flight1 = new Flight ("AA", 320, true, 9);
        Flight flight2 = new Flight ("BB", 400, false, 17);
        Flight flight3 = new Flight ("CC", 250, true, 6);
        Flight flight4 = new Flight ("DD", 200, false, 9);
        Flight flight5 = new Flight ("EE", 350, true, 14);
        Flight[] flightList = new Flight[5];
        flightList[0] = flight1;
        flightList[1] = flight2;
        flightList[2] = flight3;
        flightList[3] = flight4;
        flightList[4] = flight5;
        System.out.println("מספר האנשים שצפויים להמריא: " + departCount(flightList));
        largeLanding(flightList);
        flight4.setCount(230);
        System.out.println(flight4.toString());
        System.out.println(busyHour(flightList));
        sortFlights(flightList);
        System.out.println(flightList[0].toString());
        System.out.println(flightList[1].toString());
        System.out.println(flightList[2].toString());
        System.out.println(flightList[3].toString());
        System.out.println(flightList[4].toString());
    }
}
