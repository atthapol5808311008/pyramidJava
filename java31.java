class v31{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=vrow;vcol<=5;vcol++) {
	System.out.print(vrow);	
	}
	for(int vcol=2;vcol<=vrow;vcol++) {
	System.out.print("  ");
	}
	for(int vcol=0;vcol<=5-vrow;pcol++) {
	System.out.print("*");	
	}
	System.out.println("");
}
}
}