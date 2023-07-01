/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_
 */ 
public class LoginTest { 
@Test public void testUsernameCorrectlyFormatted() 
{ String username = "kyl_1"; 
boolean result = Login.validateUsername(username); 
assertTrue(result); }
 @Test public void testUsernameIncorrectlyFormatted() {
 String username = "kyle!!!!!!!"; 
boolean result = Login.validateUsername(username);
 assertFalse(result); } 
@Test public void testPasswordMeetsComplexityRequirements() 
{ String password = "Ch$$ec@ke99!"; boolean result = Login.validatePassword(password); assertTrue(result); }
 @Test public void testPasswordDoesNotMeetComplexityRequirements() 
{ String password = "password"; boolean result = Login.validatePassword(password); assertFalse(result); }
 }

