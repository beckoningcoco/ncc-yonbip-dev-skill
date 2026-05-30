# |<<

**行政组织 (org_adminorg / nc.vo.om.orginfo.HRAdminOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3986.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adminorg | 主键 | pk_adminorg | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fatherorg | 上级行政组织 | pk_fatherorg | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |