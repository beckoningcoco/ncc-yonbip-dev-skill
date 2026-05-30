# |<<

**组织_业务单元_报表组织 (org_reportorg / nc.vo.org.ReportOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4155.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportorg | 主键 | pk_reportorg | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(90) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |