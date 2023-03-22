public class SoloSport extends Sport {
    private int participantNo;
    
    public SoloSport(String sportName, String participantName, int participantNo) {
        super(sportName, participantName);
        this.participantNo = participantNo;
    }
    
    public void registerSport() {
        super.registerSport();
    }
    
    public int getParticipantNo() {
        return participantNo;
    }
    
    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }
}