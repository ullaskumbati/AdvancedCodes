package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class AirportRunnerDTO
{
	
	//public class AirportRunner {

		public static void main(String[] args) 
		{
			
			AirportDTO airportDTO1 = new AirportDTO("KempegowdaInternationalAirport", true, "Bengaluru");
			AirportDTO airportDTO2 = new AirportDTO("MagaloreInternationalAirport",false, "Mangalore");
			AirportDTO airportDTO3 = new AirportDTO("BelgaviAirport",false,"Belagavi");
			AirportDTO airportDTO4 = new AirportDTO("GulbargaAirport",true,"Kalburagi");
			AirportDTO airportDTO5 = new AirportDTO("HALairport",false,"Bengaluru");
			
			boolean equals = airportDTO1.equals(airportDTO5);
			System.out.println(equals);
			
			Collection<AirportDTO> airports = new ArrayList<AirportDTO>();
			airports.add(airportDTO1);
			airports.add(airportDTO2);
			
			boolean contains = airports.contains(airportDTO5);
			System.out.println("contains "+contains);
			
		}

	}

