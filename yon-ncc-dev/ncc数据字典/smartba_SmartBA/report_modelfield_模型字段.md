# |<<

**模型字段 (report_modelfield / nc.vo.report.datamodel.ModelFieldVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4875.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_modelfield | 主键 | pk_modelfield | char(20) | √ | 主键 (UFID) |
| 2 | code | 字段编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 字段名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | fieldtype | 字段分类 | fieldtype | char(1) | √ | 字段分类 (fieldtype) |  | D=标签; |