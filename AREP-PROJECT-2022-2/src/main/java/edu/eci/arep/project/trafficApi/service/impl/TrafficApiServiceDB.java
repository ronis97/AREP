package edu.eci.arep.project.trafficApi.service.impl;

import edu.eci.arep.project.trafficApi.model.Solution;
import edu.eci.arep.project.trafficApi.persistence.connection.DBConnection;
import edu.eci.arep.project.trafficApi.repository.SolutionDao;
import edu.eci.arep.project.trafficApi.repository.impl.SolutionDaoJDBC;
import edu.eci.arep.project.trafficApi.service.TrafficApiService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TrafficApiServiceDB implements TrafficApiService {

    private Connection connection;
    private final SolutionDao solutionRepository;

    {
        try {
            connection = DBConnection.getConnection();
            if (connection.getAutoCommit()) connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            connection = null;
        }
        solutionRepository = new SolutionDaoJDBC(connection);
    }

    @Override
    public List<Solution> getAllSolutions() throws SQLException {
        return solutionRepository.selectAll();
    }

    @Override
    public int addSolution(Solution solution) throws SQLException {
        try {
            return solutionRepository.insert(solution);
        } catch (SQLException ex1) {
            connection.rollback();
            throw ex1;
        }
    }
}