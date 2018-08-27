class v12{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=2;vcol<=vrow;vcol++) {
	System.out.print(" ");
	}

	for(int vcol=vrow;vcol<=10-vrow;vcol++){
		System.out.print(vcol);
	}
	System.out.println("");
}
}
}