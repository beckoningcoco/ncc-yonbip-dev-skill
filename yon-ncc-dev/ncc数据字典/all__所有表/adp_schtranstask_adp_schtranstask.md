# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6430.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | taskid | taskid | taskid | char(20) | √ |
| 2 | currentsystem | currentsystem | currentsystem | varchar2(20) |  |  | '~' |
| 3 | initdata | initdata | initdata | char(1) |
| 4 | mnemoniccode | mnemoniccode | mnemoniccode | varchar2(50) |
| 5 | origsystem | origsystem | origsystem | varchar2(20) |  |  | '~' |
| 6 | scheduledenable | scheduledenable | scheduledenable | char(1) |
| 7 | sysbgflag | sysbgflag | sysbgflag | char(1) |
| 8 | taskcode | taskcode | taskcode | varchar2(50) |
| 9 | taskname | taskname | taskname | varchar2(300) |
| 10 | taskname2 | taskname2 | taskname2 | varchar2(300) |
| 11 | taskname3 | taskname3 | taskname3 | varchar2(300) |
| 12 | taskname4 | taskname4 | taskname4 | varchar2(300) |
| 13 | taskname5 | taskname5 | taskname5 | varchar2(300) |
| 14 | taskname6 | taskname6 | taskname6 | varchar2(300) |
| 15 | taskremark | taskremark | taskremark | varchar2(300) |
| 16 | taskremark2 | taskremark2 | taskremark2 | varchar2(300) |
| 17 | taskremark3 | taskremark3 | taskremark3 | varchar2(300) |
| 18 | taskremark4 | taskremark4 | taskremark4 | varchar2(300) |
| 19 | taskremark5 | taskremark5 | taskremark5 | varchar2(300) |
| 20 | taskremark6 | taskremark6 | taskremark6 | varchar2(300) |
| 21 | taskstatus | taskstatus | taskstatus | number(38, 0) |
| 22 | tasktype | tasktype | tasktype | number(38, 0) |
| 23 | taskuuid | taskuuid | taskuuid | varchar2(50) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |