package org.TarkovHideout.Repository;

import org.TarkovHideout.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID>
{

}
