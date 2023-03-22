public class StudentDetails {
    /**
     * @param args
     */
    public static void main(String[] args) {
        DayBoarder db = new DayBoarder(711211, "Rafael", 1855, 315);
        db.calculateTotalFee();
        System.out.println("Hi "+db.getStudentName()+", your fee is "+db.getTotalFee());
        Hosteler hs = new Hosteler(102, "Jennifer", 1855, 60, 27);
        hs.calculateTotalFee();
        System.out.println("Hi "+hs.getStudentName()+ ", your salary is "+hs.getTotalFee());
        }
        
}
