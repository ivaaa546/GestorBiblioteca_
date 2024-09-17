-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-09-2024 a las 19:09:20
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gestor_biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autores`
--

CREATE TABLE `autores` (
  `id_autor` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `nacionalidad` varchar(50) NOT NULL,
  `fecha_nacimiento` datetime NOT NULL,
  `fecha_fallecimiento` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `autores`
--

INSERT INTO `autores` (`id_autor`, `nombre`, `nacionalidad`, `fecha_nacimiento`, `fecha_fallecimiento`) VALUES
(5, 'Karl Marx', 'Alemana', '1818-05-05 00:00:00', '1818-05-05 00:00:00'),
(6, 'Milton Friedman', 'estadounidense', '1912-07-31 00:00:00', '1946-11-16 00:00:00'),
(7, 'Nicolás Bernardo de Maquiavelo', 'italiana', '1469-05-31 00:00:00', '1527-06-21 00:00:00'),
(8, 'Jose Chub', 'chapin', '2005-09-08 00:00:00', '2100-09-13 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id_libro` int(11) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `isbn` varchar(13) NOT NULL,
  `genero` varchar(100) DEFAULT NULL,
  `id_autor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id_libro`, `titulo`, `isbn`, `genero`, `id_autor`) VALUES
(14, 'El capital', '2131231234', 'Comedia', 5),
(16, 'Libertad', '42342342342', 'politica', 6),
(20, 'Pazw', '11111', 'novelae', 5);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `mostralibros`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `mostralibros` (
`id_libro` int(11)
,`titulo` varchar(255)
,`isbn` varchar(13)
,`genero` varchar(100)
,`Autores` varchar(50)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `multas`
--

CREATE TABLE `multas` (
  `id_multa` int(11) NOT NULL,
  `id_prestamo` int(11) DEFAULT NULL,
  `monto` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id_prestamo` int(11) NOT NULL,
  `id_libro` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `fecha_prestamo` date NOT NULL,
  `fecha_devolucion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `tipo_usuario` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `numero_cel` varchar(50) NOT NULL,
  `fecha_ingreso` varchar(50) NOT NULL,
  `direccion` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre`, `tipo_usuario`, `apellido`, `numero_cel`, `fecha_ingreso`, `direccion`) VALUES
(6, 'Marcos', 'Estudiante', 'Marcos', '3232', '15/9/2024', 'tactic'),
(7, 'Iván', 'Estudiante', 'Icó', '12312312', '15/9/2024', 'Chamelco, zona 2'),
(8, 'Josue', 'Estudiante', 'Caal', '456454632', '15/9/2024', 'Chamelco, Zona 6');

-- --------------------------------------------------------

--
-- Estructura para la vista `mostralibros`
--
DROP TABLE IF EXISTS `mostralibros`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `mostralibros`  AS SELECT `b`.`id_libro` AS `id_libro`, `b`.`titulo` AS `titulo`, `b`.`isbn` AS `isbn`, `b`.`genero` AS `genero`, `a`.`nombre` AS `Autores` FROM (`libros` `b` join `autores` `a` on(`b`.`id_autor` = `a`.`id_autor`)) ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autores`
--
ALTER TABLE `autores`
  ADD PRIMARY KEY (`id_autor`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id_libro`),
  ADD KEY `fk_libro_autor` (`id_autor`) USING BTREE,
  ADD KEY `isbn` (`isbn`) USING BTREE;

--
-- Indices de la tabla `multas`
--
ALTER TABLE `multas`
  ADD PRIMARY KEY (`id_multa`),
  ADD KEY `fk_id_prestamo` (`id_prestamo`) USING BTREE;

--
-- Indices de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD PRIMARY KEY (`id_prestamo`),
  ADD KEY `id_libro` (`id_libro`),
  ADD KEY `fk_id_usuario` (`id_usuario`) USING BTREE;

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autores`
--
ALTER TABLE `autores`
  MODIFY `id_autor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id_libro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `multas`
--
ALTER TABLE `multas`
  MODIFY `id_multa` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  MODIFY `id_prestamo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`id_autor`) REFERENCES `autores` (`id_autor`);

--
-- Filtros para la tabla `multas`
--
ALTER TABLE `multas`
  ADD CONSTRAINT `multas_ibfk_1` FOREIGN KEY (`id_prestamo`) REFERENCES `prestamos` (`id_prestamo`);

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `prestamos_ibfk_1` FOREIGN KEY (`id_libro`) REFERENCES `libros` (`id_libro`),
  ADD CONSTRAINT `prestamos_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
