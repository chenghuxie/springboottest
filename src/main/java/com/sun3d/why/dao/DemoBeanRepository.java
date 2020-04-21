package com.sun3d.why.dao;

import com.sun3d.why.model.DemoBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by xiech on 2018/1/29 0029.
 */
@Repository
public interface DemoBeanRepository extends JpaRepository<DemoBean,Long> {
}
