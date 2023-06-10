package SaturdayProjects.Week7;

public class Assignment10 {
    // in this code we should pay close attention to the "break". Normally, after each case we insert break to quit the switch
// and stop checking each line. Without break every line will be checked. Like so, the result = 3
    public static void main(String[] args) {
        int wd = 0;
        String[]days = {"sun","mon","wed","sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd+=2;

            }
        }
        System.out.println(wd);
    }
}
