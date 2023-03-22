public class TeamSport extends Sport {
    private int noOfParticipants;
    private int teamNo;
    
    public TeamSport(String sportName, String participantName, int noOfParticipants, int teamNo) {
        super(sportName, participantName);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }
    
    public void registerSport() {
        switch (getSportName()) {
            case "Badminton":
                setRegistrationFee(40 * noOfParticipants);
                break;
            case "Tennis":
                setRegistrationFee(60 * noOfParticipants);
                break;
            case "TableTennis":
                setRegistrationFee(80 * noOfParticipants);
                break;
            case "Volleyball":
                setRegistrationFee(100 * noOfParticipants);
                break;
            case "Basketball":
                setRegistrationFee(110 * noOfParticipants);
                break;
            default:
                setRegistrationFee(0);
        }
    }
    
    public int getNoOfParticipants() {
        return noOfParticipants;
    }
    
    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }
    
    public int getTeamNo() {
        return teamNo;
    }
    
    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }
}