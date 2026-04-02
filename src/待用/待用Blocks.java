package 待用;

import arc.graphics.Color;
import mindustry.content.Blocks;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.entities.UnitSorts;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.FlakBulletType;
import mindustry.entities.bullet.PointBulletType;
import mindustry.entities.pattern.ShootSpread;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.with;

public class 待用Blocks {
    public static float T2Items = 1.6F;
    public static Block
            恶兆,

    方块;


    /*    //一个特效效果
     public static ParticleEffect T2Items =new ParticleEffect(){{
            lightOpacity = 0.5f;
            particles = 5;
            length = 50;
            baseLength = 30;
            lifetime = 50;
            interp = Interp.exp5;
            lightColor = Color.valueOf("96fbe1ff");
            sizeFrom = 60;
            sizeTo = 8;
            colorFrom = Color.valueOf("96fbe13c");
            colorTo = Color.valueOf("57D9933c");
        }};*/
    static {
        ((ItemTurret) Blocks.duo).ammo(
                Items.copper, new BasicBulletType(5f, 2900) {{
                    width = 7f;
                    height = 9f;
                    lifetime = 600f;
                    ammoMultiplier = 2;
                    trailColor = Color.valueOf("feff98ff");
                    trailParam = 4;
                    trailLength = 5;
                    trailWidth = 2;
                    trailInterval = 5;
                    trailRotation = false;
                    trailEffect = Fx.none;
/*                    trailEffect=new ParticleEffect(){{
                        region = "gamesmod-mingwangB1";
                        colorFrom = Color.valueOf("96fbe1");
                        colorTo = Color.valueOf("96fbe1");
                    }};*/
           /*         hitEffect = new MultiEffect() {{
                        effects = new Effect[]{
                                new ParticleEffect() {{
                                    lightOpacity = 0.5f;
                                    particles = 5;
                                    length = 50;
                                    baseLength = 30;
                                    lifetime = 50;
                                    interp = Interp.exp5;
                                    lightColor = Color.valueOf("96fbe1ff");
                                    sizeFrom = 60;
                                    sizeTo = 8;
                                    colorFrom = Color.valueOf("96fbe13c");
                                    colorTo = Color.valueOf("57D9933c");
                                }},
                                new ParticleEffect() {{
                                    lightOpacity = 0.5f;
                                    particles = 5;
                                    length = 50;
                                    baseLength = 30;
                                    lifetime = 30;
                                    interp = Interp.exp5;
                                    lightColor = Color.valueOf("96fbe1ff");
                                    sizeFrom = 30;
                                    sizeTo = 7;
                                    colorFrom = Color.valueOf("96fbe13c");
                                    colorTo = Color.valueOf("57D9933c");
                                }},
                        };
                    }};*/
                }}, Items.graphite, new BasicBulletType(3.5f, 18) {{
                    width = 9f;
                    height = 12f;
                    reloadMultiplier = 0.6f;
                    ammoMultiplier = 4;
                    lifetime = 60f;
                    trailColor = Color.valueOf("599efeff");
                    trailParam = 4;
                    trailLength = 5;
                    trailWidth = 2;
                    trailInterval = 5;
                    trailRotation = false;
                    trailEffect = Fx.none;

                }}, Items.silicon, new BasicBulletType(3f, 12) {{
                    width = 7f;
                    height = 9f;
                    homingPower = 0.1f;
                    reloadMultiplier = 1.5f;
                    ammoMultiplier = 5;
                    lifetime = 60f;
                    trailColor = Color.valueOf("4e4e4eff");
                    trailParam = 4;
                    trailLength = 5;
                    trailWidth = 2;
                    trailInterval = 5;
                    trailRotation = false;
                    trailEffect = Fx.none;
                }});
    }

    static {
        ((ItemTurret) Blocks.scatter).ammo(
                Items.scrap, new FlakBulletType(4f, 3) {{
                    lifetime = 60f;
                    ammoMultiplier = 5f;
                    shootEffect = Fx.shootSmall;
                    reloadMultiplier = 0.5f;
                    width = 6f;
                    height = 8f;
                    hitEffect = Fx.flakExplosion;
                    splashDamage = 22f * 1.5f;
                    splashDamageRadius = 24f;
                    trailColor = Color.valueOf("fecb5e");
                    trailParam = 4;
                    trailLength = 5;
                    trailWidth = 2;
                    trailInterval = 5;
                    trailRotation = false;
                    trailEffect = Fx.none;
                }},
                Items.lead, new FlakBulletType(4.2f, 3) {{
                    lifetime = 60f;
                    ammoMultiplier = 4f;
                    shootEffect = Fx.shootSmall;
                    width = 6f;
                    height = 8f;
                    hitEffect = Fx.flakExplosion;
                    splashDamage = 27f * 1.5f;
                    splashDamageRadius = 15f;
                    trailColor = Color.valueOf("766597");
                    trailParam = 4;
                    trailLength = 5;
                    trailWidth = 2;
                    trailInterval = 5;
                    trailRotation = false;
                    trailEffect = Fx.none;
                }},
                Items.metaglass, new FlakBulletType(4f, 3) {{
                    lifetime = 60f;
                    ammoMultiplier = 5f;
                    shootEffect = Fx.shootSmall;
                    reloadMultiplier = 0.8f;
                    width = 6f;
                    height = 8f;
                    hitEffect = Fx.flakExplosion;
                    splashDamage = 30f * 1.5f;
                    splashDamageRadius = 20f;
                    fragBullets = 6;
                    fragBullet = new BasicBulletType(3f, 5) {{
                        width = 5f;
                        height = 12f;
                        shrinkY = 1f;
                        lifetime = 20f;
                        backColor = Pal.gray;
                        frontColor = Color.white;
                        despawnEffect = Fx.none;
                        collidesGround = false;
                    }};
                    trailColor = Color.valueOf("dadada");
                    trailParam = 4;
                    trailLength = 5;
                    trailWidth = 2;
                    trailInterval = 5;
                    trailRotation = false;
                    trailEffect = Fx.none;
                }});
    }


    public static void load() {

        恶兆 = new ItemTurret("foreshadow"){{
            float brange = range = 500f;

            requirements(Category.turret, with(
                    Items.copper, 1000*T2Items,
                    Items.metaglass, 600*T2Items,
                    Items.surgeAlloy, 300*T2Items,
                    Items.plastanium, 200*T2Items,
                    Items.silicon, 600*T2Items
            ));
            ammo(
                    Items.surgeAlloy, new PointBulletType(){{
                        shootEffect = Fx.instShoot;
                        hitEffect = Fx.instHit;
                        smokeEffect = Fx.smokeCloud;
                        trailEffect = Fx.instTrail;
                        despawnEffect = Fx.instBomb;
                        trailSpacing = 20f;
                        damage = 1350;
                        buildingDamageMultiplier = 0.2f;
                        speed = brange;
                        hitShake = 6f;
                        ammoMultiplier = 1f;
                    }}
            );
            maxAmmo = 40;
            ammoPerShot = 5;
            rotateSpeed = 2f;
            reload = 200f;
            ammoUseEffect = Fx.casing3Double;
            recoil = 5f;
            cooldownTime = reload;
            shake = 4f;
            size = 4;
            shootCone = 2f;
            shoot = new ShootSpread(3, 5f);
            shootSound = Sounds.shootForeshadow;
            unitSort = UnitSorts.strongest;
            envEnabled |= Env.space;
            coolantMultiplier = 0.4f;
            scaledHealth = 150;
            coolant = consumeCoolant(1f);
            consumePower(1500/60f);
        }};
    }
}
