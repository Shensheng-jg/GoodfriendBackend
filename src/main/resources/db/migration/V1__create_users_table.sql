-- 创建用户表
CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       phone VARCHAR(11) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       name VARCHAR(50) NOT NULL,
                       age INT NOT NULL,
                       gender ENUM('MALE', 'FEMALE', 'UNKNOWN') NOT NULL,
                       region VARCHAR(100) NOT NULL,
                       avatar_url VARCHAR(255),
                       created_at DATETIME NOT NULL,
                       updated_at DATETIME NOT NULL
);

-- 创建咨询师表
CREATE TABLE consultants (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             phone VARCHAR(11) NOT NULL UNIQUE,
                             password VARCHAR(255) NOT NULL,
                             name VARCHAR(50) NOT NULL,
                             age INT NOT NULL,
                             gender ENUM('MALE', 'FEMALE', 'UNKNOWN') NOT NULL,
                             qualifications TEXT NOT NULL,
                             available_time VARCHAR(100) NOT NULL,
                             field VARCHAR(100) NOT NULL,
                             avatar_url VARCHAR(255),
                             created_at DATETIME NOT NULL,
                             updated_at DATETIME NOT NULL
);

-- 创建管理员表
CREATE TABLE admins (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        password VARCHAR(255) NOT NULL,
                        created_at DATETIME NOT NULL,
                        updated_at DATETIME NOT NULL
);