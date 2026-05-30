# |<<

**日期信息 (bd_workcalendardate / nc.vo.bd.workcalendar.WorkCalendarDateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1159.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workcalendardate | 主键 | pk_workcalendardate | char(20) | √ | 主键 (UFID) |
| 2 | calendardate | 日历日期 | calendardate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | datetype | 日期类型 | datetype | int | √ | 日期类型 (holidaytype) |  | 0=工作日; |