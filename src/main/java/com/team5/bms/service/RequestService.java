package com.team5.bms.service;

import com.team5.bms.model.Request;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.team5.bms.model.Request;}.
 * 
 * @author Jasper Belenzo
 * 
 */
public interface RequestService {
	
	List<Request> getRequestsByBuildingAndSuperIntendent(Long buildingId, Long assigneeId);

    List<Request> getRequestsByBuildingAndUser(Long buildingId, Long userId);

    List<Request> getRequestsByBuilding(Long buildingId);
	
    /**
     * Save a request.
     *
     * @param request the entity to save.
     * @return the persisted entity.
     */
    Request save(Request request);

    /**
     * Updates a request.
     *
     * @param request the entity to update.
     * @return the persisted entity.
     */
    Request update(Request request);

    /**
     * Partially updates a request.
     *
     * @param request the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Request> partialUpdate(Request request);

    /**
     * Get all the requests.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Request> findAll(Pageable pageable);

    /**
     * Get the "id" request.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Request> findOne(Long id);

    /**
     * Delete the "id" request.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
	
}
