# |<<

**票据帐明细表 (batm_billacc_detail / nc.vo.batm.fbmvo.BillAccDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/212.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billacc_detail | 主键 | pk_billacc_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_sourcebill | 来源票据pk | pk_sourcebill | varchar(50) |  | 字符串 (String) |
| 3 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 字符串 (String) |
| 4 | billtype | 来源单据类型 | billtype | varchar(10) |  | 字符串 (String) |
| 5 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 6 | vbillno | 来源单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | sfflag | 借贷标记 | sfflag | int |  | 整数 (Integer) |
| 8 | lendermoney | 贷方额度 | lendermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | glllendermoney | 全局本币贷方额度 | glllendermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glclendermoney | 集团本币贷方额度 | glclendermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | olclendermoney | 组织本币贷方额度 | olclendermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | debitmoney | 借方额度 | debitmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glldebitmoney | 全局本币借方额度 | glldebitmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glcdebitmoney | 集团本币借方额度 | glcdebitmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcdebitmoney | 组织本币借方额度 | olcdebitmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | billclass | 票据大类 | billclass | int |  | 整数 (Integer) |
| 17 | pk_billtype | 票据类型 | pk_billtype | varchar(20) |  | 票据类型 (notetype) |
| 18 | billbizdate | 单据业务日期 | billbizdate | char(19) |  | 日期 (UFDate) |
| 19 | bizsystem | 业务系统 | bizsystem | varchar(50) |  | 字符串 (String) |
| 20 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 21 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 22 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 23 | tallyperson | 记账人 | tallyperson | varchar(20) |  | 用户 (user) |
| 24 | tallytime | 记账时间 | tallytime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 26 | direction | 票据帐方向 | direction | int |  | 整数 (Integer) |
| 27 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 28 | beginbalance | 期初余额 | beginbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | olcbeginbalance | 期初余额组织本币 | olcbeginbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | glcbeginbalance | 期初余额集团本币 | glcbeginbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | gllbeginbalance | 期初余额全局本币 | gllbeginbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | endbalance | 期末余额 | endbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | olcendbalance | 期末余额组织本币 | olcendbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | glcendbalance | 期末余额集团 | glcendbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | gllendbalance | 期末余额全局 | gllendbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | voucherno | 凭证号 | voucherno | varchar(50) |  | 字符串 (String) |
| 37 | billaccbalance | 票据余额 | billaccbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | olcbillaccbalance | 票据余额组织本币 | olcbillaccbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | glcbillaccbalance | 票据余额集团本币 | glcbillaccbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | gllbillaccbalance | 票据余额全局本币 | gllbillaccbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |