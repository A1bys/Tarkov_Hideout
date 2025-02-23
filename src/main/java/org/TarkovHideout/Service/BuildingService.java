package org.TarkovHideout.Service;

import org.TarkovHideout.Model.buildingRequirement;
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

    public List<buildingRequirement> getAllBuildings()
    {
        return buildingRepository.findAll();
    }

    public buildingRequirement getBuildingbyId(UUID id)
    {
        return buildingRepository.findById(id).orElse(null);
    }

    public buildingRequirement saveBuilding(buildingRequirement building)
    {
        return buildingRepository.save(building);
    }

    public void deleteBuilding(UUID id)
    {
        buildingRepository.deleteById(id);
    }
}
