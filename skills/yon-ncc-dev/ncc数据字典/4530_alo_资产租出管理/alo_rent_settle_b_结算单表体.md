# |<<

**结算单表体 (alo_rent_settle_b / nc.vo.alo.rent.settle.RentOutSettleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/99.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentsettle_b | 结算单子表主键 | pk_rentsettle_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_contract | 合同编码 | pk_contract | varchar(20) |  | 租出合同 (ContractOutHeadVO) |
| 7 | contract_no | 合同号 | contract_no | varchar(50) |  | 字符串 (String) |
| 8 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 9 | pk_equip | 设备编码 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 10 | calculate_date | 租金计算日期 | calculate_date | char(19) |  | 日期 (UFDate) |
| 11 | pk_currency_origin | 原币币种 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 12 | rentmoney | 租金金额 | rentmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | rentmoney_org | 租金金额（本币） | rentmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | rentmoney_group | 租金金额（集团本币） | rentmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | rentmoney_global | 租金金额（全局本币） | rentmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | expense | 费用金额 | expense | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | expense_org | 费用金额（本币） | expense_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | expense_group | 费用金额（集团本币） | expense_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | expense_global | 费用金额（全局本币） | expense_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | settlemoney | 结算金额 | settlemoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | settlemoney_org | 结算金额（本币） | settlemoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | settlemoney_group | 结算金额（集团本币） | settlemoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | settlemoney_global | 结算金额（全局本币） | settlemoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | gathermoney | 收款金额 | gathermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | gathermoney_org | 收款金额（本币） | gathermoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | gathermoney_group | 收款金额（集团本币） | gathermoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | gathermoney_global | 收款金额（全局本币） | gathermoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 29 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 30 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 31 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 32 | src_bill_code | 来源单据单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 33 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 34 | pk_currency_local | 本币币种 | pk_currency_local | varchar(20) |  | 币种 (currtype) |
| 35 | receivable_flag | 应付标志 | receivable_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 36 | pk_materi_v | 物料编码 | pk_materi_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 37 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 38 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |