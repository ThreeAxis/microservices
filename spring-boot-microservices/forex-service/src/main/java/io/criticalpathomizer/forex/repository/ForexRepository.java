package io.criticalpathomizer.forex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.criticalpathomizer.forex.entity.ForexValue;

public interface ForexRepository extends JpaRepository<ForexValue, Integer> {

	ForexValue findByFromAndTo(String from, String to);

}
