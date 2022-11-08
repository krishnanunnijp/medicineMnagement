public class Ointment extends MedicineCompany {
    String additionalInfo;

    Ointment(String companyName, String[] companyAddresses) {
        super(companyName, companyAddresses);
        this.additionalInfo = "for external use only";
    }
    @Override
    void displayLabels() {
        System.out.println("Company name:   " + this.companyName + "\n"
                + "Company address:  " + "\n"
                + companyAddresses[0] + "\n"
                + companyAddresses[1] + "\n"
                + companyAddresses[2] + "\n"
                + companyAddresses[3]+"\n"
                +"Additional Information:   "+this.additionalInfo );
    }
}
