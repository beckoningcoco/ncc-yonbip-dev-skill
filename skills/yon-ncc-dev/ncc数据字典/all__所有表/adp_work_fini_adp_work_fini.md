# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6446.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | wid | wid | wid | varchar2(50) | √ |
| 2 | dispatchcount | dispatchcount | dispatchcount | number(38, 0) | √ |
| 3 | elapsedmillis | elapsedmillis | elapsedmillis | number(38, 0) | √ |
| 4 | endtime | endtime | endtime | char(19) | √ |
| 5 | finishedcode | finishedcode | finishedcode | varchar2(30) | √ |
| 6 | starttime | starttime | starttime | char(19) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |