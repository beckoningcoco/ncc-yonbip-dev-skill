# |<<

**托管子表 (fbm_storage_b / nc.vo.fbm.storage.StorageBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2160.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_storage_b | 主键 | pk_storage_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_storage | 主表主键 | pk_storage | varchar(20) |  | 主键 (UFID) |
| 3 | pk_register | 登记表主键 | pk_register | varchar(20) |  | 票据登记 (fbm_register) |
| 4 | fbmbillno | 票据编号 | fbmbillno | varchar(50) |  | 主键 (UFID) |
| 5 | isoutdisaccount | 是否外贴 | isoutdisaccount | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | keepbank | 托管银行 | keepbank | varchar(20) |  | 银行档案 (bankdoc) |
| 7 | billmoney | 票据票面金额 | billmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | billolcmoney | 票据组织本币金额 | billolcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | billolcrate | 票据组织本币汇率 | billolcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 10 | billglcmoney | 票据集团本币金额 | billglcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | billglcrate | 票据集团本币汇率 | billglcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | billgllcmoney | 票据全局本币金额 | billgllcmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | billgllcrate | 票据全局本币汇率 | billgllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 14 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 15 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 16 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | billpooluse | 票据池用途 | billpooluse | varchar(20) |  | 票据池用途 (BillPoolUseEnum) |  | pledge=质押; |