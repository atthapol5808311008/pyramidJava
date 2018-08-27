class p2 {
public static void main (String args[]){
for(int vrow=1;vrow<=4;vrow++) {
	for(int vcol=vrow;vcol<=vrow+2;vcol++) {
		System.out.print(vcol);
	}
	
	for(int vcol=0;vcol<=1+vrow; vcol++){
		System.out.print("*");	
	}
	
	System.out.println("");
}
}
}