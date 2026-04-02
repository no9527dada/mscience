package mscience.MBlocks;

import mindustry.content.Fx;
import mindustry.content.Liquids;
import mindustry.world.Block;
import mindustry.world.blocks.production.Fracker;
import mindustry.world.meta.Attribute;
import mscience.Mscience.M科技lib;

import static mindustry.type.Category.crafting;
import static mindustry.type.Category.production;
import static mindustry.type.ItemStack.with;
import static mscience.M科技资源.*;

public class M科技钻头 {
    public static Block

     曙光钻头 = new M科技lib.M科技基础钻头(
            "曙光钻头",4,600,360,5,120,水,6,3f) {{
        rotateSpeed = 6;
        drillEffect = Fx.hitBulletBig;
        consumePower(4f);
        liquidCapacity = 12;
        hasShadow = true;
        drawMineItem = true;
        requirements(production, with(
                曙光金, 30,
                蓝美晶,150
                ,梦境翡翠,100
                ,月银,130
                , M晶体, 180
        ));
    }}
 , 寒霜钻头 = new M科技lib.M科技基础钻头(
            "寒霜钻头",4,600,360,6,120,Liquids.cryofluid,6,2.5f) {{
        rotateSpeed = 7;
        drillEffect = Fx.hitBulletBig;
        liquidCapacity = 12;
        hasShadow = true;
        consumePower(8f);
        drawMineItem = true;
        requirements(production, with(
                曙光金, 120,
                虚空黑曜石,140
                ,寒霜石,160
                , M晶体, 230
        ));
    }}
            , 光神钻头 = new M科技lib.M科技基础钻头(
            "光神钻头",4,600,360,7,120,Liquids.cryofluid,6,2.5f) {{
        rotateSpeed = 7;
        drillEffect = Fx.hitBulletBig;
        liquidCapacity = 12;
        hasShadow = true;
        consumePower(13f);
        drawMineItem = true;
        requirements(production, with(
                曙光神金, 120,
                虚空黑曜石,140
                ,寒霜石,160
                ,幻影幽晶,180
                , M晶体, 330
        ));
    }}
            , 虚空钻头 = new M科技lib.M科技基础钻头(
            "虚空钻头",4,600,360,8,120,流光液,3,3.2f) {{
        rotateSpeed = 7;
        drillEffect = Fx.hitBulletBig;
        liquidCapacity = 12;
        hasShadow = true;
        consumePower(20f);
        drawMineItem = true;
        requirements(production, with(
                曙光神金, 200,
                魂炎晶,140,
                虚空晶,90
                ,灵能石,160
                , M晶体, 670
        ));
    }}
            , 混沌金钻头 = new M科技lib.M科技爆裂钻头(
            "混沌金钻头",4,600,360,9,200,流光液,3,2.6f) {{
        rotateSpeed = 7;
        drillEffect = Fx.hitBulletBig;
        liquidCapacity = 20;
        itemCapacity=200;
        consumePower(28f);
        requirements(production, with(
                曙光混沌金, 100,
                M晶体, 1
        ));
    }}           , 龙磁钻头 = new M科技lib.M科技爆裂钻头(
            "龙磁钻头",4,600,360,10,170,寒霜液,3,2.5f) {{
        rotateSpeed = 7;
        drillEffect = Fx.hitBulletBig;
        liquidCapacity = 20;
        itemCapacity=200;
        consumePower(38f);
        requirements(production, with(
                曙光混沌金, 100,
                龙磁髓,1,
                虚空灵璃,1,
                M晶体, 1
        ));
    }}
            , 暗能钻头 = new M科技lib.M科技爆裂钻头(
            "暗能钻头",4,600,360,11,150,星芒液,20,2.8f) {{
        rotateSpeed = 7;
        drillEffect = Fx.hitBulletBig;
        liquidCapacity = 20;
        itemCapacity=200;
        consumePower(55f);
        requirements(production, with(
                曙光混沌金, 130,
                M晶体, 750
                , 暗能髓, 170
                , 虚空灵璃, 140
                , 幽冥梦魇晶, 80
        ));
    }}
            , 深渊钻头 = new M科技lib.M科技爆裂钻头(
            "深渊钻头",4,600,360,11,120,灵枢醚,20,5f) {{
        rotateSpeed = 7;
        drillEffect = Fx.hitBulletBig;
        liquidCapacity = 20;
        itemCapacity=200;
        consumePower(70f);
        requirements(production, with(
                M晶体, 1000,
                幽冥梦魇晶, 300,
                幻海深渊珀,30,
                暗能髓, 210,
                迷雾幽灵石, 150,
                宇宙秘宝, 100

        ));
    }}


            ;

}