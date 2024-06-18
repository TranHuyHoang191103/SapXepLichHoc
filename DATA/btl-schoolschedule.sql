-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 01, 2024 lúc 04:31 AM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `btl-schoolschedule`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giangvien`
--

CREATE TABLE `giangvien` (
  `MaGiangVien` char(20) NOT NULL,
  `MaKhoa` char(20) DEFAULT NULL,
  `TenGiangVien` varchar(50) DEFAULT NULL,
  `BangCap` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `giangvien`
--

INSERT INTO `giangvien` (`MaGiangVien`, `MaKhoa`, `TenGiangVien`, `BangCap`) VALUES
('CNTT001', '31', 'Trần Huy Hoàng', 'Tiến sĩ'),
('CNTT002', '31', 'Đỗ Xuân Bình', 'Thạc sĩ'),
('CNTT003', '31', 'Lê Thị B', 'Tiến sĩ'),
('CNTT004', '31', 'Phạm Văn C', 'Tiến sĩ'),
('CNTT005', '31', 'Hoàng Thị D', 'Thạc sĩ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hocphan`
--

CREATE TABLE `hocphan` (
  `MaHocPhan` char(20) NOT NULL,
  `MaKhoa` char(20) DEFAULT NULL,
  `TenHocPhan` varchar(50) DEFAULT NULL,
  `TinChi` int(11) DEFAULT NULL,
  `LoaiHocPhan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hocphan`
--

INSERT INTO `hocphan` (`MaHocPhan`, `MaKhoa`, `TenHocPhan`, `TinChi`, `LoaiHocPhan`) VALUES
('HP001', '31', 'Lập trình cơ bản', 4, 1),
('HP002', '31', 'Mạng máy tính', 3, 1),
('HP003', '31', 'Trí tuệ nhân tạo', 4, 0),
('HP004', '31', 'Phát triển phần mềm', 2, 1),
('HP005', '31', 'Hệ quản trị cơ sở dữ liệu', 4, 1),
('HP006', '31', 'Cơ sở dữ liệu', 4, 0),
('HP007', '31', 'An toàn mạng', 3, 0),
('HP008', '31', 'Học máy', 4, 0),
('HP009', '32', 'Phát triển ứng dụng web', 3, 0),
('HP010', '31', 'Hệ điều hành', 4, 0),
('HP011', '32', 'Phân tích thiết kế hệ thống', 3, 0),
('HP012', '32', 'Truyền thông mạng', 2, 0),
('HP013', '32', 'Khoa học dữ liệu', 2, 0),
('HP014', '32', 'Kiến trúc phần mềm', 3, 1),
('HP015', '31', 'Phân tích dữ liệu', 4, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khoa`
--

CREATE TABLE `khoa` (
  `MaKhoa` char(20) NOT NULL,
  `TenKhoa` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `khoa`
--

INSERT INTO `khoa` (`MaKhoa`, `TenKhoa`) VALUES
('31', 'Công nghê thông tin '),
('32', 'Mạng máy tính và truyền thông'),
('33', 'Khoa học máy tính'),
('34', 'Kỹ thuật phần mềm'),
('35', 'Hệ thống thông tin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lich`
--

CREATE TABLE `lich` (
  `MaLich` int(11) NOT NULL,
  `MaLopHocPhan` char(20) DEFAULT NULL,
  `MaPhongHoc` char(20) DEFAULT NULL,
  `ThoiGian` date DEFAULT NULL,
  `TietBatDau` int(11) DEFAULT NULL,
  `TietKetThuc` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `lich`
--

INSERT INTO `lich` (`MaLich`, `MaLopHocPhan`, `MaPhongHoc`, `ThoiGian`, `TietBatDau`, `TietKetThuc`) VALUES
(317, '202431002', 'PH003', '2024-05-13', 8, 10),
(318, '202431001', 'PH001', '2024-05-14', 2, 5),
(319, '202431004', 'PH004', '2024-05-14', 7, 9),
(320, '202431006', 'PH004', '2024-05-15', 3, 4),
(321, '202431003', 'PH007', '2024-05-17', 1, 4),
(322, '202431002', 'PH003', '2024-05-20', 8, 10),
(323, '202431001', 'PH001', '2024-05-21', 2, 5),
(324, '202431004', 'PH004', '2024-05-21', 7, 9),
(325, '202431006', 'PH004', '2024-05-22', 3, 4),
(326, '202431003', 'PH007', '2024-05-24', 1, 4),
(327, '202431002', 'PH003', '2024-05-27', 8, 10),
(328, '202431001', 'PH001', '2024-05-28', 2, 5),
(329, '202431004', 'PH004', '2024-05-28', 7, 9),
(330, '202431006', 'PH004', '2024-05-29', 3, 4),
(331, '202431003', 'PH007', '2024-05-31', 1, 4),
(332, '202431002', 'PH003', '2024-06-03', 8, 10),
(333, '202431001', 'PH001', '2024-06-04', 2, 5),
(334, '202431004', 'PH004', '2024-06-04', 7, 9),
(335, '202431006', 'PH004', '2024-06-05', 3, 4),
(336, '202431003', 'PH007', '2024-06-07', 1, 4),
(337, '202431002', 'PH003', '2024-06-10', 8, 10),
(338, '202431001', 'PH001', '2024-06-11', 2, 5),
(339, '202431004', 'PH004', '2024-06-11', 7, 9),
(340, '202431006', 'PH004', '2024-06-12', 3, 4),
(341, '202431003', 'PH007', '2024-06-14', 1, 4),
(342, '202431002', 'PH003', '2024-06-17', 8, 10),
(343, '202431001', 'PH001', '2024-06-18', 2, 5),
(344, '202431004', 'PH004', '2024-06-18', 7, 9),
(345, '202431006', 'PH004', '2024-06-19', 3, 4),
(346, '202431003', 'PH007', '2024-06-21', 1, 4),
(347, '202431002', 'PH003', '2024-06-24', 8, 10),
(348, '202431001', 'PH001', '2024-06-25', 2, 5),
(349, '202431004', 'PH004', '2024-06-25', 7, 9),
(350, '202431006', 'PH004', '2024-06-26', 3, 4),
(351, '202431003', 'PH007', '2024-06-28', 1, 4),
(352, '202431002', 'PH003', '2024-07-01', 8, 10),
(353, '202431001', 'PH001', '2024-07-02', 2, 5),
(354, '202431004', 'PH004', '2024-07-02', 7, 9),
(355, '202431006', 'PH004', '2024-07-03', 3, 4),
(356, '202431003', 'PH007', '2024-07-05', 1, 4),
(357, '202431002', 'PH003', '2024-07-08', 8, 10),
(358, '202431001', 'PH001', '2024-07-09', 2, 5),
(359, '202431004', 'PH004', '2024-07-09', 7, 9),
(360, '202431006', 'PH004', '2024-07-10', 3, 4),
(361, '202431003', 'PH007', '2024-07-12', 1, 4),
(362, '202431002', 'PH003', '2024-07-15', 8, 10),
(363, '202431001', 'PH001', '2024-07-16', 2, 5),
(364, '202431004', 'PH004', '2024-07-16', 7, 9),
(365, '202431006', 'PH004', '2024-07-17', 3, 4),
(366, '202431003', 'PH007', '2024-07-19', 1, 4),
(367, '202431002', 'PH003', '2024-07-22', 8, 10),
(368, '202431001', 'PH001', '2024-07-23', 2, 5),
(369, '202431004', 'PH004', '2024-07-23', 7, 9),
(370, '202431006', 'PH004', '2024-07-24', 3, 4),
(371, '202431003', 'PH007', '2024-07-26', 1, 4),
(372, '202431002', 'PH003', '2024-07-29', 8, 10),
(373, '202431001', 'PH001', '2024-07-30', 2, 5),
(374, '202431004', 'PH004', '2024-07-30', 7, 9),
(375, '202431006', 'PH004', '2024-07-31', 3, 4),
(376, '202431003', 'PH007', '2024-08-02', 1, 4),
(377, '202431002', 'PH003', '2024-08-05', 8, 10),
(378, '202431001', 'PH001', '2024-08-06', 2, 5),
(379, '202431004', 'PH004', '2024-08-06', 7, 9),
(380, '202431006', 'PH004', '2024-08-07', 3, 4),
(381, '202431003', 'PH007', '2024-08-09', 1, 4),
(382, '202431002', 'PH003', '2024-08-12', 8, 10),
(383, '202431001', 'PH001', '2024-08-13', 2, 5),
(384, '202431004', 'PH004', '2024-08-13', 7, 9),
(385, '202431006', 'PH004', '2024-08-14', 3, 4),
(386, '202431003', 'PH007', '2024-08-16', 1, 4),
(387, '202431002', 'PH003', '2024-08-19', 8, 10),
(388, '202431001', 'PH001', '2024-08-20', 2, 5),
(389, '202431004', 'PH004', '2024-08-20', 7, 9),
(390, '202431006', 'PH004', '2024-08-21', 3, 4),
(391, '202431003', 'PH007', '2024-08-23', 1, 4);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lophocphan`
--

CREATE TABLE `lophocphan` (
  `MaLopHocPhan` char(20) NOT NULL,
  `MaGiangVien` char(20) DEFAULT NULL,
  `MaHocPhan` char(20) DEFAULT NULL,
  `SoHocSinh` int(11) DEFAULT NULL,
  `Nam` int(11) NOT NULL,
  `Ki` int(11) NOT NULL,
  `TenLop` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `lophocphan`
--

INSERT INTO `lophocphan` (`MaLopHocPhan`, `MaGiangVien`, `MaHocPhan`, `SoHocSinh`, `Nam`, `Ki`, `TenLop`) VALUES
('202431001', 'CNTT001', 'HP001', 35, 2024, 1, 'DHTI15A2ND'),
('202431002', 'CNTT002', 'HP002', 37, 2024, 1, 'DHTI15A1ND'),
('202431003', 'CNTT001', 'HP001', 37, 2024, 1, 'DHTI15A1ND'),
('202431004', 'CNTT002', 'HP002', 32, 2024, 1, 'DHTI15A2ND'),
('202431005', 'CNTT001', 'HP003', 35, 2024, 1, 'DHTI15A2ND'),
('202431006', 'CNTT005', 'HP004', 36, 2024, 1, 'DHTI14A1ND');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `monhoc`
--

CREATE TABLE `monhoc` (
  `MaGiangVien` char(20) NOT NULL,
  `MaHocPhan` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `monhoc`
--

INSERT INTO `monhoc` (`MaGiangVien`, `MaHocPhan`) VALUES
('CNTT001', 'HP001'),
('CNTT001', 'HP003'),
('CNTT002', 'HP002'),
('CNTT003', 'HP003'),
('CNTT004', 'HP004'),
('CNTT005', 'HP005');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phongdaotao`
--

CREATE TABLE `phongdaotao` (
  `MaNV` char(20) NOT NULL,
  `hoten` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phongdaotao`
--

INSERT INTO `phongdaotao` (`MaNV`, `hoten`) VALUES
('nv01', 'Đỗ Xuân Bình'),
('nv02', 'đỗ bình 2');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phonghoc`
--

CREATE TABLE `phonghoc` (
  `MaPhongHoc` char(20) NOT NULL,
  `MaKhoa` char(20) DEFAULT NULL,
  `SoCho` int(11) DEFAULT NULL,
  `LoaiPhong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phonghoc`
--

INSERT INTO `phonghoc` (`MaPhongHoc`, `MaKhoa`, `SoCho`, `LoaiPhong`) VALUES
('PH001', '31', 50, 1),
('PH002', '31', 60, 1),
('PH003', '31', 50, 1),
('PH004', '31', 50, 1),
('PH005', '31', 50, 1),
('PH006', '31', 50, 1),
('PH007', '31', 50, 1),
('PH008', '31', 80, 0),
('PH009', '31', 40, 0),
('PH010', '31', 60, 0),
('PH011', '31', 50, 0),
('PH012', '32', 50, 1),
('PH013', '33', 50, 1),
('PH014', '34', 85, 1),
('PH015', '35', 75, 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `giangvien`
--
ALTER TABLE `giangvien`
  ADD PRIMARY KEY (`MaGiangVien`),
  ADD KEY `FK_GiangVien_Khoa` (`MaKhoa`);

--
-- Chỉ mục cho bảng `hocphan`
--
ALTER TABLE `hocphan`
  ADD KEY `FK_HocPhan_Khoa` (`MaKhoa`);

--
-- Chỉ mục cho bảng `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`MaKhoa`);

--
-- Chỉ mục cho bảng `lich`
--
ALTER TABLE `lich`
  ADD PRIMARY KEY (`MaLich`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `lich`
--
ALTER TABLE `lich`
  MODIFY `MaLich` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=392;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
