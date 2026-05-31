# |<<

**银行账户超额签核 (cmp_bankaccexsign / nc.vo.cmp.bankaccexsign.AccexsignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1533.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accexsign | 超额签核主键 | pk_accexsign | char(20) | √ | 主键 (UFID) |
| 2 | userid | 用户 | userid | varchar(20) |  | 用户 (user) |
| 3 | password | 密码 | password | varchar(50) |  | 字符串 (String) |
| 4 | pk_bankaccsub | 银行账户子户主键 | pk_bankaccsub | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | errornum | 出错次数 | errornum | int |  | 整数 (Integer) |
| 6 | islock | 是否锁定 | islock | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | accounttype | 账户类型 | accounttype | int |  | 超额签核账户类型 (exsignacctype) |  | 1=银行账户; |