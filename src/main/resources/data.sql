DROP TABLE TESTING.REGISTER;
 
CREATE TABLE TESTING.REGISTER(
  c_c2code INTEGER PRIMARY KEY,
 c_name varchar(20),
 d_dob date,
 c_mobile_no VARCHAR(20) ,
c_email varchar(20),
c_gender char(10),
c_pincode VARCHAR(10),
n_firm_id INTEGER, 
c_br_code INTEGER, 
c_service_active_status VARCHAR(200));

CREATE TABLE TESTING.LOGINPAGE(c_mobile_no INTEGER PRIMARY KEY auto_increment,
OTP INTEGER,
c_c2code INTEGER,
n_login INTEGER);

