package org.TarkovHideout.Repository;

import org.TarkovHideout.Model.buildingRequirement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BuildingRepository extends JpaRepository<buildingRequirement, UUID>
{

}
