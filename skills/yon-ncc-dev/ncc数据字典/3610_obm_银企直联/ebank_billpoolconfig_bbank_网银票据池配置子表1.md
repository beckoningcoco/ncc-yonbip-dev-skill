# |<<

**网银票据池配置子表1 (ebank_billpoolconfig_bbank / nc.vo.obm.ebankbillpoolconfig.BillPoolConfigBBankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1751.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billpoolconfig_bbank | 子表主键1 | pk_billpoolconfig_bbank | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 5 | pk_billpoolconfig | 主表主键 | pk_billpoolconfig | varchar(50) |  | 字符串 (String) |
| 6 | bankname | 银行名称 | bankname | varchar(50) |  | 字符串 (String) |
| 7 | banktype | 银行编码 | banktype | varchar(50) |  | 字符串 (String) |
| 8 | netbankinftpcode | 银行接口类型 | netbankinftpcode | varchar(50) | √ | 网银接口类别 (netbankinftpcode) |  | 00015=工商银行; |