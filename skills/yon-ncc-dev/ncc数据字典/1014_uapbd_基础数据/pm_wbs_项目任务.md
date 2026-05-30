# |<<

**项目任务 (pm_wbs / nc.vo.pmpub.wbs.WbsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4556.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wbs | WBS主键 | pk_wbs | char(20) | √ | 主键 (UFID) |
| 2 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 3 | wbs_code | 任务编码 | wbs_code | varchar(40) |  | 字符串 (String) |
| 4 | wbs_name | 任务名称 | wbs_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 5 | description | 任务描述 | description | varchar(200) |  | 字符串 (String) |
| 6 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |