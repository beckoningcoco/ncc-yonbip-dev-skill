# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | configid | configid | configid | char(20) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | createuser | createuser | createuser | varchar2(20) |  |  | '~' |
| 4 | enablestatus | enablestatus | enablestatus | number(38, 0) |
| 5 | endoperator | endoperator | endoperator | varchar2(20) |  |  | '~' |
| 6 | endopetime | endopetime | endopetime | char(19) |
| 7 | firstextime | firstextime | firstextime | char(19) |
| 8 | holdingtime | holdingtime | holdingtime | number(38, 0) |
| 9 | holdingtimetype | holdingtimetype | holdingtimetype | number(38, 0) |
| 10 | runcircle | runcircle | runcircle | number(38, 0) |
| 11 | runcircletype | runcircletype | runcircletype | number(38, 0) |
| 12 | savepath | savepath | savepath | varchar2(250) |
| 13 | trigertime | trigertime | trigertime | char(8) |
| 14 | version | version | version | number(38, 0) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |