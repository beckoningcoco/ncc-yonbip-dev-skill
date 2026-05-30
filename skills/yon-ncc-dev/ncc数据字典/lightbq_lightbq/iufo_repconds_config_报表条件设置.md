# |<<

**报表条件设置 (iufo_repconds_config / nccloud.vo.report.subscibetask.LightRepCondsConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conds_config | 报表条件设置主键 | pk_conds_config | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团pk | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 组织pk | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | id_subscribetask | 报表组合订阅pk | id_subscribetask | varchar(50) |  | 字符串 (String) |
| 5 | query_condition | 查询条件 | query_condition | image |  | 图片类型 (IMAGE) |
| 6 | pk_report | 自由报表pk | pk_report | varchar(50) |  | 字符串 (String) |
| 7 | pk_app | 小应用pk | pk_app | varchar(50) |  | 字符串 (String) |
| 8 | conditiondisplay | 条件显示内容 | conditiondisplay | image |  | BLOB (BLOB) |
| 9 | pk_apppage | 小应用页面pk | pk_apppage | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改者 | modifier | varchar(50) |  | 字符串 (String) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |