class v8{
public static void main (String args[]){
for(int vrow=1;vrow<=7;vrow++) {
	for(int vcol=3;vcol<=1+vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=vrow;vcol<=vrow;vcol++){
		System.out.print(vrow);
		System.out.print(vrow+1);
		System.out.print(vrow+2);
	}
	for(int vcol=2;vcol<=2+vrow;vcol++){
		System.out.print("*");
	}

	System.out.println("");
}
}
}