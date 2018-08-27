class v30{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=2;vcol<=vrow;vcol++) {
	System.out.print(" ");	
	}
	for(int vcol=0;vcol<=5-vrow;vcol++){
	System.out.print("*");
	}
	for(int vcol=0;vcol<=4-vrow;vcol++){
	System.out.print("*");
	}
	for(int vcol=vrow;vcol>=1;vcol--) {
	System.out.print(vcol);
	}
	System.out.println("");
}
}
}