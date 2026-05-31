# |<<

**报表分类 (report_ReportClass / nc.vo.report.reportclass.ReportClass)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4878.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportclass | 分类主键 | pk_reportclass | char(20) | √ | 主键 (UFID) |
| 2 | name | 分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_parent | 父分类主键 | pk_parent | char(20) |  | 主键 (UFID) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | ispreset | 是否预置 | ispreset | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | preclass | 前分类 | preclass | varchar(20) |  | 字符串 (String) |
| 7 | sequence | 次序 | sequence | varchar(50) |  | 字符串 (String) |
| 8 | domain | 领域编号 | domain | varchar(50) |  | 字符串 (String) |
| 9 | moduleid | 模块编号 | moduleid | varchar(50) |  | 字符串 (String) |
| 10 | type | 节点类型 | type | varchar(50) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |