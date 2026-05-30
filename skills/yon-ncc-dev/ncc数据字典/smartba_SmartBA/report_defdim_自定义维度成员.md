# |<<

**自定义维度成员 (report_defdim / nc.vo.report.reportobject.ReportDefdim)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4874.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_defdim | 主键ID | pk_defdim | char(20) | √ | 主键 (UFID) |
| 2 | dimname | 成员名称 | dimname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | showname | 显示名称 | showname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | dimcode | 成员编码 | dimcode | varchar(50) |  | 字符串 (String) |
| 5 | fathercode | 父维度编码 | fathercode | varchar(50) |  | 字符串 (String) |
| 6 | pk_doc | 档案值 | pk_doc | varchar(200) |  | 字符串 (String) |
| 7 | dimtype | 成员类型 | dimtype | int |  | 成员类型 (dimtype) |  | 1=虚维度; |