package Classes;

import GUI.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {

    public static LoginForm login = new LoginForm();
    public static ManageApplicationForm applicationForm = new ManageApplicationForm();
    public static AdminMainMenuForm adminMenu = new AdminMainMenuForm();
    public static ManageRoomForm roomForm = new ManageRoomForm();
    public static ViewAllStudentsForm vasf = new ViewAllStudentsForm();
    public static ViewAllRoomsForm varf = new ViewAllRoomsForm();

    public static ArrayList<String> userLogs = new ArrayList<>();
    public static ArrayList<String> currentUser = new ArrayList<>();

    public static Admin admin_Login = null;
    public static ArrayList<Admin> admin = new ArrayList<>();

    public static Room room_info = null;
    public static ArrayList<Room> room = new ArrayList<>();

    public static Student student_info = null;
    public static Student student_Login = null;
    public static ArrayList<Student> student = new ArrayList<>();
    
    public static Application application_info = null;
    public static ArrayList<Application> application = new ArrayList<>();
    
    
    public static void main(String[] args ) {
        //login file
        try{
            Scanner sLogs = new Scanner(new File("src/main/java/Database/logs.txt"));
            while(sLogs.hasNext()){
                String user_logs = sLogs.nextLine();
                sLogs.nextLine();
                String user_Logs = user_logs;
                userLogs.add(user_Logs);
            }
            sLogs.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //admin file
        try {
            Scanner scanner = new Scanner(new File("src/main/java/Database/admin.txt"));
            while (scanner.hasNext()) {
                String adminUsername = scanner.nextLine();
                String adminPassword = scanner.nextLine();
                scanner.nextLine();
                Admin admin = new Admin(adminUsername, adminPassword);
                MainClass.admin.add(admin);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace(); //print the error
        }

        //student file
        try {
            Scanner scanner = new Scanner(new File("src/main/java/Database/student.txt"));
            while (scanner.hasNext()) {
                String stuID = scanner.nextLine();
                String stuName = scanner.nextLine();
                String stuUsername = scanner.nextLine();
                String stuPassword = scanner.nextLine();
                String stuEmail = scanner.nextLine();
                String stuGender = scanner.nextLine();
                String stuRoomNumber = scanner.nextLine();
                String stuStatus = scanner.nextLine();
                String stuPayment = scanner.nextLine();
                scanner.nextLine();
                Student student = new Student(stuID, stuName, stuUsername, stuPassword, stuEmail, stuGender,stuRoomNumber, stuStatus, stuPayment );
                MainClass.student.add(student);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //room file
        try {
            Scanner scanner = new Scanner(new File("src/main/java/Database/room.txt"));
            while (scanner.hasNext()) {
                String roomNo = scanner.nextLine();
                String roomType = scanner.nextLine();
                String roomPrice = scanner.nextLine();
                String isRoomAvailable = scanner.nextLine();
                scanner.nextLine();
                Room room = new Room(roomNo, roomType, roomPrice, isRoomAvailable);
                MainClass.room.add(room);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //application file
        try {
            Scanner scanner = new Scanner(new File("src/main/java/Database/application.txt"));
            while (scanner.hasNext()) {
                String appId = scanner.nextLine();
                String appStudentId = scanner.nextLine();
                String appApproval = scanner.nextLine();
                String appRoomNo = scanner.nextLine();
                scanner.nextLine();
                Application application = new Application(appId, appStudentId, appApproval, appRoomNo);
                MainClass.application.add(application);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}