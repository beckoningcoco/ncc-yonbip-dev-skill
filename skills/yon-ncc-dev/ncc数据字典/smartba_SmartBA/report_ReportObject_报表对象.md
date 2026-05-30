# |<<

**报表对象 (report_ReportObject / nc.vo.report.reportobject.ReportObject)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | 报表主键 | pk_report | char(20) | √ | 主键 (UFID) |
| 2 | code | 报表编码 | code | varchar(20) | √ | 字符串 (String) |
| 3 | name | 报表名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 5 | pk_reportclass | 报表分类 | pk_reportclass | varchar(20) | √ | 报表分类 (ReportClass) |
| 6 | reportstatus | 报表状态 | reportstatus | varchar(20) | √ | 报表状态 (ReportStatus) |  | 1=未发布; |