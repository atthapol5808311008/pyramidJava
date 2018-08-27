class v33{
public static void main (String args[]){
for(int vrow=1;vrow<=3;vrow++) {
	for(int vcol=1;vcol<=3-vrow;vcol++) {	
	System.out.print(" ");
	}
	for(int vcol=1;vcol<=vrow;vcol++){
	System.out.print("*");
	}
	for(int vcol=2;vcol<=vrow;vcol++){
	System.out.print("*");
	}
	for(int vcol=1;vcol<=3-vrow;vcol++) {
	System.out.print(" ");
	}
	System.out.println("");
}
for(int vrow=2;vrow>=1;vrow--) {
	for(int vcol=1;vcol<=3-vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=1;vcol<=vrow;vcol++){
	System.out.print("*");
	}
	for(int vcol=2;vcol<=vrow;vcol++){
	System.out.print("*");
	}
	for(int vcol=1;vcol<=3-vrow;vcol++) {
	System.out.print(" ");
	}
	System.out.println("");
}

}
}