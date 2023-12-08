package Classes;

public class Application {
    
private String applicationId;
private String studentId;
private String isApproved;
private String roomNumber;

    public Application(String applicationId, String studentId, String isApproved, String roomNumber) {
        this.applicationId = applicationId;
        this.studentId = studentId;
        this.isApproved = isApproved;
        this.roomNumber = roomNumber;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(String isApproved) {
        this.isApproved = isApproved;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
  
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Application{applicationId=").append(applicationId);
        sb.append(", studentId=").append(studentId);
        sb.append(", isApproved=").append(isApproved);
        sb.append(", roomNumber=").append(roomNumber);
        sb.append('}');
        return sb.toString();
    }
}

        