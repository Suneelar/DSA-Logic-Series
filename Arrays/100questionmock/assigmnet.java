public class assigmnet {
    public static void main(String[] args) {
        String str="i&know$java@program#";
    char ch[]=str.toCharArray();
int i=0;
int j=ch.length-1;
while(i<j){
if(!Character.isLetter(ch[i])){
    i++;
}else if(!Character.isLetter(ch[j])){
    j--;
}else{
    // swap
    char temp=ch[i];
    ch[i]=ch[j];
    ch[j]=temp;
    i++;
    j--;
}
}
System.out.println(new String(ch));
        }  
}
