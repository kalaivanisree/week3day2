package assignmentscollections;

public class RemoveDuplicatString {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1"; //split[i]
        //We learn basics as part of sessions in week1 //split[j]

int count = 0;

String[] split = text.split(" ");

for (int i = 0; i < split.length; i++) {

for (int j = i+1; j < split.length; j++) {
    //split[0] split[1]
    //split[0] split[2]
if(split[i].equalsIgnoreCase(split[j])) {
    //java java
    split[j] = "";
    
    count++;
}
}
}

if(count>0) {

for (int k = 0; k < split.length; k++) {

System.out.print(split[k]+" ");

}
}

	}

}
