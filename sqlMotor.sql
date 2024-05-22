-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2024 at 10:34 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `motor`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblclient`
--

CREATE TABLE `tblclient` (
  `id` int(11) NOT NULL,
  `phoneNumber` varchar(10) NOT NULL,
  `address` varchar(250) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `citizenId` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `note` varchar(250) DEFAULT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblclient`
--

INSERT INTO `tblclient` (`id`, `phoneNumber`, `address`, `mail`, `citizenId`, `gender`, `note`, `name`) VALUES
(1, '012345678', 'Mo Lao-Ha Dong', 'abc@gmail.com', 'ABC123', 'nam', 'Dep trai', 'Tran Van A'),
(2, '123456789', 'Van Quan', 'example@mail.com', 'ABC123', 'Male', 'This is a note', 'Nguyen Van C'),
(3, '987654321', 'Trung Hoa', 'example2@mail.com', 'DEF456', 'Female', 'Another note', 'Le Thi Y'),
(4, '555666777', '789 Road, Village', 'example3@mail.com', 'GHI789', 'Other', 'Yet another note', 'Trinh Van D'),
(5, '0358745830', 'phuc la - Ha dong', 'xyz1@gmail.com', 'txkgh4567', 'nam', '', 'Bui Van X'),
(6, '0977112537', 'Hai Duong', 'bui huu quyet203@gmail.com', '0123789cb', 'Male', 'no content', 'Bui Huu Quyet'),
(7, '1234567890', '123 Main St', 'client1@mail.com', '123456789', 'Male', 'Note 1', 'Duong Van Du'),
(8, '2345678901', '234 Main St', 'client2@mail.com', '234567890', 'Female', 'Note 2', 'Tran Trung Hieu'),
(9, '3456789012', '345 Main St', 'client3@mail.com', '345678901', 'Male', 'Note 3', 'Pham The Anh'),
(10, '4567890123', '456 Main St', 'client4@mail.com', '456789012', 'Female', 'Note 4', 'Nguyen Van An'),
(11, '5678901234', '567 Main St', 'client5@mail.com', '567890123', 'Male', 'Note 5', 'Duong Hoang An'),
(12, '123456789', 'Hai Duong', 'abcd@gmail.com', 'ashfkdj1234', 'Nam', '123456678', 'Nguyen Viet Van'),
(13, '123456789', 'arap', 'a7@gmail.com', '899768', 'Nam', 'goal', 'CR7'),
(14, '0358745830', 'hai duong', 'abcd@gmail.com', '12345678', 'Nam', 'd21cntt', 'dep trai');

-- --------------------------------------------------------

--
-- Table structure for table `tblcollateral`
--

CREATE TABLE `tblcollateral` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `price` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblcollateral`
--

INSERT INTO `tblcollateral` (`id`, `name`, `price`) VALUES
(1, 'Iphone 14', 16000000.00),
(2, 'Nu trang', 99999999.99),
(3, 'Iphone 14 pro max', 12000000.00),
(4, 'deo co', 0.00),
(5, 'dsas', 0.00),
(6, 'iphone 15 hehe', 12000000.00);

-- --------------------------------------------------------

--
-- Table structure for table `tblcontract`
--

CREATE TABLE `tblcontract` (
  `id` int(11) NOT NULL,
  `note` varchar(250) DEFAULT NULL,
  `rentalDay` date NOT NULL,
  `paymentTye` varchar(50) NOT NULL,
  `tblClientId` int(11) DEFAULT NULL,
  `tblUserId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblcontract`
--

INSERT INTO `tblcontract` (`id`, `note`, `rentalDay`, `paymentTye`, `tblClientId`, `tblUserId`) VALUES
(3, 'hop dong dai han', '2024-05-11', 'tien mat', 1, 1),
(4, 'hop dong dai han', '2024-05-11', 'chuyen khoan', 2, 1),
(5, 'Hop dong trong ngay', '2024-05-10', 'tien mat', 1, 1),
(6, 'Hop dong dai han', '2024-05-10', 'tien mat', 5, 1),
(10, 'dser', '2024-05-21', 'Chuyển khoản', 1, 1),
(11, 'Can giữ gìn cẩn thận', '2024-05-21', 'Tiền mặt', 9, 1),
(12, 'cứ phá xe đi', '2024-05-21', 'Tiền mặt', 9, 1),
(13, 'Ngu si', '2024-05-21', 'Tiền mặt', 9, 1),
(14, 'ptit', '2024-05-22', 'Tiền mặt', 9, 1),
(15, 'fe', '2024-05-22', 'Chuyển khoản', 9, 1),
(16, 'hoc vien ptit', '2024-05-22', 'Tiền mặt', 9, 1),
(17, 'hoc vien ptit', '2024-05-22', 'Tiền mặt', 9, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbldetailassets`
--

