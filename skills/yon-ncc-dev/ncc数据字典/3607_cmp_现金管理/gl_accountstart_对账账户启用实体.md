# |<<

**对账账户启用实体 (gl_accountstart / nc.vo.cmp.accountstart.AccountStart)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2341.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountstart | 对账账户启用Oid | pk_accountstart | char(20) | √ | 主键 (UFID) |
| 2 | pk_contrastaccount | 对帐账户Oid | pk_contrastaccount | varchar(20) |  | 对账账户实体 (contrastaccount) |
| 3 | years | 启用年度 | years | varchar(20) |  | 字符串 (String) |
| 4 | period | 启用会计期间 | period | varchar(20) |  | 字符串 (String) |
| 5 | startdate | 启用日期 | startdate | char(19) |  | 日期 (UFDate) |
| 6 | debitamount | 借方余额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | creditamount | 贷方余额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | stopdate | 停用日期 | stopdate | char(19) |  | 日期 (UFDate) |
| 9 | status | 状态 | status | char(1) |  | 布尔类型 (UFBoolean) |