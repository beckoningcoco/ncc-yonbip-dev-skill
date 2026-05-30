# |<<

**期末结账 (gl_syssettled / nc.vo.gl.syssettle.syssettle)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2486.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_syssettled | 结账标识 | pk_syssettled | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | funccode | 节点号 | funccode | varchar(60) |  | 字符串 (String) |
| 5 | settledyear | 结帐年 | settledyear | varchar(4) |  | 字符串 (String) |
| 6 | settledperiod | 结帐期间 | settledperiod | varchar(2) |  | 字符串 (String) |
| 7 | settleddate | 结帐日期 | settleddate | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |