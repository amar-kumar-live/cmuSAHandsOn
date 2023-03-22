public class Sport {
    private String sportName;
    private String participantName;
    private int registrationFee;
    
    public Sport(String sportName, String participantName) {
        this.sportName = sportName;
        this.participantName = participantName;
    }
    
    public void registerSport() {
        registrationFee = switch (sportName) {
            case "Badminton" -> 80;
            case "Tennis" -> 100;
            case "TableTennis" -> 120;
            case "Volleyball" -> 150;
            case "Basketball" -> 160;
            default -> 0;
        };
        }
        public String getSportName() {
            return sportName;
        }
        public void setSportName(String sportName) {
            this.sportName = sportName;
        }
        public String getParticipantName() {
            return participantName;
        }
        public void setParticipantName(String participantName) {
            this.participantName = participantName;
        }
        public int getRegistrationFee() {
            return registrationFee;
        }
        public void setRegistrationFee(int registrationFee) {
            this.registrationFee = registrationFee;
        }
            
    }