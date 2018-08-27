class v5{
public static void main (String args[]){
for(int vrow=1;vrow<=4;vrow++) {
	for(int vcol=1;vcol<=4-vrow;vcol++) {
	System.out.print(" ");
	}
	System.out.print(prow);

	for(int vcol=2;vcol<=vrow;vcol++){
	System.out.print("**");
	}
	System.out.print(vrow);
	System.out.println("");
}
for(int vrow=3;vrow>=1;vrow--) {
	for(int vcol=1;vcol<=4-vrow;vcol++) {
	System.out.print(" ");
	}
	System.out.print(vrow);
	for(int vcol=2;vcol<=vrow;vcol++){
	System.out.print("**");
	}
	System.out.print(vrow);
	System.out.println("");
}
}
}