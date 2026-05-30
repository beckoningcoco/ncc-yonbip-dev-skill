# 用友 BIP 项目配置资料

> 此文件用于记录不同用友 BIP 项目的配置信息和环境信息。
> 采用 **项目 → 环境 → 凭据** 的嵌套结构，支持多环境、多组 AppKey/AppSecret。
> 每次新增项目或修改配置时，请将变更同步到本文档。

---

## 配置模板

新增项目时，复制以下模板填写：

```markdown
### 项目名称
> 项目备注、NCC版本等

#### 环境: dev
| 域名 | https://erp-dev.xxx.com/ |
| 说明 | 开发环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| 默认 | {appKey} | {appSecret} | 主应用 |

#### 环境: uat
| 域名 | https://erp-uat.xxx.com/ |
| 说明 | 测试环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| 默认 | {appKey} | {appSecret} | |

#### 环境: prod
| 域名 | https://erp.xxx.com/ |
| 说明 | 生产环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| 默认 | {appKey} | {appSecret} | |

#### 其他信息
| 配置项 | 值 |
|--------|-----|
| **包路径 (客开)** | *待补充* |
| **包路径 (原生)** | *待补充* |
| **NCC 环境地址** | *待补充* |
| **代码仓库** | *待补充* |
| **备注** | *待补充* |
```

---

## 已登记项目

### 天九 (NCC 2312 高级版)
> 需通过 VPN 访问内网环境

#### 环境: uat
| 域名 | http://172.16.26.10:8099/ |
| 说明 | 高级版 2312 测试环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| *待补充* | *待补充* | *待补充* | |

#### 测试环境账号
| 账号 | 密码 | 说明 |
|------|------|------|
| yonyou1 | 1234qwer! | 测试账号1 |
| yonyou2 | 1234qwer! | 测试账号2 |
| yonyou3 | 1234qwer! | 测试账号3 |

#### 数据库
| 配置项 | 值 |
|--------|-----|
| **数据库类型** | Oracle (PolarDB) |
| **数据库地址** | pc-2zek8f77996c0g6zz.o.polardb.rds.aliyuncs.com:1521 |
| **数据库名称** | biptestdb3 |
| **数据库用户** | bipuser |
| **数据库密码** | 2Gjzt+6LcB.Kdq!Z# |

#### VPN 信息
| 配置项 | 值 |
|--------|-----|
| **VPN 地址** | https://vpn.tojoy.com/ |
| **VPN 账号** | wangrui_os |
| **VPN 密码** | TJYFJT@12 |
| **备注** | 支持多人同时登录 |

#### 堡垒机
| 配置项 | 值 |
|--------|-----|
| **堡垒机地址** | http://10.107.1.12/ |
| **用户名** | wangrui_os |
| **密码** | Tj123456@ |
| **说明** | NCC 2312 高级版服务器登录 |

#### 电子档案系统 (测试环境)
| 配置项 | 值 |
|--------|-----|
| **登录地址** | http://172.16.30.117:1880/data/collection/vouchersAttachments |
| **账号** | admin |
| **密码** | admin123 |

#### 其他信息
| 配置项 | 值 |
|--------|-----|
| **包路径 (客开)** | *待补充* |
| **包路径 (原生)** | *待补充* |
| **测试环境 home** | /data/yonyou/biphome |
| **代码仓库** | *待补充* |
| **分支策略** | *待补充* |
| **JDK 版本** | *待补充* |

---

### 毛戈平

#### 环境: dev
| 域名 | https://erp-dev-test.maogeping.com/ |
| 说明 | 开发测试环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| 默认 | 89fb50a7328c49ddaa62b566b58a9eb1 | 64c8219811309a407238f676f3ea8714e16723ec | 主应用 |

#### 环境: uat
| 域名 | https://erp-uat-test.maogeping.com/ |
| 说明 | UAT 测试环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| *待补充* | *待补充* | *待补充* | |

#### 其他信息
| 配置项 | 值 |
|--------|-----|
| **包路径 (客开)** | *待补充* |
| **包路径 (原生)** | *待补充* |
| **NCC 环境地址** | *待补充* |
| **代码仓库** | *待补充* |
| **备注** | *待补充* |

---

### 泸州老窖 (BIP)
> 客开项目，需通过 ATRUST VPN 访问内网环境。已打 2025033 合集补丁。

#### 环境: dev
| 域名 | https://gxdev.lzlj.com/ |
| 说明 | 开发环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| *待补充* | *待补充* | *待补充* | |

#### VPN 信息
| 配置项 | 值 |
|--------|-----|
| **VPN 类型** | ATRUST |
| **VPN 地址** | https://atrust.lzlj.com |
| **VPN 账号** | 16630637041 |
| **VPN 密码** | #i8I#JcGc$ (变更后: #123qwe#) |

#### 入口信息
| 配置项 | 值 |
|--------|-----|
| **Nginx 服务器** | 10.0.120.4 |
| **业务中台** | https://gxdev.lzlj.com |
| **技术中台** | https://gxdev.lzlj.com |
| **YMS 配置中心** | https://gxdev.lzlj.com/confcenter |

#### 平台 & 产品

| 产品 | 地址 | 用户名 | 密码 |
|------|------|--------|------|
| 安装器 | http://10.0.120.4:8080/ | admin | G52r9!F@D#fw |
| leveldb | - | leveldb | Aj*MP&pJvJ09 |
| nexus | http://10.0.120.4:10005/nexus | admin | B3BaS#c5Xm5J |
| bind | http://10.0.120.80:10000 | bind | qE2]xN2*hM5+ |
| harbor | http://10.0.120.80:81 | admin | q7JDVkP@!1^G |
| licenseserver | http://10.0.120.4:30001/iuap-licenseserver | admin | ^QJC89zgPEXu2$3r |
| YMS | https://gxdev.lzlj.com/confcenter | admin | c91D@b9eB9!41d |
| 技术中台 | https://gxdev.lzlj.com | admin | bI0!jD4#jD0_ |
| ISV | - | isvadmin | 7Y@dUNbZdE!e |
| 业务中台 | - | yhtmanager | manager@2020 |

#### 中间件

| 中间件 | 地址 | 用户名 | 密码 |
|--------|------|--------|------|
| 达梦(DM) | jdbc:dm://10.0.120.160:5236/ | YYBIP | SC_yybip2025 |
| elastic (cereboro) | 10.0.120.4:6882 | elastic | B3BaS#c5Xm5J |
| elastic (head) | 10.0.120.4:6881 | elastic | B3BaS#c5Xm5J |
| elastic (rest) | 10.0.120.4:6884 | elastic | B3BaS#c5Xm5J |
| elastic (tcp) | 10.0.120.4:6883 | - | - |
| kafka | 10.0.120.4:6890 | admin | B3BaS#c5Xm5J |
| kibana | 10.0.120.4:25021 | admin | B3BaS#c5Xm5J |
| minio | 10.0.120.4:6885 | minio | Tv9uxm#OALGo |
| redis | 10.0.120.4:6898 | admin | B3BaS#c5Xm5J |

#### 其他信息
| 配置项 | 值 |
|--------|-----|
| **代码仓库** | http://10.0.48.15:8090/lzlj-fs/lzlj-cwgx |
| **Git 账号** | zhanghongtao / 0zZCzFkhYnIQ (变更后: zhang1009) |
| **包路径 (客开)** | *待补充* |
| **包路径 (原生)** | *待补充* |
| **NCC 环境地址** | *待补充* |
| **备注** | 技术中台和业务中台不能在同一浏览器同时登录，需开无痕或其他浏览器 |

---

### 机械总院 (BIP 旗舰版 本地部署)
> 生产环境，数据中台项目。YonBIP 旗舰版 (本地部署)，麒麟 Linux。

#### 环境: prod
| 域名 | http://sjzt.cam.com.cn/ |
| 说明 | 生产环境 |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| *待补充* | *待补充* | *待补充* | |

#### BIP 激活信息
| 配置项 | 值 |
|--------|-----|
| **服务识别码** | 2611007232 |
| **识别码密码** | 784235 |
| **重启 License 命令** | systemctl restart license-server-30001.service |

#### 平台 & 产品

