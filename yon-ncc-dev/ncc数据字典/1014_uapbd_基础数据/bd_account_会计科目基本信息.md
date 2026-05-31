# |<<

**会计科目基本信息 (bd_account / nc.vo.bd.account.AccountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/311.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account | 主键 | pk_account | char(20) | √ | 主键 (UFID) |
| 2 | pk_accchart | 创建科目表 | pk_accchart | char(20) | √ | 科目表 (accchart) |
| 3 | code | 科目编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | name | 科目名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | pid | 上级科目 | pid | varchar(20) |  | 会计科目基本信息 (account) |
| 6 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | pk_originalaccount | 原始科目主键 | pk_originalaccount | varchar(20) |  | 字符串 (String) |
| 8 | pk_acctype | 科目类型 | pk_acctype | char(20) | √ | 科目类型 (acctype) |
| 9 | cashtype | 现金分类 | cashtype | smallint | √ | 现金分类 (CashBankFlag) | 0 | 0=其它; |