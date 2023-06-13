package edu.eci.arep.project.trafficApi.repository;

import edu.eci.arep.project.trafficApi.model.SolutionsHistory;

import java.sql.SQLException;
import java.util.List;

public interface SolutionsHistoryDao {

    List<SolutionsHistory> selectAll() throws SQLException;
    int insert(SolutionsHistory solutionsHistory) throws SQLException;

}