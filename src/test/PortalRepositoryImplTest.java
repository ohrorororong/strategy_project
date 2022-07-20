package test;

import character.portal.Portal;
import character.portal.repository.Impl.PortalRepositoryImpl;
import character.portal.repository.PortalRepository;

import java.util.List;

public class PortalRepositoryImplTest {

    public static void main(String[] args) {

        PortalRepository repository = new PortalRepositoryImpl();

        List<Portal> list = repository.findAllMap();
        for (Portal portal : list) {

            System.out.println(portal);

        }

    }
}
