public class DayBoarder extends Student {
    private double tuitionFee;
    private double conveyanceFee;

    public DayBoarder(int studentId, String studentName, double tuitionFee, double conveyanceFee) {
        super(studentId, studentName);
        this.tuitionFee = tuitionFee;
        this.conveyanceFee = conveyanceFee;
    }

    public double calculateTotalFee() {
        setTotalFee(tuitionFee + conveyanceFee);
        return getTotalFee();
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getConveyanceFee() {
        return conveyanceFee;
    }

    public void setConveyanceFee(double conveyanceFee) {
        this.conveyanceFee = conveyanceFee;
    }
}
