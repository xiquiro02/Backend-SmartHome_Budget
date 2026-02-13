create database SmartHome_BudgetBD;
use SmartHome_BudgetBD;
show databases;

create table Roles (
IDRol int not null,
NombreRol varchar(100) not null,
primary key (IDRol));

INSERT INTO roles (IDRol, NombreRol)
VALUES
(1, 'Usuario'),
(2, 'Administrador');

create table PermisosRoles (
IDPermiso int not null,
NombrePermiso varchar(100) not null,
Modulo varchar(100) not null,
primary key (IDPermiso));

create table DetallesPermisos (
IDDetallesPermiso int not null,
IDRol int not null,
IDPermiso int not null,
primary key (IDDetallesPermiso),
foreign key (IDRol) references Roles(IDRol),
foreign key (IDPermiso) references PermisosRoles(IDPermiso));

create table Usuario (
IDUsuario int auto_increment not null,
NombreUsuario varchar(100) not null,
IDRol int not null,
PrimerApellido varchar(100) not null,
SegundoApellido varchar(100),
correo varchar(100) not null,
telefono bigint not null,
ContrasenaUsuario varchar(100) not null,
FechaRegistro datetime,
primary key (IDUsuario),
foreign key (IDRol) references Roles(IDRol));

insert into usuario(NombreUsuario, PrimerApellido, correo, telefono, ContrasenaUsuario, IDRol)
VALUES ('ximena', 'Quintanilla', 'ximenaqiro02@gmail.com', '3208325041','12345', 1);

create table Categorias_Egresos (
IDCategoriaEgreso int not null,
NombreCategoriaEgreso varchar(100) not null,
primary key (IDCategoriaEgreso));

create table Metodo_Pago (
IDMetodoPago int not null,
NombreMetodoPago varchar(100) not null,
primary key (IDMetodoPago));

create table Registro_Egresos (
IDEgresos int not null, 
Monto decimal(12,2) not null,
IDCategoriaEgreso int not null, 
IDMetodoPago int not null,
FechaVencimiento datetime not null,
Descripcion text, 
EstadoPago enum("Pendiente", "Pagada", "Vencida") default "Pendiente",
primary key (IDEgresos),
foreign key (IDCategoriaEgreso) references Categorias_Egresos(IDCategoriaEgreso),
foreign key (IDMetodoPago) references Metodo_Pago(IDMetodoPago));

create table Recordatorios_Egresos (
IDRecordatorioEgresos int not null, 
IDEgresos int not null,
IDUsuario int not null,
DescripcionAlerta text, 
FechaRecordatorio datetime not null,
primary key (IDRecordatorioEgresos),
foreign key (IDUsuario) references Usuario(IDUsuario),
foreign key (IDEgresos) references Registro_Egresos(IDEgresos));

create table Categorias_Ingresos (
IDCategoriaIngreso int not null, 
NombreCategoriaIngreso varchar(100) not null,
primary key (IDCategoriaIngreso));

create table Registro_Ingresos (
IDIngresos int not null,
Monto decimal(12,2) not null,
FechaIngreso datetime not null,
Descripcion text,
IDCategoriaIngreso int not null, 
primary key (IDIngresos),
foreign key (IDCategoriaIngreso) references Categorias_Ingresos(IDCategoriaIngreso));

create table Recordatorios_Ingresos (
IDRecordatorioIngresos int not null, 
IDIngresos int not null,
IDUsuario int not null,
DescripcionAlerta text, 
FechaRecordatorio datetime not null,
primary key (IDRecordatorioIngresos),
foreign key (IDUsuario) references Usuario(IDUsuario),
foreign key (IDIngresos) references Registro_Ingresos(IDIngresos));

create table Coordenadas (
IDCoordenada int not null,
Latitud decimal(12,2),
Logitud decimal(12,2),
primary key (IDCoordenada));

create table Ubicacion_Usuario (
IDUbicacion int not null,
Pais varchar(100) not null,
Ciudad varchar(100) not null,
Direccion varchar(100) not null,
FechaRegistro datetime not null,
IDUsuario int not null, 
IDCoordenada int,
primary key (IDUbicacion),
foreign key (IDCoordenada) references Coordenadas(IDCoordenada));

create table Tienda (
IDTienda int not null,
NombreTienda varchar(100) not null,
Pais varchar(100) not null,
Ciudad varchar(100) not null,
Direccion varchar(100) not null,
IDCoordenada int,
FechaRegistro datetime, 
primary key(IDTienda),
foreign key (IDCoordenada) references Coordenadas(IDCoordenada));

create table Tipo_Producto (
IDTipoProducto int not null,
NombreTipoProducto enum("Otros", "Aseo", "Alimentos", "Personal", "Ropa y calzado") default "Otros",
primary key (IDTipoProducto));

create table Producto (
IDProducto int not null,
NombreProducto varchar(100) not null,
Descripcion text,
IDTipoProducto int not null,
StockInicial int not null,
StockMinimo int not null,  
primary key(IDProducto),
foreign key (IDTipoProducto) references Tipo_Producto(IDTipoProducto));

create table Inventario_Casa (
IDInventario int not null,
IDProducto int not null, 
StockActual int not null, 
FechaActualizacion datetime not null,
primary key(IDInventario),
foreign key (IDProducto) references Producto(IDProducto));

create table Precio_Producto (
IDPrecio int not null,
IDTienda int not null,
IDInventario int not null, 
precio decimal(12,2) not null,
FechaActualizacion datetime not null,
primary key (IDPrecio),
foreign key (IDTienda) references Tienda(IDTienda),
foreign key (IDInventario) references Inventario_Casa(IDInventario));

create table Lista_Compras (
IDListaCompras int not null,
NombreLista varchar(100) not null,
IDCategoriaLista int not null,
IDProducto int not null,
FechaCreacion datetime,
primary key(IDListaCompras),
foreign key (IDCategoriaLista) references Categorias_Lista(IDCategoriaLista),
foreign key (IDProducto) references Producto(IDProducto));

create table Recordatorios (
IDRecordatorio int not null, 
IDListaCompras int not null,
IDUsuario int not null,
DescripcionAlerta text, 
FechaRecordatorio datetime not null,
primary key (IDRecordatorio),
foreign key (IDUsuario) references Usuario(IDUsuario),
foreign key (IDListaCompras) references Lista_Compras(IDListaCompras));
