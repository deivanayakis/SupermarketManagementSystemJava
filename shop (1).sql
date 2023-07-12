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
-- Table structure for table `shop`
--

CREATE TABLE `shop` (
  `ID` varchar(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Quantity` varchar(11) NOT NULL,
  `Price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shop`
--

INSERT INTO `shop` (`ID`, `Name`, `Quantity`, `Price`) VALUES
('101', 'Apple', '8.25', '70.0'),
('102', 'Banana', '7.0', '50.0'),
('103', 'Guaua', '0.0', '70.0'),
('104', 'Orange', '0.0', '150.0'),
('105', 'Pomegranate', '3.75', '110.0'),
('201', 'Carrot', '8.0', '60.0'),
('202', 'Potato', '8.25', '40.0'),
('203', 'Tomato', '8', '120.0'),
('204', 'Cauliflower', '0.0', '60.0'),
('205', 'Butter Beans', '9', '70.0'),
('206', 'Onion', '0.5', '75.0'),
('301', 'Ball Pen', '6.0', '30.0'),
('302', 'Gel Pen', '0.0', '50.0'),
('303', 'Pencil Box', '6.0', '35.0'),
('304', 'A4 Paper', '1.0', '20.0'),
('305', 'Pouch', '5.0', '55.0'),
('501', 'Milk Peda', '9.0', '40.0'),
('502', 'Chocolate Combo', '0.0', '50.0'),
('503', 'Chips', '0.0', '35.0'),
('504', 'Biscuits', '13.0', '30.0'),
('505', 'Juice', '10.0', '50.0'),
('506', 'Burfi', '10', '40.0'),
('601', 'Kajal', '5.0', '140.0'),
('602', 'Eyeliner', '4.0', '300.0'),
('603', 'Lip Stick', '6.0', '220.0'),
('604', 'Perfume', '0.0', '80.0'),
('605', 'Moisturizer', '0.0', '160.0'),
('701', 'Moong Dal', '17.5', '40.0'),
('702', 'Urad Dal', '0', '40.0'),
('703', 'Wheat', '5.5', '60.0'),
('704', 'Thor Dal', '6.25', '70.0'),
('705', 'Ragi', '5.0', '130.0'),
('706', 'Millet', '5.0', '150.0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
