class v19{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=vrow;vcol<=vrow;vcol++) {
	System.out.print(vcol);	
	}
	for(int vcol=vrow;vcol<=9;vcol++){
	System.out.print("*");
	}
	for(int vcol=2;vcol<=vrow;vcol++){
	System.out.print(" ");
	}
	for(int vcol=vrow;vcol<=vrow;vcol++){
	System.out.print(6-vrow);
	}
	System.out.println("");
}
}
}