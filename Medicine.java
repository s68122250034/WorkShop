package project;

import java.util.Date;

public class Medicine {
    private String medicineId;
    private String medicineName;
    private String type;
    private String dosage;
    private int quantity;
    private String Warning;
    private String allergyRisk;
    private int Stock;
    private Date expireDate;

    public Medicine () {}
    public Medicine (String medicineId , String medicineName , String type , String dosage ,int quantity , String Warning , String allergyRisk , int Stock ,Date expireDate) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.type = type;
        this.dosage = dosage;
        this.quantity = quantity;
        this.Warning = Warning;
        this.allergyRisk = allergyRisk;
        this.Stock = Stock;
        this.expireDate = expireDate;
    }
    public String getmedicineId() {
        return  medicineId;
    }
    public void setmedicineId(String medicineId) {
        this.medicineId = medicineId;
    }
    public String getmedicineName() {
        return  medicineName;
    }
    public void setmedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String gettype() {
        return  type;
    }
    public void settype(String type) {
        this.type = type;
    }
    public String getdosage() {
        return  dosage;
    }
    public void setdosage(String dosage) {
        this.dosage = dosage;
    }
    public int  getquantity() {
        return  quantity;
    }
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
    public String getWarning() {
        return  Warning;
    }
    public void setWarning(String Warning) {
        this.Warning = Warning;
    }
    public String getallergyRisk() {
        return  allergyRisk;
    }
    public void setallergyRisk(String allergyRisk) {
        this.allergyRisk = allergyRisk;
    }
    public int  getStock() {
        return  Stock;
    }
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    public Date  getexpireDate() {
        return  expireDate;
    }
    public void setexpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
    public void dispense() {
        System.out.println("From class Medicine = dispense" );
    }
    public void checkStock() {
        System.out.println("From class Medicine = checkStock" );
    }
    public void updateStock() {
        System.out.println("From class Medicine = updateStock" );
    }
    public void isExpired() {
        System.out.println("From class Medicine = isExpired" );
    }

}