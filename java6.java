class v6{
public static void main (String args[]){
for(int vrow=1;vrow<=7;vrow++) {
	for(int vcol=2;vcol<=1+vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=1;vcol<=1;vcol++){
	System.out.print(vcol);
	}
	for(int vcol=vrow;vcol<=6;vcol++){
	System.out.print("01");
	}
	System.out.println("");
}
}
}