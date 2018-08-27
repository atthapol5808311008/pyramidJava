class v22{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	System.out.print("*");
	for(int vcol=2;vcol<=vrow;vcol++) {
	System.out.print(" ");	
	}
	for(int vcol=0;vcol<=5-vrow;vcol++){
	System.out.print(vrow);
	}
	for(int vcol=0;vcol<=4-vrow;vcol++){
	System.out.print(vrow);
	}
	for(int vcol=2;vcol<=vrow;vcol++) {
	System.out.print(" ");	
	}
	System.out.print("*");
	System.out.println("");
}
}
}