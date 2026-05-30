# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6440.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | taskexecid | taskexecid | taskexecid | char(20) | √ |
| 2 | endtime | endtime | endtime | char(19) |
| 3 | exectime | exectime | exectime | char(19) |
| 4 | execuser | execuser | execuser | varchar2(20) |  |  | '~' |
| 5 | rescount | rescount | rescount | number(38, 0) |
| 6 | taskid | taskid | taskid | varchar2(20) | √ |  | '~' |
| 7 | transsessionid | transsessionid | transsessionid | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |