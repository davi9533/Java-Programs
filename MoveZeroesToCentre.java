package array;
//Program to move zeroes to the centre of the array
public class MoveZeroesToCentre {
	
	public static void move(int arr[]) {
		
		int mid = (int) Math.floor((arr.length)/2);
		int count = 0;
		int last = arr.length-1;
		//first half
		
		for(int i=0;i<mid;i++) {
			
			if(arr[i]!=0) {
				arr[count++] =arr[i];
			}
		}
		while(count<mid) {
			arr[count++]=0;
		}
		
		//second half
		
		for(int i=arr.length-1;i>=mid;i--) {
			if(arr[i]!=0) {
				arr[last--]=arr[i];
			}
		}
		while(last>=mid) {
			arr[last--]=0;
		}
		
		
		//print
		for(int i=0;i<arr.length;i++)
			System.out.print("  " + arr[i]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,2,0,4,0,5,0};
		move(arr);
	}

}
