public class IfArgsTest {
	public static void main(String[] args) { 
		int x=Integer.parseInt(args[0]);
		/*以下を改造する。**/
        switch (x) {
            case 7:
            case 8:
            case 9:
                System.out.println(x+" is Big Number");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(x+" is Middle Number");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println(x+" is Small Number");
                break;
            default:
                System.out.println(x+" is out of scope");
                break;
        }
	
	

	}//main end
}//class end
