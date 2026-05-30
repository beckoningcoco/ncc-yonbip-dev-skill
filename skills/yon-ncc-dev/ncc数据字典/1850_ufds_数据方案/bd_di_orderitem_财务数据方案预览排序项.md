# |<<

**财务数据方案预览排序项 (bd_di_orderitem / nc.vo.bd.intdata.diorderitem.DIOrderItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/795.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orderitem | 排序项主键 | pk_orderitem | varchar(50) | √ | 字符串 (String) |
| 2 | code | 排序项字段编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 排序项字段名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | itemorder | 排序项排序类型 | itemorder | int |  | 整数 (Integer) |
| 5 | pk_scheme | 所属整合方案 | pk_scheme | varchar(20) |  | 财务数据方案 (dataintschema) |
| 6 | atindex | 排序项所在列索引 | atindex | int |  | 整数 (Integer) |