package edu.eci.arep.project.trafficApi.service;

import edu.eci.arep.project.trafficApi.model.Solution;

import java.sql.SQLException;
import java.util.List;

public interface TrafficApiService {

    List<Solution> getAllSolutions() throws SQLException;
    int addSolution(Solution solution) throws SQLException;

}