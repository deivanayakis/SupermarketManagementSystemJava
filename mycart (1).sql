-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 18, 2022 at 06:53 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermarketdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `mycart`
--

CREATE TABLE `mycart` (
  `Username` varchar(40) NOT NULL,
  `pname` varchar(60) NOT NULL,
  `Quantity` varchar(40) NOT NULL,
  `Price` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mycart`
--

INSERT INTO `mycart` (`Username`, `pname`, `Quantity`, `Price`) VALUES
('17925', 'Orange', '2', '150.0'),
('17925', 'Burfi', '4', '40.0'),
('azr123', 'Potato', '0.75', '40.0'),
('azr123', 'Onion', '4', '75.0'),
('azr123', 'Pencil Box', '3', '35.0'),
('azr123', 'A4 Paper', '4', '20.0'),
('azr123', 'Juice', '1', '50.0'),
('azr123', 'Carrot', '1', '60.0'),
('azr123', 'Carrot', '1', '60.0'),
('18084', 'A4 Paper', '3', '20.0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
