package com.apap.tutorial7.service;


import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.repository.FlightDb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FlightServiceImpl
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightDb flightDb;
    
    @Override
    public FlightModel addFlight(FlightModel flight) {
        return flightDb.save(flight);
    }

    @Override
    public void deleteByFlightNumber(String flightNumber) {
        flightDb.deleteByFlightNumber(flightNumber);
    }

    @Override
    public FlightModel getFlightDetailByFlightNumber(String flightNumber) {
        return flightDb.findByFlightNumber(flightNumber);
    }

	@Override
	public FlightModel getFlightById(long id) {
		// TODO Auto-generated method stub
		return flightDb.findById(id);
	}

	@Override
	public void updateFlight(long id, FlightModel newFlight) {
		// TODO Auto-generated method stub
		FlightModel oldFlight = this.getFlightById(id);
		oldFlight.setDestination(newFlight.getDestination());
		oldFlight.setOrigin(newFlight.getOrigin());
		oldFlight.setTime(newFlight.getTime());
	}

	@Override
	public void deleteFlight(FlightModel flight) {
		// TODO Auto-generated method stub
		flightDb.delete(flight);
	}

	@Override
	public List<FlightModel> getAllFlight() {
		// TODO Auto-generated method stub
		return flightDb.findAll();
	}
    
	
    
}