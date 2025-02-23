package org.TarkovHideout.Service;

import org.TarkovHideout.Model.buildingRequirement;
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

    public List<buildingRequirement> getAllBuildingRequirements()
    {
        return buildingRequirementRepository.findAll();
    }

    public buildingRequirement getBuildingRequirementbyId(UUID id)
    {
        return buildingRequirementRepository.findById(id).orElse(null);
    }

    public buildingRequirement saveBuildingRequirement(buildingRequirement buildingRequirement)
    {
        return buildingRequirementRepository.save(buildingRequirement);
    }

    public void deleteBuildingRequirement(UUID id)
    {
        buildingRequirementRepository.deleteById(id);
    }
}
