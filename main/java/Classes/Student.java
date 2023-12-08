package Classes;


public class Student extends User {
    
    private String studentId;
    private String nName;
    private String email;
    private String gender;
    private String roomNumber;
    private String status;
    private String paymentStatus;

    public Student(String studentId, String nName, String username, String password, String email, String gender, String roomNumber, String status, String paymentStatus) {
        super(username, password);
        this.studentId = studentId;
        this.nName = nName;
        this.email = email;
        this.gender = gender;
        this.roomNumber = roomNumber;
        this.status = status;
        this.paymentStatus = paymentStatus;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{studentId=").append(studentId);
        sb.append(", nName=").append(nName);
        sb.append(", email=").append(email);
        sb.append(", gender=").append(gender);
        sb.append(", roomNumber=").append(roomNumber);
        sb.append(", status=").append(status);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append('}');
        return sb.toString();
    }

  
}
