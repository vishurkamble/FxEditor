// Copyright © 2016-2017 Andy Goryachev <andy@goryachev.com>
package demo.edit;
import goryachev.fx.CommonStyles;
import goryachev.fx.FX;
import goryachev.fx.FxStyleSheet;
import javafx.scene.paint.Color;


/**
 * this is how a style sheet is generated.
 */
public class Styles
	extends FxStyleSheet
{
	public Styles()
	{
		// TODO themes
		
		add
		(
			// basic styles
			selector(".root").defines
			(
				// text selection
				prop("-fx-accent", FX.rgba(0xffff8b, 0.7)),
				prop("-fx-highlight-text-fill", Color.BLACK), //"-fx-dark-text-color"),
				// focus outline
				prop("-fx-focus-color", FX.rgb(0xff6d00)),
				// focus glow
				prop("-fx-faint-focus-color", FX.rgba(0xff6d00, 0.1)) // FIX
			),
			
			selector(".text").defines
			(
				prop("-fx-font-smoothing-type", "gray")
			),
			
			selector(".scroll-pane").defines
			(
//				new Selector(FOCUSED).defines
//				(
//					// removes focused border from scroll pane
//					// TODO do it specifically for the content pane
//					backgroundInsets(1)
//				),
				new Selector(" > .viewport").defines
				(
					backgroundColor(Color.WHITE) // FIX theme
				)
			),
			
			// common fx styles
			new CommonStyles(),
			
			// fix text selection colors
			selector(".text-input").defines
			(
				new Selector(FOCUSED).defines
				(
					textFill(Color.BLACK), // FIX theme
					prop("-fx-highlight-text-fill", Color.BLACK) // FIX theme
				)
			)
		);
	}
}
