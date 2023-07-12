-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 18, 2022 at 06:52 PM
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
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `Username` varchar(50) NOT NULL,
  `id` varchar(40) NOT NULL,
  `name` varchar(60) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `price` varchar(20) NOT NULL,
  `Date` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`Username`, `id`, `name`, `quantity`, `price`, `Date`) VALUES
('17925', '104', 'Orange', '1', '150.0', '2022-12-18'),
('17925', '303', 'Pencil Box', '1', '35.0', '2022-12-18'),
('17925', '304', 'A4 Paper', '4', '20.0', '2022-12-18'),
('17925', '503', 'Chips', '1', '35.0', '2022-12-18'),
('17925', '502', 'Chocolate Combo', '2', '50.0', '2022-12-18'),
('17925', '203', 'Tomato', '4', '120.0', '2022-12-18'),
('17925', '203', 'Tomato', '10', '120.0', '2022-12-18'),
('17925', '205', 'Butter Beans', '20', '35.0', '2022-12-18'),
('17925', '203', 'Tomato', '10', '120.0', '2022-12-18'),
('17925', '203', 'Tomato', '2.25', '120.0', '2022-12-18'),
('17925', '205', 'Butter Beans', '9.5', '35.0', '2022-12-18'),
('17925', '203', 'Tomato', '1', '120.0', '2022-12-18'),
('17925', '705', 'Ragi', '1', '130.0', '2022-12-18'),
('17925', '203', 'Tomato', '1', '120.0', '2022-12-18'),
('17925', '205', 'Butter Beans', '3', '35.0', '2022-12-18'),
('17925', '206', 'Onion', '6', '75.0', '2022-12-18'),
('17925', '206', 'Onion', '1', '75.0', '2022-12-18'),
('17925', '605', 'Moisturizer', '5', '160.0', '2022-12-18'),
('17925', '105', 'Pomegranate', '0.75', '110.0', '2022-12-18'),
('17925', '304', 'A4 Paper', '5', '20.0', '2022-12-18'),
('17925', '703', 'Wheat', '3', '60.0', '2022-12-18'),
('17925', '603', 'Lip Stick', '1', '220.0', '2022-12-18'),
('17925', '204', 'Cauliflower', '2', '100.0', '2022-12-18'),
('azr123', '301', 'Ball Pen', '5', '30.0', '2022-12-18'),
('azr123', '504', 'Biscuits', '3', '30.0', '2022-12-18'),
('azr123', '204', 'Cauliflower', '1', '100.0', '2022-12-18'),
('azr123', '201', 'Carrot', '1', '60.0', '2022-12-18'),
('HARRY', '204', 'Cauliflower', '1', '100.0', '2022-12-18'),
('HARRY', '202', 'Potato', '1', '40.0', '2022-12-18'),
('HARRY', '501', 'Milk Peda', '1', '40.0', '2022-12-18'),
('HARRY', '503', 'Chips', '2', '35.0', '2022-12-18'),
('HARRY', '101', 'Apple', '1', '70.0', '2022-12-18'),
('HARRY', '104', 'Orange', '0.75', '150.0', '2022-12-18'),
('HARRY', '105', 'Pomegranate', '1', '110.0', '2022-12-18'),
('HARRY', '105', 'Pomegranate', '0.5', '110.0', '2022-12-18'),
('18032', '301', 'Ball Pen', '5', '30.0', '2022-12-18'),
('18032', '302', 'Gel Pen', '5', '50.0', '2022-12-18'),
('18032', '305', 'Pouch', '2', '55.0', '2022-12-18'),
('18032', '503', 'Chips', '5', '35.0', '2022-12-18'),
('18084', '504', 'Biscuits', '1', '30.0', '2022-12-18'),
('18084', '505', 'Juice', '1', '50.0', '2022-12-18'),
('18084', '601', 'Kajal', '1', '140.0', '2022-12-18'),
('18084', '604', 'Perfume', '1', '80.0', '2022-12-18'),
('18084', '602', 'Eyeliner', '1', '300.0', '2022-12-18'),
('18084', '605', 'Moisturizer', '1', '160.0', '2022-12-18'),
('18084', '302', 'Gel Pen', '1', '50.0', '2022-12-18'),
('18084', '301', 'Ball Pen', '1', '30.0', '2022-12-18');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
