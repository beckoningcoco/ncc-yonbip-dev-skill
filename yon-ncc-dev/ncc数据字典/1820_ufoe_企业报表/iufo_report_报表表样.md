# |<<

**报表表样 (iufo_report / nc.vo.iufo.ufoereport.UfoeReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3498.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | 报表主键 | pk_report | char(20) | √ | 主键 (UFID) |
| 2 | code | 报表表样编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 报表表样名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_dir | 报表表样分类 | pk_dir | varchar(20) |  | 报表目录 (reportdir) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |