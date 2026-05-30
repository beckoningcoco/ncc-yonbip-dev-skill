# |<<

**核销余额 (gl_VerifyDetail / nc.vo.gl.verifydetail.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2500.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verifydetail | 新凭证信息表标识 | pk_verifydetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_org_v | 财务组织多版本 | pk_org_v | char(20) |  | 主键 (UFID) |
| 5 | pk_voucher | 凭证表标识 | pk_voucher | varchar(20) |  | 实时凭证主体 (gl_rtvoucher) |
| 6 | pk_detail | 凭证分录标识 | pk_detail | varchar(20) |  | 实时凭证分录 (gl_rtdetail) |
| 7 | initflag | 期初未达标志 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_vouchertype | 凭证类别标识 | pk_vouchertype | char(20) |  | 主键 (UFID) |
| 9 | voucherno | 凭证号 | voucherno | int |  | 整数 (Integer) |
| 10 | prepareddate | 凭证日期 | prepareddate | char(19) |  | 日期时间 (UFDateTime) |
| 11 | businessdate | 业务日期 | businessdate | char(19) |  | 日期时间 (UFDateTime) |
| 12 | explanation | 摘要 | explanation | char(150) |  | 主键 (UFID) |
| 13 | verifyno | 核销号 | verifyno | varchar(20) |  | 主键 (UFID) |
| 14 | pk_prepared | 制单人 | pk_prepared | char(20) |  | 主键 (UFID) |
| 15 | pk_accasoa | 科目 | pk_accasoa | char(20) |  | 主键 (UFID) |
| 16 | pk_currtype | 币种 | pk_currtype | char(20) |  | 主键 (UFID) |
| 17 | detailindex | 分录号 | detailindex | int |  | 整数 (Integer) |
| 18 | assid | 辅助核算标识 | assid | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 19 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | excrate1 | 汇率1 | excrate1 | decimal(15, 8) |  | 数值 (UFDouble) |
| 21 | excrate2 | 汇率2 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) |
| 22 | excrate3 | 集团汇率 | excrate3 | decimal(15, 8) |  | 数值 (UFDouble) |
| 23 | excrate4 | 全局汇率 | excrate4 | decimal(15, 8) |  | 数值 (UFDouble) |
| 24 | orientation | 方向 | orientation | int |  | 整数 (Integer) |
| 25 | debitquantity | 借方数量 | debitquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 26 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | fracdebitamount | 辅币借发生额 | fracdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | localdebitamount | 本币借发生额 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | groupdebitamount | 集团借方发生额 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | globaldebitamount | 全局借方发生额 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | creditquantity | 贷方数量 | creditquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 32 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | fraccreditamount | 辅币贷发生额 | fraccreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | localcreditamount | 本币贷发生额 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | groupcreditamount | 集团贷方发生额 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | globalcreditamount | 全局贷方发生额 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | balancedebitquantity | 借方数量余额 | balancedebitquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 38 | balancedebitamount | 原币借余额 | balancedebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | balancefracdebitamount | 辅币借余额 | balancefracdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | balancelocaldebitamount | 本币借余额 | balancelocaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | balancegroupdebitamount | 集团借余额 | balancegroupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | balanceglobaldebitamount | 全局借余额 | balanceglobaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | balancecreditquantity | 贷方数量余额 | balancecreditquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 44 | balancecreditamount | 原币贷余额 | balancecreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | balancefraccreditamount | 辅币贷余额 | balancefraccreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | balancelocalcreditamount | 本币贷余额 | balancelocalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | balancegroupcreditamount | 集团贷余额 | balancegroupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | balanceglobalcreditamount | 全局贷余额 | balanceglobalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | pk_manager | 记账人 | pk_manager | char(20) |  | 主键 (UFID) |
| 50 | isverifyflag | 核销标志 | isverifyflag | char(1) |  | 布尔类型 (UFBoolean) |
| 51 | pk_sourcepk | 折算来源凭证PK | pk_sourcepk | char(20) |  | 主键 (UFID) |
| 52 | convertflag | 是否折算凭证标志 | convertflag | char(1) |  | 布尔类型 (UFBoolean) |
| 53 | pk_setofbook | 账簿类型 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 54 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 55 | netbankflag | 银行对账标识 | netbankflag | varchar(50) |  | 字符串 (String) |
| 56 | freevalue1 | 自由项1 | freevalue1 | varchar(60) |  | 字符串 (String) |
| 57 | freevalue2 | 自由项2 | freevalue2 | varchar(60) |  | 字符串 (String) |
| 58 | freevalue3 | 自由项3 | freevalue3 | varchar(60) |  | 字符串 (String) |
| 59 | freevalue4 | 自由项4 | freevalue4 | varchar(60) |  | 字符串 (String) |
| 60 | freevalue5 | 自由项5 | freevalue5 | varchar(60) |  | 字符串 (String) |
| 61 | freevalue6 | 自由项6 | freevalue6 | varchar(60) |  | 字符串 (String) |
| 62 | freevalue7 | 自由项7 | freevalue7 | varchar(60) |  | 字符串 (String) |
| 63 | freevalue8 | 自由项8 | freevalue8 | varchar(60) |  | 字符串 (String) |
| 64 | freevalue9 | 自由项9 | freevalue9 | varchar(60) |  | 字符串 (String) |
| 65 | freevalue10 | 自由项10 | freevalue10 | varchar(60) |  | 字符串 (String) |
| 66 | freevalue11 | 自由项11 | freevalue11 | varchar(60) |  | 字符串 (String) |
| 67 | freevalue12 | 自由项12 | freevalue12 | varchar(60) |  | 字符串 (String) |
| 68 | freevalue13 | 自由项13 | freevalue13 | varchar(60) |  | 字符串 (String) |
| 69 | freevalue14 | 自由项14 | freevalue14 | varchar(60) |  | 字符串 (String) |
| 70 | freevalue15 | 自由项15 | freevalue15 | varchar(60) |  | 字符串 (String) |
| 71 | freevalue16 | 自由项16 | freevalue16 | varchar(60) |  | 字符串 (String) |
| 72 | freevalue17 | 自由项17 | freevalue17 | varchar(60) |  | 字符串 (String) |
| 73 | freevalue18 | 自由项18 | freevalue18 | varchar(60) |  | 字符串 (String) |
| 74 | freevalue19 | 自由项19 | freevalue19 | varchar(60) |  | 字符串 (String) |
| 75 | freevalue20 | 自由项20 | freevalue20 | varchar(60) |  | 字符串 (String) |
| 76 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 77 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 78 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 79 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |