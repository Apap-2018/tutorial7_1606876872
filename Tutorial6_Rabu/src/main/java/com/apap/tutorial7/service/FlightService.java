package com.apap.tutorial7.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.model.PilotModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    
    void deleteByFlightNumber(String flightNumber);

    FlightModel getFlightDetailByFlightNumber(String flightNumber);
    FlightModel getFlightById (long id);
    void updateFlight (long id, FlightModel flight);
    void deleteFlight(FlightModel flight);
    List<FlightModel> getAllFlight();
}