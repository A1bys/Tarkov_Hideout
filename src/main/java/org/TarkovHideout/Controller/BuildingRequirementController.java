package org.TarkovHideout.Controller;

import org.TarkovHideout.Model.BuildingRequirement;
import org.TarkovHideout.Service.BuildingRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/BuildingRequirement")
public class BuildingRequirementController
{
    @Autowired
    private BuildingRequirementService buildingRequirementService;

    @GetMapping
    public List<BuildingRequirement> getAllBuildingRequirements()
    {
        return buildingRequirementService.getAllBuildingRequirements();
    }

    @GetMapping("/{id}")
    public BuildingRequirement getBuildingRequirementbyId(@PathVariable UUID id)
    {
        return buildingRequirementService.getBuildingRequirementbyId(id);
    }

    @PostMapping
    public BuildingRequirement createBuildingRequirement(@RequestBody BuildingRequirement buildingRequirement)
    {
        return buildingRequirementService.saveBuildingRequirement(buildingRequirement);
    }

    @DeleteMapping("/{id}")
    public void deleteBuildingRequirement(@PathVariable UUID id)
    {
        buildingRequirementService.deleteBuildingRequirement(id);
    }
}
