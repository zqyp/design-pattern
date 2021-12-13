package com.zp.dps;

import com.zp.dps.entity.AbstractStation;
import com.zp.dps.entity.WhStation;
import com.zp.dps.factory.GzFactory;
import com.zp.dps.factory.SimpleStationFactory;
import com.zp.dps.entity.SyStation;
import com.zp.dps.factory.XaFactory;
import com.zp.dps.singleton.SingletonByEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ZP
 * @date 2021/12/12
 */
@SpringBootTest
public class ZpTest {

    @Test
    void tt1() {
        SingletonByEnum instance = SingletonByEnum.getInstance();
        SingletonByEnum instance2 = SingletonByEnum.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }

    @Test
    void tt2() {
        SyStation syStation = (SyStation) SimpleStationFactory.createStation(4);
        assert syStation != null;
        syStation.sendWorkCondition("123", 6660);
    }

    @Test
    void tt3() {
        AbstractStation abstractStation = SimpleStationFactory.creatStationByRef(SyStation.class);
        abstractStation.sendWorkCondition("123", 6660);
    }

    @Test
    void tt4() {
        WhStation wh = (WhStation) SimpleStationFactory.createWh();
        wh.sendWorkCondition("123", 6660);
    }

    @Test
    void tt5() {
        AbstractStation xaStation = new XaFactory().create();
        xaStation.sendWorkCondition("123312312", 6660);
    }

    @Test
    void tt6() {
        AbstractStation xaStation = new GzFactory().create();
        xaStation.sendWorkCondition("123312312", 6660);
    }
}
