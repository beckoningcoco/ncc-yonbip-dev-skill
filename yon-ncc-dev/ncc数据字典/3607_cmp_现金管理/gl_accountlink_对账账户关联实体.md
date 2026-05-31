# |<<

**对账账户关联实体 (gl_accountlink / nc.vo.cmp.cb.AccountlinkVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2339.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountlink | 对账账户关联Oid | pk_accountlink | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_contrastaccount | 对帐账户Oid | pk_contrastaccount | varchar(20) |  | 对账账户实体 (contrastaccount) |
| 5 | bankaccount | 银行帐户Oid | bankaccount | varchar(20) |  | 字符串 (String) |
| 6 | pk_subject | 科目Oid | pk_subject | varchar(20) |  | 字符串 (String) |
| 7 | pk_ass | 辅助核算 | pk_ass | varchar(20) |  | 字符串 (String) |
| 8 | memo | 备注 | memo | varchar(500) |  | 字符串 (String) |
| 9 | debitamount | 借方 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | creditamount | 贷方 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | bankno | 外部银行账户号 | bankno | varchar(50) |  | 字符串 (String) |
| 12 | memo1 | 备用1 | memo1 | varchar(100) |  | 字符串 (String) |
| 13 | memo2 | 备用2 | memo2 | varchar(100) |  | 字符串 (String) |
| 14 | memo3 | 备用3 | memo3 | varchar(100) |  | 字符串 (String) |
| 15 | years | 启用年度 | years | varchar(20) |  | 字符串 (String) |
| 16 | pk_accbank | 开户银行帐号 | pk_accbank | varchar(20) |  | 字符串 (String) |
| 17 | period | 启用会计期间 | period | varchar(20) |  | 字符串 (String) |
| 18 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |