package pythontool.scriptitem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pythontool.PythonTool;

/**
 * ----------- PythonTool Mod -----------
 * Alvaro Perez & Hans Fangohr
 * University of Southampton, UK (2016)
 *
 * Code based on MinecraftByExample by TheGreyGhost: MBE11_ITEM_VARIANTS
 * https://github.com/TheGreyGhost/MinecraftByExample/tree/1-8final
 * (mbe11_item_variants/StartupCommon.java)
 * 
 * User: The Grey Ghost
 * Date: 24/12/2014
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 */
@ObjectHolder(PythonTool.MODID)
@Mod.EventBusSubscriber
public class StartupCommon
{
  public final static ScriptItem scriptItem = null;  // this holds the unique instance of your block

  public static void preInitCommon()
  {
  }

  public static void initCommon()
  {
  }

  public static void postInitCommon()
  {
  }
  
  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
	event.getRegistry().register(new ScriptItem().setRegistryName(PythonTool.MODID+":"+"scriptItem").setUnlocalizedName(PythonTool.MODID+":"+"scriptItem"));    
  }
  
  @Mod.EventBusSubscriber(modid = PythonTool.MODID)
	public static class RegistrationHandler {
	  @SubscribeEvent
      @SideOnly(Side.CLIENT)
      public static void onModelEvent(final ModelRegistryEvent event) {
			int metadata;
			
			String item0 = "scriptItem_0";
			metadata = 0;
			ModelResourceLocation itemModelResourceLocation0 = new ModelResourceLocation("pythontool:" + item0, "inventory");
			ModelLoader.setCustomModelResourceLocation(StartupCommon.scriptItem, metadata, itemModelResourceLocation0);
			String item1 = "scriptItem_1";
			metadata = 1;
			ModelResourceLocation itemModelResourceLocation1 = new ModelResourceLocation("pythontool:" + item1, "inventory");
			ModelLoader.setCustomModelResourceLocation(StartupCommon.scriptItem, metadata, itemModelResourceLocation1);
			String item2 = "scriptItem_2";
			metadata = 2;
			ModelResourceLocation itemModelResourceLocation2 = new ModelResourceLocation("pythontool:" + item2, "inventory");
			ModelLoader.setCustomModelResourceLocation(StartupCommon.scriptItem, metadata, itemModelResourceLocation2);
			String item3 = "scriptItem_3";
			metadata = 3;
			ModelResourceLocation itemModelResourceLocation3 = new ModelResourceLocation("pythontool:" + item3, "inventory");
			ModelLoader.setCustomModelResourceLocation(StartupCommon.scriptItem, metadata, itemModelResourceLocation3);
			
			ModelBakery.registerItemVariants(StartupCommon.scriptItem, itemModelResourceLocation0, itemModelResourceLocation1,
					itemModelResourceLocation2, itemModelResourceLocation3);
		}
		
//	  @SubscribeEvent
//      @SideOnly(Side.CLIENT)
//      public static void onModelEvent(final ModelBakeEvent event)
//      {
//			// Register all the PythonScript variants
//			for (int i = 0; i < 4; i++) {
//				ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("pythontool:scriptItem_" + i, "inventory");
//				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.scriptItem, i, itemModelResourceLocation);
//			}
//      }
	}
}
