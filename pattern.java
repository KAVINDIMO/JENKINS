class pattern{


public static void main(String[] args) {
	int n = 5;

	for(int i=0;i<n;i++){
		System.out.print(" ".repeat(n-i) + "*".repeat(2*i+1));
		System.out.println(" ");
	}
		for(int i=n-2;i>-1;i--){
		System.out.print(" ".repeat(n-i) + "*".repeat(2*i+1));
		System.out.println(" ");
	}

	//number diamond
	for(int i=0;i<n;i++){
		System.out.print(" ".repeat(n-i)+ Integer.toString(i).repeat(2*i+1));
		System.out.println(" ");
	}

	
}

}