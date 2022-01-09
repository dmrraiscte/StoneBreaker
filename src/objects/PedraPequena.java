package objects;

import engine.StoneBreaker;
import utils.Point2D;

// TODO
// Pode ser necessario mudar a declaracao da classe e/ou construtor
//
public class PedraPequena extends Pedra {

	public PedraPequena(Point2D position) {
		super("smallstone", position, 1);
	}

	@Override
	public void brokenBy(Bulldozer b) {
		StoneBreaker.getInstance().removeObject(this);
		givePointsTo(b);
	}

	@Override
	public void givePointsTo(Bulldozer b) {
		b.addPoints(1);
	}
	
	//TODO
}
