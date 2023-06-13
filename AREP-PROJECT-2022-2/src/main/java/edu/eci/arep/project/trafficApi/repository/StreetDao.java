package edu.eci.arep.project.trafficApi.repository;

import edu.eci.arep.project.trafficApi.model.Street;

import java.sql.SQLException;
import java.util.List;

public interface StreetDao {

    List<Street> selectAll()  throws SQLException;
    int insert(Street street) throws SQLException;

}