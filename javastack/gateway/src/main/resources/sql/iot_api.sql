SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


CREATE TABLE `city` (
  `country_id` bigint NOT NULL,
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `country` (
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `ref` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `equipment` (
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `indicator` (
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `reference_room` (
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `reference_sensor` (
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `room` (
  `city_id` bigint NOT NULL,
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `reference_room_id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `room_equipment` (
  `created_at` datetime(6) NOT NULL,
  `equipment_id` bigint NOT NULL,
  `id` bigint NOT NULL,
  `room_id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `equipment_desc` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `room_equipment_sensor_indicator` (
  `created_at` datetime(6) NOT NULL,
  `equipment_id` bigint NOT NULL,
  `id` bigint NOT NULL,
  `indicator_id` bigint NOT NULL,
  `reference_sensor_id` bigint NOT NULL,
  `room_id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `value` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `room_sensor_indicator` (
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `indicator_id` bigint NOT NULL,
  `reference_sensor_id` bigint NOT NULL,
  `room_id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `value` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sensor` (
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `reference_sensor_id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sensor_indicator` (
  `created_at` datetime(6) NOT NULL,
  `id` bigint NOT NULL,
  `indicator_id` bigint NOT NULL,
  `sensor_id` bigint NOT NULL,
  `updated_at` datetime(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


ALTER TABLE `city`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrpd7j1p7yxr784adkx4pyepba` (`country_id`);

ALTER TABLE `country`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `equipment`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `indicator`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `reference_room`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `reference_sensor`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `room`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlu7mqgx208gvxs11mgp850oyw` (`city_id`),
  ADD KEY `FK4seo34o911u6g9pkk2vv4ka9f` (`reference_room_id`);

ALTER TABLE `room_equipment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrmdm2ihfq0rjieivqjmnty6hq` (`equipment_id`),
  ADD KEY `FKqi32u6nxv9y6w769n87o958fj` (`room_id`);

ALTER TABLE `room_equipment_sensor_indicator`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKmh7pt6l6nm9ymjyfccwsgpuii` (`equipment_id`),
  ADD KEY `FK66f1lmwifcgprpqd7kd5qqowl` (`indicator_id`),
  ADD KEY `FKp8cd41djlopmr7033mds8kcif` (`reference_sensor_id`),
  ADD KEY `FKabdprotoc0vlevyfq1yerkry2` (`room_id`);

ALTER TABLE `room_sensor_indicator`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdbnvwve0iagu5vhigc62ey5r0` (`indicator_id`),
  ADD KEY `FKa11gceimalobuct9qrtcl4lya` (`reference_sensor_id`),
  ADD KEY `FKnf3ocdsymscr1ddhhodfdt3lm` (`room_id`);

ALTER TABLE `sensor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfs21u4e57ykl7elgjf3l72y86` (`reference_sensor_id`);

ALTER TABLE `sensor_indicator`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKl0m5wr33ihm21pp5jqdtt3p4p` (`indicator_id`),
  ADD KEY `FKlb6450qnl3f0dgitl6gkj96yk` (`sensor_id`);


ALTER TABLE `city`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `country`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `equipment`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `indicator`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `reference_room`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `reference_sensor`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `room`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `room_equipment`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `room_equipment_sensor_indicator`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `room_sensor_indicator`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `sensor`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

ALTER TABLE `sensor_indicator`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;


ALTER TABLE `city`
  ADD CONSTRAINT `FKrpd7j1p7yxr784adkx4pyepba` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`);

ALTER TABLE `room`
  ADD CONSTRAINT `FK4seo34o911u6g9pkk2vv4ka9f` FOREIGN KEY (`reference_room_id`) REFERENCES `reference_room` (`id`),
  ADD CONSTRAINT `FKlu7mqgx208gvxs11mgp850oyw` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`);

ALTER TABLE `room_equipment`
  ADD CONSTRAINT `FKqi32u6nxv9y6w769n87o958fj` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`),
  ADD CONSTRAINT `FKrmdm2ihfq0rjieivqjmnty6hq` FOREIGN KEY (`equipment_id`) REFERENCES `equipment` (`id`);

ALTER TABLE `room_equipment_sensor_indicator`
  ADD CONSTRAINT `FK66f1lmwifcgprpqd7kd5qqowl` FOREIGN KEY (`indicator_id`) REFERENCES `indicator` (`id`),
  ADD CONSTRAINT `FKabdprotoc0vlevyfq1yerkry2` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`),
  ADD CONSTRAINT `FKmh7pt6l6nm9ymjyfccwsgpuii` FOREIGN KEY (`equipment_id`) REFERENCES `equipment` (`id`),
  ADD CONSTRAINT `FKp8cd41djlopmr7033mds8kcif` FOREIGN KEY (`reference_sensor_id`) REFERENCES `reference_sensor` (`id`);

ALTER TABLE `room_sensor_indicator`
  ADD CONSTRAINT `FKa11gceimalobuct9qrtcl4lya` FOREIGN KEY (`reference_sensor_id`) REFERENCES `reference_sensor` (`id`),
  ADD CONSTRAINT `FKdbnvwve0iagu5vhigc62ey5r0` FOREIGN KEY (`indicator_id`) REFERENCES `indicator` (`id`),
  ADD CONSTRAINT `FKnf3ocdsymscr1ddhhodfdt3lm` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`);

ALTER TABLE `sensor`
  ADD CONSTRAINT `FKfs21u4e57ykl7elgjf3l72y86` FOREIGN KEY (`reference_sensor_id`) REFERENCES `reference_sensor` (`id`);

ALTER TABLE `sensor_indicator`
  ADD CONSTRAINT `FKl0m5wr33ihm21pp5jqdtt3p4p` FOREIGN KEY (`indicator_id`) REFERENCES `indicator` (`id`),
  ADD CONSTRAINT `FKlb6450qnl3f0dgitl6gkj96yk` FOREIGN KEY (`sensor_id`) REFERENCES `sensor` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;