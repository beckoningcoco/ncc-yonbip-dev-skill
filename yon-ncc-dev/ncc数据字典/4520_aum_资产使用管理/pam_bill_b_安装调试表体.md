# |<<

**安装调试表体 (pam_bill_b / nc.vo.aum.install.InstallBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4225.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bill_b | 业务单子表主键 | pk_bill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_card | 固定资产卡片 | pk_card | varchar(50) |  | 字符串 (String) |
| 7 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | serial_num | 存货序列号 | serial_num | varchar(80) |  | 字符串 (String) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 12 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 13 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 14 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 15 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 16 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 17 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 18 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 19 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 20 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 21 | pk_cusmandoc | 客商档案 | pk_cusmandoc | varchar(20) |  | 供应商基本信息 (supplier) |
| 22 | deadline | 期限 | deadline | char(19) |  | 日期 (UFDate) |
| 23 | start_date | 开始调试日期 | start_date | char(19) |  | 日期 (UFDate) |
| 24 | end_date | 结束调试日期 | end_date | char(19) |  | 日期 (UFDate) |
| 25 | pk_srcdist_b | 设备来源 | pk_srcdist_b | varchar(20) |  | 设备来源表体 (SrcDistBodyVo) |
| 26 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 27 | bill_type_src | 来源单据类型 | bill_type_src | varchar(4) |  | 字符串 (String) |
| 28 | transi_type_src | 来源交易类型 | transi_type_src | varchar(30) |  | 字符串 (String) |
| 29 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 30 | bill_code_src | 来源单据编码 | bill_code_src | varchar(40) |  | 字符串 (String) |
| 31 | pk_bill_b_src | 来源单据表体主键 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 32 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 33 | money_global | 调试费用（全局本币） | money_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | money_group | 调试费用（集团本币） | money_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | money_org | 调试费用 | money_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 36 | install_fee | 安装调试费用 | install_fee | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | pk_used_status | 设置使用状态 | pk_used_status | varchar(20) |  | 设备状态 (StatusVO) |
| 38 | payable_flag | 应付标记 | payable_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 40 | purc_price | 无税价格 | purc_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | purc_price_global | 无税价格（全局） | purc_price_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 42 | purc_price_group | 无税价格（集团） | purc_price_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 43 | purc_price_tax | 含税价格 | purc_price_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 44 | purc_price_tax_group | 含税价格（集团） | purc_price_tax_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 45 | purc_price_tax_global | 含税价格（全局） | purc_price_tax_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 46 | pk_transitype_src | 来源交易类型主键 | pk_transitype_src | varchar(20) |  | 字符串 (String) |
| 47 | pk_used_status_after | 使用后状态 | pk_used_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 48 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |