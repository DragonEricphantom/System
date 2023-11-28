package com.example.WebApi.P1.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

//JpaSpecificationExecutor<GMPo>
public interface GmJpaRepository extends JpaRepository<GmPo, Integer>, JpaSpecificationExecutor<GmPo> {
//    @Query(value = "SELECT EH.HRLD_NCIF_ID AS ncifId " +
//            ", CN.NCIF_ID_NMBR AS nmbrId " +
//            ", CN.NCIF_NAME AS name " +
//            ", TO_CHAR(CN.NCIF_BIRTH_DATE,'yyyyMMdd') AS birthDay " +
//            ", EH.HRLD_CMSS_ID AS cmssId "+
//            "FROM CUS_NCIF CN " +
//            "INNER JOIN EXG_HRLD EH ON EH.HRLD_NCIF_ID  = CN.NCIF_ID " +
//            "WHERE EH.HRLD_CMMT_ID = :cmmtId " +
//            "AND EH.HRLD_CSTM_ID = :cstmId " +
//            "AND EH.HRLD_DEPS_ID  IN ('1003301', '1003302', '1003303', '1003304', '1003401') " +
//            "AND EH.HRLD_AMT > 0 " +
//            "AND CN.NCIF_CURR_STATUS = 0 " +
//            "AND TO_CHAR(HRLD_DATE, 'yyyyMMdd') <= :ymd " +
//            "AND CN.NCIF_AGE >= :age " +
//            "AND EH.HRLD_DEL_FLAG = 'N' AND CN.NCIF_DEL_FLAG = 'N' " +
//            "GROUP BY EH.HRLD_NCIF_ID, CN.NCIF_ID_NMBR, CN.NCIF_NAME " +
//            ", CN.NCIF_BIRTH_DATE, EH.HRLD_CMMT_ID , EH.HRLD_CMSS_ID " +
//            "ORDER BY NCIF_ID_NMBR ", nativeQuery = true)
//    List<Rpt07NcifInfoDto> getRpt07NcifInfo(@Param("cstmId") Integer cstmId, @Param("age") Integer age
//            , @Param("cmmtId") String cmmtId, @Param("ymd") String ymd);


}
