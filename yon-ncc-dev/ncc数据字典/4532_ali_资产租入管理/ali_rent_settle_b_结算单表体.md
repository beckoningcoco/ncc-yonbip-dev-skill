# |<<

**结算单表体 (ali_rent_settle_b / nc.vo.ali.rent.settle.RentInSettleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/63.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentsettle_b | 结算单子表主键 | pk_rentsettle_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_contract | 合同编码 | pk_contract | varchar(20) |  | 租入合同 (ContractInHeadVO) |
| 7 | contract_no | 合同号 | contract_no | varchar(50) |  | 字符串 (String) |
| 8 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 9 | pk_equip | 设备主键 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 10 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 11 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 12 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 13 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 14 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 15 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 16 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 17 | calculate_date | 租金计算日期 | calculate_date | char(19) |  | 日期 (UFDate) |
| 18 | pk_currency_origin | 原币币种 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 19 | rentmoney | 租金金额 | rentmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | rentmoney_org | 租金金额（本币） | rentmoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | rentmoney_group | 租金金额（集团本币） | rentmoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | rentmoney_global | 租金金额（全局本币） | rentmoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | expense | 费用金额 | expense | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | expense_org | 费用金额（本币） | expense_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | expense_group | 费用金额（集团本币） | expense_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | expense_global | 费用金额（全局本币） | expense_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | settlemoney | 结算金额 | settlemoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | settlemoney_org | 结算金额（本币） | settlemoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | settlemoney_group | 结算金额（集团本币） | settlemoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | settlemoney_global | 结算金额（全局本币） | settlemoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | settlemoneynotax_global | 结算无税金额（全局本币） | settlemoneynotax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | settlemoneynotax_group | 结算无税金额（集团本币） | settlemoneynotax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | settlemoneynotax_org | 结算无税金额（本币） | settlemoneynotax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | settlemoneynotax | 结算无税金额 | settlemoneynotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | settle_tax_org | 结算税额（本币） | settle_tax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | settle_tax | 结算税额 | settle_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | gathermoney | 付款金额 | gathermoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | gathermoney_org | 付款金额（本币） | gathermoney_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | gathermoney_group | 付款金额（集团本币） | gathermoney_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | gathermoney_global | 付款金额（全局本币） | gathermoney_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | gathermoneynotax_global | 已付款无税金额（全局本币） | gathermoneynotax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 42 | gathermoneynotax_group | 已付款无税金额（集团本币） | gathermoneynotax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 43 | gathermoneynotax_org | 已付款无税金额（本币） | gathermoneynotax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 44 | gathermoneynotax | 已付款无税金额 | gathermoneynotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 45 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 46 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 47 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 48 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 49 | src_bill_code | 来源单据单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 50 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 51 | pk_currency_local | 本币币种 | pk_currency_local | varchar(20) |  | 币种 (currtype) |
| 52 | coop_pk_bill_b | 协同来源单据子表主键 | coop_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 53 | coop_bill_type | 协同来源单据类型 | coop_bill_type | varchar(20) |  | 字符串 (String) |
| 54 | coop_transi_type | 协同来源交易类型 | coop_transi_type | varchar(30) |  | 字符串 (String) |
| 55 | coop_bill_code | 协同来源单据单据号 | coop_bill_code | varchar(40) |  | 字符串 (String) |
| 56 | payable_flag | 应付标志 | payable_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 57 | pk_lease_in | 租入单主键 | pk_lease_in | varchar(20) |  | 字符串 (String) |
| 58 | pk_lease_in_b | 租入单子表主键 | pk_lease_in_b | varchar(20) |  | 字符串 (String) |
| 59 | tax_category | 税码 | tax_category | varchar(20) |  | 增值税税码税率 (taxcode) |
| 60 | tax_rate | 税率 | tax_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 61 | rentmoney_notax | 租金金额无税 | rentmoney_notax | decimal(28, 8) |  | 金额 (UFMoney) |
| 62 | rentmoney_tax | 租金金额税额 | rentmoney_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 63 | rentmoney_notax_org | 租金金额无税（本币） | rentmoney_notax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 64 | rentmoney_tax_org | 租金金额税额（本币） | rentmoney_tax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 65 | rentmoney_notax_group | 租金金额无税（集团本币） | rentmoney_notax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 66 | rentmoney_notax_global | 租金金额无税（全局本币） | rentmoney_notax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 67 | adjustment_renttax | 调整后租金含税 | adjustment_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 68 | adjustment_rentnotax | 调整后租金无税 | adjustment_rentnotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 69 | adjustment_tax | 调整后租金税额 | adjustment_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 70 | adjustment_renttax_org | 调整后租金含税（本币） | adjustment_renttax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 71 | adjustment_rentnotax_org | 调整后租金无税（本币） | adjustment_rentnotax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 72 | adjustment_tax_org | 调整后租金税额（本币） | adjustment_tax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 73 | adjustment_renttax_group | 调整后租金含税（集团本币） | adjustment_renttax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 74 | adjustment_rentnotax_group | 调整后租金无税（集团本币） | adjustment_rentnotax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 75 | adjustment_renttax_global | 调整后租金含税（全局本币） | adjustment_renttax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 76 | adjustment_rentnotax_global | 调整后租金无税（全局本币） | adjustment_rentnotax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 77 | nogather_moneytax | 未付款含税金额 | nogather_moneytax | decimal(28, 8) |  | 金额 (UFMoney) |
| 78 | nogather_moneytax_org | 未付款含税金额（本币） | nogather_moneytax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 79 | nogather_moneytax_group | 未付款合计含税（集团本币） | nogather_moneytax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 80 | nogather_moneytax_global | 未付款合计含税（全局本币） | nogather_moneytax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 81 | nogather_moneynotax | 未付款无税金额 | nogather_moneynotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 82 | nogather_moneynotax_org | 未付款无税金额（本币） | nogather_moneynotax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 83 | nogather_moneynotax_group | 未付款无税金额（集团本币） | nogather_moneynotax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 84 | nogather_moneynotax_global | 未付款无税金额（全局本币） | nogather_moneynotax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 85 | src_pk_bill_b_src_pk_b | 来源子表的来源子表主键 | src_pk_bill_b_src_pk_b | varchar(20) |  | 字符串 (String) |
| 86 | src_pk_expense | 来源费用单主键 | src_pk_expense | varchar(20) |  | 字符串 (String) |
| 87 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 88 | scomment | 摘要 | scomment | varchar(40) |  | 字符串 (String) |
| 89 | contract_scene_flag | 租入合同场景 | contract_scene_flag | int |  | 租入合同场景 (ContractSceneConst) |  | 1=场景一; |