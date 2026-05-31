# |<<

**合同设备明细 (alo_contract_eq / nc.vo.alo.contract.leasecont.ContractOutEquipVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/85.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_d | 合同设备明细主键 | pk_contract_d | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | rent_type | 计租方式 | rent_type | varchar(500) |  | 字符串 (String) |
| 8 | renttype_enum | 计租方式枚举 | renttype_enum | int |  | 计租方式 (LeaseRuleEnum) |  | 1=单次; |