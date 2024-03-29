public class EmpWageUC6 {
    public static final int attpart = 1;
    public static final int attfull = 2;
    public static final int wph = 20;
    public static final int wdm = 20;
    public static final int maxhrs = 100;

    public static void main(String[] args) {
        int emphrs = 0; int totaldays = 0; int totalhrs = 0;
        while (totaldays<wdm && totalhrs<=maxhrs ) {
            totaldays++;
            int a = (int) Math.floor(Math.random() * 10) % 3;
            switch (a) {
                case attfull:
                    emphrs = 8;
                    break;
                case attpart:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
            }
            totalhrs += emphrs;
            System.out.println("For Day: "+totaldays+"  Total Hours: "+emphrs);
        }
        int totalempwage = totalhrs * wph;
        System.out.println("Monthly wage for an employee : " +totalempwage);

    }
}
