package org.TarkovHideout.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "buildings")
@Getter
@Setter
class BuildingRequirement
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private int tier;
}

@Entity
@Table(name = "building_requirements")
@Getter
@Setter
public class buildingRequirement
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private buildingRequirement building;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private int quantity;
}
