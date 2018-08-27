class v11{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=1;vcol<=5-vrow;vcol++) {
	System.out.print(" ");
	}
	for(int vcol=vrow;vcol<=vrow;vcol++){
	System.out.print(vrow);
	}
	for(int vcol=2;vcol<=vrow;vcol++){
	System.out.print(" ");
	}
	System.out.print(vrow);
	System.out.println("");
}
}
}