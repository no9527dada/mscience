Blocks.duo.ammoTypes.put(Items.lead,//
    (() => {
        const D = new JavaAdapter(BasicBulletType, {});
        D.damage = 999;
        D.speed = 3.8
        D.width = 9;
        D.height = 12;
        D.shootEffect = Fx.shootBig;
        D.smokeEffect = Fx.shootBigSmoke;
        D.ammoMultiplier = 2;
        D.lifetime = 240;
        return D;
    })(),
);
function invadeSector(sector) {
    let state = Vars.state;
    let { rules } = state;
    let { info } = sector;
    let { winWave, wave, wavesPassed } = info

    let waveMax = Math.max(winWave, sector.isBeingPlayed() ? state.wave : wave + wavesPassed) + Mathf.random(2, 4) * 5;

    //assign invasion-related things
    if (sector.isBeingPlayed()) {
        rules.winWave = waveMax;
        rules.waves = true;
        rules.attackMode = false;
    } else {
        info.winWave = waveMax;
        info.waves = true;
        info.attack = false;
        sector.saveInfo();
    }
+
    Events.fire(new SectorInvasionEvent(sector));
}


Events.on(EventType.ClientLoadEvent, cons(e => {
    Vars.ui.hudGroup.fill(cons(cundang => {
        cundang.button(Icon.upload, Styles.defaulti, run(() => {
            invadeSector();
        })).size(40).width(40).height(40).tooltip("@data.export");
        //cundang .width(40).height(40).name("ores").tooltip("开启下一次入侵");
        cundang.top().left().marginTop(110).marginLeft(40);
    }));
}));