# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7279.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workcalendweek | pk_workcalendweek | pk_workcalendweek | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | pk_workcalendar | pk_workcalendar | pk_workcalendar | char(20) | √ |
| 4 | weekamount | weekamount | weekamount | number(38, 0) |
| 5 | workyear | workyear | workyear | number(38, 0) | √ |
| 6 | workyearstartdate | workyearstartdate | workyearstartdate | char(10) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |