package com.driver.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.dataRead.DataRead;
import com.utility.Functionality;

public class MainCaller {
       int count = 1;
       // int currentValue;
       final int MAX = 100;
       final JFrame frame = new JFrame("JProgress Demo");

       public String scrFolder, temp;
       ExtentHtmlReporter report1, reporttemp;
       ExtentReports extent1, extenttemp;
       ExtentTest logger, logger2, loggertemp;
       String result;

       int testnum = 0;

       // creates progress bar
       final JProgressBar pb = new JProgressBar();

       DataRead dr = new DataRead();
       Functionality fn = new Functionality();
       String arr[][] = new String[100][];
       String arr1[][] = new String[100][];
       String arr2[][] = new String[100][];

       @BeforeMethod
       public void a() {

              report1 = new ExtentHtmlReporter("D:\\rep.html");
              extent1 = new ExtentReports();
              extent1.attachReporter(report1);
              logger = extent1.createTest("hello");
              logger.log(Status.PASS, "sucess");
              extent1.flush();
              report1.flush();

              report1 = new ExtentHtmlReporter("D:\\rep1.html");
              extent1 = new ExtentReports();
              extent1.attachReporter(report1);

       }

       @AfterMethod
       public void b() {
              extent1.flush();
              report1.flush();
       }

       @Test
       public void f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {

              File src1 = new File("C:\\Users\\M1046989\\Documents\\p\\Book1.xlsx");
              FileInputStream fis = new FileInputStream(src1);
              Workbook wb = new XSSFWorkbook(fis);
              int wbcount = wb.getNumberOfSheets();

              Sheet sheetMain = wb.getSheetAt(0);
              int lenMain = sheetMain.getLastRowNum() + 1;
              System.out.println("aaaaaaaaaaaaaaaaaaaasdfgh" + lenMain);
              String arrayMain[][] = new String[lenMain][2];

              for (int i = 0; i < lenMain; i++) {
                     System.out.println("sheet");
                     arrayMain[i][0] = sheetMain.getRow(i).getCell(0).getStringCellValue();
                     // System.out.println("arr[i " +arr[i][0] );
                     arrayMain[i][1] = sheetMain.getRow(i).getCell(1).getStringCellValue();

              }

              int index = 0;
              for (int iter = 1; iter < sheetMain.getLastRowNum() + 1; iter++) {

                     if (arrayMain[iter][1].equalsIgnoreCase("yes")) {
                           logger = extent1.createTest(arrayMain[iter][0]);

                           reporttemp = new ExtentHtmlReporter("D:\\" + arrayMain[iter][0] + ".html");
                           extenttemp = new ExtentReports();
                           extenttemp.attachReporter(reporttemp);

                           Method[] methods = Functionality.class.getDeclaredMethods();
                           try {
                                  arr = dr.getData(iter);
                           } catch (IOException i) {
                           }

                           int len = Integer.parseInt(arr[0][0]);

                           try {

                                  for (int i = 1; i < len; i++) {
                                         System.out.println("met : " + arr[i][1]);
                                         int j;
                                         try {
                                                for (j = 0; j < methods.length; j++) {
                                                       System.out.println("Method Name = " + methods[j].getName());
                                                       //loggertemp = extenttemp.createTest(methods[j].getName());
                                                       if (arr[i][1].equalsIgnoreCase(methods[j].getName())) {

                                                              try {
                                                                     SwingUtilities.invokeLater(new Runnable() {
                                                                           public void run() {
                                                                                  pb.setValue(count);
                                                                           }
                                                                     });
                                                                     java.lang.Thread.sleep(100);
                                                              } catch (InterruptedException e) {
                                                                     JOptionPane.showMessageDialog(frame, e.getMessage());
                                                              }

                                                              System.out.println("lol" + arr[i][0] + "=================" + methods[j].getName());
                                                              methods[j].invoke(fn, arr[i][2], arr[i][3], arr[i][4]);
                                                              break;
                                                       }
                                                }
                                                if(j==methods.length)
                                                {
                                                       throw new NullPointerException();
                                                }
                                                
                                                loggertemp = extenttemp.createTest(arr[i][1]);
                                                loggertemp.log(Status.PASS, "path");
                                         } catch (Exception e) {
                                                loggertemp = extenttemp.createTest(arr[i][1]);
                                                loggertemp.log(Status.FAIL, "pathfail");
                                                throw e;
                                         }

                                  }
                                  logger.log(Status.PASS,"<a href=D:\\" + arrayMain[iter][0] + ".html>"+arrayMain[iter][0]+"</a>");
                           } catch (Exception e) {

                                  logger.log(Status.FAIL,"<a href=D:\\" + arrayMain[iter][0] + ".html>"+arrayMain[iter][0]+"</a>");

                           }
                           extenttemp.flush();
                           reporttemp.flush();

                     }

              }
       }



Thanks and Regards,
Sharath.s

