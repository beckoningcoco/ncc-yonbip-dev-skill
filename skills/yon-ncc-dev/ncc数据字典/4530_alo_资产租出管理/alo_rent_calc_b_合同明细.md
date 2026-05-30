# |<<

**合同明细 (alo_rent_calc_b / nc.vo.alo.rent.calculate.RentOutContractVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/96.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent_calc_b | 合同明细主键 | pk_rent_calc_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_contract | 合同编码 | pk_contract | varchar(20) |  | 租出合同 (ContractOutHeadVO) |
| 7 | contract_no | 合同号 | contract_no | varchar(80) |  | 字符串 (String) |
| 8 | lease_bill_code | 租出单号 | lease_bill_code | varchar(40) |  | 字符串 (String) |
| 9 | pk_lease | 租出单主键 | pk_lease | varchar(20) |  | 字符串 (String) |
| 10 | transi_type | 租出单交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 11 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 12 | pk_currency_origin | 原币币种 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 13 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | calculate_rent | 计算租金 | calculate_rent | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 15 | calculate_rent_org | 计算租金（本币） | calculate_rent_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 16 | calculate_rent_group | 计算租金（集团） | calculate_rent_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 17 | calculate_rent_global | 计算租金（全局） | calculate_rent_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 18 | adjust_rent | 调整后租金 | adjust_rent | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | adjust_rent_org | 调整后租金（本币） | adjust_rent_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 20 | adjust_rent_group | 调整后租金（集团） | adjust_rent_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 21 | adjust_rent_global | 调整后租金（全局） | adjust_rent_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 22 | last_rent_date | 本次计算日期 | last_rent_date | char(19) |  | 日期 (UFDate) |
| 23 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 24 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 25 | calc_date_old | 上次租金计算日期 | calc_date_old | char(19) |  | 日期 (UFDate) |
| 26 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |