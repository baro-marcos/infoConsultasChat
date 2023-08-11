-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-08-2023 a las 04:35:03
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `chat`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialpreguntas`
--

CREATE TABLE `historialpreguntas` (
  `IDHistorialPreg` int(5) NOT NULL,
  `IDUsuario` int(5) NOT NULL,
  `IDPregunta` int(5) NOT NULL,
  `IDRespuesta` int(5) NOT NULL,
  `FechaHist` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historialpreguntas`
--

INSERT INTO `historialpreguntas` (`IDHistorialPreg`, `IDUsuario`, `IDPregunta`, `IDRespuesta`, `FechaHist`) VALUES
(1, 1, 1, 7, '2023-06-08'),
(2, 1, 1, 8, '2023-07-29'),
(3, 2, 1, 9, '2023-06-09'),
(4, 3, 1, 8, '2023-06-15'),
(5, 4, 2, 10, '2023-06-28'),
(6, 5, 3, 12, '2023-07-03'),
(7, 5, 4, 13, '2023-07-29'),
(8, 6, 1, 8, '2023-07-15'),
(9, 7, 8, 18, '2023-07-20'),
(10, 8, 1, 9, '2023-08-21'),
(11, 8, 6, 15, '2023-07-20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `moneda`
--

CREATE TABLE `moneda` (
  `IDMoneda` int(5) NOT NULL,
  `Moneda` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `moneda`
--

INSERT INTO `moneda` (`IDMoneda`, `Moneda`) VALUES
(1, 'Peso Arg'),
(2, 'Peso Chil');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `IDPregunta` int(5) NOT NULL,
  `Pregunta` varchar(100) NOT NULL,
  `IDUsuario` int(5) NOT NULL,
  `FechaPregunta` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`IDPregunta`, `Pregunta`, `IDUsuario`, `FechaPregunta`) VALUES
(1, 'Hola, buen dia', 1, '2023-04-25 13:28:14'),
(2, 'Que dia es hoy?', 3, '2023-04-26 14:23:57'),
(3, 'Cuanto es 2 x 2', 1, '2023-04-27 11:23:15'),
(4, 'Para que sirve un barometro?', 3, '2023-05-01 18:19:30'),
(5, 'Para que sirve un termometro?', 1, '2023-05-05 03:59:14'),
(6, 'Cuanto es 2 + 2?', 1, '2023-05-07 04:20:54'),
(7, 'Cuando va a llover?', 1, '2023-05-08 13:19:26'),
(8, 'Cuando comienza la primavera?', 1, '2023-05-08 12:16:54');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta`
--

CREATE TABLE `respuesta` (
  `IDRespuesta` int(5) NOT NULL,
  `Respuesta` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `respuesta`
--

INSERT INTO `respuesta` (`IDRespuesta`, `Respuesta`) VALUES
(7, 'Hola'),
(8, 'Buenas'),
(9, 'Buen dia'),
(10, 'Hoy es lunes'),
(11, 'Viernes'),
(12, 'La respuesta es 4'),
(13, 'Sirve para medir la presion atmosferica'),
(14, 'Es para medir la temperatura'),
(15, '2 + 2 es 4'),
(16, 'Segun el pronostico, el jueves'),
(17, 'El lunes que viene va a llover'),
(18, 'Comienza el 21 de septiembre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `idrol` bigint(20) NOT NULL,
  `NombreRol` varchar(10) NOT NULL,
  `nombre_rol` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`idrol`, `NombreRol`, `nombre_rol`) VALUES
(1, 'RolAdmin', ''),
(2, 'RolUsuario', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `saldo`
--

CREATE TABLE `saldo` (
  `IDSaldo` int(5) NOT NULL,
  `DeudaTotal` decimal(10,2) NOT NULL DEFAULT 0.00,
  `IDMoneda` int(5) NOT NULL,
  `IDUsuario` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `saldo`
--

INSERT INTO `saldo` (`IDSaldo`, `DeudaTotal`, `IDMoneda`, `IDUsuario`) VALUES
(1, 0.00, 1, 1),
(2, 540.00, 2, 2),
(3, 1500.00, 1, 3),
(4, 2500.00, 2, 4),
(5, 200.00, 1, 5),
(6, 900.00, 1, 6),
(7, 0.00, 1, 7),
(8, 0.00, 1, 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` bigint(20) NOT NULL,
  `Usuario` varchar(10) NOT NULL,
  `pass` varchar(10) NOT NULL,
  `Nombre` varchar(15) NOT NULL,
  `Apellido` varchar(15) NOT NULL,
  `Telefono` varchar(25) DEFAULT NULL,
  `Genero` varchar(1) NOT NULL,
  `Pais` varchar(15) NOT NULL,
  `FechaAlta` datetime NOT NULL,
  `idrol` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `Usuario`, `pass`, `Nombre`, `Apellido`, `Telefono`, `Genero`, `Pais`, `FechaAlta`, `idrol`) VALUES
(1, 'juan', '1234', 'Juan', 'Mengano', '052341567888', 'M', 'Argentina', '2023-04-01 07:37:21', 1),
(2, 'manuel', '5678F', 'Manuel', 'Gonzales', '0987164325', 'M', 'Chile', '2023-04-10 11:08:00', 2),
(3, 'juli', 'VB789', 'Julieta', 'Fulana', '07651589076', 'F', 'Argentina', '2023-04-15 18:16:00', 1),
(4, 'mauro', '56AA', 'Mauro', 'Maurales', '0654123876', 'M', 'Chile', '2023-04-11 20:22:00', 2),
(5, 'diego', 'AWER', 'Diego', 'Diegal', '09853214567', 'M', 'Argentina', '2023-04-15 07:21:16', 2),
(6, 'maria', 'AQPOY', 'Maria', 'Marial', '0765123465', 'F', 'Argentina', '2023-04-20 23:46:35', 2),
(7, 'guille', 'qwerty', 'Guillermo', 'Guillead', '0378623456', 'M', 'Argentina', '2023-06-29 17:35:10', 1),
(8, 'jose', '23erty', 'Josefina', 'Josefam', '15999888', 'F', 'Argentina', '2023-08-01 00:00:25', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `historialpreguntas`
--
ALTER TABLE `historialpreguntas`
  ADD PRIMARY KEY (`IDHistorialPreg`);

--
-- Indices de la tabla `moneda`
--
ALTER TABLE `moneda`
  ADD PRIMARY KEY (`IDMoneda`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`IDPregunta`);

--
-- Indices de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD PRIMARY KEY (`IDRespuesta`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`idrol`);

--
-- Indices de la tabla `saldo`
--
ALTER TABLE `saldo`
  ADD PRIMARY KEY (`IDSaldo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`),
  ADD KEY `FK10bib7rrkh36ss78063ifbq6k` (`idrol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `historialpreguntas`
--
ALTER TABLE `historialpreguntas`
  MODIFY `IDHistorialPreg` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `moneda`
--
ALTER TABLE `moneda`
  MODIFY `IDMoneda` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `IDPregunta` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `IDRespuesta` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `idrol` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `saldo`
--
ALTER TABLE `saldo`
  MODIFY `IDSaldo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FK10bib7rrkh36ss78063ifbq6k` FOREIGN KEY (`idrol`) REFERENCES `rol` (`idrol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