| 产品 | 地址 | 用户名 | 密码 |
|------|------|--------|------|
| 安装器 | http://10.4.1.11:8080 | admin | a*Xb45I*1C2nQjY |
| BIP 平台 | http://sjzt.cam.com.cn/ | yhtmanager | cammanager@2025 (更新后: jxzy123456) |
| 技术平台 (ISV) | http://sjzt.cam.com.cn/ | isvadmin | 7Y@dUNbZdE!e (更新后: jxzy123456) |
| LicenseServer | http://10.4.1.11:30001/iuap-licenseserver | LicenseServer | ^QJC89zgPEXu2$3r |
| 文件存储 (SFTP) | http://10.4.1.13:6862 | sftpstorageupload | XSsftpG49#X38BtL |

#### 中间件

| 中间件 | 地址 | 用户名 | 密码 |
|--------|------|--------|------|
| 达梦 系统库 | jdbc:dm://10.4.1.19:5236/ | YYBIP | IbnQ*1YC245ja*X |
| 达梦 系统库 (SYSDBA) | jdbc:dm://10.4.1.19:5236/ | SYSDBA | Randompwd123! |
| 达梦 分析库 | jdbc:dm://10.4.1.20:5236/ | YYBQ | a*Xb45I*1C2nQjY |
| 达梦 分析库 (SYSDBA) | jdbc:dm://10.4.1.20:5236/ | SYSDBA | Randompwd123! |
| Redis | 10.4.1.11:6860,10.4.1.11:6859,10.4.1.12:6860,10.4.1.12:6859,10.4.1.13:6860,10.4.1.13:6859 | - | C332q=2c6lw0fqch |
| OpenSearch | 10.4.1.11:6857,10.4.1.12:6857,10.4.1.13:6857 | admin | N5e51=hxd64820kj |
| OpenSearchDashboards | http://10.4.1.12:6855/iuap-ymc-server/proxy/dataviz | admin | N5e51=hxd64820kj |

#### NCC 测试环境

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

#### NCC 正式环境

| 产品 | 地址 | 用户名 | 密码 |
|------|------|--------|------|
| NCC 正式 | http://192.168.8.142:7000/nccloud/resources/workbench/public/common/main/index.html#/ | liuq002 | liuqiang123!@# |
| NCC 正式数据库 | 192.168.8.143:1521/ORCL | NCC | WffkeeAlIY4HidfQ05wj1W |

#### 久其网络版数据库

| 配置项 | 值 |
|--------|-----|
| **地址** | 192.168.8.15:1521/orcl |
| **SID** | jxky |
| **密码** | jqsjlEl@20311 |
| **服务器远程** | administrator / 2015cam10 |

#### 服务器列表

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

#### 用户账号 (数据中台)

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

#### AI 一体机
| 配置项 | 值 |
|--------|-----|
| **地址** | 192.168.2.10 |
| **账号** | Admin/dmin@123 |
| **说明** | 远程桌面地址，插网线用 |

#### 麒麟系统
| 配置项 | 值 |
|--------|-----|
| **账号** | root/cam@20251120 |

#### 其他信息
| 配置项 | 值 |
|--------|-----|
| **包路径 (客开)** | *待补充* |
| **包路径 (原生)** | *待补充* |
| **代码仓库** | *待补充* |
| **备注** | BIP 旗舰版本地部署，AES 加密用户名: J7vUeZ8r1Kj3Qx9WbN2mFQ==, AES 加密密码: bD5iN0JtQ2xKcW1RZ3ZyVXpLdw== |

---

### 国投中鲁 (BIP R6)
> 客开项目，需通过 VPN 访问内网环境。集团 IP: 10.61.128.21。

#### 环境: dev
| 域名 | https://devbip.sdic.com.cn/ (旧: erpbip.sdic.com.cn) |
| 说明 | 开发环境，对应内网 IP 10.61.128.200 (旧: 10.61.128.129) |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| *待补充* | *待补充* | *待补充* | |

#### 环境: uat
| 域名 | https://xctest-r6.sdic.com.cn/ |
| 说明 | UAT 测试环境 (NAT 后地址: 172.30.201.9) |

| 应用名称 | AppKey | AppSecret | 说明 |
|---------|--------|-----------|------|
| *待补充* | *待补充* | *待补充* | |

#### 平台 & 产品 (dev)

| 产品 | 地址 | 用户名 | 密码 | 备注 |
|------|------|--------|------|------|
| 安装器 | http://10.61.128.199:8080/ (旧: 10.61.128.128) | admin | G52r9!F@D#fe (旧: G52r9!F@D#fw) | 安装补丁等 |
| YMS 控制台 | https://devbip.sdic.com.cn/confcenter/ (旧: erpbip.sdic.com.cn) | admin | c91D@b9eB9!41e (旧: c91D@b9eB9!41d) | 系统配置、变量配置 |
| 技术中台 | https://devbip.sdic.com.cn (旧: erpbip.sdic.com.cn) | isvadmin | 7Y@dUNbZdE!e (旧: manager@2025) | 开发发版 |
| 业务中台 | https://devbip.sdic.com.cn (旧: erpbip.sdic.com.cn) | yhtmanager | BIPmanager@2025! (旧: manager@2024) | 业务实施，内网 IP 10.61.128.200 |

#### 平台 & 产品 (uat)

| 产品 | 地址 | 用户名 | 密码 | 备注 |
|------|------|--------|------|------|
| 安装器 | - | - | - | 暂不提供 |
| YMS 控制台 | - | - | - | 暂不提供 |
| YMC 控制台 | - | - | - | 暂不提供 |
| 技术中台 | https://xctest-r6.sdic.com.cn/#/ | isvadmin | 7Y@dUNbZdE!e | |
| 业务中台 | https://xctest-r6.sdic.com.cn/#/ | yhtmanager | manager@2024 | |

#### 数据库 (dev)
| 配置项 | 值 |
|--------|-----|
| **数据库类型** | MySQL |
| **数据库地址** | 10.61.128.217 (旧: 10.61.128.143) |
| **数据库用户** | oper_dc |
| **数据库密码** | yaSBpV3yzTgnW5OQs (旧: operzADF2020qwer) |

#### Git
| 配置项 | 值 |
|--------|-----|
| **Git 地址** | https://dmis-test.sdic.com.cn |
| **Git 账号 (许乐)** | w6683220 / 6ntVHF2FvEwsKvrPzyns% |
| **Git 账号 (袁林)** | w1607083 / rvh3dsRwuDew% |
| **Git 账号 (赵亚辉)** | w4566939 / GXrN3KqEnETA% |
| **备注** | 初始化密码，登录后需修改 |

#### VPN 信息
| 配置项 | 值 |
|--------|-----|
| **VPN 地址** | https://vpn.gtvpn.sdic.com.cn |
| **VPN 账号** | w30000242 / 1234Qwer@ |
| **VPN 备注** | 数字国投扫码登录 |

#### 生产环境
| 配置项 | 值 |
|--------|-----|
| **特权账号网址** | http://10.61.192.26/ |
| **特权账号** | Yanglei@9013 / 10021810 (数字国投扫码登录) |
| **ESB 地址** | http://10.61.1.158:8080 |
| **ESB 账号** | w6683220 / 1qaz@WSX |

#### 联系人

| 姓名 | 手机号 | 备注 |
|------|--------|------|
| 孟令凯 | 15210503676 | 合同管理员，密码 get_rich@1988 |
| 许乐 | 18810906862 | 在用 |
| 陈峥 | 13513124987 | 李昆择在用 |
| 李俊峰 | 15810288758 | 未使用 |
| 臧灿榕 | 13513124987 | 未使用 |

#### 合同测试账号
| 账号 | 密码 | 说明 |
|------|------|------|
| 孟令凯 15210503676 | get_rich@1988 | 用于测试采购以及销售合同 |

#### 其他信息
| 配置项 | 值 |
|--------|-----|
| **包路径 (客开)** | *待补充* |
| **包路径 (原生)** | *待补充* |
| **代码仓库** | *待补充* |
| **备注** | UAT 代码库账号 15845186872 / get_rich@1988；ESB 用于采购销售合同接口 |
