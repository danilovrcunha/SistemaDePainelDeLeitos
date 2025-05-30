package com.HospitalDecos.SistemaDePainelDeLeitos.repository;

import com.HospitalDecos.SistemaDePainelDeLeitos.model.Leito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeitoRepository extends JpaRepository<Leito, Long> {
}
