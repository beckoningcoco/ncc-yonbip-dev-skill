# |<<

**报表查询条件 (report_querycondition / nc.vo.report.reportobject.ReportQueryCondition)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4876.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportquery | 查询条件主键 | pk_reportquery | char(20) | √ | 主键 (UFID) |
| 2 | pk_datamodel | 数据模型 | pk_datamodel | varchar(20) |  | 字符串 (String) |
| 3 | pk_modelfield | 数据模型字段ID | pk_modelfield | varchar(20) |  | 字符串 (String) |
| 4 | fieldcode | 数据模型编码 | fieldcode | varchar(500) |  | 字符串 (String) |
| 5 | showname | 显示名称 | showname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | dataval | 条件可选值 | dataval | varchar(2000) |  | 字符串 (String) |
| 7 | defaultval | 默认值 | defaultval | varchar(2000) |  | 字符串 (String) |
| 8 | ifmust | 是否必输 | ifmust | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isshow | 是否显示 | isshow | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | ifimmobility | 是否可编辑（固定条件） | ifimmobility | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | dispsequence | 显示顺序 | dispsequence | int |  | 整数 (Integer) |
| 12 | modelname | 模型名称 | modelname | varchar(50) |  | 字符串 (String) |
| 13 | datatype | 数据类型 | datatype | varchar(50) |  | 字符串 (String) |
| 14 | refclassname | 参照类名 | refclassname | varchar(200) |  | 字符串 (String) |
| 15 | reftype | 参照类型 | reftype | varchar(50) |  | 字符串 (String) |
| 16 | ispreset | 是否预置查询条件 | ispreset | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | ismultiple | 查询条件是否可多选 | ismultiple | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | classid | 元数据ID | classid | varchar(50) |  | 字符串 (String) |
| 19 | refpath | 参照路径 | refpath | varchar(500) |  | 字符串 (String) |
| 20 | refname | 参照名称 | refname | varchar(200) |  | 多语文本 (MultiLangText) |
| 21 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |