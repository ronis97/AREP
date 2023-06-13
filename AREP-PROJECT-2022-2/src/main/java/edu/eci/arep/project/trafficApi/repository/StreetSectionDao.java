package edu.eci.arep.project.trafficApi.repository;

import edu.eci.arep.project.trafficApi.model.StreetSection;

import java.sql.SQLException;
import java.util.List;

public interface StreetSectionDao {

    List<StreetSection> selectAll()  throws SQLException;
    int insert(StreetSection streetSection) throws SQLException;

}