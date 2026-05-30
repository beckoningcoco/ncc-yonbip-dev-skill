# |<<

**财务数据方案 (bd_di_scheme / nc.vo.bd.intdata.scheme.DISchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/797.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheme | 方案主键 | pk_scheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_sort | 方案分类 | pk_sort | varchar(20) |  | 整合方案分类 (dataintschemasort) |
| 3 | code | 方案编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 方案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |