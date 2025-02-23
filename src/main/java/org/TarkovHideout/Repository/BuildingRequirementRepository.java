package org.TarkovHideout.Repository;

import org.TarkovHideout.Model.buildingRequirement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BuildingRequirementRepository extends JpaRepository<buildingRequirement, UUID>
{

}
