package edu.eci.arep.project.trafficApi.repository.impl;

import edu.eci.arep.project.trafficApi.model.Solution;
import edu.eci.arep.project.trafficApi.repository.SolutionDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SolutionDaoJDBC implements SolutionDao {

    private static final String SQL_SELECT_ALL;
    private static final String SQL_INSERT_SOLUTION;

    private final Connection connection;

    static {
        SQL_SELECT_ALL = "SELECT * FROM Solutions";
        SQL_INSERT_SOLUTION = "INSERT INTO Solutions VALUES (DEFAULT, ?, ?)";
    }

    public SolutionDaoJDBC(Connection connection) {
        if (connection == null) throw new NullPointerException("Connection currently Unavailable");
        this.connection = connection;
    }

    @Override
    public List<Solution> selectAll() throws SQLException {
        List<Solution> solutions = new ArrayList<>();
        try (
                PreparedStatement executor = connection.prepareStatement(SQL_SELECT_ALL);
                ResultSet executionResult = executor.executeQuery();
        ) {
            while (executionResult.next()) {
                int solutionId = executionResult.getInt("solutionId");
                String solutionName = executionResult.getString("solutionName");
                Date additionDate = executionResult.getDate("additionDate");
                solutions.add(new Solution(solutionId, solutionName, additionDate.toString()));
            }
        }
        return solutions;
    }

    @Override
    public int insert(Solution newSolution) throws SQLException {
        int qtyOfModifiedRecords = 0;
        try (
                PreparedStatement executor = connection.prepareStatement(SQL_INSERT_SOLUTION);
        ) {
            executor.setString(1, newSolution.getSolutionName());
            executor.setString(2, newSolution.getAdditionDate());
            qtyOfModifiedRecords = executor.executeUpdate();
        }
        return qtyOfModifiedRecords;
    }
}