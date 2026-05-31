# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8789.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | action | action | action | varchar2(50) |
| 3 | begintime | begintime | begintime | number(38, 0) |
| 4 | costtime | costtime | costtime | number(16, 3) |
| 5 | endtime | endtime | endtime | number(38, 0) |
| 6 | funccode | funccode | funccode | varchar2(50) | √ |
| 7 | creator | creator | creator | char(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |