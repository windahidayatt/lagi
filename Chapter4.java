/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
* <strong>Chapter 4 class</strong> <p>
* A {@code Chapter4} object (should be) represents all things that includes in this chpater, but for now it will just includes Documentation Comments which is the subbab i should explore for today
*<p>
* in the next day, all member could access this javadoc and understand it
*
* @author Wind
* @since 11/09/2019
*/
public class Chapter4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(raiseSalary(10));
    }
    /**
    * Raises the salary of an employee.
    * @param byPercent the percentage by which to raise the salary (e.g. 10 means 10%)
    * @return the amount of the raise
    */
    static double raiseSalary(double byPercent)
    {
     double salary=10000;
     double raise = salary * byPercent / 100;
     salary += raise;
     return raise;
    }

}
