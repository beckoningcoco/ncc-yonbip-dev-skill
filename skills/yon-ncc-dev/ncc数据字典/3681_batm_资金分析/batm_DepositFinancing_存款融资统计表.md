# |<<

**存款融资统计表 (batm_DepositFinancing / nc.vo.batm.DepositFinancingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depositfinancing | 主键 | pk_depositfinancing | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_commorg | 存款或贷款单位 | pk_commorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_bankdoc | 银行 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 7 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 8 | pk_dctype | 存贷类型 | pk_dctype | int |  | 整数 (Integer) |
| 9 | pk_dcform | 存款、融资形式 | pk_dcform | int |  | 整数 (Integer) |
| 10 | period | 期限 | period | varchar(50) |  | 字符串 (String) |
| 11 | vbillno | 存单号或账户或合同号 | vbillno | varchar(50) |  | 字符串 (String) |
| 12 | balance | 原币余额 | balance | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | olcbalance | 组织本币余额 | olcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glcbalance | 集团本币余额 | glcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | gllcbalance | 全局本币余额 | gllcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |