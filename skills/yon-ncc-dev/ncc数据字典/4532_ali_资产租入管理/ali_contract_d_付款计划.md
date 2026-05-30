# |<<

**付款计划 (ali_contract_d / nc.vo.ali.contract.leasecont.ContractInCalculationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/44.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_d | 付款计划主键 | pk_contract_d | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 6 | subsection_type | 分段类型 | subsection_type | varchar(50) |  | 字符串 (String) |
| 7 | amount_type | 金额类型 | amount_type | int |  | 金额类型 (AmountTypeConst) |  | 1=租金; |