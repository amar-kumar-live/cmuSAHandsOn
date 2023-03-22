public class Hosteler extends Student {
    private double tuitionFee;
    private double hostelRate;
    private float daysStayed;

    public Hosteler(int studentId, String studentName, double tuitionFee, double hostelRate, float daysStayed) {
        super(studentId, studentName);
        this.tuitionFee = tuitionFee;
        this.hostelRate = hostelRate;
        this.daysStayed = daysStayed;
    }

    public double calculateTotalFee() {
        double hostelFee = hostelRate * daysStayed;
        setTotalFee(tuitionFee + hostelFee);
        return getTotalFee();
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getHostelRate() {
        return hostelRate;
    }

    public void setHostelRate(double hostelRate) {
        this.hostelRate = hostelRate;
    }

    public float getDaysStayed() {
        return daysStayed;
    }

    public void setDaysStayed(float daysStayed) {
        this.daysStayed = daysStayed;
    }
}
