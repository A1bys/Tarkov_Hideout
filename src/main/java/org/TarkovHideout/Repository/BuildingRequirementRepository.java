package org.TarkovHideout.Repository;

import org.TarkovHideout.Model.BuildingRequirement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BuildingRequirementRepository extends JpaRepository<BuildingRequirement, UUID>
{
}
