# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9690.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scheduleaction | pk_scheduleaction | pk_scheduleaction | char(20) | √ |
| 2 | actionname | actionname | actionname | varchar2(1) |
| 3 | pk_action | pk_action | pk_action | char(20) | √ |
| 4 | pk_actiontype | pk_actiontype | pk_actiontype | char(20) | √ |
| 5 | pk_org | pk_org | pk_org | char(20) | √ |
| 6 | pk_schedule | pk_schedule | pk_schedule | char(20) | √ |
| 7 | position | position | position | number(38, 0) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |