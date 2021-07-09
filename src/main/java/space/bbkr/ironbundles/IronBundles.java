package space.bbkr.ironbundles;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class IronBundles implements ModInitializer {
	public static final String MODID = "ironbundles";

	public static final Item IRON_BUNDLE = register("iron_bundle", new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS), 128));

	public static final Item GOLD_BUNDLE = register("gold_bundle", new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS), 256));

	public static final Item DIAMOND_BUNDLE = register("diamond_bundle", new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS), 512));

	public static final Item NETHERITE_BUNDLE = register("netherite_bundle", new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS), 512));
	
	public static final Item AMETHYST_BUNDLE = register("amethyst_bundle", new CustomBundleItem(new Item.Settings().maxCount(1).group(ItemGroup.TOOLS),1024));

	@Override
	public void onInitialize() {

	}

	public static Item register(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(MODID, name), item);
	}
}
