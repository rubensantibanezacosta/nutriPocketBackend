-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 27-10-2021 a las 13:19:42
-- Versión del servidor: 8.0.27-0ubuntu0.20.04.1
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutripocket`
--
CREATE DATABASE IF NOT EXISTS `nutripocket` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `nutripocket`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `composition`
--

CREATE TABLE `composition` (
  `foodid` int NOT NULL,
  `calories` float NOT NULL,
  `fat` float NOT NULL,
  `carbs` float NOT NULL,
  `protein` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `composition`
--

INSERT INTO `composition` (`foodid`, `calories`, `fat`, `carbs`, `protein`) VALUES
(151, 1.1, 0.0124, 0, 0.2309),
(152, 2.33981, 0.0987379, 0.0967961, 0.249806),
(153, 1.83495, 0.0466019, 0, 0.332136),
(154, 2.33981, 0.0987379, 0.0967961, 0.249806),
(161, 1.9505, 0.0771287, 0, 0.295049),
(162, 1.63366, 0.0353465, 0, 0.307129),
(163, 2.14706, 0.0906863, 0, 0.31549),
(164, 2.55556, 0.12798, 0.101414, 0.233939),
(165, 2.54, 0.1365, 0.1014, 0.2143),
(166, 2.56566, 0.135455, 0.101414, 0.221111),
(167, 1.55, 0.1061, 0.0112, 0.1258),
(168, 1.47, 0.0994, 0.0077, 0.1258),
(169, 3.03061, 0.189475, 0.299227, 0.0347085),
(170, 1.57353, 0.115147, 0.0186765, 0.109853),
(171, 1.69, 0.1226, 0.0128, 0.1234),
(172, 1.49558, 0.105752, 0.0556637, 0.0769027),
(173, 2.76046, 0.215988, 0.083189, 0.119596),
(174, 2.23256, 0.176346, 0.0159136, 0.137575),
(175, 3.16901, 0.301831, 0.0192254, 0.0917606),
(176, 1.66057, 0.04184, 0.248251, 0.0668914);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `foods`
--

CREATE TABLE `foods` (
  `id` int NOT NULL,
  `name` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `foods`
--

INSERT INTO `foods` (`id`, `name`) VALUES
(151, 'Skinless Chicken Breast'),
(152, 'Baked or Fried Coated Chicken Breast Skinless'),
(153, 'Baked or Fried Coated Chicken Breast Skinless (Coating Not Eaten)'),
(154, 'Baked or Fried Coated Chicken Breast Skinless (Coating Eaten)'),
(155, 'Boneless Skinless Chicken Breast'),
(156, 'Boneless Skinless Chicken Breast'),
(157, 'Skinless Boneless Chicken Breast'),
(158, 'Boneless Skinless Chicken Breast'),
(159, 'Boneless Skinless Chicken Breast'),
(160, 'Boneless Skinless Chicken Breast'),
(161, 'Chicken Breast'),
(162, 'Chicken Breast (Skin Not Eaten)'),
(163, 'Fried Chicken Breast No Coating'),
(164, 'Baked or Fried Coated Chicken Skinless'),
(165, 'Baked or Fried Coated Chicken Thigh Skinless'),
(166, 'Baked or Fried Coated Chicken Leg Skinless'),
(167, 'Soft Boiled Egg'),
(168, 'Egg'),
(169, 'Puerto Rican Style Yam Buns (Bunuelos De Name)'),
(170, 'Egg Omelet or Scrambled Egg'),
(171, 'Cooked Egg'),
(172, 'Creamed Egg'),
(173, 'Benedict Egg'),
(174, 'Egg Omelet or Scrambled Egg with Sausage'),
(175, 'Egg Salad'),
(176, 'Egg Muffin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `composition`
--
ALTER TABLE `composition`
  ADD PRIMARY KEY (`foodid`);

--
-- Indices de la tabla `foods`
--
ALTER TABLE `foods`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `foods`
--
ALTER TABLE `foods`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=177;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `composition`
--
ALTER TABLE `composition`
  ADD CONSTRAINT `FK_food_composition` FOREIGN KEY (`foodid`) REFERENCES `foods` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
