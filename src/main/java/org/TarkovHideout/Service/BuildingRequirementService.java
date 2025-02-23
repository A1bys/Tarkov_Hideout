package org.TarkovHideout.Service;

import org.TarkovHideout.Model.BuildingRequirement;
import org.TarkovHideout.Repository.BuildingRequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BuildingRequirementService
{
    @Autowired
    private BuildingRequirementRepository buildingRequirementRepository;

    public List<BuildingRequirement> getAllBuildingRequirements()
    {
        return buildingRequirementRepository.findAll();
    }

    public BuildingRequirement getBuildingRequirementbyId(UUID id)
    {
        return buildingRequirementRepository.findById(id).orElse(null);
    }

    public BuildingRequirement saveBuildingRequirement(BuildingRequirement buildingRequirement)
    {
        return buildingRequirementRepository.save(buildingRequirement);
    }

    public void deleteBuildingRequirement(UUID id)
    {
        buildingRequirementRepository.deleteById(id);
    }
}
