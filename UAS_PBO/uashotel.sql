-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 05, 2023 at 04:34 AM
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
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `uashotel`
--

CREATE TABLE `uashotel` (
  `kode_kamar` varchar(5) NOT NULL,
  `no_kamar` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jenis_kamar` varchar(255) NOT NULL,
  `harga` int(11) DEFAULT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `uashotel`
--

INSERT INTO `uashotel` (`kode_kamar`, `no_kamar`, `nama`, `jenis_kamar`, `harga`, `tgl_masuk`, `tgl_keluar`) VALUES
('ID001', 1, 'Rehan', 'Normal', 500000, '2023-07-05', '2023-07-06'),
('ID002', 2, 'Joko', 'Deluxe', 3000000, '2023-07-05', '2023-07-08'),
('ID003', 3, 'Adi', 'Suite', 13500000, '2023-07-05', '2023-07-14');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `uashotel`
--
ALTER TABLE `uashotel`
  ADD PRIMARY KEY (`kode_kamar`),
  ADD UNIQUE KEY `no_kamar` (`no_kamar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
