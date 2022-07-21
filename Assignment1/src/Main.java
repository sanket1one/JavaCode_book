public class Main {
    private String name;
    private String branch;
    private String registrationId;
    private long contactNumber;
    private static int counter;

    static
    {
        counter=1001;
    }

    public Main(String name, long contactNumber, String branch)
    {
        this.name=name;
        this.branch= branch;
        this.contactNumber=contactNumber;
        this.registrationId="D"+ counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Main.counter = counter;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public static void main(String[] args)
    {
        Main student1 = new Main("Rohit", 1234567889, "Computer" );
        Main student2 = new Main("Sayli", 1988612300, "Mechanical");

        System.out.println("Hi " +student1.getName()+"! Your registration id is "+ student1.getRegistrationId());

        System.out.println("Hi " +student2.getName()+"! Your registration id is "+ student2.getRegistrationId());

    }
}