# |<<

**保修合同 (pam_warcontract / nc.vo.aim.warcontract.WarContractHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_warcontract | 保修合同主键 | pk_warcontract | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | bill_code | 合同编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | contract_name | 合同名称 | contract_name | varchar(80) |  | 字符串 (String) |
| 7 | con_version | 合同版本号 | con_version | varchar(50) |  | 字符串 (String) |
| 8 | bill_status | 合同状态 | bill_status | int |  | 保修合同单据状态 (wcbillstatus) |  | 0=自由态; |