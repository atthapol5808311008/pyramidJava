class v21{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	for(int vcol=vrow;vcol<=7;vcol++){
	System.out.print(" ");
	}
	System.out.print(vrow);
	for(int vcol=1;vcol<=vrow;vcol++){
	System.out.print(" ");
	}
	for(int vcol=vrow;vcol<=vrow;vcol++){
	System.out.print(8-vrow);
	}
	System.out.println("");
}
}
}