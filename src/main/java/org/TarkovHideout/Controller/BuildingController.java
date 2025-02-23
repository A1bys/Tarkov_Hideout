package org.TarkovHideout.Controller;

import org.TarkovHideout.Model.BuildingRequirement;
import org.TarkovHideout.Service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/building")
public class BuildingController
{
    @Autowired
    private BuildingService buildingService;

    @GetMapping
    public List<BuildingRequirement> getAllBuildings()
    {
        return buildingService.getAllBuildings();
    }

    @GetMapping("/{id}")
    public BuildingRequirement getBuildingbyId(@PathVariable UUID id)
    {
        return buildingService.getBuildingbyId(id);
    }

    @PostMapping
    public BuildingRequirement createBuilding(@RequestBody BuildingRequirement building)
    {
        return buildingService.saveBuilding(building);
    }

    @DeleteMapping("/{id}")
    public void deleteBuilding(@PathVariable UUID id)
    {
        buildingService.deleteBuilding(id);
    }
}
