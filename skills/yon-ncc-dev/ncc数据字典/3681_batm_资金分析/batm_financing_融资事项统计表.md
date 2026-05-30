# |<<

**融资事项统计表 (batm_financing / nc.vo.batm.FinancingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/225.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financing | 主键 | pk_financing | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | financing_org | 融资财务组织 | financing_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | financing_way | 融资方式 | financing_way | int |  | 整数 (Integer) |
| 7 | financing_variety | 融资品种 | financing_variety | int |  | 整数 (Integer) |
| 8 | pk_bankdoc | 融资银行 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | vbillno | 合同或协议编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 11 | begindate | 开始日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 12 | enddate | 到期日 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | guaranteetype | 担保方式 | guaranteetype | varchar(50) |  | 字符串 (String) |
| 14 | pk_cctype | 授信类别 | pk_cctype | varchar(50) |  | 字符串 (String) |
| 15 | ccamount | 使用授信额度 | ccamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | balance | 原币余额 | balance | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | olcbalance | 组织本位币余额 | olcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | glcbalance | 集团本位币余额 | glcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | gllcbalance | 全局本位币余额 | gllcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |