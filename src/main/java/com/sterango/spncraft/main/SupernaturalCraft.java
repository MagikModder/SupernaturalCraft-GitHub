package com.sterango.spncraft.main;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

<<<<<<< HEAD:src/main/java/com/sterango/spncraft/SupernaturalCraft.java
import com.sterango.spncraft.Items.AngelicIron;
import com.sterango.spncraft.Items.Colt;
import com.sterango.spncraft.Items.DemonKnife;
import com.sterango.spncraft.Items.ModItems;
import com.sterango.spncraft.Items.PurifiedBlood;
import com.sterango.spncraft.Items.AngelBlood;
import com.sterango.spncraft.Items.LambsBlood;
import com.sterango.spncraft.Items.LeviathanBlood;
import com.sterango.spncraft.Items.DemonBlood;
import com.sterango.spncraft.Items.DeadMansBlood;
import com.sterango.spncraft.Items.Salt;
import com.sterango.spncraft.Items.SaltItem;
import com.sterango.spncraft.Items.Soul;
import com.sterango.spncraft.Items.Stake;
import com.sterango.spncraft.blocks.DevilsTrap;
import com.sterango.spncraft.blocks.SaltBlock;
import com.sterango.spncraft.blocks.SaltOre;
import com.sterango.spncraft.blocks.SilverBlock;
import com.sterango.spncraft.blocks.SilverOre;
import com.sterango.spncraft.food.FoodApplePie;
import com.sterango.spncraft.mobs.EntityAngel;
import com.sterango.spncraft.mobs.EntityBobby;
import com.sterango.spncraft.mobs.EntityCastiel;
import com.sterango.spncraft.mobs.EntityCrowley;
import com.sterango.spncraft.mobs.EntityDean;
import com.sterango.spncraft.mobs.EntityDeanDemon;
import com.sterango.spncraft.mobs.EntityDemon;
import com.sterango.spncraft.mobs.EntityDjinn;
import com.sterango.spncraft.mobs.EntityHellHound;
import com.sterango.spncraft.mobs.EntityLeviathan;
import com.sterango.spncraft.mobs.EntitySam;
import com.sterango.spncraft.mobs.EntityWIW;
import com.sterango.spncraft.proxy.CommonProxy;
import com.sterango.spncraft.weapons.AngelBlade;
import com.sterango.spncraft.weapons.DeathsScythe;
import com.sterango.spncraft.weapons.FirstBlade;
import com.sterango.spncraft.weapons.PurgatoryBlade;
import com.sterango.spncraft.world.WorldGen;
=======
import com.sterango.spncraft.Client.proxy.CommonProxy;
import com.sterango.spncraft.Client.world.gen.WorldGen;
import com.sterango.spncraft.Common.blocks.SaltBlock;
import com.sterango.spncraft.Common.blocks.SaltOre;
import com.sterango.spncraft.Common.blocks.SilverBlock;
import com.sterango.spncraft.Common.blocks.SilverOre;
import com.sterango.spncraft.Common.entitys.mobs.EntityAngel;
import com.sterango.spncraft.Common.entitys.mobs.EntityBobby;
import com.sterango.spncraft.Common.entitys.mobs.EntityCastiel;
import com.sterango.spncraft.Common.entitys.mobs.EntityCrowley;
import com.sterango.spncraft.Common.entitys.mobs.EntityDean;
import com.sterango.spncraft.Common.entitys.mobs.EntityDeanDemon;
import com.sterango.spncraft.Common.entitys.mobs.EntityDemon;
import com.sterango.spncraft.Common.entitys.mobs.EntityDjinn;
import com.sterango.spncraft.Common.entitys.mobs.EntityHellHound;
import com.sterango.spncraft.Common.entitys.mobs.EntityLeviathan;
import com.sterango.spncraft.Common.entitys.mobs.EntitySam;
import com.sterango.spncraft.Common.entitys.mobs.EntityWIW;
import com.sterango.spncraft.Common.items.AngelBlade;
import com.sterango.spncraft.Common.items.Colt;
import com.sterango.spncraft.Common.items.DemonKnife;
import com.sterango.spncraft.Common.items.DevilsTrap;
import com.sterango.spncraft.Common.items.FirstBlade;
import com.sterango.spncraft.Common.items.ModItems;
import com.sterango.spncraft.Common.items.PurgatoryBlade;
import com.sterango.spncraft.Common.items.SaltItem;
import com.sterango.spncraft.Common.items.Soul;
import com.sterango.spncraft.Common.items.Stake;
>>>>>>> origin/master:src/main/java/com/sterango/spncraft/main/SupernaturalCraft.java

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid =  SupernaturalCraft.MODID, version =  SupernaturalCraft.VERSION)
public class SupernaturalCraft
{

    public static final String MODID = "SupernaturalCraft";
    public static final String VERSION = "4.0";
    @Instance(MODID)
    public static SupernaturalCraft instance; 
    
  
    @SidedProxy(clientSide="com.sterango.spncraft.proxy.ClientProxy", serverSide="com.sterango.spncraft.proxy.CommonProxy")
    public static CommonProxy proxy;
    
//MOBS 
    
    //Mobs - Register Eggs/Entity
    public static void registerEntity(Class entityClass, String name)
    {
    int entityID = EntityRegistry.findGlobalUniqueEntityId();
    long seed = name.hashCode();
    Random rand = new Random(seed);
    int primaryColor = rand.nextInt() * 16777215;
    int secondaryColor = rand.nextInt() * 16777215;

    EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
    EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
    EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }

  		
    public static Item getCarDrop(int colour)
	{
		switch (colour) 
		{
		case 0:
			return null;
		
		}
		return null;
	}
  		
    
    public static Block SaltBlock;
	 public static Block SaltOre;
	 public static Block SilverBlock;
	 public static Block  SilverOre;
	 public static Item JohnsJournal;
	 public static Item AngelicIron;
	 public static Block DevilsTrap;
	 public static Block BloodyDevilsTrap;
	 public static Item PurifiedBlood;
	 public static Item LambsBlood;
	 public static Item Bible;
	 public static Item BookOfSpells;
	 public static Item BookOfShadows;
	 public static Item DeathsScythe;
	 public static Item Amulet;
	 public static Item DemonBlood;
	 public static Item EMFMeter;
	 public static Item Ectoplasm;
	 public static Item HolyOil;
	 public static Item DTablet;
	 public static Item SoulStick;
	 public static Item LeviathanBlood;
	 public static Item ATablet;
	 public static Item LTablet;
	 public static Item RoadSalt;
	 public static Block SaltLine;
	 public static Item Sulfur;
	 public static Item WordofGod;
	 public static Item Salt;
	 public static Item AngelBlood;
	 public static Item Goblet;
	 public static Item HexBag;
	 public static Item AngelBlade;
	 public static Item DeathsRing;
	 public static Item DemonKnife;
	 public static Item FaminesRing;
	 public static Item HornOfTruth;
	 public static Item PestilencesRing;
	 public static Item PurgatoryBlade;
	 public static Item PurgatoryPortalBlade;
	 public static Item RabbitsFoot;
	 public static Item WoodenStake;
	 public static Item WarsRing;
	 public static Item HolyWater;
	 public static Item ColtAmmo;
	 public static Item ApplePie;
	 public static Item Colt;
	 public static Item Silver;
	 public static Item Soul;
	 public static Item FirstBlade;
	 public static Item AntiPossessionTattoo;
	 public static Item DeadMansBlood;
	 public static Item SupernaturalBooks;
	  public static CreativeTabs tabSupernaturalCraft = new CreativeTabsSupernaturalCraft("SupernaturalCraft");
	  static ToolMaterial StakeToolMaterial = EnumHelper.addToolMaterial("StakeToolMaterial", 2, 750, 7, 16.0F, 20);
	  static ToolMaterial PurgatoryToolMaterial = EnumHelper.addToolMaterial("PurgatoryToolMaterial", 2, 750, 7, 66.0F, 20);
	  static ToolMaterial DemonToolMaterial = EnumHelper.addToolMaterial("DemonToolMaterial", 2, 750, 7, 36.0F, 20);
	  static ToolMaterial FirstBladeToolMaterial = EnumHelper.addToolMaterial("FirstBladeToolMaterial", 2, 750, 7, 76.0F, 20);
	  static ToolMaterial AngelBladeToolMaterial = EnumHelper.addToolMaterial("AngelBladeToolMaterial", 2, 750, 7, 36.0F, 20);
	  static ToolMaterial DeathScytheToolMaterial = EnumHelper.addToolMaterial("DeathScytheToolMaterial", 2, 750, 7, 96.0F, 20);
	  public static IWorldGenerator gen = new WorldGen();
	  
	  @EventHandler
	  public void preInit(FMLPreInitializationEvent event)
	  {
		 
		  
		  
		  
		  GameRegistry.registerWorldGenerator(gen, 1 /*This is the importance at which to generate the contents of the file, leave it at 1*/);
		  
		  //Mobs - Register the Mobs
		  registerEntity(EntityAngel.class, "entityAngel");
		  registerEntity(EntityDemon.class, "entityDemon");
		  registerEntity(EntityCastiel.class, "entityCastiel");
		  registerEntity(EntityLeviathan.class, "entityLeviathan");
		    registerEntity(EntityCrowley.class, "entityCrowley");
		    registerEntity(EntityDean.class, "entityDean");
		    registerEntity(EntityBobby.class, "entityBobby");
		    registerEntity(EntityHellHound.class, "entityHellHound");
		    registerEntity(EntityDeanDemon.class, "entityDeanDemon");
		    registerEntity(EntitySam.class, "entitySam");
		    registerEntity(EntityWIW.class, "entityWIW");
		   registerEntity(EntityDjinn.class, "entityDjinn");

		    
		    EntityRegistry.addSpawn(EntityAngel.class, 20, 20, 20, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityDemon.class, 20, 20, 20, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityBobby.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntitySam.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityDean.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityCastiel.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityCrowley.class, 1, 1, 1, EnumCreatureType.monster);
		   EntityRegistry.addSpawn(EntityDeanDemon.class, 1, 1, 1, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityDjinn.class, 10, 9, 3, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntityHellHound.class, 10, 9, 3, EnumCreatureType.monster);
		   EntityRegistry.addSpawn(EntityLeviathan.class, 7, 5, 3, EnumCreatureType.monster);
		   EntityRegistry.addSpawn(EntityWIW.class, 6, 5, 4, EnumCreatureType.monster);
		    EntityRegistry.addSpawn(EntitySam.class, 1, 1, 1, EnumCreatureType.monster);

		    
		    proxy.registerRenderers();
		    
		    ApplePie = new ItemFood(4, 0.1F, true).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "apple_pie").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);;
		    GameRegistry.registerItem(ApplePie, ApplePie.getUnlocalizedName().substring(5));


//Silver Block
			
			SilverBlock = new SilverBlock().setBlockName("SilverBlock").setHardness(10.0F).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(SilverBlock, SilverBlock.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "SilverBlock").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		    
		    SaltBlock = new SaltBlock().setBlockName("SaltBlock").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setHardness(10.0F);
		    GameRegistry.registerBlock(SaltBlock, SaltBlock.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "SaltBlock").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		    
		    
		    SaltLine = new Salt().setBlockName("SaltLine");
		    GameRegistry.registerBlock(SaltLine, SaltLine.getUnlocalizedName().substring(5)).setBlockTextureName(SupernaturalCraft.MODID + ":" + "salt");
		    

			
			SaltOre = new SaltOre().setBlockName("SaltOre").setHardness(3.0F).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(SaltOre, SaltOre.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "saltore").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			
	
	//Silver Ore		
			
			SilverOre = new SilverOre().setBlockName("SilverOre").setHardness(3.0F).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(SilverOre, SilverOre.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "silverore").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
	//Devil's Trap		
			
			DevilsTrap = new DevilsTrap().setBlockName("DevilsTrap").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(DevilsTrap, DevilsTrap.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "deviltrap").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
	//Bloody Devil's Trap		
			BloodyDevilsTrap = new DevilsTrap().setBlockName("BloodyDevilsTrap").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerBlock(BloodyDevilsTrap, BloodyDevilsTrap.getUnlocalizedName().substring(5)).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setBlockTextureName(SupernaturalCraft.MODID + ":" + "deviltrapblood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
	
			
			
			//Silver
			Silver = new ModItems().setUnlocalizedName("Silver").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "silver").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
			GameRegistry.registerItem(Silver, Silver.getUnlocalizedName().substring(5));
		

//Soul
				Soul = new Soul().setUnlocalizedName("Soul").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Soul").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(Soul, Soul.getUnlocalizedName().substring(5));
//Purified Blood		
		
		PurifiedBlood = new PurifiedBlood().setUnlocalizedName("PurifiedBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "purifiedblood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(PurifiedBlood, PurifiedBlood.getUnlocalizedName().substring(5));
//Lamb's Blood		
		
		LambsBlood = new LambsBlood().setUnlocalizedName("LambsBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "lambsblood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(LambsBlood, LambsBlood.getUnlocalizedName().substring(5));
//Dead Man's Blood		
	
		DeadMansBlood = new DeadMansBlood().setUnlocalizedName("DeadMansBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "DeadMansBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DeadMansBlood, DeadMansBlood.getUnlocalizedName().substring(5));
//Demon's Blood		
		DemonBlood = new DemonBlood().setUnlocalizedName("DemonBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "demonblood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DemonBlood, DemonBlood.getUnlocalizedName().substring(5));		
//Angel Blood		
				AngelBlood = new AngelBlood().setUnlocalizedName("AngelBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "angelblood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(AngelBlood, AngelBlood.getUnlocalizedName().substring(5));
//	LeviathanBlood	
		LeviathanBlood = new LeviathanBlood().setUnlocalizedName("LeviathanBlood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "leviathanblood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(LeviathanBlood, LeviathanBlood.getUnlocalizedName().substring(5));
//Anti-Possession Tattoo		
				AntiPossessionTattoo = new ModItems().setUnlocalizedName("AntiPossessionTattoo").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "AntiPossessionTattoo").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(AntiPossessionTattoo, AntiPossessionTattoo.getUnlocalizedName().substring(5));
//Bible			
		Bible = new ModItems().setUnlocalizedName("Bible").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "bible").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Bible, Bible.getUnlocalizedName().substring(5));
//Book Of Spells		
		
		BookOfSpells = new ModItems().setUnlocalizedName("BookOfSpells").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "BookOfSpells").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(BookOfSpells, BookOfSpells.getUnlocalizedName().substring(5));
//Book Of Shadows		
		BookOfShadows = new ModItems().setUnlocalizedName("Book Of Shadows").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Book Of Shadows").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(BookOfShadows, BookOfShadows.getUnlocalizedName().substring(5));
//John's Journa
		JohnsJournal = new ModItems().setUnlocalizedName("JohnsJournal").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "johnsjournal").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(JohnsJournal, JohnsJournal.getUnlocalizedName().substring(5));
//Dean's Amulet		
		Amulet = new ModItems().setUnlocalizedName("Amulet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Amulet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Amulet, Amulet.getUnlocalizedName().substring(5));

//EMF Meter		
		EMFMeter = new ModItems().setUnlocalizedName("EMFMeter").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "EMFMeter").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(EMFMeter, EMFMeter.getUnlocalizedName().substring(5));
//Ectoplasm		
		Ectoplasm = new ModItems().setUnlocalizedName("Ectoplasm").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Ectoplasm").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Ectoplasm, Ectoplasm.getUnlocalizedName().substring(5));
//Death's Scythe		
		DeathsScythe = new DeathsScythe(DeathScytheToolMaterial).setUnlocalizedName("DeathsScythe").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "DeS").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DeathsScythe, DeathsScythe.getUnlocalizedName().substring(5));
//Holy Oil		
		HolyOil = new ModItems().setUnlocalizedName("HolyOil").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Holy Oil").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(HolyOil, HolyOil.getUnlocalizedName().substring(5));
//Holy Water		
		HolyWater = new ModItems().setUnlocalizedName("HolyWater").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "HolyWater").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(HolyWater, HolyWater.getUnlocalizedName().substring(5));
//Key to OZ		
		Item KeytoOz;
		KeytoOz = new ModItems().setUnlocalizedName("KeytoOz").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "KeytoOz").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(KeytoOz, KeytoOz.getUnlocalizedName().substring(5));
//Demon Tablet		
		DTablet = new ModItems().setUnlocalizedName("DTablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Tablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DTablet, DTablet.getUnlocalizedName().substring(5));
//Angel Tablet		
		ATablet = new ModItems().setUnlocalizedName("ATablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Tablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(ATablet, ATablet.getUnlocalizedName().substring(5));
//Leviathan Tablet		
		LTablet = new ModItems().setUnlocalizedName("LTablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Tablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(LTablet, LTablet.getUnlocalizedName().substring(5));
//Salt		
				Salt = new SaltItem().setUnlocalizedName("Salt").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "salt").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(Salt, Salt.getUnlocalizedName().substring(5));
//Sulfur		
		Sulfur = new ModItems().setUnlocalizedName("Sulfur").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "sulfur").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Sulfur, Sulfur.getUnlocalizedName().substring(5));
//Supernatural Books		
		
	SupernaturalBooks = new ModItems().setUnlocalizedName("SupernaturalBooks").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "SPNBook").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(SupernaturalBooks, SupernaturalBooks.getUnlocalizedName().substring(5));
//Word of God		
		WordofGod = new ModItems().setUnlocalizedName("WordofGod").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Tablet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(WordofGod, WordofGod.getUnlocalizedName().substring(5));

		//AngelicIron		
				AngelicIron = new AngelicIron().setUnlocalizedName("AngelicIron").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "AngelicIron").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
				GameRegistry.registerItem(AngelicIron, AngelicIron.getUnlocalizedName().substring(5));
		
//Goblet of Blood		
		
		Goblet = new ModItems().setUnlocalizedName("Goblet").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "gobletofblood").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Goblet, Goblet.getUnlocalizedName().substring(5));
		
	//Soul Stick	
		SoulStick = new ModItems().setUnlocalizedName("SoulStick").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "soulstick").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(SoulStick, SoulStick.getUnlocalizedName().substring(5));
		
//Hexbag		
		HexBag = new ModItems().setUnlocalizedName("HexBag").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "HexBag").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(HexBag, HexBag.getUnlocalizedName().substring(5));
//Angel Blade		
		AngelBlade = new AngelBlade(AngelBladeToolMaterial).setUnlocalizedName("AngelBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "AngelBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(AngelBlade, AngelBlade.getUnlocalizedName().substring(5));
//Death's Ring		
		DeathsRing = new ModItems().setUnlocalizedName("DeathsRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "deathsring").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DeathsRing, DeathsRing.getUnlocalizedName().substring(5));
//Demon Killing Knife		
		DemonKnife = new DemonKnife(DemonToolMaterial).setUnlocalizedName("DemonKnife").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "dk").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(DemonKnife, DemonKnife.getUnlocalizedName().substring(5));
//Famine's Ring		
		FaminesRing = new ModItems().setUnlocalizedName("FaminesRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "faminesring").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(FaminesRing, FaminesRing.getUnlocalizedName().substring(5));
//Horn of Truth		
		HornOfTruth = new ModItems().setUnlocalizedName("HornOfTruth").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Horn Of Truth").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(HornOfTruth, HornOfTruth.getUnlocalizedName().substring(5));
//Pestilence's Ring		
		PestilencesRing = new ModItems().setUnlocalizedName("PestilencesRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "pestilencesring").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(PestilencesRing, PestilencesRing.getUnlocalizedName().substring(5));
//Purgatory Blade		
		PurgatoryBlade = new PurgatoryBlade(PurgatoryToolMaterial).setUnlocalizedName("PB").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "PB").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(PurgatoryBlade, PurgatoryBlade.getUnlocalizedName().substring(5));
//Rabbit's Foot		
		RabbitsFoot = new ModItems().setUnlocalizedName("RabbitsFoot").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "rabbitsfoot").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(RabbitsFoot, RabbitsFoot.getUnlocalizedName().substring(5));
//Wooden Stake		
		WoodenStake = new Stake(StakeToolMaterial).setUnlocalizedName("WoodenStake").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Stake").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(WoodenStake, WoodenStake.getUnlocalizedName().substring(5));

//War's Ring		
		WarsRing = new ModItems().setUnlocalizedName("WarsRing").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "warsring").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(WarsRing, WarsRing.getUnlocalizedName().substring(5));
//Colt
		Colt = new Colt().setUnlocalizedName("Colt").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "Colt").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(Colt, Colt.getUnlocalizedName().substring(5));
		
//Colt Ammo		
		ColtAmmo = new ModItems().setUnlocalizedName("ColtAmmo").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "ColtAmmo").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(ColtAmmo, ColtAmmo.getUnlocalizedName().substring(5));
//First Blade
		
		FirstBlade = new FirstBlade(FirstBladeToolMaterial).setUnlocalizedName("FirstBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft).setTextureName(SupernaturalCraft.MODID + ":" + "FirstBlade").setCreativeTab(SupernaturalCraft.tabSupernaturalCraft);
		GameRegistry.registerItem(FirstBlade, FirstBlade.getUnlocalizedName().substring(5));
	 
	  //Recipes
		Recipes.addRecipes();
	  
	  
	  }
	
	}

    		
    		
    		
    			

    
  			 



