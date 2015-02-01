package com.momnop.simplypaths;

import net.minecraft.util.ResourceLocation;

public class TextureHelper {
	public static String getBlockResource(String s2) {
        String s1 = "minecraft";

        int ind = s2.indexOf(58);

        if (ind >= 0) {
            if (ind > 1) {
                s1 = s2.substring(0, ind);
            }

            s2 = s2.substring(ind + 1, s2.length());
        }

        s1 = s1.toLowerCase();
        s2 = "textures/blocks/" + s2 + ".png";

        return new String(s2);
    }
}
