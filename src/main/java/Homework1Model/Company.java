package Homework1Model;

public class Company {

    private int companyId;
    private String companyName;
    private String companySector;
    private Item companyItem;

    public Company() {

    }

    public Company(int companyId, String companyName, String companySector, Item companyItem) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companySector = companySector;
        this.companyItem = companyItem;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanySector() {
        return companySector;
    }

    public void setCompanySector(String companySector) {
        this.companySector = companySector;
    }

    public Item getCompanyItem() {
        return companyItem;
    }

    public void setCompanyItem(Item companyItem) {
        this.companyItem = companyItem;
    }
}
