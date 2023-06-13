package edu.eci.arep.project.trafficApi.repository;

import edu.eci.arep.project.trafficApi.model.Traffic;

import java.sql.SQLException;
import java.util.List;

public interface TrafficDao {

    List<Traffic> selectAll() throws SQLException;
    int insert(Traffic traffic) throws SQLException;

}