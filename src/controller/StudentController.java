/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Students;

/**
 *
 * @author JayJomJohn
 */
public class StudentController {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    Statement stmt;

    public ArrayList<Students> displayStudents() {
        ArrayList<Students> getall = new ArrayList<Students>();

        try {
            conn = database.JavaConnector.ConnectDb();
            stmt = conn.createStatement();
            String query = "SELECT * FROM student_record";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                Students users = new Students(rs.getInt("student_id"), rs.getString("student_name"), rs.getString("student_email"), rs.getString("student_password"), rs.getString("student_gender"), rs.getString("student_address"));
                getall.add(users);
            }
        } catch (Exception ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getall;
    }

    //INSERT METHOD
    public void saveInformation(Students students) {

        try {
            conn = database.JavaConnector.ConnectDb();
            String insert = "INSERT INTO `student_record`(`student_name`, `student_email`, `student_password`, `student_gender`, `student_address`) VALUES(?,?,?,?,?)";
            pst = conn.prepareStatement(insert);
            pst.setString(1, students.getName());
            pst.setString(2, students.getEmail());
            pst.setString(3, students.getPassword());
            pst.setString(4, students.getGender());
            pst.setString(5, students.getAddress());
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //UPDATE METHOD
    public void updateInformation(Students students) {

        try {
            conn = database.JavaConnector.ConnectDb();
            String update = "UPDATE `student_record` SET `student_name`=?, `student_email`=?, `student_password`=?, `student_gender`=?, `student_address`=? WHERE student_id=?";
            pst = conn.prepareStatement(update);
            pst.setString(1, students.getName());
            pst.setString(2, students.getEmail());
            pst.setString(3, students.getPassword());
            pst.setString(4, students.getGender());
            pst.setString(5, students.getAddress());
            pst.setInt(6, students.getId());
            pst.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    //DELETE METHOD
    public void deleteInformation(Students students) {
        try {
            conn = database.JavaConnector.ConnectDb();
            String delete = "DELETE FROM student_record WHERE student_id = ?";
            pst = conn.prepareStatement(delete);
            pst.setInt(1, students.getId());
            pst.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
