# |<<

**跌价提取单_利润中心 (ia_ilbill / nc.vo.ia.mil.entity.ILHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2849.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 跌价提取单_利润中心 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 4 | pk_org | 利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | caccountperiod | 会计期间 | caccountperiod | varchar(7) |  | 字符串 (String) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 9 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 10 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 11 | pk_org_v | 利润中心版本 | pk_org_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 12 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 13 | fbookflag | 账簿属性 | fbookflag | int |  | 账簿属性 (fbookflag) |  | 1=财务; |