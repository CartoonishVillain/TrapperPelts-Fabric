package com.cartoonishvillain.trapperpelts;

import net.fabricmc.api.ModInitializer;
import net.minecraft.world.entity.EntityType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TrapperPelts implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "trapperpelts";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static ArrayList<EntityType> SMALLGAME = new ArrayList<>(List.of(EntityType.SILVERFISH, EntityType.PLAYER, EntityType.ENDERMITE, EntityType.RABBIT, EntityType.CHICKEN, EntityType.BEE, EntityType.AXOLOTL, EntityType.CAT, EntityType.WITHER, EntityType.ENDER_DRAGON));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Register.init();
	}
}
