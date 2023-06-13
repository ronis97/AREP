package edu.eci.arep.project.trafficApi.repository;

import edu.eci.arep.project.trafficApi.model.Solution;

import java.sql.SQLException;
import java.util.List;

public interface SolutionDao {

    List<Solution> selectAll() throws SQLException;
    int insert(Solution newSolution) throws SQLException;

}