package com.tlg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.tlg.entities.Institution;

@Repository
public interface FundOpsRepository extends JpaRepository<Institution, String> {

	@Procedure("insert_institution")
	public void insertInstitution(String institutionId, String institutionName);
}
