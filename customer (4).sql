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
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Name` varchar(30) NOT NULL,
  `Age` varchar(3) NOT NULL,
  `Gender` varchar(15) NOT NULL,
  `Aadhar` varchar(12) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Mobile` varchar(10) NOT NULL,
  `Mail` varchar(80) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Fpsswd` varchar(40) NOT NULL,
  `Document` varchar(200) NOT NULL,
  `Image` varchar(200) NOT NULL,
  `paddress` varchar(200) NOT NULL,
  `Id` varchar(20) NOT NULL,
  `Query` text NOT NULL,
  `Reply` varchar(500) NOT NULL,
  `Feedback` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Name`, `Age`, `Gender`, `Aadhar`, `Address`, `Mobile`, `Mail`, `Username`, `Password`, `Fpsswd`, `Document`, `Image`, `paddress`, `Id`, `Query`, `Reply`, `Feedback`) VALUES
('Deivanayaki S', '19', 'FEMALE', '843864782634', '7,Melapalayam Street,Ambasamudram - 627401,Tirunelveli', '9742846827', 'deiva@gmail.com', '17925', '3939', 'PAPANASAM DAM', 'C:\\Users\\DELL\\Documents\\COA\\LU1_3_FuntionalUnits_BasicOperational_Concepts_Number_Representation_Performance_1661849130605.pdf', 'C:\\Users\\DELL\\Pictures\\profiles\\Girl20(1).png', '7,Melapalayam Street', '410', '0', '0', '0'),
('AZHARA YOUSUF', '19', 'FEMALE', '556950837601', 'PALAYAMKOTTAI,TIRUNELVELLI - 627011,TIRUNELVELI', '9443487477', 'azr_usuf@gmail.com', 'azr123', '002', 'TENNESSE', 'C:\\Users\\DELL\\Documents\\COA\\Fast_Multiplication_1664540503277.ppt', 'C:\\Users\\DELL\\Pictures\\profiles\\Girl18.png', 'ERUVADI', '123', '0', '0', 'BETTER,POOR,GOOD'),
('HARITHA R', '18', 'FEMALE', '546578908976', 'MIDDLE STREET,THENI,BODI - 625528,THENI', '1324354655', 'haritha@gmail.com', 'HARRY', '1234', 'KODAIKANAL', 'C:\\Users\\DELL\\Documents\\C\\Declaration and Initialisation.docx', 'C:\\Users\\DELL\\Pictures\\profiles\\Girl18(1).png', 'MIDDLE STREET,THENI', '462', '0', '0', 'EXCELLENT,BETTER,BETTER'),
('Ajithaa Malini', '18', 'FEMALE', '453354500000', 'Ganga Hostel (GS22),Sivakasi - 626005,Virudhunagar', '6374769252', 'logidhasankls_bcs25@gmail.com', '18032', '18032', 'NEW ZEALAND', 'C:\\Users\\DELL\\Documents\\C\\Declaration and Initialisation.docx', 'C:\\Users\\DELL\\Pictures\\profiles\\Girl18(2).png', 'MSEC', '482', '0', '0', 'EXCELLENT,BETTER,EXCELLENT'),
('Revathi S', '18', 'FEMALE', '456897349257', 'D-11,PALAR ROAD,NEYVELI - 607801,CUDDALORE', '7397729348', 'revskutty17@gmail.com', '18084', 'Revathi@04', 'HOKANAKKAL', 'C:\\Users\\DELL\\Documents\\C\\Declaration and Initialisation.docx', 'C:\\Users\\DELL\\Pictures\\profiles\\Girl19(3).png', 'BLOCK-17', '475', '0', '0', 'EXCELLENT,BETTER,GOOD');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
