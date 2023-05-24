-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2023 at 07:55 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vehicle_rental`
--

-- --------------------------------------------------------

--
-- Table structure for table `rental`
--

CREATE TABLE `rental` (
  `id_rental` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_vehicle` varchar(11) NOT NULL,
  `start_rental` datetime NOT NULL,
  `end_rental` datetime NOT NULL,
  `returned_date` datetime DEFAULT NULL,
  `price` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rental`
--

INSERT INTO `rental` (`id_rental`, `id_user`, `id_vehicle`, `start_rental`, `end_rental`, `returned_date`, `price`) VALUES
(1, 3, 'K 6709 BA', '2023-05-21 14:50:02', '2023-05-25 14:50:02', NULL, 1500000),
(3, 3, 'W 2222 WW', '2023-05-24 00:00:00', '2023-05-25 00:00:00', NULL, 200000),
(4, 3, 'Q 1111 QQ', '2023-05-25 00:00:00', '2023-05-26 00:00:00', NULL, 200000),
(5, 18, 'O 0000 OO', '2023-05-18 00:00:00', '2023-05-26 00:00:00', NULL, 200000),
(6, 3, 'T 5555 TT', '2023-05-25 00:00:00', '2023-05-26 00:00:00', NULL, 400000);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `id_transaction` int(11) NOT NULL,
  `id_rental` int(11) NOT NULL,
  `return_date` datetime NOT NULL,
  `price` int(12) NOT NULL,
  `status` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `type`
--

CREATE TABLE `type` (
  `id_type` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `price` int(20) NOT NULL,
  `availability` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `type`
--

INSERT INTO `type` (`id_type`, `name`, `description`, `price`, `availability`) VALUES
(1, 'rHondardsf', 'Mobil ini berwarna hitam. Memiliki 6 kaca jendela, 2 di sebelah kanan, 2 lagi di sebelah kiri, 1 di depan dan 1 di belakang. Mobil ini pendek. Hampir seperti CEDAN, memiliki 3 kursi. 1 : untuk supir / yg menyupir. 2 : untuk penumpang kursi depan. 3 : untuk penumpang kursi belakang. Mobil ini adalah mobil CIVIC', 400000, 3),
(26, 'Vario 13', 'Mobil ini berwarna hitam. Memiliki 6 kaca jendela, 2 di sebelah kanan, 2 lagi di sebelah kiri, 1 di depan dan 1 di belakang. Mobil ini pendek. Hampir seperti CEDAN, memiliki 3 kursi. 1 : untuk supir / yg menyupir. 2 : untuk penumpang kursi depan. 3 : untuk penumpang kursi belakang. Mobil ini adalah mobil CIVIC', 200000, 2),
(27, 'Motor', 'Motor elon', 200000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `name`, `email`, `password`, `phone`, `role`, `created_at`, `updated_at`) VALUES
(2, 'asgard', 'asgard@gmail.com', '123', '082122222222', 'admin', '2023-05-17 15:16:12', '2023-05-17 15:16:12'),
(3, 'Gregorius', '1234', '1234', '1234', 'customer', '2023-05-17 22:39:32', '2023-05-17 22:39:32'),
(4, 'Zuxxy', '12345', '12345', '12345', 'customer', '2023-05-18 00:34:00', '2023-05-18 00:34:00'),
(5, 'rafaellllllssss', 'ra@gmail.com', '00Raden@', '082197597157', 'customer', '2023-05-18 07:39:56', '2023-05-24 11:26:07'),
(6, 'rasdsgsgsd', 'ra@gmail.com', '00Raden@', '082198999929', 'customer', '2023-05-18 07:50:41', '2023-05-24 11:36:21'),
(7, 'rasasaasasas', 'rasa@gmail.com', '00Raden@', '082133333333', 'customer', '2023-05-18 07:51:26', '2023-05-21 20:12:34'),
(10, 'ssss', 's@gmail.com', '00Raden@', '082155555555', 'customer', '2023-05-18 15:04:00', '2023-05-24 11:26:18'),
(11, 'sa', 's@gmail.com', '00Raden@', '082155555555', 'customer', '2023-05-18 15:04:27', '2023-05-18 15:04:27'),
(13, 'Bambang', 'Bambang@gmail.com', '00Raden@', '082100000000', 'customer', '2023-05-18 15:18:30', '2023-05-18 15:18:30'),
(14, 'Dere', 'Dere@gmail.com', '00People@', '082188888888', 'admin', '2023-05-20 23:52:16', '2023-05-20 23:52:16'),
(15, 'ramayana', 'ra@gmail.com', '00Raden@', '082197597157', 'customer', '2023-05-21 00:49:41', '2023-05-21 00:49:41'),
(16, 'Rafael', 's@gmail.com', '00Raden@', '082155555555', 'customer', '2023-05-24 11:26:32', '2023-05-24 11:26:32'),
(17, 'ahmad', 'ra@gmail.com', '00Raden@', '082167248372', 'admin', '2023-05-24 11:37:00', '2023-05-24 11:37:00'),
(18, 'bami', 'bami@gmail.com', '00Bami@@', '082185748392', 'customer', '2023-05-24 11:47:56', '2023-05-24 11:47:56');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `id_vehicle` varchar(11) NOT NULL,
  `categories` varchar(20) NOT NULL,
  `id_type` int(11) NOT NULL,
  `status` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`id_vehicle`, `categories`, `id_type`, `status`) VALUES
('K 6709 BA', 'car', 1, 'busy'),
('K 8888 KK', 'car', 1, 'free'),
('O 0000 OO', 'motorcycle', 27, 'busy'),
('Q 1111 QQ', 'car', 26, 'busy'),
('T 5555 TT', 'car', 1, 'busy'),
('W 2222 WW', 'car', 26, 'busy');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`id_rental`),
  ADD KEY `id_vehicle` (`id_vehicle`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`id_transaction`),
  ADD KEY `id_rental` (`id_rental`);

--
-- Indexes for table `type`
--
ALTER TABLE `type`
  ADD PRIMARY KEY (`id_type`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`id_vehicle`),
  ADD KEY `id_type` (`id_type`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `rental`
--
ALTER TABLE `rental`
  MODIFY `id_rental` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `id_transaction` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `type`
--
ALTER TABLE `type`
  MODIFY `id_type` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rental`
--
ALTER TABLE `rental`
  ADD CONSTRAINT `rental_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`),
  ADD CONSTRAINT `rental_ibfk_2` FOREIGN KEY (`id_vehicle`) REFERENCES `vehicle` (`id_vehicle`);

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`id_rental`) REFERENCES `rental` (`id_rental`);

--
-- Constraints for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD CONSTRAINT `vehicle_ibfk_1` FOREIGN KEY (`id_type`) REFERENCES `type` (`id_type`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
