# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | recordid | recordid | recordid | char(20) | √ |
| 2 | endtime | endtime | endtime | char(19) |
| 3 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 4 | runresult | runresult | runresult | varchar2(500) |
| 5 | runstatus | runstatus | runstatus | number(38, 0) |
| 6 | savepath | savepath | savepath | varchar2(500) |
| 7 | starttime | starttime | starttime | char(19) |
| 8 | trigertype | trigertype | trigertype | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |