package org.TarkovHideout.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.UUID;

@Entity
@Table(name="Building")
@Getter
@Setter
public class Building
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "tier", nullable = false)
    private int tier;

    @ElementCollection
    @CollectionTable(name = "building_requirements", joinColumns = @JoinColumn(name = "building_id"))
    @MapKeyColumn(name = "item_name")
    @Column(name = "amount")
    private Map<String, Integer> requirements;
}
