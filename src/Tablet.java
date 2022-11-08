public class Tablet extends MedicineCompany {
    String additionalInfo;

    Tablet(String companyName, String[] companyAddresses) {
        super(companyName, companyAddresses);
        this.additionalInfo = "store in a cool dry place";

    }

    @Override
    void displayLabels() {
        System.out.println("Company name:   " + this.companyName + "\n"
                + "Company address:  " + "\n"
                + companyAddresses[0] + "\n"
                + companyAddresses[1] + "\n"
                + companyAddresses[2] + "\n"
                + companyAddresses[3] + "\n"
                + "Additional Information:   " + this.additionalInfo);
    }
}
