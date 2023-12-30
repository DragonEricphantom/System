-- --------------------------------------------------------
-- 主機:                           127.0.0.1
-- 伺服器版本:                        8.2.0 - MySQL Community Server - GPL
-- 伺服器作業系統:                      Linux
-- HeidiSQL 版本:                  12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 傾印 Julin 的資料庫結構
CREATE DATABASE IF NOT EXISTS `Julin` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `Julin`;

-- 傾印  資料表 Julin.APST 結構
CREATE TABLE IF NOT EXISTS `APST` (
  `APST_ID` int NOT NULL AUTO_INCREMENT,
  `APST_YEAR` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `APST_MON` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `APST_DEP` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `APST_GLIST` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `APST_GCA` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `APST_GCOUNT` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `APST_GAMOUNT` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  PRIMARY KEY (`APST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.CM 結構
CREATE TABLE IF NOT EXISTS `CM` (
  `CM_ID` int NOT NULL AUTO_INCREMENT,
  `CM_LIST` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CA` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CM` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CNAME` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CNAMES` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CA_NUM` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_DLIST` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CUNI_NUM` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CRT_DATE` timestamp NULL DEFAULT NULL,
  `CM_PERSON` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CON_PERSON` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CON_PHONE` varchar(15) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_MOB_PHONE` varchar(15) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_ADDR` varchar(60) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_CHANGE_DATE` timestamp NULL DEFAULT NULL,
  `CM_REMARK` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_DNUM` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CM_DEL_FLAG` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`CM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.CMC 結構
CREATE TABLE IF NOT EXISTS `CMC` (
  `CMC_ID` int NOT NULL AUTO_INCREMENT,
  `CMC_CA` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CMC_LIST` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CMC_NAME` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CMC_DEL_FLAG` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`CMC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.DD 結構
CREATE TABLE IF NOT EXISTS `DD` (
  `DD_ID` int NOT NULL AUTO_INCREMENT,
  `DD_LIST` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `DD_NAME` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `DD_STORE` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `DD_ADDR` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `DD_DEL_FLAG` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  PRIMARY KEY (`DD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.GC 結構
CREATE TABLE IF NOT EXISTS `GC` (
  `GC_ID` int NOT NULL AUTO_INCREMENT,
  `GC_LIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GC_NAME` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`GC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.GM 結構
CREATE TABLE IF NOT EXISTS `GM` (
  `GID` int NOT NULL AUTO_INCREMENT,
  `GLIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GNAME` varchar(60) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GUNIT` varchar(6) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GQRCODE` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GBCODE` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GCN` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GMN` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `PD` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `PRICE` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GEN_DIS` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `MEM_DIS` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `PUR_DIS` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GEN_PRICE` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `MEM_PRICE` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `PUR_PRICE` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GM_CRT_DATE` timestamp NULL DEFAULT NULL,
  `GM_DEL_FLAG` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`GID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.GS 結構
CREATE TABLE IF NOT EXISTS `GS` (
  `GS_LIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.GU 結構
CREATE TABLE IF NOT EXISTS `GU` (
  `GU_ID` int NOT NULL AUTO_INCREMENT,
  `GU_Ch_UNIT` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `GU_ENG_UNIT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`GU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.POD 結構
CREATE TABLE IF NOT EXISTS `POD` (
  `POD_ID` int NOT NULL AUTO_INCREMENT,
  `POD_SUB_NUM` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POD_CRT_NUM` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POD_GLIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POD_GNAME` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POD_GUNIT` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POD_GCOUNT` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POD_UNI_PRICE` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POD_DIS_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POD_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`POD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.POM 結構
CREATE TABLE IF NOT EXISTS `POM` (
  `POM_ID` int NOT NULL AUTO_INCREMENT,
  `POM_CA` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_SUB_NUM` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_LIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_DATE` timestamp NULL DEFAULT NULL,
  `POM_PERSON` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_DLIST` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_SLIST` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_G_TAL_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_BUS_TAXI` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_TAL_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_DIS_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_ADDR` varchar(60) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `POM_DEL_FLAG` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`POM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.REC 結構
CREATE TABLE IF NOT EXISTS `REC` (
  `REC_ID` int NOT NULL AUTO_INCREMENT,
  `REC_CA` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_TLIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_TDATE` timestamp NULL DEFAULT NULL,
  `REC_TCUSTOMER` varchar(20) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_SFLIST` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_GLIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_GNAME` varchar(60) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_GCOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_GUNIT` varchar(5) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_GPRICE` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_GAMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `REC_REMARK` varchar(30) COLLATE utf8mb4_general_ci DEFAULT '0',
  PRIMARY KEY (`REC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.RPD 結構
CREATE TABLE IF NOT EXISTS `RPD` (
  `RPD_ID` int NOT NULL AUTO_INCREMENT,
  `RPD_SUB_NUM` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `RPD_CRT_NUM` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `RPD_SUB_LIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `RPD_CA` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `RPD_DATE` date DEFAULT NULL,
  `RPD_BALANCE` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `RPD_DIS_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `RPD_STR_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`RPD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.RPM 結構
CREATE TABLE IF NOT EXISTS `RPM` (
  `RPM_ID` int NOT NULL AUTO_INCREMENT,
  `RPM_CA` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `RPM_LIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT '0',
  `RPM_SUB_NUM` varchar(20) COLLATE utf8mb4_general_ci DEFAULT '0',
  `RPM_DATE` date DEFAULT NULL,
  `RPM_PERSON` varchar(20) COLLATE utf8mb4_general_ci DEFAULT '0',
  `RPM_DLIST` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `RPM_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `RPM_DIS_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `RPM_TAL_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT '0',
  `RPM_DEL_FLAG` char(1) COLLATE utf8mb4_general_ci DEFAULT '0',
  PRIMARY KEY (`RPM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.SD 結構
CREATE TABLE IF NOT EXISTS `SD` (
  `SD_ID` int NOT NULL AUTO_INCREMENT,
  `SD_NAME` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `SD_MOB_PHONE` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '0',
  `SD_PHONE` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `SD_ADDR` varchar(60) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `SD_DLIST` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `SD_REMARK` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `SD_RESIGN` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `SD_BIR_DATE` date DEFAULT NULL,
  `SD_ACCOUNT` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `SD_PWD` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`SD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.TD 結構
CREATE TABLE IF NOT EXISTS `TD` (
  `TD_ID` int NOT NULL AUTO_INCREMENT,
  `TD_SUB_CODE` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_GLIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_GNAME` varchar(60) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_GUNIT` varchar(6) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_GNUM` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_UNI_PRICE` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_AMOUNT` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_COST` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_REMARK` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TD_DEL_FLAG` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`TD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

-- 傾印  資料表 Julin.TM 結構
CREATE TABLE IF NOT EXISTS `TM` (
  `TM_ID` int NOT NULL AUTO_INCREMENT,
  `TM_LIST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TM_SUB_CODE` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TM_TRADE_DATE` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TM_CUSTOMER` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CON_PERSON` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `CON_PHONE` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `UNI_NUM` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `SED_PERSON` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `SED_ADDR` varchar(90) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `DEP_NUM` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `MAKER_DOC` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `REMARK` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TOTAL_COST` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TAL_G_AMOUNT` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `BUS_TAX` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TAL_AMOUNT` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `DIS_AMOUNT` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `AMOUNT_PAID` varchar(10) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `TM_CRT_DATE` timestamp NULL DEFAULT NULL,
  `TM_UPD_DATE` timestamp NULL DEFAULT NULL,
  `TM_DEL_FLAG` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`TM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 取消選取資料匯出。

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
