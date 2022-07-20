package character.portal.repository.Impl;

import character.portal.Portal;
import character.portal.product.Hospital;
import character.portal.product.HuntingGround;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortalRepositoryImpl implements PortalRepository {

    private static Map<Long, Portal> store = new HashMap<>();

    public PortalRepositoryImpl(){
        portalInit();


    }

    public void portalInit(){

        store.put(1L , new Hospital("병원", "병원입니다."));
        store.put(2L , new HuntingGround("사냥터", "사냥터입니다."));
    }


    @Override
    public List<Portal> findAllMap() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Portal findByPortalId(Long id) {
        return store.get(id);
    }
}
