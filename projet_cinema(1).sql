-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 03 mars 2020 à 22:38
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `projet_cinema`
--

-- --------------------------------------------------------

--
-- Structure de la table `stockage`
--

DROP TABLE IF EXISTS `stockage`;
CREATE TABLE IF NOT EXISTS `stockage` (
  `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) COLLATE utf8_bin NOT NULL,
  `prenom` varchar(30) COLLATE utf8_bin NOT NULL,
  `Snum` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `stockage`
--

INSERT INTO `stockage` (`ID`, `nom`, `prenom`, `Snum`) VALUES
(1, 'Alexandre', 'Carmone', 2001),
(2, 'Adam', 'Aggoun', 2004),
(3, 'Thomas', 'Yalap', 2009),
(4, 'Antoine', 'Vasone', 2001),
(5, 'Enzo', 'Birba', 2001),
(6, 'test', 'test', 2003),
(7, 'paul', 'test', 2003);

-- --------------------------------------------------------

--
-- Structure de la table `stockagebilan`
--

DROP TABLE IF EXISTS `stockagebilan`;
CREATE TABLE IF NOT EXISTS `stockagebilan` (
  `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `numero` int(11) NOT NULL,
  `nombre` int(11) NOT NULL,
  `Etud` varchar(20) COLLATE utf8_bin NOT NULL,
  `Dix` varchar(20) COLLATE utf8_bin NOT NULL,
  `Navigo` varchar(20) COLLATE utf8_bin NOT NULL,
  `PleinTarif` varchar(20) COLLATE utf8_bin NOT NULL,
  `film` varchar(30) COLLATE utf8_bin NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `stockagebilan`
--

INSERT INTO `stockagebilan` (`ID`, `numero`, `nombre`, `Etud`, `Dix`, `Navigo`, `PleinTarif`, `film`, `date`) VALUES
(1, 1, 1, '', '', '', '', 'les miserables', '2020-02-05'),
(2, 1, 2, '', '', '', '', 'Drive', '2020-02-05'),
(3, 1, 2, '', '', '', '', 'Annihilation', '2020-02-05'),
(4, 1, 3, '', '', '', '', 'Drive', '2020-02-26'),
(5, 1, 4, '1', '1', '1', '1', 'Drive', '2020-03-01'),
(6, 1, 4, '1', '1', '1', '1', 'Drive', '2020-03-01'),
(7, 1, 20, '5', '5', '5', '5', 'Drive', '2020-03-01'),
(8, 1, 2, '0', '0', '1', '1', ' Annihilation', '2020-03-01'),
(9, 1, 1, '0', '0', '1', '0', 'Drive', '2020-03-01');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
