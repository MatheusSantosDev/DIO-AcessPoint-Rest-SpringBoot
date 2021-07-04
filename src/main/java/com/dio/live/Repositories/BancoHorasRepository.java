package com.dio.live.Repositories;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras,Long> {
}
