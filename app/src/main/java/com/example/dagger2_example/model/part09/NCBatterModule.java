package com.example.dagger2_example.model.part09;

import dagger.Binds;
import dagger.Module;

//@Module
//public class NCBatterModule {
//
//    @Provides/**Dagger recognizes this returned dependency by considering the return of the provider method, it means Dagger will recognize this dependency as a battery*/
//    Battery provideBattery(NickelCadmiumBattery nickelCadmiumBattery) {/**As we have annotated the constructor of the NickelCadmiumBattery with inject annotation dagger can construct that dependency.
//     so we use that dependency here.*/
//        nickelCadmiumBattery.showType();
//        return nickelCadmiumBattery;
//    }
//
//
//}

@Module
abstract class NCBatterModule {/**there is another way to use interface which is using abstract*/

    @Binds
    abstract Battery bindBattery(NickelCadmiumBattery nickelCadmiumBattery) ;


}
