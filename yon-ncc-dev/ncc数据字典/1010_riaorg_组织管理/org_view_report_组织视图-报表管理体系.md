# |<<

**组织视图-报表管理体系 (org_view_report / nc.vo.org.orgview.OrgViewReportSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4195.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportsub | 报表子表主键 | pk_reportsub | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 5 | pk_fatherorg | 上级组织单元 | pk_fatherorg | varchar(20) |  | 组织结构_报表组织体系成员 (reportmanastrumember) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | ismanageorg | 报表管理组织 | ismanageorg | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | entityorg | 对应实体组织 | entityorg | varchar(100) |  | 字符串 (String) |
| 11 | pk_rms | 所属报表管理体系 | pk_rms | varchar(20) |  | 组织结构_报表组织体系 (reportmanastru) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |