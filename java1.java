class v1{
public static void main (String args[]){
for(int vrow=1;vrow<=4;vrow++) {
	for(int vcol=2; vcol<=0+vrow; vcol++) {
	System.out.print(" ");
	}
	for(int vcol=vrow; vcol<=vrow+1; vcol++) {
	System.out.print(vrow);
	}
	for(int vcol=1; vcol<=4-vrow; vcol++){
	System.out.print("**");
	}
	for(int pcol=prow; pcol<=prow+1; pcol++) {
	System.out.print(prow);
	}
	System.out.println("");
	}
}
}