-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2023 at 03:56 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `reporting`
--

-- --------------------------------------------------------

--
-- Table structure for table `campaign`
--

CREATE TABLE `campaign` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `platform` varchar(255) NOT NULL,
  `budget` decimal(10,2) NOT NULL,
  `type` varchar(255) NOT NULL,
  `result` decimal(10,2) NOT NULL
) ;

--
-- Dumping data for table `campaign`
--

INSERT INTO `campaign` (`id`, `name`, `platform`, `budget`, `type`, `result`) VALUES
(1, 'Campaign 1', 'Google', 1000.00, 'Awareness', 500.00),
(2, 'Campaign 2', 'Meta', 1500.00, 'Leadgen', 750.00),
(3, 'Campaign 3', 'Google', 2000.00, 'Views', 1000.00),
(4, 'Campaign 4', 'Meta', 1800.00, 'Engagement', 900.00),
(5, 'Campaign 5', 'Google', 1200.00, 'Awareness', 600.00),
(6, 'Campaign 6', 'Meta', 800.00, 'Leadgen', 400.00),
(7, 'Campaign 7', 'Google', 2500.00, 'Views', 1200.00),
(8, 'Campaign 8', 'Meta', 3000.00, 'Engagement', 1400.00),
(9, 'Campaign 9', 'Google', 5000.00, 'Awareness', 2000.00),
(10, 'Campaign 10', 'Meta', 3500.00, 'Leadgen', 1800.00),
(11, 'Campaign 11', 'Google', 4200.00, 'Engagement', 2100.00),
(12, 'Campaign 12', 'Meta', 800.00, 'Awareness', 400.00),
(13, 'Campaign 13', 'Google', 3000.00, 'Leadgen', 1500.00),
(14, 'Campaign 14', 'Meta', 1500.00, 'Views', 750.00),
(15, 'Campaign 15', 'Google', 1800.00, 'Engagement', 900.00),
(16, 'Campaign 16', 'Google', 900.00, 'Awareness', 400.00),
(17, 'Campaign 17', 'Meta', 2200.00, 'Leadgen', 1100.00),
(18, 'Campaign 18', 'Google', 4000.00, 'Views', 1800.00),
(19, 'Campaign 19', 'Meta', 2600.00, 'Engagement', 1300.00),
(20, 'Campaign 20', 'Google', 1500.00, 'Awareness', 700.00),
(21, 'Campaign 21', 'Google', 2800.00, 'Leadgen', 1200.00),
(22, 'Campaign 22', 'Meta', 3500.00, 'Views', 1700.00),
(23, 'Campaign 23', 'Google', 2300.00, 'Engagement', 900.00),
(24, 'Campaign 24', 'Meta', 1900.00, 'Awareness', 800.00),
(25, 'Campaign 25', 'Google', 3200.00, 'Leadgen', 1400.00),
(26, 'Campaign 26', 'Google', 1800.00, 'Views', 900.00),
(27, 'Campaign 27', 'Meta', 2700.00, 'Engagement', 1200.00),
(28, 'Campaign 28', 'Google', 2000.00, 'Awareness', 1000.00),
(29, 'Campaign 29', 'Meta', 4200.00, 'Leadgen', 1800.00),
(30, 'Campaign 30', 'Google', 1500.00, 'Views', 800.00),
(31, 'Campaign 31', 'Google', 2800.00, 'Engagement', 1500.00),
(32, 'Campaign 32', 'Meta', 2300.00, 'Awareness', 1200.00),
(33, 'Campaign 33', 'Meta', 1900.00, 'Leadgen', 1000.00),
(34, 'Campaign 34', 'Google', 3200.00, 'Views', 1600.00),
(35, 'Campaign 35', 'Google', 1800.00, 'Engagement', 900.00),
(36, 'Campaign 36', 'Google', 2700.00, 'Awareness', 1400.00),
(37, 'Campaign 37', 'Meta', 2100.00, 'Leadgen', 1000.00),
(38, 'Campaign 38', 'Meta', 3100.00, 'Views', 1600.00),
(39, 'Campaign 39', 'Google', 2300.00, 'Engagement', 1200.00),
(40, 'Campaign 40', 'Google', 2000.00, 'Awareness', 800.00),
(41, 'Campaign 41', 'Meta', 4200.00, 'Leadgen', 1800.00),
(42, 'Campaign 42', 'Google', 1500.00, 'Views', 750.00),
(43, 'Campaign 43', 'Google', 2800.00, 'Engagement', 1400.00),
(44, 'Campaign 44', 'Meta', 3200.00, 'Awareness', 1500.00),
(45, 'Campaign 45', 'Meta', 1800.00, 'Leadgen', 900.00),
(46, 'Campaign 46', 'Google', 2700.00, 'Views', 1300.00),
(47, 'Campaign 47', 'Google', 2100.00, 'Engagement', 1000.00),
(48, 'Campaign 48', 'Google', 3100.00, 'Awareness', 1700.00),
(49, 'Campaign 49', 'Meta', 2300.00, 'Leadgen', 1200.00),
(50, 'Campaign 50', 'Meta', 1900.00, 'Views', 900.00),
(51, 'Abhishek', 'Google', 900.00, 'Awareness', 75.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `campaign`
--
ALTER TABLE `campaign`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `campaign`
--
ALTER TABLE `campaign`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
