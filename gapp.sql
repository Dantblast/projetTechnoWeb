-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 29 Mars 2016 à 12:27
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `gapp`
--

-- --------------------------------------------------------

--
-- Structure de la table `abscences`
--

CREATE TABLE IF NOT EXISTS `abscences` (
  `id_abscence` int(11) NOT NULL AUTO_INCREMENT,
  `id_personne` int(2) NOT NULL,
  `date_abscence` date NOT NULL,
  `justificatif` text NOT NULL,
  PRIMARY KEY (`id_abscence`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `competences`
--

CREATE TABLE IF NOT EXISTS `competences` (
  `id_competence` int(1) NOT NULL,
  `id_famille` int(1) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `coefficient` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `deadlines`
--

CREATE TABLE IF NOT EXISTS `deadlines` (
  `id_deadline` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `num_groupe` varchar(5) NOT NULL,
  `date_deadline` date NOT NULL,
  PRIMARY KEY (`id_deadline`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `droits`
--

CREATE TABLE IF NOT EXISTS `droits` (
  `id_droit` int(1) NOT NULL,
  `nom` varchar(50) NOT NULL,
  PRIMARY KEY (`id_droit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `familles`
--

CREATE TABLE IF NOT EXISTS `familles` (
  `id_famille` int(1) NOT NULL,
  `nom` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `groupes`
--

CREATE TABLE IF NOT EXISTS `groupes` (
  `id_groupe` varchar(5) NOT NULL,
  `id_tuteur` int(2) NOT NULL,
  `num_groupe` varchar(5) NOT NULL,
  PRIMARY KEY (`id_groupe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `notes`
--

CREATE TABLE IF NOT EXISTS `notes` (
  `id_eleve` int(2) NOT NULL,
  `note` int(1) NOT NULL,
  PRIMARY KEY (`id_eleve`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `personnes`
--

CREATE TABLE IF NOT EXISTS `personnes` (
  `id_personne` int(2) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `droit` int(1) NOT NULL,
  `login` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `id_groupe` varchar(5) NOT NULL,
  PRIMARY KEY (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `releves_notes`
--

CREATE TABLE IF NOT EXISTS `releves_notes` (
  `id_releve` int(11) NOT NULL AUTO_INCREMENT,
  `id_personne` int(2) NOT NULL,
  `id_competence` int(1) NOT NULL,
  `resultat` varchar(50) NOT NULL,
  `commentaire` text NOT NULL,
  PRIMARY KEY (`id_releve`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `remarques`
--

CREATE TABLE IF NOT EXISTS `remarques` (
  `id_remarque` int(11) NOT NULL AUTO_INCREMENT,
  `id_from` int(2) NOT NULL,
  `id_to` varchar(5) NOT NULL,
  `text_remarque` text NOT NULL,
  PRIMARY KEY (`id_remarque`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
