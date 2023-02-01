package utilities;

import java.sql.*;
import java.util.ArrayList;

public class JDBC1 {
    public static void main(String[] args) throws SQLException {

        Connection cnn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/HR_Production",
                "postgres",
                "admin"
        );

        Statement stt = cnn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        ResultSet rs=stt.executeQuery("Select * from jobs");
//        rs.next();
//        System.out.println(rs.getString("job_title"));

        // printCountries(stt);
        // printDepartmentsByCountries(stt);
        updateAllEmails(stt);
    }

    private static void updateAllEmails(Statement stt) throws SQLException {
        String emailQuery = "Select email from employees";
        ResultSet rs = stt.executeQuery(emailQuery);

        ArrayList<String> emailList = new ArrayList<>();
        while (rs.next()){
            emailList.add(rs.getString("email"));
        }

        ArrayList<String>newEmails = new ArrayList<>();

        for(String email: emailList){
            email= email.substring(0, email.indexOf('@')) + "@mindtek.edu";
            newEmails.add(email);
        }

        String updateQuery = "update employees set email = newEmail where employees.email = oldEmail ";
        int i=0;
        for (String em: emailList){
            updateQuery = "update employees set email = '"+ newEmails.get(i)+"' where employees.email ='"+ emailList.get(i)+"'";
            System.out.println(updateQuery);
            stt.executeUpdate(updateQuery);
            i++;
        }

    }

    private static void printDepartmentsByCountries(Statement stt) throws SQLException {
        ResultSet rs = stt.executeQuery("select locations.country_id, count(departments.department_name)\n" +
                "from locations, departments\n" +
                "where locations.location_id = departments.location_id\n" +
                "group by locations.country_id;");
        while (rs.next()){
            System.out.println(rs.getString("country_id")+" -> "+ rs.getString("count"));
        }

    }

    private static void printCountries(Statement stt) throws SQLException {
        ResultSet rs1= stt.executeQuery("select country_name from countries");
        int num=0;
        while (rs1.next()){
            num++;
            System.out.println(num+" -> "+ rs1.getString("country_name"));
        }
    }


}