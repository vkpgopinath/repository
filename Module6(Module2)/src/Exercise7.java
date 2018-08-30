
public class Exercise7 {

	public static void main(String[] args) {
  
		int a[]=new int[] {100,200,300,400,500,600};
		
		int Smallestno=a[0];
		int Largestno=a[0];
		
		for (int i=1;i<a.length;i++) 
		{
			if(a[i]<Smallestno) 
				Smallestno=a[i];
				else if (a[i]>Largestno)
				Largestno=a[i];
				
		}
		
		System.out.println("Smallest no is:"+Smallestno);
		System.out.println("Largest no is:"+Largestno);
		
	}

	}
