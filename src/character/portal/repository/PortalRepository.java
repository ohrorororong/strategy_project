package character.portal.repository;

import character.portal.Portal;

import java.util.List;

public interface PortalRepository {

    List<Portal> findAllMap();

    Portal findByPortalId(Long id);







}
