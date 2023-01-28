package by.tms.jdbc.utils;

import by.tms.jdbc.model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityUtils {
    private static final String GET_ALL_CITY_QUERY = "SELECT * FROM City";
    private static final String INSERT_CITY_QUERY = "INSERT INTO City(id,namecity, description) VALUES(?, ?,?);";
    private static final String DELETE_CITY_QUERY = "DELETE FROM City WHERE id = ?";

    public static List<City> getAllCity() {
        List<City> cities = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(GET_ALL_CITY_QUERY);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nameCity = rs.getString("nameCity");
                String description = rs.getString("description");
                cities.add(new City(id, nameCity, description));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cities;
    }

    public static List<City> addCity(City city) {
        List<City> updatedCity = new ArrayList<>();
        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CITY_QUERY);
            preparedStatement.setInt(1, city.getId());
            preparedStatement.setString(2, city.getNameCity());
            preparedStatement.setString(3, city.getDescription());
            preparedStatement.executeUpdate();
            updatedCity = getAllCity();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedCity;
    }

    public static List<City> deleteCity(int cityId) {
        List<City> updatedCity = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CITY_QUERY);
            preparedStatement.setInt(1, cityId);
            preparedStatement.execute();
            updatedCity = getAllCity();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedCity;
    }
}

