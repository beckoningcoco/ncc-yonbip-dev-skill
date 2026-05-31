# |<<

**合并科目金额属性 (iufo_hbaccountprop / nc.vo.hbbb.account.HBAccountPropVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3449.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accprop | 主键 | pk_accprop | varchar(50) | √ | 字符串 (String) |
| 2 | pk_account | 对应科目主键 | pk_account | char(20) | √ | 合并科目 (hbaccount) |
| 3 | pk_accchart | 对应合并科目表主键 | pk_accchart | varchar(20) |  | 合并科目表 (合并科目表) |
| 4 | name | 科目属性名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | direction | 方向 | direction | int |  | 科目方向 (Balanorient) |  | 0=借方; |