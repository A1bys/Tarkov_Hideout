package org.TarkovHideout.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "building_requirements")
@Getter
@Setter
public class BuildingRequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    // Связь с зданием, для которого это требование
    @ManyToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;

    // Связь с предметом, который требуется для постройки
    @ManyToOne
    @JoinColumn(name = "required_item_id")
    private Item requiredItem;

    // Количество требуемого предмета
    @Column(name = "required_quantity")
    private int requiredQuantity;

    // Связь с другим зданием, которое требуется для постройки (если нужно)
    @ManyToOne
    @JoinColumn(name = "required_building_id")
    private Building requiredBuilding;
}