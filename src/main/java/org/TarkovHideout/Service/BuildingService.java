package org.TarkovHideout.Service;

import org.TarkovHideout.Model.BuildingRequirement;
import org.TarkovHideout.Repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BuildingService
{
    @Autowired
    private BuildingRepository buildingRepository;

    public List<BuildingRequirement> getAllBuildings()
    {
        return buildingRepository.findAll();
    }

    public BuildingRequirement getBuildingbyId(UUID id)
    {
        return buildingRepository.findById(id).orElse(null);
    }

    public BuildingRequirement saveBuilding(BuildingRequirement building)
    {
        return buildingRepository.save(building);
    }

    public void deleteBuilding(UUID id)
    {
        buildingRepository.deleteById(id);
    }
}
