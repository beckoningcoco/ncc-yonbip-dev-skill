# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6702.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adptask | pk_adptask | pk_adptask | char(20) | √ |
| 2 | condition | condition | condition | varchar2(4000) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | planstarttime | planstarttime | planstarttime | char(19) |
| 5 | remark | remark | remark | varchar2(200) |
| 6 | runfinishtime | runfinishtime | runfinishtime | char(19) |
| 7 | runner | runner | runner | varchar2(20) |  |  | '~' |
| 8 | runstarttime | runstarttime | runstarttime | char(19) |
| 9 | schedule | schedule | schedule | number(38, 0) |
| 10 | server | server | server | varchar2(50) |
| 11 | sourceadp | sourceadp | sourceadp | varchar2(20) |  |  | '~' |
| 12 | targetadp | targetadp | targetadp | varchar2(20) |  |  | '~' |
| 13 | taskcode | taskcode | taskcode | varchar2(50) |
| 14 | taskname | taskname | taskname | varchar2(200) |
| 15 | taskname2 | taskname2 | taskname2 | varchar2(200) |
| 16 | taskname3 | taskname3 | taskname3 | varchar2(200) |
| 17 | taskname4 | taskname4 | taskname4 | varchar2(200) |
| 18 | taskname5 | taskname5 | taskname5 | varchar2(200) |
| 19 | taskname6 | taskname6 | taskname6 | varchar2(200) |
| 20 | taskstatus | taskstatus | taskstatus | number(38, 0) |
| 21 | tasktype | tasktype | tasktype | number(38, 0) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |