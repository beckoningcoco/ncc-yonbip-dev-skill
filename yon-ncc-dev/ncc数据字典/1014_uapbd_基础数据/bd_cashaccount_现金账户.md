# |<<

**现金账户 (bd_cashaccount / nc.vo.bd.cashaccount.CashAccountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/386.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashaccount | 现金账户主键 | pk_cashaccount | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | code | 现金账户编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | name | 现金账户名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | innorcode | 助记码 | innorcode | varchar(50) |  | 字符串 (String) |
| 7 | pk_moneytype | 币种 | pk_moneytype | varchar(20) |  | 币种 (currtype) |
| 8 | notice | 备注 | notice | varchar(1024) |  | 备注 (Memo) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |