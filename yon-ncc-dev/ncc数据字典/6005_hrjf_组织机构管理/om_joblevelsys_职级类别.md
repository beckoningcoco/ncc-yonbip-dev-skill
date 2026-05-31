# |<<

**职级类别 (om_joblevelsys / nc.vo.om.joblevelsys.JobLevelSysVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3938.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_joblevelsys | 职级类别主键 | pk_joblevelsys | char(20) | √ | 主键 (UFID) |
| 2 | code | 职级类别编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 职级类别名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |