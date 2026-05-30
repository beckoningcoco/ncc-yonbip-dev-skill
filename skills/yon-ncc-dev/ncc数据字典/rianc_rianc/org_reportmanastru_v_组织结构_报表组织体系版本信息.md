# |<<

**组织结构_报表组织体系版本信息 (org_reportmanastru_v / nc.vo.vorg.ReportManaStruVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4153.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_reportmanastru | 报表组织体系主键 | pk_reportmanastru | varchar(20) |  | 组织结构_报表组织体系 (reportmanastru) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态 (enablestate) |  | 1=未启用; |