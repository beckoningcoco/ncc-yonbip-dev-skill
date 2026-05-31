# |<<

**租入合同 (ali_contract / nc.vo.ali.contract.leasecont.ContractInHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/42.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 租入合同主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_org_in | 承租组织最新版本 | pk_org_in | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 6 | pk_org_in_v | 承租组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 7 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 9 | bill_code | 合同编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 10 | contract_no | 合同号 | contract_no | varchar(50) |  | 字符串 (String) |
| 11 | contract_name | 合同名称 | contract_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 12 | bill_status | 合同状态 | bill_status | int |  | 租入合同状态 (CIBillStatusConst) |  | 0=自由态; |