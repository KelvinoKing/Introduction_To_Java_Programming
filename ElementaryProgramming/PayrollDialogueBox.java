import javax.swing.JOptionPane;

public class PayrollDialogueBox {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter employee's name: ");
        int hours = Integer.parseInt(JOptionPane.showInputDialog("Enter number of hours worked in a week: "));
        double payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate: "));
        double federalTaxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter federal tax witholding rate: "));
        double stateTaxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter state tax withholding rate: "));

        double totalDeduction = (hours * payRate * federalTaxRate) + 
        (hours * payRate * stateTaxRate);


        JOptionPane.showMessageDialog(null, "Employee Name: " + name + "\n" +
        "Hours Worked: " + hours + "\n" +
        "Pay Rate: $" + payRate + "\n" +
        "Gross Pay: $" + (hours * payRate) + "\n" +
        "Deductions: " + "\n" + "\t" +
        "Federal Withholding (" + (federalTaxRate * 100) + "%): $" +
        (hours * payRate * federalTaxRate) + "\n" + "\t" +
        "State Withholding (" + (stateTaxRate * 100) + "%): $" +
        (hours * payRate * stateTaxRate) + "\n" + "\t" +
        "Total Deductions: $" + totalDeduction + "\n" +
        "Net pay: $" + ((hours * payRate) - totalDeduction));
    }
}
