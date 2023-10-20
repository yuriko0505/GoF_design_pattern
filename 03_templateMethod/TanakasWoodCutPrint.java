public class TanakasWoodCutPrint extends WoodCutPrint{
	public void draw( Cuttable hanzai ){
		System.out.println("hanzai にマジックを使って大好きな女の子の絵を描く");
	}
	public void cut( Cuttable hanzai ){
		System.out.println("彫刻刀を使って細部まで丁寧に hanzai を彫る");
	}
	public void print( Cuttable hanzai ){
		System.out.println("版画インクと馬簾を使って豪快にプリントする");
	}
}