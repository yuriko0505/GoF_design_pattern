public abstract class WoodCutPrint{
    public abstract void draw( Cuttable hanzai );
	public abstract void cut( Cuttable hanzai );
	public abstract void print( Cuttable hanzai );
	public void createWoodCutPrint(){
		Wood hanzai = new Wood(); //Wood クラスは、Cuttable インタフェースを実装している
		draw( hanzai );
		cut( hanzai );
		print( hanzai );
	}
}