package mscience;

import mindustry.graphics.CacheLayer;
import mindustry.world.Block;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.OreBlock;

import static CtCoreSystem.content.CTFragShader.*;
import static mscience.M科技资源.*;

public class M科技地板 {
    public static float T2Items = 1.6F;
    public static Block
            oreM晶体 = new OreBlock(M晶体) {{
        variants = 3;
        oreDefault = true;
        oreThreshold = 0.86f;
        oreScale = 22.45f;
    }},
            ore星辰铜精 = new OreBlock(星辰铜精) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore幽冥铁精 = new OreBlock(幽冥铁精) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore幻光玉 = new OreBlock(幻光玉) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore量子砂 = new OreBlock(量子砂) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore辉烁玉 = new OreBlock(辉烁玉) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore幽荧星砂 = new OreBlock(幽荧星砂) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore星辰泪滴石 = new OreBlock(星辰泪滴石) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore灵魂星尘矿 = new OreBlock(灵魂星尘矿) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore银河幻银矿 = new OreBlock(银河幻银矿) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore云码矿 = new OreBlock(云码矿) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore幻星砂 = new OreBlock(幻星砂) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }},
            ore虚空幽寂矿 = new OreBlock(虚空幽寂矿) {{
                variants = 3;
                oreDefault = true;
                oreThreshold = 0.86f;
                oreScale = 22.45f;
            }}
                    ;








    public static Floor

            FloorLiquid时渊髓液 = new Floor("Floor时渊髓液") {{
                speedMultiplier = 0.5f;
                variants = 0;
                liquidDrop = 时渊髓液;
                isLiquid = false;
                cacheLayer = FI8;
                albedo = 0.9f;
              //  supportsOverlay = true;
            }},
            FloorLiquid龙芯熔液 = new Floor("Floor龙芯熔液") {{
                speedMultiplier = 0.5f;
                variants = 0;
                liquidDrop = 龙芯熔液;
                isLiquid = true;
                cacheLayer = CacheLayer.slag;
                albedo = 0.9f;
                supportsOverlay = true;
            }},
            FloorLiquid虚识之潮 = new Floor("Floor虚识之潮") {{
                speedMultiplier = 0.5f;
                variants = 0;
                liquidDrop = 虚识之潮;
                isLiquid = true;
                cacheLayer = 紫色冷却液效果;
                albedo = 0.9f;
                supportsOverlay = true;
            }},
            FloorLiquid星芒液 = new Floor("Floor星芒液") {{
                speedMultiplier = 0.5f;
                variants = 0;
                liquidDrop = 星芒液;
                isLiquid = true;
                cacheLayer = weizhi;
                albedo = 0.9f;
                supportsOverlay = true;
            }},
    FloorLiquid灵枢醚 = new Floor("Floor灵枢醚") {{
        speedMultiplier = 0.5f;
        variants = 0;
        liquidDrop = 灵枢醚;
        isLiquid = true;
        cacheLayer = 灰色冷却液大效果;
        albedo = 0.9f;
        supportsOverlay = true;
    }},

    矿物地板;


}
