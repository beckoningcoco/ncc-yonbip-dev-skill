# |<<

**租金分段明细 (ali_rent_settle_c / nc.vo.ali.rent.settle.RentInSettleDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/64.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rentsettle_c | 租金分段明细主键 | pk_rentsettle_c | char(20) | √ | 主键 (UFID) |
| 2 | start_date | 开始日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 3 | end_date | 截止日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 4 | pre_rent | 租金单价含税 | pre_rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | pre_rentnotax | 租金单价无税 | pre_rentnotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | rent_day | 日租金含税 | rent_day | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | rent_daynotax | 日租金无税 | rent_daynotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | rent_day_org | 日租金含税（本币） | rent_day_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | rent_daynotax_org | 日租金无税（本币） | rent_daynotax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | calculate_renttax | 计算租金含税 | calculate_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | calculate_rentnotax | 计算租金无税 | calculate_rentnotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | calculate_tax | 计算租金税额 | calculate_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | calculate_renttax_org | 计算租金含税（本币） | calculate_renttax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | calculate_rentnotax_org | 计算租金无税（本币） | calculate_rentnotax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | calculate_tax_org | 计算租金税额（本币） | calculate_tax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | calculate_renttax_group | 计算租金含税（集团本币） | calculate_renttax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | calculate_rentnotax_group | 计算租金无税（集团本币） | calculate_rentnotax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | calculate_renttax_global | 计算租金含税（全局本币） | calculate_renttax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | calculate_rentnotax_global | 计算租金无税（全局本币） | calculate_rentnotax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | adjustment_renttax | 调整后租金含税 | adjustment_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | adjustment_rentnotax | 调整后租金无税 | adjustment_rentnotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | adjustment_tax | 调整后租金税额 | adjustment_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | adjustment_renttax_org | 调整后租金含税（本币） | adjustment_renttax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | adjustment_rentnotax_org | 调整后租金无税（本币） | adjustment_rentnotax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | adjustment_tax_org | 调整后租金税额（本币） | adjustment_tax_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | adjustment_renttax_group | 调整后租金含税（集团本币） | adjustment_renttax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | adjustment_rentnotax_group | 调整后租金无税（集团本币） | adjustment_rentnotax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | adjustment_renttax_global | 调整后租金含税（全局本币） | adjustment_renttax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | adjustment_rentnotax_global | 调整后租金无税（全局本币） | adjustment_rentnotax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 31 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 32 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 字符串 (String) |
| 33 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 34 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 35 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 36 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 37 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 38 | src_bill_code | 来源单据单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 39 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 40 | pk_rentsettle_b | 结算单表体主键 | pk_rentsettle_b | varchar(20) |  | 字符串 (String) |
| 41 | src_pk_contract_eq | 来源资产明细主键 | src_pk_contract_eq | varchar(20) |  | 字符串 (String) |
| 42 | src_pk_contract_eq_oid | 来源资产明细主键oid | src_pk_contract_eq_oid | varchar(20) |  | 字符串 (String) |
| 43 | src_pk_workload_b | 来源工作量表体主键 | src_pk_workload_b | varchar(20) |  | 字符串 (String) |
| 44 | tax_category | 税码 | tax_category | varchar(20) |  | 增值税税码税率 (taxcode) |
| 45 | tax_rate | 税率 | tax_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | pk_currency_origin | 原币币种 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 48 | equip_code | 资产编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 49 | contract_no | 合同号 | contract_no | varchar(50) |  | 字符串 (String) |
| 50 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 字符串 (String) |
| 51 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |