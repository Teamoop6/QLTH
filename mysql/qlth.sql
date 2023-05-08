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
   `Ngay_Muon` datetime,
   `Ngay_Tra` dateTime,
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
   `Ngay_Muon` datetime,
   `Ngay_Tra` dateTime,
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