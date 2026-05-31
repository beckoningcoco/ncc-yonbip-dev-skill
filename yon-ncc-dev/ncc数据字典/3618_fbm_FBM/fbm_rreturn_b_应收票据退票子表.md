# |<<

**应收票据退票子表 (fbm_rreturn_b / nc.vo.fbm.rreturn.RReturnBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2158.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rreturn_b | 主键 | pk_rreturn_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_rreturn | 主表主键 | pk_rreturn | char(20) |  | 主键 (UFID) |
| 3 | pk_register | 票据编号 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | fbmbillno | 票据编号 | fbmbillno | varchar(100) |  | 主键 (UFID) |
| 5 | olcmoney | 组织本币金额 | olcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | glcmoney | 集团本币金额 | glcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | gllcmoney | 全局本币金额 | gllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | bodymoney | 原币金额 | bodymoney | decimal(28, 4) |  | 金额 (UFMoney) |
| 9 | body_curr | 币种 | body_curr | varchar(20) |  | 币种 (currtype) |
| 10 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | billmoney | 票据票面金额 | billmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | billolcmoney | 票据组织本币金额 | billolcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | billolcrate | 票据组织本币汇率 | billolcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | billglcmoney | 票据集团本币金额 | billglcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | billglcrate | 票据集团本币汇率 | billglcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 18 | billgllcmoney | 票据全局本币金额 | billgllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | billgllcrate | 票据全局本币汇率 | billgllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 20 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 21 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 22 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 23 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |