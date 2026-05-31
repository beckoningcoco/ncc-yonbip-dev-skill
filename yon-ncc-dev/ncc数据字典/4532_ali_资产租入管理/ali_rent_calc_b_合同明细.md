# |<<

**合同明细 (ali_rent_calc_b / nc.vo.ali.rent.calculate.RentInContractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/60.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent_calc_b | 合同明细主键 | pk_rent_calc_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_contract | 合同编码 | pk_contract | varchar(20) |  | 租入合同 (ContractInHeadVO) |
| 7 | contract_no | 合同号 | contract_no | varchar(80) |  | 字符串 (String) |
| 8 | lease_bill_code | 租入单号 | lease_bill_code | varchar(40) |  | 字符串 (String) |
| 9 | pk_lease | 租入单主键 | pk_lease | varchar(20) |  | 字符串 (String) |
| 10 | pk_lease_in_b | 租入单表体主键 | pk_lease_in_b | varchar(20) |  | 字符串 (String) |
| 11 | transi_type | 租入单交易类型 | transi_type | varchar(30) |  | 字符串 (String) |
| 12 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 13 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 14 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 15 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 16 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 17 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 18 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 19 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 20 | pk_currency_origin | 原币币种 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 21 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | calculate_rent | 计算租金 | calculate_rent | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 23 | calculate_rent_org | 计算租金（本币） | calculate_rent_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 24 | calculate_rent_group | 计算租金（集团） | calculate_rent_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 25 | calculate_rent_global | 计算租金（全局） | calculate_rent_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 26 | adjust_rent | 调整后租金 | adjust_rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | adjust_rent_org | 调整后租金（本币） | adjust_rent_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 28 | adjust_rent_group | 调整后租金（集团） | adjust_rent_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 29 | adjust_rent_global | 调整后租金（全局） | adjust_rent_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 30 | calc_date_old | 上次租金计算日期 | calc_date_old | char(19) |  | 日期 (UFDate) |
| 31 | last_rent_date | 本次计算日期 | last_rent_date | char(19) |  | 日期 (UFDate) |
| 32 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 33 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 34 | coop_pk_bill_b | 协同来源单据子表主键 | coop_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 35 | coop_bill_type | 协同来源单据类型 | coop_bill_type | varchar(20) |  | 字符串 (String) |
| 36 | coop_transi_type | 协同来源交易类型 | coop_transi_type | varchar(30) |  | 字符串 (String) |
| 37 | coop_bill_code | 协同来源单据单据号 | coop_bill_code | varchar(40) |  | 字符串 (String) |
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