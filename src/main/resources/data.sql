
 CREATE TABLE REGISTER(c_name varchar(20),
 d_dob date,
 c_mobile_no INTEGER PRIMARY KEY auto_increment,
c_email varchar(20),
c_c2code INTEGER,
c_gender char(10),
c_pincode INTEGER,
n_firm_id INTEGER, 
c_br_code INTEGER, 
c_service_active_status char(200));
CREATE TABLE LOGINPAGE(c_mobile_no INTEGER PRIMARY KEY auto_increment,
OTP INTEGER,
c_c2code INTEGER,
n_login INTEGER);


