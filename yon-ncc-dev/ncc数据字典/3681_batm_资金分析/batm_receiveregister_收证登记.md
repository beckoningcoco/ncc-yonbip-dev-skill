# |<<

**收证登记 (batm_receiveregister / nc.vo.batm.lcmvo.ReceiveregisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/234.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptregister | 收证登记主键 | pk_receiptregister | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 5 | pk_receiptregister_b | 合同信息 | pk_receiptregister_b | varchar(50) |  | 字符串 (String) |
| 6 | vbillstatus | 单据状态 | vbillstatus | int |  | 整数 (Integer) |
| 7 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 8 | lcno | 信用证号 | lcno | varchar(50) |  | 字符串 (String) |
| 9 | receivedate | 收证日期 | receivedate | char(19) |  | 日期 (UFDate) |
| 10 | pk_receivebank | 收证行 | pk_receivebank | varchar(20) |  | 银行档案 (bankdoc) |
| 11 | pk_advisingbank | 通知行 | pk_advisingbank | varchar(50) |  | 字符串 (String) |
| 12 | pk_lccurrtype | 信用证币种 | pk_lccurrtype | varchar(20) |  | 币种 (currtype) |
| 13 | lcamount | 信用证金额 | lcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | olclcamount | 信用证组织本币金额 | olclcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | glclcamount | 信用证集团本币金额 | glclcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | gllclcamount | 信用证全局本币金额 | gllclcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | lcstatus | 信用证状态 | lcstatus | varchar(50) |  | 字符串 (String) |
| 18 | validdate | 信用证有效期 | validdate | char(19) |  | 日期 (UFDate) |
| 19 | lctype | 类型（地域） | lctype | int |  | 整数 (Integer) |
| 20 | lcterm | 类型（期限） | lcterm | int |  | 整数 (Integer) |
| 21 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 22 | isdocubills | 押汇 | isdocubills | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 24 | pk_busipersion | 业务员 | pk_busipersion | varchar(20) |  | 人员基本信息 (psndoc) |
| 25 | billdate | 开证日期 | billdate | char(19) |  | 日期 (UFDate) |
| 26 | paytype | 兑付方式 | paytype | int |  | 整数 (Integer) |
| 27 | pk_issuingbank | 开证行 | pk_issuingbank | varchar(50) |  | 字符串 (String) |
| 28 | submissionamount | 累计交单金额 | submissionamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | submissionolcamount | 累计交单金额本币 | submissionolcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | submissioneglcamount | 累计交单金额集团本币 | submissioneglcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | submissiongllamount | 累计交单金额全局本币 | submissiongllamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | collectionamount | 累计收款金额 | collectionamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | collectionolcamt | 累计收款金额组织本币 | collectionolcamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | collectionglcamt | 累计收款金额集团本币 | collectionglcamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | collectiongllamt | 累计收款金额全局本币 | collectiongllamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | lcbalanceamt | 信用证余额 | lcbalanceamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | lcbalanceolcamt | 信用证余额组织本币 | lcbalanceolcamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | lcbalanceglcamt | 信用证余额集团本币 | lcbalanceglcamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | lcbalancegllamt | 信用证余额全局本币 | lcbalancegllamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |