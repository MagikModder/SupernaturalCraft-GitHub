package com.sterango.spncraft.world;

import java.util.Random;

import com.sterango.spncraft.SupernaturalCraft;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator{

	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, rand, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, rand, chunkX * 16, chunkZ * 16);

		}

	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ){
		for (int i = 0; i < 100; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			(new WorldGenMinable(SupernaturalCraft.SilverOre, 3)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(SupernaturalCraft.SaltOre, 3)).generate(world, rand, randPosX, randPosY, randPosZ);

		}
	}

	private void generateNether(World world, Random rand, int i, int j) {


	}

}