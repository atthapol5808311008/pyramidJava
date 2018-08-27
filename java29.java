class v29{
public static void main (String args[]){
for(int vrow=1;vrow<=5;vrow++) {
	System.out.print(vrow);
	System.out.print(" ");
	System.out.print(2+vrow);
	for(int vcol=1;vcol<=2+vrow;vcol++) {
	System.out.print("*");
	}
	System.out.println("");
}
}
}