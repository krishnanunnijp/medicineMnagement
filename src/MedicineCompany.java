public class MedicineCompany {
    String companyName;
    String[] companyAddresses = new String[4];

    MedicineCompany(String companyName, String[] companyAddresses) {
        this.companyName = companyName;
        this.companyAddresses = companyAddresses;
    }

    void displayLabels() {
        System.out.println("Company name:   " + this.companyName + "\n"
                + "Company address:  " + "\n"
                + companyAddresses[0] + "\n"
                + companyAddresses[1] + "\n"
                + companyAddresses[2] + "\n"
                + companyAddresses[3]);
    }
}
