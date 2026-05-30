# |<<

**收支项目 (bd_inoutbusiclass / nc.vo.bd.inoutbusiclass.InoutBusiClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/868.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inoutbusiclass | 收支项目主键 | pk_inoutbusiclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 收支项目编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 收支项目名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_parent | 上级收支项目 | pk_parent | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 8 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 9 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 10 | seq | 内部编码序号 | seq | varchar(20) |  | 字符串 (String) |
| 11 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |