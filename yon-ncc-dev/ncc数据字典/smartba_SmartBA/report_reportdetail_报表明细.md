# |<<

**报表明细 (report_reportdetail / nc.vo.report.reportobject.ReportDetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4879.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportdetail | 报表明细主键 | pk_reportdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_datamodel | 数据模型 | pk_datamodel | varchar(20) |  | 字符串 (String) |
| 3 | pk_modelfield | 模型字段ID | pk_modelfield | varchar(20) | √ | 字符串 (String) |
| 4 | fieldcode | 模型字段编码 | fieldcode | varchar(500) |  | 字符串 (String) |
| 5 | fieldname | 模型字段名称 | fieldname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | showname | 显示名称 | showname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | fieldtype | 字段类型 | fieldtype | varchar(20) | √ | 字段类型 (fieldType) |  | 1=行维度; |