# |<<

**合同设备明细 (ali_contract_eq / nc.vo.ali.contract.leasecont.ContractInEquipVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/45.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_eq | 合同设备明细主键 | pk_contract_eq | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 资产组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 8 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 9 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 10 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 11 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 12 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 15 | rent_type | 计租方式 | rent_type | varchar(500) |  | 字符串 (String) |
| 16 | renttype_enum | 计租方式枚举 | renttype_enum | int |  | 计租方式 (LeaseRuleEnum) |  | 1=单次; |