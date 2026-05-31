# |<<

**年度信息 (bd_workcalendyear / nc.vo.bd.workcalendar.WorkCalendarYearVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1161.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workcalendweek | 主键 | pk_workcalendweek | char(20) | √ | 主键 (UFID) |
| 2 | workyear | 工作年度 | workyear | int | √ | 整数 (Integer) |
| 3 | workyearstartdate | 年度起始日 | workyearstartdate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 4 | weekamount | 周数 | weekamount | int |  | 整数 (Integer) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |