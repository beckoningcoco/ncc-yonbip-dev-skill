# |<<

**租出明细 (aol_contract_b / nc.vo.aol.contract.leasecont.ContractOutBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/113.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_b | 租出明细主键 | pk_contract_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 6 | pk_equip | 资产 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | equip_name | 资产名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 8 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 9 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 10 | pk_lease_target | 租赁对象 | pk_lease_target | varchar(20) |  | 租赁对象 (LeaseTargetVO) |
| 11 | describe | 租赁对象描述 | describe | varchar(400) |  | 字符串 (String) |
| 12 | lease_spce | 租赁对象规格 | lease_spce | varchar(400) |  | 字符串 (String) |
| 13 | lease_model | 租赁对象型号 | lease_model | varchar(400) |  | 字符串 (String) |
| 14 | rent_type | 计租方式 | rent_type | varchar(500) |  | 字符串 (String) |
| 15 | renttype_enum | 计租方式枚举 | renttype_enum | int |  | 计租方式 (LeaseRuleEnum) |  | 1=单次; |