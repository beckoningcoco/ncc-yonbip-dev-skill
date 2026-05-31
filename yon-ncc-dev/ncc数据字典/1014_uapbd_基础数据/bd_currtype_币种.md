# |<<

**币种 (bd_currtype / nc.vo.bd.currtype.CurrtypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/429.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currtype | 币种主键 | pk_currtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 币种编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 币种名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | currtypesign | 币种币符 | currtypesign | varchar(50) |  | 字符串 (String) |
| 7 | currdigit | 金额小数位数 | currdigit | smallint | √ | 财务系统精度 (currdigitenum) | 2 | 0=0; |