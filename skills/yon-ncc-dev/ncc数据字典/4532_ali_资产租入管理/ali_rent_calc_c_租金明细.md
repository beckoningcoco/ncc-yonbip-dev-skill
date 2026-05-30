# |<<

**租金明细 (ali_rent_calc_c / nc.vo.ali.rent.calculate.RentInDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/61.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent_calc_c | 租金明细主键 | pk_rent_calc_c | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | lease_bill_code | 租入单号 | lease_bill_code | varchar(40) |  | 字符串 (String) |
| 7 | pk_lease | 租入单主键 | pk_lease | varchar(20) |  | 字符串 (String) |
| 8 | pk_lease_in_b | 租入单表体主键 | pk_lease_in_b | varchar(20) |  | 字符串 (String) |
| 9 | transi_type | 租入单交易类型 | transi_type | varchar(30) |  | 字符串 (String) |
| 10 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 11 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 12 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 13 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 14 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 15 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 16 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 17 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 18 | cal_start_date | 起始日期 | cal_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 19 | cal_end_date | 截至日期 | cal_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 20 | rent_type | 计租方式 | rent_type | varchar(500) |  | 字符串 (String) |
| 21 | rent_calmode | 租金计算方式 | rent_calmode | int |  | 租金计算方式 (RentCalTypeEnum) |  | 1=合同约定标准; |