//package com.tms.dao;
//
//import com.tms.model.User;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class UserDAO {
//
//    private static final String GET_ALL_USERS_QUERY = "SELECT * FROM public.\"user\"";
//    private static final String INSERT_USER_QUERY = "INSERT INTO public.\"user\"(name, surname,birthday,password,email) VALUES(?, ?, ?,?,?);";
//
//    public static List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//
//        try (Connection connection = loginform.dao.DbUtils.getConnection()) {
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery(GET_ALL_USERS_QUERY);
//            while (rs.next()) {
//
//                String name = rs.getString("name");
//                String surname = rs.getString("surname");
//                LocalDate birthday = rs.getDate("birthday").toLocalDate();
//                String email = rs.getString("email");
//                String password = rs.getString("password");
//                users.add(new User(password, name, surname, email, birthday));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//        return users;
//    }
//
//    public static List<User> saveUser(User user) {
//        List<User> updatedUsers = new ArrayList<>();
//        try (Connection connection = loginform.dao.DbUtils.getConnection()) {
//            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_QUERY);
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2, user.getSurname());
//            preparedStatement.setDate(3, Date.valueOf(user.getBirthDay()));
//            preparedStatement.setString(4, user.getPassword());
//            preparedStatement.setString(5, user.getEmail());
//            preparedStatement.executeUpdate();
//            updatedUsers = getAllUsers();
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return updatedUsers;
//    }
//
////    public static List<User> addUser(int userId) {
////        List<User> updatedUsers = new ArrayList<>();
////        try (Connection connection = DbUtils.getConnection()) {
////            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_QUERY);
////            preparedStatement.setInt(1, userId);
////
////            preparedStatement.executeUpdate();
////            updatedUsers = getAllUsers();
////
////        } catch (SQLException e) {
////            System.out.println(e.getMessage());
////        }
////        return updatedUsers;
////    }
//
////    public static List<User> deleteUser(int userId) {
////        List<User> updatedUsers = new ArrayList<>();
////        try (Connection connection = DbUtils.getConnection()) {
////            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_QUERY);
////            preparedStatement.setInt(1, userId);
////            preparedStatement.execute();
////            updatedUsers = getAllUsers();
////
////        } catch (SQLException e) {
////            System.out.println(e.getMessage());
////        }
////        return updatedUsers;
////    }
//}
