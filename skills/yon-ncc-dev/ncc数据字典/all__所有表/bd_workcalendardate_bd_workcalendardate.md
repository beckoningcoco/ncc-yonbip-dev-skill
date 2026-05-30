# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7277.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workcalendardate | pk_workcalendardate | pk_workcalendardate | char(20) | √ |
| 2 | calendardate | calendardate | calendardate | char(10) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | datetype | datetype | datetype | number(38, 0) | √ |
| 5 | memo | memo | memo | varchar2(1024) |
| 6 | offdutytime | offdutytime | offdutytime | varchar2(8) |
| 7 | ondutytime | ondutytime | ondutytime | varchar2(8) |
| 8 | pk_workcalendar | pk_workcalendar | pk_workcalendar | char(20) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |