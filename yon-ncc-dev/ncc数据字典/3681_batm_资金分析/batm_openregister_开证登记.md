# |<<

**开证登记 (batm_openregister / nc.vo.batm.lcmvo.OpenregisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/232.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_openregister | 主键 | pk_openregister | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | vbillstatus | 单据状态 | vbillstatus | varchar(50) |  | 字符串 (String) |
| 8 | lcstatus | 信用证状态 | lcstatus | varchar(50) |  | 字符串 (String) |
| 9 | billdate | 开证日期 | billdate | char(19) |  | 日期 (UFDate) |
| 10 | lcno | 信用证号 | lcno | varchar(50) |  | 字符串 (String) |
| 11 | pk_lccurrtype | 信用证币种 | pk_lccurrtype | varchar(20) |  | 币种 (currtype) |
| 12 | lcamount | 信用证金额 | lcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | olclcamount | 信用证组织本币金额 | olclcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glclcamount | 信用证集团本币金额 | glclcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | gllclcamount | 信用证全局本币金额 | gllclcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | pk_supplier | 供应商 | pk_supplier | varchar(50) |  | 字符串 (String) |
| 17 | pk_dept | 部门 | pk_dept | varchar(50) |  | 字符串 (String) |
| 18 | pk_busipersion | 业务员 | pk_busipersion | varchar(50) |  | 字符串 (String) |
| 19 | validdate | 有效期 | validdate | char(19) |  | 日期 (UFDate) |
| 20 | arrivalamount | 到单金额 | arrivalamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | pay | 付款金额 | pay | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | lcbalance | 信用证余额 | lcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | commitamount | 承付金额 | commitamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | isdocubills | 押汇 | isdocubills | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | pk_cccurrtype | 授信币种 | pk_cccurrtype | varchar(20) |  | 币种 (currtype) |
| 26 | useccamount | 使用授信额度 | useccamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | pk_guacurrtype | 担保币种 | pk_guacurrtype | varchar(50) |  | 字符串 (String) |
| 28 | pk_pledgecurr | 保证金币种 | pk_pledgecurr | varchar(20) |  | 币种 (currtype) |
| 29 | pledgeamount | 保证金金额 | pledgeamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | pk_bank_issuing | 开证行 | pk_bank_issuing | varchar(50) |  | 字符串 (String) |
| 31 | guaranteetype | 担保方式 | guaranteetype | int |  | 整数 (Integer) |
| 32 | guaranteeamont | 使用担保金额 | guaranteeamont | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | type | 类型（地域） | type | int |  | 整数 (Integer) |
| 34 | term | 类型（期限） | term | int |  | 整数 (Integer) |
| 35 | paytype | 兑付方式 | paytype | int |  | 整数 (Integer) |
| 36 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 37 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 38 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 39 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 40 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 41 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 42 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 43 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 44 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 45 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |
| 46 | def11 | 自定义项11 | def11 | varchar(50) |  | 字符串 (String) |
| 47 | def12 | 自定义项12 | def12 | varchar(50) |  | 字符串 (String) |
| 48 | def13 | 自定义项13 | def13 | varchar(50) |  | 字符串 (String) |
| 49 | def14 | 自定义项14 | def14 | varchar(50) |  | 字符串 (String) |
| 50 | def15 | 自定义项15 | def15 | varchar(50) |  | 字符串 (String) |
| 51 | def16 | 自定义项16 | def16 | varchar(50) |  | 字符串 (String) |
| 52 | def17 | 自定义项17 | def17 | varchar(50) |  | 字符串 (String) |
| 53 | def18 | 自定义项18 | def18 | varchar(50) |  | 字符串 (String) |
| 54 | def19 | 自定义项19 | def19 | varchar(50) |  | 字符串 (String) |
| 55 | def20 | 自定义项20 | def20 | varchar(50) |  | 字符串 (String) |