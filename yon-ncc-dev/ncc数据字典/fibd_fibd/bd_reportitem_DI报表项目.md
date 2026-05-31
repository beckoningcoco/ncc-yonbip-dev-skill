# |<<

**DI报表项目 (bd_reportitem / nc.vo.bd.reportitem.ReportItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/959.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportitem | 报表项目主键 | pk_reportitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_reportsystem | 报表项目体系主键 | pk_reportsystem | char(20) | √ | 报表项目体系 (reportsystem) |
| 3 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 6 | itemlevel | 项目级次 | itemlevel | int |  | 整数 (Integer) |
| 7 | itemprop | 项目性质 | itemprop | int | √ | 报表项目性质 (ReportItemPropEnum) | 1 | 1=金额; |