# |<<

**租赁资产豁免单表体 (ali_used_exemption_b / nc.vo.ali.used.exemption.UsedExemptionBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/76.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exemption_b | 租赁资产豁免子表主键 | pk_exemption_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_contract | 合同编码 | pk_contract | varchar(20) |  | 租入合同 (ContractInHeadVO) |
| 7 | pk_equip | 资产 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 8 | equip_code | 资产编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 9 | equip_name | 资产名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 10 | pk_category | 资产类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 11 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 12 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 13 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 15 | start_date | 起租日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 16 | start_pay_date | 起算日期 | start_pay_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | end_date | 止租日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 18 | include_use | 包含使用权 | include_use | int |  | 包含使用权 (IncludeUseConst) |  | 1=是; |