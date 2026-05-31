# |<<

**工作日历 (bd_workcalendar / nc.vo.bd.workcalendar.WorkCalendarVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1158.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workcalendar | 主键 | pk_workcalendar | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_workcalendrule | 依据日历规则 | pk_workcalendrule | char(20) | √ | 工作日历规则 (workcalendarrule) |
| 5 | code | 工作日历编码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 工作日历名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | isdefaultcalendar | 默认工作日历 | isdefaultcalendar | char(1) |  | 布尔类型 (UFBoolean) | N |
| 8 | begindate | 起始日 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 9 | enddate | 结束日 | enddate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 10 | yearstartdate | 工作日历年度起始日 | yearstartdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |