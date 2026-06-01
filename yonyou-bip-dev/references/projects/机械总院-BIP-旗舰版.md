# 机械总院 (BIP 旗舰版 本地部署)
> 生产环境，数据中台项目。YonBIP 旗舰版 (本地部署)，麒麟 Linux。

## 环境: prod
| 域名 | http://sjzt.cam.com.cn/ |
| 说明 | 生产环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| *待补充* | *待补充* | *待补充* | |

## BIP 激活信息
| 配置项 | 值 |
|--------|-----|
| **服务识别码** | 2611007232 |
| **识别码密码** | 784235 |
| **重启 License 命令** | systemctl restart license-server-30001.service |

## 平台 & 产品

| 产品 | 地址 | 用户名 | 密码 |
|------|------|--------|------|
| 安装器 | http://10.4.1.11:8080 | admin | a*Xb45I*1C2nQjY |
| BIP 平台 | http://sjzt.cam.com.cn/ | yhtmanager | cammanager@2025 (更新后: jxzy123456) |
| 技术平台 (ISV) | http://sjzt.cam.com.cn/ | isvadmin | 7Y@dUNbZdE!e (更新后: jxzy123456) |
| LicenseServer | http://10.4.1.11:30001/iuap-licenseserver | LicenseServer | ^QJC89zgPEXu2$3r |
| 文件存储 (SFTP) | http://10.4.1.13:6862 | sftpstorageupload | XSsftpG49#X38BtL |

## 中间件

| 中间件 | 地址 | 用户名 | 密码 |
|--------|------|--------|------|
| 达梦 系统库 | jdbc:dm://10.4.1.19:5236/ | YYBIP | IbnQ*1YC245ja*X |
| 达梦 系统库 (SYSDBA) | jdbc:dm://10.4.1.19:5236/ | SYSDBA | Randompwd123! |
| 达梦 分析库 | jdbc:dm://10.4.1.20:5236/ | YYBQ | a*Xb45I*1C2nQjY |
| 达梦 分析库 (SYSDBA) | jdbc:dm://10.4.1.20:5236/ | SYSDBA | Randompwd123! |
| Redis | 10.4.1.11:6860,10.4.1.12:6860,10.4.1.13:6860,10.4.1.11:6859,10.4.1.12:6859,10.4.1.13:6859 | - | C332q=2c6lw0fqch |
| OpenSearch | 10.4.1.11:6857,10.4.1.12:6857,10.4.1.13:6857 | admin | N5e51=hxd64820kj |
| OpenSearchDashboards | http://10.4.1.12:6855/iuap-ymc-server/proxy/dataviz | admin | N5e51=hxd64820kj |

## NCC 测试环境

**应用服务器**
- 地址: 192.168.8.139
- 远程登录: administrator / 2025Cam01!
- 代码路径: D:\yonyou\NCC

**数据库**
- 地址: 192.168.8.139:1521/orcl
- 数据源/用户:
  - NCC20250912 / NCC20250912
  - NCC20250614 / NCC20250614

**NCC 平台**
- 地址: http://192.168.8.139:8080
- 超级管理员: root / jxzy@88301837
- 系统管理员: sysadmin / jxzy@88301837
- 集团管理员: jtadmin / jxzy@88301837
- 新增用户默认密码: 1234qwer

## NCC 正式环境

| 产品 | 地址 | 用户名 | 密码 |
|------|------|--------|------|
| NCC 正式 | http://192.168.8.142:7000/nccloud/resources/workbench/public/common/main/index.html#/ | liuq002 | liuqiang123!@# |
| NCC 正式数据库 | 192.168.8.143:1521/ORCL | NCC | WffkeeAlIY4HidfQ05wj1W |

## 久其网络版数据库

| 配置项 | 值 |
|--------|-----|
| **地址** | 192.168.8.15:1521/orcl |
| **SID** | jxky |
| **密码** | jqsjlEl@20311 |
| **服务器远程** | administrator / 2015cam10 |

## 服务器列表

| 序号 | 名称 | 主机名 | IP | CPU | 内存 | 系统盘 | 数据盘 | 用户 | 密码 |
|------|------|--------|----|-----|------|--------|--------|------|------|
| 1 | 中间件01 | prod-mid01 | 10.4.1.11 | 32 | 64 | 100G | 1T | root | jxzy@2025 |
| 2 | 中间件02 | prod-mid02 | 10.4.1.12 | 32 | 64 | 100G | 1T | root | jxzy@2025 |
| 3 | 中间件03 | prod-mid03 | 10.4.1.13 | 32 | 64 | 100G | 1T | root | jxzy@2025 |
| 5 | 平台资源 | prod-paas-apps | 10.4.1.14 | 64 | 64 | 100G | 500G | root | jxzy@2025 |
| 6 | 领域资源 | prod-yewu-apps | 10.4.1.15 | 64 | 64 | 100G | 500G | root | jxzy@2025 |
| 11 | 智能平台&算法服务 | prod-algorithm | 10.4.1.16 | 32 | 32 | 100G | 500G | root | jxzy@2025 |
| 12 | 向量数据库 | prod-vectordb | 10.4.1.17 | 32 | 64 | 100G | 1T | root | jxzy@2025 |
| 15 | 数据平台中间件 | prod-data-mid | 10.4.1.18 | 32 | 64 | 100G | 500G | root | jxzy@2025 |
| 18 | 业务库 | prod-yewu-db | 10.4.1.19 | 32 | 64 | 100G | 1T | root | jxzy@2025 |
| 19 | 分析库 | prod-analysis-db | 10.4.1.20 | 32 | 64 | 100G | 1T | root | jxzy@2025 |

> 所有服务器系统: Kylin Linux Advanced Server V10 (64-bit)

## 用户账号 (数据中台)

| 姓名 | 手机号 | 用户名 | 密码 | 备用密码 |
|------|--------|--------|------|----------|
| 苏帅 | 15128303030 | sus | nTYt9a8$XM | 123qwe!@#QWE |
| 吕立超 | 18633520403 | lvlc | nTYt9a8$XM | |
| 刘然 | 13911104200 | liur | nTYt9a8$XM | |
| 刘强 | 15603304552 | liuq001 | nTYt9a8$XM | 123!@#qwe |
| 王浩 | 18661850179 | wangh001 | nTYt9a9$XM | |
| 张建 | 13730471227 | zhangj001 | nTYt9a9$XM | qwe123!@# |
| 王浩泽 | 18333254283 | wanghz001 | nTYt9a8$XM | |
| 刁思源 | 15127250276 | diaoxy | nTYt9a8$XM | |
| 袁林 | 17710227083 | yuanl001 | nTYt9a8$XM | |
| 孟江舸 | 15530262663 | mengjk | 1234qwer! | |

## AI 一体机
| 配置项 | 值 |
|--------|-----|
| **地址** | 192.168.2.10 |
| **账号** | Admin/dmin@123 |
| **说明** | 远程桌面地址，插网线用 |

## 麒麟系统
| 配置项 | 值 |
|--------|-----|
| **账号** | root/cam@20251120 |

## 其他信息
| 配置项 | 值 |
|--------|-----|
| **备注** | BIP 旗舰版本地部署，AES 加密用户名: J7vUeZ8r1Kj3Qx9WbN2mFQ==, AES 加密密码: bD5iN0JtQ2xKcW1RZ3ZyVXpLdw== |
