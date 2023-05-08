CREATE DATABASE qlth;
USE qlth;

CREATE TABLE `SINH VIEN` (
  `Ma_Sinh_Vien` varchar(20),
  `Ten` varchar(20),
  `So_Dien_Thoai` varchar(20),
  `Dia_Chi` varchar(20),
  PRIMARY KEY (`Ma_Sinh_Vien`)
);

CREATE TABLE `GIAO VIEN` (
  `Ma_Giao_Vien` varchar(20),
  `Ten` varchar(20),
  `So_Dien_Thoai` varchar(20),
  `Dia_Chi` varchar(20),
  PRIMARY KEY (`Ma_Giao_Vien`)
);

CREATE TABLE `SACH` (
  `Ma_Sach` varchar(20),
  `Ten` varchar(20),
  `Tac_Gia` varchar(20),
  `Gia` int,
  PRIMARY KEY (`Ma_Sach`)
);

CREATE TABLE `SV MUON SACH` (
   `Ma_Sinh_Vien` varchar(20),
   `Ma_Sach` varchar(20),
   `Ngay_Muon` varchar(20),
   `Ngay_Tra` varchar(20),
    CONSTRAINT `FK_SV MUON SACH.Ma_Sinh_Vien`
    FOREIGN KEY (`Ma_Sinh_Vien`)
      REFERENCES `SINH VIEN`(`Ma_Sinh_Vien`),
	CONSTRAINT `FK_SV MUON SACH.Ma_Sach`
    FOREIGN KEY (`Ma_Sach`)
      REFERENCES `SACH`(`Ma_Sach`)
);

CREATE TABLE `GV MUON SACH` (
   `Ma_Giao_Vien` varchar(20),
   `Ma_Sach` varchar(20),
   `Ngay_Muon` varchar(20),
   `Ngay_Tra` varchar(20),
    CONSTRAINT `FK_GV MUON SACH.Ma_Giao_Vien`
    FOREIGN KEY (`Ma_Giao_Vien`)
      REFERENCES `GIAO VIEN`(`Ma_Giao_Vien`),
	CONSTRAINT `FK_GV MUON SACH.Ma_Sach`
    FOREIGN KEY (`Ma_Sach`)
      REFERENCES `SACH`(`Ma_Sach`)
);
CREATE TABLE `BANG DIEM` (
  `Id` int,
  `Ma_Sinh_Vien` varchar(20),
  `OOP` decimal(3,2),
  `CNPM` decimal(3,2),
  `C++` decimal(3,2),
  `KTVXL` decimal(3,2),
  `DTB` decimal(3,2),
  PRIMARY KEY (`Id`),
  CONSTRAINT `FK_BANG DIEM.Ma_Sinh_Vien`
    FOREIGN KEY (`Ma_Sinh_Vien`)
      REFERENCES `SINH VIEN`(`Ma_Sinh_Vien`)
);

CREATE TABLE `user_login` (
  `Id` int,
  `Username` varchar(20),
  `Password` varchar(20),
  PRIMARY KEY (`Id`)
) ;

INSERT INTO `user_login` (`Id`, `Username`, `Password`) VALUES
(1, 'admin', 'admin');

-- them du lieu sinh vien
INSERT INTO `SINH VIEN` VALUES
('B19DCVT179', 'Nguyễn Văn Huy', '0864235124', 'Hà Nội'),
('B19DCVT264', 'Mai Hoài Nam', '0868093067', 'Nghệ An'),
('B19DCVT286', 'Trần Xuân Phú', '0865345213', 'Hà Nội'),
('B19DCVT331', 'Nguyễn Trọng Toàn', '0867057221', 'Nghệ An');

-- them du lieu bang diem
INSERT INTO `BANG DIEM` VALUES
(1, 'B19DCVT179', 8.00, 9.00, 8.00, 7.00, 8.00),
(2, 'B19DCVT264', 8.00, 7.00, 9.00, 7.00, 7.75),
(3, 'B19DCVT286', 8.00, 6.00, 9.00, 9.00, 8.00),
(4, 'B19DCVT331', 8.00, 9.00, 8.00, 9.00, 8.50);

-- them du lieu teacher
INSERT INTO `GIAO VIEN` VALUES
('t123', 'Nguyễn Văn Hùng', '0867083212', 'Hà Nội'),
('t456', 'Nguyễn Thị Lan', '0864573124', 'Hà Nội'),
('t789', 'Trần Văn Phú', '0867584124', 'Hà Nội');

-- them du lieu sach
INSERT INTO `SACH` VALUES
('s123', 'OOP', 'Nguyễn Mạnh Sơn', 50000),
('s456', 'Công Nghệ Phần Mềm', 'Nguyễn Văn Hùng', 60000),
('s789', 'C++ cơ bản', 'Nguyễn Văn Trí', 70000);

-- them du lieu sinh vien muon sach
INSERT INTO `SV MUON SACH` VALUES
('B19DCVT331', 's123', '8/5/2023', '10/5/2023'),
('B19DCVT264', 's789', '8/5/2023', '9/5/2023'),
('B19DCVT179', 's456', '8/5/2023', '12/5/2023');

-- them du lieu giao vien muon sach
INSERT INTO `GV MUON SACH` VALUES
('t123', 's456', '5/8/2023', '10/8/2023'),
('t456', 's123', '5/8/2023', '11/8/2023');
