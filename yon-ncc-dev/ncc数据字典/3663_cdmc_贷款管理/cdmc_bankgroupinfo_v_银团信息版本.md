# |<<

**银团信息版本 (cdmc_bankgroupinfo_v / nc.vo.cdmc.cdm.financepay.version.BankGroupInfoVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1323.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_bankgroup_b | 子表pk | pk_bankgroup_b | char(20) |  | 主键 (UFID) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | banktype | 银行类别 | banktype | varchar(50) |  | 银团银行类别 (BankTypeEnum) |  | AGENT=代理行; |