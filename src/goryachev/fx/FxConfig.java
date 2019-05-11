// Copyright © 2019 Andy Goryachev <andy@goryachev.com>
package goryachev.fx;


/**
 * These application-wide flags control FX subsystem.
 */
public class FxConfig
{
	/** -Dcss.refresh=true enables polling of css style sheet for changes */
	public static boolean continuousCssRefresh() { return Boolean.getBoolean("css.refresh"); };
	
	/** -Dcss.dump=true enables CSS dump to stdout upon startup and also upon change */
	public static boolean dumpCSS() { return Boolean.getBoolean("css.dump"); }
}
