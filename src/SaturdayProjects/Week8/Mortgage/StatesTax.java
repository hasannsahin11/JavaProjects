package SaturdayProjects.Week8.Mortgage;

public class StatesTax {
        /*

                StateTax class was created. Add a private int tax variable to this class.
                Create a constructor which gets String stateName as parameters.
                Assign 20 to tax variable if stateName is New York,
                Assign 15 to tax variable if stateName is New Jersey,
                Assign 5 to tax variable if stateName is Florida,
                Assign 12 to tax variable if stateName is Ohio

                by creating private setTax method and call this method in the constructor.
                Make sure tax variable cannot be changed after it is assigned.
                create a private variable int tax;
                create the constructor
                create a get method of the tax
            */
        private int tax;

        public StatesTax(String stateName) {

            if (stateName.equals("New York")){
                tax=20;
            }else if(stateName.equals("New Jersey")){
                tax=15;
            }else if(stateName.equals("Florida")){
                tax=5;
            } else if (stateName.equals("Ohio")) {
                tax=12;
            }
        }

        private final void setTax(int tax) {
            this.tax = tax;
        }

       public int getTax() {
            return tax;
        }

        public StatesTax(int tax) {
            this.tax = tax;
        }
    }