CREATE TABLE `tbldetailassets` (
  `id` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `tblCollateralId` int(11) DEFAULT NULL,
  `tblContractId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbldetailassets`
--

INSERT INTO `tbldetailassets` (`id`, `amount`, `description`, `tblCollateralId`, `tblContractId`) VALUES
(1, 1, 'co gia tri', 2, 3),
(2, 1, 'tai san co gia tri', 2, 5),
(3, 1, 'do co gia tri cao', 1, 6),
(4, 0, 'sjfkdhfd', 5, 15),
(5, 1, 'deo co hee', 6, 17);

-- --------------------------------------------------------

--
-- Table structure for table `tblmotor`
--

CREATE TABLE `tblmotor` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `manufacture` varchar(50) NOT NULL,
  `launchYear` int(11) NOT NULL CHECK (`launchYear` > 2015),
  `licensePlate` varchar(10) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `storeId` int(11) DEFAULT NULL,
  `partner` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblmotor`
--

INSERT INTO `tblmotor` (`id`, `name`, `manufacture`, `launchYear`, `licensePlate`, `price`, `storeId`, `partner`) VALUES
(1, 'Exciter 155', 'Yamaha', 2020, '29A1-12345', 45000000.00, 1, 1),
(2, 'Winner X', 'Honda', 2022, '29B2-54321', 55000000.00, 2, 0),
(3, 'RSX Fi', 'Suzuki', 2019, '29C3-98765', 48000000.00, 3, 1),
(4, 'Raider', 'SYM', 2021, '29D4-24680', 42000000.00, 4, 0),
(5, 'Z1000', 'Kawasaki', 2023, '29E5-13579', 85000000.00, 5, 1),
(6, 'Ninja 300', 'Kawasaki', 2020, '29F6-97531', 60000000.00, 1, 0),
(7, 'CBR500R', 'Honda', 2021, '29G7-86420', 58000000.00, 1, 1),
(8, 'PCX', 'Honda', 2019, '29H8-75319', 40000000.00, 1, 0),
(9, 'Liberty', 'SYM', 2022, '29I9-64258', 35000000.00, 1, 1),
(10, 'Vision', 'Honda', 2023, '29J0-53147', 32000000.00, 1, 0),
(11, 'Wave Alpha', 'Honda', 2020, '29K1-23456', 25000000.00, 1, 1),
(12, 'Sirius', 'Yamaha', 2021, '29L2-34567', 28000000.00, 1, 0),
(13, 'Dream', 'Honda', 2019, '29M3-45678', 30000000.00, 1, 1),
(14, 'Air Blade', 'Honda', 2023, '29N4-56789', 35000000.00, 1, 0),
(15, 'Exciter 135', 'Yamaha', 2018, '29O5-67890', 40000000.00, 1, 1),
(16, 'Vario', 'Honda', 2022, '29P6-78901', 32000000.00, 1, 0),
(17, 'Future', 'Honda', 2020, '29Q7-89012', 28000000.00, 1, 1),
(18, 'Winner 150', 'Honda', 2017, '29R8-90123', 37000000.00, 1, 0),
(19, 'Jupiter', 'Yamaha', 2021, '29S9-01234', 30000000.00, 1, 1),
(20, 'Wave RSX', 'Honda', 2018, '29T0-98765', 26000000.00, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tblrentaldetail`
--

CREATE TABLE `tblrentaldetail` (
  `id` int(11) NOT NULL,
  `numberOfMotor` int(11) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `tblMotorId` int(11) DEFAULT NULL,
  `tblContractId` int(11) DEFAULT NULL,
  `desDamages` varchar(250) DEFAULT NULL,
  `numberOfDamages` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblrentaldetail`
--

INSERT INTO `tblrentaldetail` (`id`, `numberOfMotor`, `price`, `startDate`, `endDate`, `tblMotorId`, `tblContractId`, `desDamages`, `numberOfDamages`) VALUES
(3, 1, 50000.00, '2024-05-09', '2024-05-11', 1, 3, 'khong co', 0),
(4, 1, 60000.00, '2024-05-09', '2024-05-12', 2, 3, 'khong co', 0),
(5, 1, 50000.00, '2024-05-10', '0000-00-00', 1, 5, 'khong co', 0),
(6, 1, 50000.00, '2024-05-10', '2024-05-12', 1, 6, 'khong co', 0),
(9, 1, 40000000.00, '2024-05-24', '2024-05-24', 8, 10, 'sdferew', 1),
(10, 1, 32000000.00, '2024-05-23', '2024-05-24', 16, 11, 'hỏng gương, hỏng phanh', 1),
(11, 1, 55000000.00, '2024-05-24', '2024-05-29', 2, 12, 'rac ruoi', 1),
(12, 1, 32000000.00, '2024-05-23', '2024-05-23', 10, 13, 'dan don', 1),
(13, 1, 32000000.00, '2024-05-24', '2024-05-24', 10, 14, 'khong', 1),
(14, 1, 37000000.00, '2024-05-17', '2024-05-24', 18, 15, 'ko', 1),
(15, 1, 26000000.00, '2024-05-24', '2024-05-25', 20, 16, 'khong co khong thac mac', 1),
(16, 1, 28000000.00, '2024-05-23', '2024-05-31', 12, 17, 'khong co hehe', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tblstore`
--

CREATE TABLE `tblstore` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(250) NOT NULL,
  `phoneNum` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblstore`
--

INSERT INTO `tblstore` (`id`, `name`, `address`, `phoneNum`) VALUES
(1, 'Cửa hàng A', '123 Đường ABC, Quận 1, Thành phố Hồ Chí Minh', '0123456789'),
(2, 'Cửa hàng B', '456 Đường XYZ, Quận 2, Thành phố Hà Nội', '0987654321'),
(3, 'Cửa hàng C', '789 Đường MNO, Quận 3, Thành phố Đà Nẵng', '0369876543'),
(4, 'Cửa hàng D', '101 Đường PQR, Quận 4, Thành phố Hải Phòng', '0543216789'),
(5, 'Cửa hàng E', '222 Đường DEF, Quận 5, Thành phố Cần Thơ', '0321654987');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `id` int(11) NOT NULL,
  `fullName` varchar(50) NOT NULL,
  `position` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`id`, `fullName`, `position`, `username`, `password`) VALUES
(1, 'Nguyễn Văn A', 'Quản lý', 'nguyenvana', 'password1'),
(2, 'Trần Thị B', 'Nhân viên', 'tranthib', 'password2'),
(3, 'Lê Văn C', 'Nhân viên', 'levanc', 'password3'),
(4, 'Phạm Thị D', 'Nhân viên', 'phamthid', 'password4'),
(5, 'Hoàng Văn E', 'Nhân viên', 'hoangvane', 'password5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblclient`
--
ALTER TABLE `tblclient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblcollateral`
--
ALTER TABLE `tblcollateral`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblcontract`
--
ALTER TABLE `tblcontract`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tblClientId` (`tblClientId`),
  ADD KEY `tblUserId` (`tblUserId`);

--
-- Indexes for table `tbldetailassets`
--
ALTER TABLE `tbldetailassets`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tblCollateralId` (`tblCollateralId`),
  ADD KEY `tblContractId` (`tblContractId`);

--
-- Indexes for table `tblmotor`
--
ALTER TABLE `tblmotor`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `licensePlate` (`licensePlate`),
  ADD KEY `storeId` (`storeId`);

--
-- Indexes for table `tblrentaldetail`
--
ALTER TABLE `tblrentaldetail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tblMotorId` (`tblMotorId`),
  ADD KEY `tblContractId` (`tblContractId`);

--
-- Indexes for table `tblstore`
--
ALTER TABLE `tblstore`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblclient`
--
ALTER TABLE `tblclient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tblcollateral`
--
ALTER TABLE `tblcollateral`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tblcontract`
--
ALTER TABLE `tblcontract`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `tbldetailassets`
--
ALTER TABLE `tbldetailassets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tblmotor`
--
ALTER TABLE `tblmotor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `tblrentaldetail`
--
ALTER TABLE `tblrentaldetail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `tblstore`
--
ALTER TABLE `tblstore`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbluser`
--
ALTER TABLE `tbluser`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tblcontract`
--
ALTER TABLE `tblcontract`
  ADD CONSTRAINT `tblcontract_ibfk_1` FOREIGN KEY (`tblClientId`) REFERENCES `tblclient` (`id`),
  ADD CONSTRAINT `tblcontract_ibfk_2` FOREIGN KEY (`tblUserId`) REFERENCES `tbluser` (`id`);

--
-- Constraints for table `tbldetailassets`
--
ALTER TABLE `tbldetailassets`
  ADD CONSTRAINT `tbldetailassets_ibfk_1` FOREIGN KEY (`tblCollateralId`) REFERENCES `tblcollateral` (`id`),
  ADD CONSTRAINT `tbldetailassets_ibfk_2` FOREIGN KEY (`tblContractId`) REFERENCES `tblcontract` (`id`);

--
-- Constraints for table `tblmotor`
--
ALTER TABLE `tblmotor`
  ADD CONSTRAINT `tblmotor_ibfk_1` FOREIGN KEY (`storeId`) REFERENCES `tblstore` (`id`);

--
-- Constraints for table `tblrentaldetail`
--
ALTER TABLE `tblrentaldetail`
  ADD CONSTRAINT `tblrentaldetail_ibfk_1` FOREIGN KEY (`tblMotorId`) REFERENCES `tblmotor` (`id`),
  ADD CONSTRAINT `tblrentaldetail_ibfk_2` FOREIGN KEY (`tblContractId`) REFERENCES `tblcontract` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
