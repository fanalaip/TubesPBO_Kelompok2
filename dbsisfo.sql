-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2022 at 05:51 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbsisfo`
--

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `nama_guru` varchar(65) NOT NULL,
  `kode_guru` char(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`nama_guru`, `kode_guru`) VALUES
('Asep Muhammad', 'AMD'),
('Dimas Pangestu', 'DPU'),
('Durga Silvaraj', 'DSJ'),
('Dedeh Siti Khadijah', 'DSK'),
('Fransiskus Vianey', 'FVY'),
('Hildegard Iban', 'HIN'),
('Lim A Sui', 'LIM'),
('Lee Kong Chew', 'LKC'),
('Made Adi Wijaua', 'MAW'),
('Rosa Juliet Long', 'RJL'),
('Wawan Budiman', 'WBN'),
('Yakub Pardamean Sihite', 'YPS');

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `nama_kelas` char(3) NOT NULL,
  `kode_guru` char(3) NOT NULL,
  `nis` varchar(50) NOT NULL,
  `nama_siswa` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`nama_kelas`, `kode_guru`, `nis`, `nama_siswa`) VALUES
('7G', 'DSK', '10987', 'meimei'),
('7A', 'DPU', '12345', 'Khrisna Raj'),
('7A', 'DPU', '12346', 'Mei Chan'),
('7G', 'DSK', '12347', 'Azizah Long'),
('7G', 'DSK', '12348', 'Aiman Putera'),
('8A', 'MAW', '12349', 'Maria Theraviam'),
('8A', 'MAW', '12350', 'Lim Hong Chew'),
('8K', 'WBN', '12356', 'Goretti Vincensia'),
('7A', 'DPU', '1301194182', 'Manuel Benedict'),
('7A', 'DPU', '1301194183', 'Sabrina Adinda'),
('7G', 'DSK', '1301194282', 'Naufal Yozha'),
('8A', 'MAW', '1301194283', 'Igga Febrian Virgiani'),
('8K', 'WBN', '14567', 'Mail'),
('8K', 'WBN', '181920', 'Ehsan');

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `nis` varchar(50) NOT NULL,
  `mapel` char(40) NOT NULL,
  `activity` char(30) NOT NULL,
  `nilai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`nis`, `mapel`, `activity`, `nilai`) VALUES
('1301194283', 'PKN', 'Tugas', 90),
('1301194283', 'IPA', 'UTS', 85),
('1301194283', 'IPS', 'UAS', 89),
('12356', 'IPA', 'Tugas', 78),
('12346', 'PKN', 'UTS', 86),
('12348', 'IPS', 'Tugas', 78),
('10987', 'PKN', 'UTS', 98);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `enroll` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `enroll`) VALUES
('admin', 'iniAdmin', 'Admin'),
('guru', 'iniGuru', 'Guru'),
('rkive', 'iniRM', 'Siswa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`kode_guru`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`nis`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
