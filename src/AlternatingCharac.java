public class AlternatingCharac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABBABAABB";
		alternatingCharacters(s);
	}
	
    static int alternatingCharacters(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                	c++;
                }
            }
        System.out.println(c);
        return c;
    }

}
