package com.p1ut0nium.roughmobsrevamped.proxy;

import com.google.common.util.concurrent.ListenableFuture;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/*
 * Server side only event handling
 */

public class ServerProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {}
	
	@Override
	public void init(FMLInitializationEvent event) {}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {}
	
	@Override
	public void serverStarting(FMLServerStartingEvent event) {}

	public EntityPlayer getPlayerEntityFromContext(MessageContext ctx) {
		return ctx.getServerHandler().player;
	}

	@Override
	public ListenableFuture<Object> addScheduledTaskClient(Runnable runnableToSchedule) {
		throw new IllegalStateException("This should only be called from client side");
	}
}
