--drop database Dormitory
create database [Dormitory]

use [Dormitory]

  insert into [StudentAccount] values('hai1', '123', 'HE16013'),('hai2', '123', 'HE16011'),('ha3', '123', 'HE16022')
  insert into [AdminAccount] values('admin1', '123', '111'),('admin2', '123', '222'),('admin3', '123', '333')

  insert into [Student] values ('HE16013', 'Le Dinh Tuan', '1', '0961973123', 'A@fpt.edu.vn', '2002-05-25','HE16013.jpg'),
  ('HE16011', 'Giang Seo Ao', '0', '0961973456', 'B@fpt.edu.vn', '2003-11-22','HE16011.jpg') ,
  ('HE16022', 'Vu Van C', '1', '0961973789', 'C16022@fpt.edu.vn', '2001-01-05','') 

  insert into [Admin] values ('111', 'Vu Dao Ngoc Hai', '1', '0961123123', 'haivdnhe160490@fpt.edu.vn', '2002-10-25','111.jpg'),
  ('222', 'Vu Van E', '0', '0961123456', 'B@fpt.edu.vn', '2003-11-22','') ,
  ('333', 'Vu Van F', '1', '0961123789', 'C16022@fpt.edu.vn', '2001-01-05','') 
go 
create table [dbo].[Student](
[StudentID] nvarchar(8) not null primary key,
[FullName] nvarchar(50) not null,
[Gender] nvarchar(10) not null,
[NumberPhone] CHAR(10) not null,
[Email] nvarchar(255) not null,
[Birthday] date not null,
[Img] nvarchar(255)
)

go 
create table [dbo].[Admin](
[AdminID] nvarchar(8) not null primary key,
[FullName] nvarchar(50) not null,
[Gender] nvarchar(10) not null,
[NumberPhone] CHAR(10) not null,
[Email] nvarchar(255) not null,
[Birthday] date not null,
[Img] nvarchar(255)
)
go 
create table [dbo].[AdminAccount](
[Acc] nvarchar(50) not null primary key,
[Pass] nvarchar(50) not null,
[ID] nvarchar(8) foreign key references [Admin]([AdminID]),
)


go 
create table [dbo].[StudentAccount](
[Acc] nvarchar(50) not null primary key,
[Pass] nvarchar(50) not null,
[ID] nvarchar(8) foreign key references Student(StudentID),
)

go
create table [dbo].[Room](
[RoomID] nvarchar(10) primary key,
[Floor] nvarchar(10) not null,
[Kind of room] nvarchar(10) not null,
[Price] int not null,
[Gender] nvarchar(10) not null,
[Status] nvarchar(10) not null
)

go
create table [dbo].[CheckIn](
[RoomID] nvarchar(10) foreign key references Room(RoomID),
[StudentID] nvarchar(8) foreign key references Student(StudentID),
[Detail info] nvarchar(1000) not null,
[Date] date,
primary key (RoomID, StudentID)
)

go
create table [dbo].[CheckOut](
[RoomID] nvarchar(10) foreign key references Room(RoomID),
[StudentID] nvarchar(8) foreign key references Student(StudentID),
[Detail info] nvarchar(1000) not null,
[Date] date,
primary key (RoomID, StudentID)
)

go
create table [dbo].[Invoice](
[StudentID] nvarchar(8) foreign key references Student(StudentID),
[RoomID] nvarchar(10) foreign key references Room(RoomID),
[Price] int not null,
[Date created] date not null,
[Status] int not null,
[Total bill amount] float not null,
[Total amount paid] float,
[Total remaining money] float not null,
primary key (StudentID, RoomId)
)

go
create table [dbo].[BedUsages](
[RoomID] nvarchar(10) foreign key references Room(RoomID),
[StudentID] nvarchar(8) foreign key references Student(StudentID),
[Date] date not null,
[ElectricMeter] int not null,
[Block Actual Usage] int not null,
[Block Over Usage] float,
[Your usage] float not null,
[Your over usage] float,
primary key (RoomID,StudentID)
)
