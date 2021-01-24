import javax.swing.JOptionPane;
public class Array {
    public static void main(String[] args) {
        String response;
        response = JOptionPane.showInputDialog("Enter the numbers : ");
        int n = Integer.parseInt(response);
        int[] a=new int[n];
        int i,j,temp=0;
        JOptionPane.showInputDialog("Enter "+n+" Array Elements : ");
        for(i=0;i<n;i++){
            a[i]=Integer.parseInt(response);
        }
        JOptionPane.showMessageDialog(null,"\nArray Elements Are : ");
        for(i=0;i<n;i++) {
            JOptionPane.showMessageDialog(null,"  "+a[i]);
        }
        for(i=0;i<n;i++) {
            for(j=i+1;j<n;j++) {
                if(a[i]<a[j]) {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;          
                }
            }
        }
        JOptionPane.showMessageDialog(null,"\nArray Elements in Descending Order : ");
        for(i=0;i<n;i++) {
            JOptionPane.showMessageDialog(null,"   "+a[i]);
        }   
    }
}