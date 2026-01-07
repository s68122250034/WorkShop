package project;

public class ClinicStaff {

    private String staffId;
    private String name;
    private String position;
    private String shift;
    private String phone;
    private String status;
    private String roomNumber;

    public ClinicStaff() {}

     public ClinicStaff(String staffId, String name, String position,
                       String shift, String phone, String status, String roomNumber) {
        this.staffId = staffId;
        this.name = name;
        this.position = position;
        this.shift = shift;
        this.phone = phone;
        this.status = status;
        this.roomNumber = roomNumber;
    }
    public String getstaffId() {
        return staffId;
    }
    public void setstaffId(String staffId) {
        this.staffId = staffId;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getposition() {
        return position;
    }
    public void setposition(String position) {
        this.position = position;
    }
    public String getshift() {
        return shift;
    }
    public void setshift(String shift) {
        this.shift = shift;
    }
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }
    public String getstatus() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }
    public String getroomNumber() {
        return roomNumber;
    }
    public void setroomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }    
    public void checkIn() {
        System.out.println("from class ClinicStaff = checkIn");   
}
    public void checkOut() {
        System.out.println("from class ClinicStaff = checkOut");
    }   
    public void updateStatus() {
        System.out.println("from class ClinicStaff = updateStatus");
    }
}