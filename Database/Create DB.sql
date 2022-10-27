--drop database Dormitory
create database Dormitory

go
create table [dbo].[Room](
	[RoomID] nvarchar(10) primary key,
	[Floor] nvarchar(10) not null,
	[Kind of room] nvarchar(10) not null,
	[Price] int not null,
	[Gender] nvarchar(10) not null
	)

go 
create table [dbo].[Student](
	[StudentID] nvarchar(8) not null primary key,
	[FullName] nvarchar(50) not null,
	[Gender] nvarchar(10) not null,
	[NumberPhone] CHAR(10) not null,
	[Email] nvarchar(255) not null,
	[Birthday] date not null,
	)

--go
--create table [dbo].[Dom](
--	[Name Dom] CHAR(1) CHECK([Name Dom] LIKE '[A-D]'),
--	[GuardID] nvarchar(10) foreign key references Guard(GuardID),
--	[RoomID] nvarchar(10) foreign key references Room(RoomID),
--	[Number People] int,
--	primary key (GuardID, RoomID)
--	)

go
create table [dbo].[CheckIn](
	[RoomID] nvarchar(10) foreign key references Room(RoomID),
	[StudentID] nvarchar(8) foreign key references Student(StudentID),
	[Detail info] nvarchar(1000) not null,
	[Date] date,
	[Status] nvarchar(10) not null,
	primary key (RoomID, StudentID)
	)

go
create table [dbo].[CheckOut](
	[RoomID] nvarchar(10) foreign key references Room(RoomID),
	[StudentID] nvarchar(8) foreign key references Student(StudentID),
	[Detail info] nvarchar(1000) not null,
	[Date] date,
	[Status] nvarchar(10) not null,
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
