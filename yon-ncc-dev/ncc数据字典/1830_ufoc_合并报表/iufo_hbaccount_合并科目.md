# |<<

**合并科目 (iufo_hbaccount / nc.vo.hbbb.account.HBAccountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account | 主键 | pk_account | char(20) | √ | 主键 (UFID) |
| 2 | pk_accchart | 所属合并科目表 | pk_accchart | varchar(0) |  | 合并科目表 (合并科目表) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | direction | 方向 | direction | int |  | 科目方向 (Balanorient) |  | 0=借方; |