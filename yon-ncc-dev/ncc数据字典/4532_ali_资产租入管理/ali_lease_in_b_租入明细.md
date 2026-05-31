# |<<

**租入明细 (ali_lease_in_b / nc.vo.ali.lease.leasein.LeaseInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/56.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lease_in_b | 租入单子表主键 | pk_lease_in_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | src_pk_bill | 来源单据主表主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 7 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 8 | src_pk_bill_b_oid | 来源单据子表oid | src_pk_bill_b_oid | varchar(20) |  | 字符串 (String) |
| 9 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 10 | src_rowno | 合同行号 | src_rowno | varchar(30) |  | 字符串 (String) |
| 11 | src_bill_code | 来源单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 12 | src_trans_type | 来源交易类型 | src_trans_type | varchar(30) |  | 字符串 (String) |
| 13 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 14 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 15 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 16 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 17 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 18 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 19 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 20 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 21 | rent_type | 计租方式 | rent_type | varchar(500) |  | 字符串 (String) |
| 22 | rent_type_enum | 计租方式枚举 | rent_type_enum | int |  | 计租方式 (LeaseRuleEnum) |  | 1=单次; |