public class Event {
    public static void main(String[] args) {
        // Create a solo sport participant
        SoloSport soloSport = new SoloSport("Tennis", "Serena", 1);
        soloSport.registerSport();
        if (soloSport.getRegistrationFee() != 0) {
            System.out.println("Thank You " + soloSport.getParticipantName()
                    + " for your participation! Your registration fee is "
                    + soloSport.getRegistrationFee());
            System.out.println("Your participant number is " +
                    soloSport.getParticipantNo());
        } else {
            System.out.println("Please enter a valid sport");
        }
        System.out.println();

        // Create a team sport participant
        TeamSport teamSport = new TeamSport("Basketball", "Stephen", 5, 1);
        teamSport.registerSport();
        if (teamSport.getRegistrationFee() != 0) {
            System.out.println("Thank You " + teamSport.getParticipantName()
                    + " for your participation! Your registration fee is "
                    + teamSport.getRegistrationFee());
            System.out.println("Your team number is " + teamSport.getTeamNo());
        } else {
            System.out.println("Please enter a valid sport");
        }
    }
}
