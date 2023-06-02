/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class tables {
      public static void main(String[] args){
          try{
              String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200) ,mobileNumber varchar(200),address varchar(200),password varchar(200) ,securityQuestion varchar(200) ,answer varchar(200) ,status varchar(20),UNIQUE (email))";
              String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200)";
             String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What promary school did you attend?','ABC','true')";
             String categoryTable = "create table category (id int AUTO_INCREMENT primary key,name varchar(200))";
             DbOperations.setDataOrDelete(categoryTable, "Categorytable Created  Succesfully");
             DbOperations.setDataOrDelete(userTable, "User Table Created SuccessFully");
             DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Succesfully");
             DbOperations.setDataOrDelete(productTable, "Product Details Added Succesfully");
          }     
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
    }
}