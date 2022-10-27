--insert data query
-- Guard table 
insert into Guard(GuardID, FullName, Gender, BirthDay, NumberPhone, Email, [Address])
values('G1', 'Duong Tuan Son', 'Male', '1984-3-12', '0963211456', 'G1@fpt.edu.vn', 'Ha Noi'),
('G2', 'Tran Van Nam', 'Male', '1970-06-05', '0963211123', 'G2@fpt.edu.vn', 'Bac Ninh'),
('G3', 'Tran Phu', 'Male', '1984-03-28', '0963211405', 'G3@fpt.edu.vn', 'Ha Noi'),
('G4', 'Le Quang Minh', 'Male', '1980-12-04', '0963217045', 'G4@fpt.edu.vn', 'Ninh Binh'),
('G5', 'Tran Thi Tam', 'Female', '1980-01-25', '0965261476', 'G5@fpt.edu.vn', 'Ha Noi'),
('G6', 'Hoang Bich Ngoc', 'Female', '1975-06-11', '0961251450', 'G6@fpt.edu.vn', 'Ha Noi'),
('G7', 'Le Long', 'Male', '1977-11-20', '0961284466', 'G7@fpt.edu.vn', 'Ha Noi'),
('G8', 'Ly Anh Tuan', 'Male', '1987-01-17', '0963417496', 'G8@fpt.edu.vn', 'Ha Noi')

-- Item table - Ao
insert into Item(ItemID, Name, Price)
values('Bed01', 'Bed', 1990000),
('TB1', 'Table', 700000),
('Ch1', 'Chair', 250000),
('LG1', 'Light', 30000),
('W1', 'Wifi', 300000)
-- Room
insert into Room(RoomID, [Floor], [Kind of room], Price, Gender)
values ('A101L', '1', '6', 2800000, 'Male'),
('A102L', '1', '6', 2800000, 'Male'),
('A103L', '1', '6', 2800000, 'Female'),
('B103R', '1', '6', 2800000, 'Male'),
('C101L', '1', '4', 3400000, 'Male'),
('C201L', '2', '4', 3400000, 'Female'),
('D101L', '1', '4', 3400000, 'Male'),
('D111L', '1', '3', 3800000, 'Male')

--Penalize
insert into Penalize(PenalizeID, Name, Price)
values ('P1', 'Nau an trong phong', 500000),
('P2', 'Khong do rac', 500000),
('P3', 'Khong don ve sinh', 500000),
('P4', 'Khong khoa cua', 500000),
('P5', 'Nuoi dong vat trong phong', 1000000)

-- Student
insert into Student(StudentID, FullName, Birthday, Gender, NumberPhone, Email, [Address])
values('HE161', 'Giang Seo Ao', '2002-12-02', 'Male', '0961973785', 'aogshe161@fpt.edu.vn', 'Lao Cai'),
('HE162', 'Vu Dao Ngoc Hai', '2002-11-15', 'Male', '0961973999', 'haivdnhe162@fpt.edu.vn', 'Hung Yen'),
('HE163', 'Nguyen Dinh Thanh Quang', '2002-01-02', 'Male', '0961978888', 'Quangndthe163@fpt.edu.vn', 'Nam Dinh'),
('HE164', 'Tran Hoang', '2001-07-01', 'Male', '0878283238', 'Hoangthe164@fpt.edu.vn', 'Ha Noi'),
('HE165', 'Le Thanh', '2003-12-07', 'Male', '0961976666', 'thanhlhe165@fpt.edu.vn', 'Lang Son'),
('HS166', 'Nguyen Thi An', '2002-02-13', 'Female', '0961234567', 'annths166@fpt.edu.vn', 'Nghe An'),
('HS167', 'Dao Thu Hang', '2002-09-02', 'Female', '0341236324', 'hangdths163187@fpt.edu.vn', 'Bac Kan'),
('IA161', 'Dang Van Nam', '2002-10-20', 'Male', '0961532876', 'tamdvAi163187@fpt.edu.vn', 'Hoa Binh')


-- Item manager 
insert into [Item Manager](ItemID, RoomID, Quantity, [Status], Repairer, [Repair date], [Import date])
values ('Bed01', 'A101L', 4, 'Normal', 'Engine A', '2022-01-15', '2017-06-30'),
('TB1','A103L', 4, 'Normal', 'Engine A', '2022-01-15', '2017-06-30'),
('Ch1', 'B103R', 4, 'Normal', 'Engine A', '2022-01-15', '2017-06-30'),
('LG1', 'C201L', 3, 'Broken', 'Engine A', '2022-01-15', '2017-06-30'),
('W1', 'D111L', 4, 'Normal', 'Engine A', '2022-01-15', '2017-06-30')

--Invoice
insert into Invoice(StudentID, RoomID, PenalizeID, Price)
values('HE165', 'A102L', 'P1', 3300000),
('HS166', 'A103L', 'P1', 3300000),
('IA161', 'C101L', 'P5', 4400000)
--Handing violations
insert into [Handing violations](StudentID, PenalizeID, Quantity, [Date])
values  ('HE165', 'P1', 1, '2021-06-02'),
('HS166', 'P1', 1, '2021-09-02'),
('IA161', 'P5', 1, '2021-05-12')

-- check in
insert into CheckIn(StudentID,RoomID,[Detail info],[Date], [Status])
values ('HE161', 'A102L','1','2022-09-17', 'Not Full'),
('HE163','A102L' ,'2', '2022-09-18', 'Not Full'),
('HE165', 'C101L', '4','2021-09-17', 'Full')

-- check out
insert into CheckOut(StudentID,RoomID,[Detail info],[Date], [Status])
values ('HS166', 'A102L','2','2022-09-17', 'Not Full'),
('HS167','A102L' ,'4', '2022-09-18', 'Not Full'),
('IA161', 'C101L', '3','2022-09-17', 'Not Full')

insert into Dom([Name Dom], GuardID, RoomID)
values ('A', 'G1', 'A101L'),
('A', 'G1', 'A102L'),
('A', 'G5', 'A103L'),
('B', 'G2', 'B103R'),
('C', 'G3', 'C101L'),
('C', 'G4', 'C201L'),
('D', 'G6', 'D101L'),
('D', 'G6', 'D111L')