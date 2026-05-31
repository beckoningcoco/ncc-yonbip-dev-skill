# |<<

**银团信息版本 (cdmc_syndicatedloan_v / nc.vo.cdmc.cdm.contract.version.SyndicatedLoanVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1405.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_syndicatedloan_b | 子表pk | pk_syndicatedloan_b | char(20) |  | 主键 (UFID) |
| 3 | financagency | 贷款机构 | financagency | varchar(20) |  | 银行档案 (bankdoc) |
| 4 | banktype | 银行类别 | banktype | varchar(50) |  | 银团银行类别 (BankTypeEnum) |  | AGENT=代理行; |