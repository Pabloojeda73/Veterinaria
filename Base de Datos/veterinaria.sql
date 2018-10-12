-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 12-10-2018 a las 03:26:06
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Clientes`
--

CREATE TABLE `Clientes` (
  `id` int(11) NOT NULL,
  `apellidoNombre` varchar(30) NOT NULL,
  `dni` varchar(11) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `unContacto` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Clientes`
--

INSERT INTO `Clientes` (`id`, `apellidoNombre`, `dni`, `direccion`, `telefono`, `unContacto`) VALUES
(5, 'Alvarez, Juan', '29767584', 'Lavalle 1111', '2664789800', 'Perazzi, Antonia'),
(6, 'Federica Papaño', '2555555', 'San Martin 1232', '2664564790', 'Ernesto Papaño');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Mascotas`
--

CREATE TABLE `Mascotas` (
  `id` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `alias` varchar(30) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `especie` varchar(30) NOT NULL,
  `raza` varchar(30) NOT NULL,
  `colorDePelo` varchar(30) NOT NULL,
  `fecNac` date NOT NULL,
  `pesoMedio` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Mascotas`
--

INSERT INTO `Mascotas` (`id`, `id_cliente`, `alias`, `sexo`, `especie`, `raza`, `colorDePelo`, `fecNac`, `pesoMedio`) VALUES
(4, 5, 'Greta', 'Hembra', 'Calle', 'Vereda', 'Negro', '2005-11-03', 39.3),
(5, 6, 'Lola', 'Macho', 'Gato', 'mishi', 'rojo', '2017-06-16', 18.9),
(7, 5, 'Brutus', 'Macho', 'Perro', 'Colli', 'Negro y Marron', '2003-03-18', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Tratamientos`
--

CREATE TABLE `Tratamientos` (
  `id` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `importe` double NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Tratamientos`
--

INSERT INTO `Tratamientos` (`id`, `tipo`, `descripcion`, `importe`, `activo`) VALUES
(1, 'Vacunacion', 'Vacunacion de cada mascota de acuerdo a su edad.', 150.5, 1),
(2, 'Castracion', 'Para la castración constatar que la mascota tenga más de 1 año.', 375.2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Visitas`
--

CREATE TABLE `Visitas` (
  `id` int(11) NOT NULL,
  `id_mascota` int(11) NOT NULL,
  `id_tratamiento` int(11) NOT NULL,
  `veterinario` varchar(30) NOT NULL,
  `fecha` datetime NOT NULL,
  `pesoActual` double NOT NULL,
  `detalles` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Clientes`
--
ALTER TABLE `Clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `Mascotas`
--
ALTER TABLE `Mascotas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `Tratamientos`
--
ALTER TABLE `Tratamientos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Mascotas.id` (`tipo`);

--
-- Indices de la tabla `Visitas`
--
ALTER TABLE `Visitas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Mascotas.id` (`id_mascota`),
  ADD KEY `Tratamientos.id` (`id_tratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Clientes`
--
ALTER TABLE `Clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `Mascotas`
--
ALTER TABLE `Mascotas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `Tratamientos`
--
ALTER TABLE `Tratamientos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `Visitas`
--
ALTER TABLE `Visitas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Mascotas`
--
ALTER TABLE `Mascotas`
  ADD CONSTRAINT `Mascotas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `Clientes` (`id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `Visitas`
--
ALTER TABLE `Visitas`
  ADD CONSTRAINT `Visitas_ibfk_1` FOREIGN KEY (`id_tratamiento`) REFERENCES `Tratamientos` (`id`),
  ADD CONSTRAINT `Visitas_ibfk_2` FOREIGN KEY (`id_mascota`) REFERENCES `Mascotas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
