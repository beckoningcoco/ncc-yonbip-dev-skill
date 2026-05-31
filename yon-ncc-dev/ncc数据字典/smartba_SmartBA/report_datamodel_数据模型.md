# |<<

**数据模型 (report_datamodel / nc.vo.report.datamodel.DataModelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4873.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datamodel | 主键 | pk_datamodel | char(20) | √ | 主键 (UFID) |
| 2 | code | 模型编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 模型名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | moduleid | 所属模块 | moduleid | varchar(50) | √ | 字符串 (String) |
| 5 | providerclass | 数据提供者 | providerclass | varchar(200) | √ | 字符串 (String) |
| 6 | domain | 所属领域 | domain | varchar(50) |  | 字符串 (String) |
| 7 | domainname | 领域名称 | domainname | varchar(50) |  | 字符串 (String) |
| 8 | domainresid | 领域名称多语 | domainresid | varchar(50) |  | 字符串 (String) |
| 9 | extendclass | 扩展类 | extendclass | varchar(300) |  | 字符串 (String) |
| 10 | extendjspath | 扩展前端资源路径 | extendjspath | varchar(200) |  | 字符串 (String) |
| 11 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |