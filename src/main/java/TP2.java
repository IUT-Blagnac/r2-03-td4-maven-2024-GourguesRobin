public class TP2 {
    /*
     * @param args IN
     * @throws Exception IN
     */
    public static void main(String[] args) throws Exception {
        Pile maPile = new Pile(10);
        System.out.println("====Test1====");
        if (!maPile.estVide()) System.out.println("NOK");
        System.out.println("Test 1 Valide");
        maPile.empiler(5);
        
        System.out.print(" \n");
        
        System.out.println("====Test2====");
        if (maPile.estVide()) System.out.println("NOK");
        System.out.println("Test 2 Valide ");
        
        System.out.print(" \n");

        int element = maPile.depiler();
        System.out.println("====Test3====");
        if (!maPile.estVide()) System.out.println("NOK");  
        System.out.println("Test 3 valide");
        	
        System.out.print(" \n");
        
        System.out.println("====Test4====");
        if (element != 5) System.out.println("NOK");
        System.out.println("Test 4 est valide");

        System.out.print(" \n");
        
        System.out.println("====Test dépiler====");
        Pile p = new Pile(10);
        p.empiler(4);
        int element1 = p.depiler();
        System.out.println(element1);
        System.out.println("Test dépiler validé");
    }
}