# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7408.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobresult | pk_jobresult | pk_jobresult | char(20) | √ |
| 2 | calstatus | calstatus | calstatus | number(38, 0) |
| 3 | caltime | caltime | caltime | char(19) |
| 4 | caluser | caluser | caluser | varchar2(20) |  |  | '~' |
| 5 | exeresult | exeresult | exeresult | varchar2(50) |
| 6 | exestatus | exestatus | exestatus | varchar2(50) |
| 7 | exetime | exetime | exetime | char(19) |
| 8 | exeuser | exeuser | exeuser | varchar2(20) |  |  | '~' |
| 9 | pk_accountbook | pk_accountbook | pk_accountbook | varchar2(20) |  |  | '~' |
| 10 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(20) |  |  | '~' |
| 11 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 12 | pk_costcentergrp | pk_costcentergrp | pk_costcentergrp | varchar2(20) |  |  | '~' |
| 13 | pk_jobsegmentation | pk_jobsegmentation | pk_jobsegmentation | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | pk_tbversion | pk_tbversion | pk_tbversion | varchar2(20) |  |  | '~' |
| 17 | splitmethod | splitmethod | splitmethod | varchar2(50) |
| 18 | def1 | def1 | def1 | varchar2(101) |
| 19 | def2 | def2 | def2 | varchar2(101) |
| 20 | def3 | def3 | def3 | varchar2(101) |
| 21 | def4 | def4 | def4 | varchar2(101) |
| 22 | def5 | def5 | def5 | varchar2(101) |
| 23 | def6 | def6 | def6 | varchar2(101) |
| 24 | def7 | def7 | def7 | varchar2(101) |
| 25 | def8 | def8 | def8 | varchar2(101) |
| 26 | def9 | def9 | def9 | varchar2(101) |
| 27 | def10 | def10 | def10 | varchar2(101) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |