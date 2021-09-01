package com.storedherbxp;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class StoredHerbXPTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(StoredHerbXPPlugin.class);
		RuneLite.main(args);
	}
}