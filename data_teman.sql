-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2025 at 06:13 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `buku_alamat`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_teman`
--

CREATE TABLE `data_teman` (
  `id_tmn` int(11) NOT NULL,
  `nm_tmn` varchar(50) NOT NULL,
  `almt_tmn` varchar(255) NOT NULL,
  `tlpn_tmn` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_teman`
--

INSERT INTO `data_teman` (`id_tmn`, `nm_tmn`, `almt_tmn`, `tlpn_tmn`) VALUES
(1, 'sang pangeran', 'masih di rumah orang tua', '0987348293874'),
(2, 'pengawal', 'di samping rumah pangeran', '09378458743975');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_teman`
--
ALTER TABLE `data_teman`
  ADD PRIMARY KEY (`id_tmn`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_teman`
--
ALTER TABLE `data_teman`
  MODIFY `id_tmn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
