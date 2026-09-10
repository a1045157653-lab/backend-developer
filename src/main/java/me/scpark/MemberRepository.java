package me.scpark;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface MenberRepository extends JpaRepository<me.scspark.Member,Long> {



}
