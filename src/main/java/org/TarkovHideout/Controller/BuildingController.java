package org.TarkovHideout.Controller;

import org.TarkovHideout.Model.buildingRequirement;
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
    public List<buildingRequirement> getAllBuildings()
    {
        return buildingService.getAllBuildings();
    }

    @GetMapping("/{id}")
    public buildingRequirement getBuildingbyId(@PathVariable UUID id)
    {
        return buildingService.getBuildingbyId(id);
    }

    @PostMapping
    public buildingRequirement createBuilding(@RequestBody buildingRequirement building)
    {
        return buildingService.saveBuilding(building);
    }

    @DeleteMapping("/{id}")
    public void deleteBuilding(@PathVariable UUID id)
    {
        buildingService.deleteBuilding(id);
    }
}
