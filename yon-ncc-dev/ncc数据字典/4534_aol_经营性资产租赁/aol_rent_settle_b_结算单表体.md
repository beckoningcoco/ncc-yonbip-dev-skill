# |<<

**结算单表体 (aol_rent_settle_b / nc.vo.aol.rent.settle.RentOutSettleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/125.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentsettle_b | 结算单子表主键 | pk_rentsettle_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 6 | pk_customer | 承租方 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 7 | pk_contract | 合同编码 | pk_contract | varchar(20) |  | 经营性租出合同 (ContractOutHeadVO) |
| 8 | pk_equip | 资产编码 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 9 | pk_lease_target | 租赁对象 | pk_lease_target | varchar(20) |  | 租赁对象 (LeaseTargetVO) |
| 10 | adjustment_rent | 调整后租金 | adjustment_rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | adjustment_rent_org | 调整后租金（本币） | adjustment_rent_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | adjustment_rent_group | 调整后租金（集团本币） | adjustment_rent_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | adjustment_rent_global | 调整后租金（全局本币） | adjustment_rent_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | expense | 费用金额 | expense | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | expense_org | 费用金额（本币） | expense_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | expense_group | 费用金额（集团本币） | expense_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | expense_global | 费用金额（全局本币） | expense_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | settlemoney | 结算金额 | settlemoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | settlemoney_org | 结算金额（本币） | settlemoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | settlemoney_group | 结算金额（集团本币） | settlemoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | settlemoney_global | 结算金额（全局本币） | settlemoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | gathermoney | 收款金额 | gathermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | gathermoney_org | 收款金额（本币） | gathermoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | gathermoney_group | 收款金额（集团本币） | gathermoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | gathermoney_global | 收款金额（全局本币） | gathermoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | settle_date | 结算日期 | settle_date | char(19) |  | 日期 (UFDate) |
| 27 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 28 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 29 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |