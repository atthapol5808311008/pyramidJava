class v9{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=3;vcol<=1+vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=0;vcol<=5-vrow;vcol++){
		System.out.print(vrow);
	}
	for(int vcol=0;vcol<=4-vrow;vcol++){
		System.out.print(vrow);
	}
	System.out.println("");
}
}
}