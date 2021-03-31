package PracticeRough;

class SubClass extends SuperClass {

	private int subPvtVariable=100;
	
	public int subPubVariable=200;
	
	private int subpvtMethod()   // <-- NO ACCESS
	{
		return subPvtVariable;
	}
	
	public int subpubMethod()   //<--- Direct access
	{
		//return pvtVariable ;
		System.out.println(pubMethod());
		return subpvtMethod();
	}
	
}