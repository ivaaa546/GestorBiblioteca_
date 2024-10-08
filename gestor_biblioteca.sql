-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-09-2024 a las 07:06:14
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
(8, 'Jose Chub', 'chapin', '2005-09-08 00:00:00', '2100-09-13 00:00:00'),
(9, 'Adolf Hitler', 'alemana', '1889-09-20 00:00:00', '1945-07-19 00:00:00'),
(10, 'Darwin', 'inglesa', '1885-09-21 00:00:00', '1930-09-23 00:00:00');

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
(14, 'El capital ', '2342342', 'Comedia', 5),
(16, 'Libre para elegir', '42342342342', 'Economia', 6),
(20, 'Manifiesto Comunista', '213123123123', 'Comedia', 5),
(27, 'Mi Lucha', '2341234', 'Autobiografía', 9),
(32, 'Teroria de la evolucion', '2342342', 'Ciencia', 10);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `mostaprestamos`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `mostaprestamos` (
`id_prestamo` int(11)
,`titulo_libro` varchar(255)
,`nombre_usuario` varchar(255)
,`fecha_prestamo` date
,`fecha_devolucion` date
,`estado` varchar(50)
);

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
  `monto` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `multas`
--

INSERT INTO `multas` (`id_multa`, `id_prestamo`, `monto`) VALUES
(19, 29, 70.00),
(20, 18, 70.00),
(21, 31, 310.00),
(22, 34, 310.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `id_prestamo` int(11) NOT NULL,
  `id_libro` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `fecha_prestamo` date DEFAULT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`id_prestamo`, `id_libro`, `id_usuario`, `fecha_prestamo`, `fecha_devolucion`, `estado`) VALUES
(18, 20, 7, '2024-09-23', '2024-10-30', 'Devuelto'),
(20, 20, 11, '2024-09-23', '2024-10-24', 'Prestamo'),
(21, 32, 7, '2024-09-23', '2024-10-24', 'Devuelto'),
(29, 20, 7, '2024-09-23', '2024-10-30', 'Devuelto'),
(30, 14, 10, '2024-09-23', '2024-09-25', 'Prestamo'),
(31, 14, 8, '2024-09-23', '2024-11-23', 'Prestamo'),
(32, 14, 7, '2024-09-23', NULL, 'Prestamo'),
(34, 14, 8, '2024-09-23', '2024-11-23', 'Prestamo'),
(35, 16, 6, '2024-08-23', NULL, 'Prestamo'),
(36, 16, 7, '2024-08-21', NULL, 'Prestamo');

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
(8, 'Josue', 'Estudiante', 'Caal', '456454632', '15/9/2024', 'Chamelco, Zona 6'),
(10, 'Hola', 'Estudiante', 'Hola', 'Hola', '17/9/2024', 'Hola'),
(11, 'Lucas', 'Estudiante', 'Lucas', '123123123', '17/9/2024', 'rrrrr');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_libros_mas_prestados`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_libros_mas_prestados` (
`id_libro` int(11)
,`titulo` varchar(255)
,`cantidad_prestamos` bigint(21)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_libros_vencidos`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_libros_vencidos` (
`id_libro` int(11)
,`titulo` varchar(255)
,`fecha_prestamo` date
,`dias_vencidos` int(7)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_multas`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_multas` (
`id_multa` int(11)
,`id_prestamo` int(11)
,`fecha_prestamo` date
,`fecha_devolucion` date
,`estado` varchar(50)
,`monto` decimal(10,2)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_usuarios_mas_prestamos`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vista_usuarios_mas_prestamos` (
`id_usuario` int(11)
,`nombre` varchar(255)
,`cantidad_prestamos` bigint(21)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `mostaprestamos`
--
DROP TABLE IF EXISTS `mostaprestamos`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `mostaprestamos`  AS SELECT `p`.`id_prestamo` AS `id_prestamo`, `l`.`titulo` AS `titulo_libro`, `u`.`nombre` AS `nombre_usuario`, `p`.`fecha_prestamo` AS `fecha_prestamo`, `p`.`fecha_devolucion` AS `fecha_devolucion`, `p`.`estado` AS `estado` FROM ((`prestamos` `p` join `libros` `l` on(`p`.`id_libro` = `l`.`id_libro`)) join `usuarios` `u` on(`p`.`id_usuario` = `u`.`id_usuario`)) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `mostralibros`
--
DROP TABLE IF EXISTS `mostralibros`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `mostralibros`  AS SELECT `b`.`id_libro` AS `id_libro`, `b`.`titulo` AS `titulo`, `b`.`isbn` AS `isbn`, `b`.`genero` AS `genero`, `a`.`nombre` AS `Autores` FROM (`libros` `b` join `autores` `a` on(`b`.`id_autor` = `a`.`id_autor`)) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_libros_mas_prestados`
--
DROP TABLE IF EXISTS `vista_libros_mas_prestados`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_libros_mas_prestados`  AS SELECT `l`.`id_libro` AS `id_libro`, `l`.`titulo` AS `titulo`, count(`p`.`id_prestamo`) AS `cantidad_prestamos` FROM (`libros` `l` join `prestamos` `p` on(`l`.`id_libro` = `p`.`id_libro`)) WHERE `p`.`estado` = 'devuelto' GROUP BY `l`.`id_libro` ORDER BY count(`p`.`id_prestamo`) DESC ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_libros_vencidos`
--
DROP TABLE IF EXISTS `vista_libros_vencidos`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_libros_vencidos`  AS SELECT `l`.`id_libro` AS `id_libro`, `l`.`titulo` AS `titulo`, `p`.`fecha_prestamo` AS `fecha_prestamo`, to_days(curdate()) - to_days(`p`.`fecha_prestamo` + interval 15 day) AS `dias_vencidos` FROM (`prestamos` `p` join `libros` `l` on(`p`.`id_libro` = `l`.`id_libro`)) WHERE `p`.`estado` = 'Prestamo' AND `p`.`fecha_prestamo` + interval 15 day < curdate() ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_multas`
--
DROP TABLE IF EXISTS `vista_multas`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_multas`  AS SELECT `m`.`id_multa` AS `id_multa`, `p`.`id_prestamo` AS `id_prestamo`, `p`.`fecha_prestamo` AS `fecha_prestamo`, `p`.`fecha_devolucion` AS `fecha_devolucion`, `p`.`estado` AS `estado`, `m`.`monto` AS `monto` FROM (`multas` `m` join `prestamos` `p` on(`m`.`id_prestamo` = `p`.`id_prestamo`)) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_usuarios_mas_prestamos`
--
DROP TABLE IF EXISTS `vista_usuarios_mas_prestamos`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_usuarios_mas_prestamos`  AS SELECT `u`.`id_usuario` AS `id_usuario`, `u`.`nombre` AS `nombre`, count(`p`.`id_prestamo`) AS `cantidad_prestamos` FROM (`usuarios` `u` join `prestamos` `p` on(`u`.`id_usuario` = `p`.`id_usuario`)) WHERE `p`.`estado` = 'devuelto' GROUP BY `u`.`id_usuario` ORDER BY count(`p`.`id_prestamo`) DESC ;

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
  MODIFY `id_autor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id_libro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `multas`
--
ALTER TABLE `multas`
  MODIFY `id_multa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  MODIFY `id_prestamo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

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
