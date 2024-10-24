//create a MD array and make copy and print both original and copy array
package ArrayDemo;

public class MDarray1 {

	public static void main(String[] args) {
		int num[][]= {
				{10,20,30},
				{40,50,60}
		};
		int numcopy[][]=num.clone();
		
		for(int i=0; i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k=0; k<numcopy.length;k++) {
			for(int m=0;m<numcopy[k].length;m++) {
				System.out.print(numcopy[k][m]+" ");
				
			}
			System.out.println();
		}

	}

}