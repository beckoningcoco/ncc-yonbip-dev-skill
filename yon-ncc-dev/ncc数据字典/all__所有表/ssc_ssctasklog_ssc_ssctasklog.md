# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11961.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ssctasklog | pk_ssctasklog | pk_ssctasklog | char(20) | √ |
| 2 | appointtime | appointtime | appointtime | char(19) |
| 3 | beginstate | beginstate | beginstate | varchar2(20) |  |  | '~' |
| 4 | begintime | begintime | begintime | char(19) |
| 5 | endstate | endstate | endstate | varchar2(20) |  |  | '~' |
| 6 | endtime | endtime | endtime | char(19) |
| 7 | lasttime | lasttime | lasttime | number(38, 0) |
| 8 | message | message | message | varchar2(400) |
| 9 | pk_busiact | pk_busiact | pk_busiact | varchar2(20) |  |  | '~' |
| 10 | pk_busiop | pk_busiop | pk_busiop | varchar2(20) |  |  | '~' |
| 11 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 12 | pk_post | pk_post | pk_post | varchar2(20) |  |  | '~' |
| 13 | pk_ssctask | pk_ssctask | pk_ssctask | varchar2(20) |  |  | '~' |
| 14 | def1 | def1 | def1 | varchar2(101) |
| 15 | def2 | def2 | def2 | varchar2(101) |
| 16 | def3 | def3 | def3 | varchar2(101) |
| 17 | def4 | def4 | def4 | varchar2(101) |
| 18 | def5 | def5 | def5 | varchar2(101) |
| 19 | def6 | def6 | def6 | varchar2(101) |
| 20 | def7 | def7 | def7 | varchar2(101) |
| 21 | def8 | def8 | def8 | varchar2(101) |
| 22 | def9 | def9 | def9 | varchar2(101) |
| 23 | def10 | def10 | def10 | varchar2(101) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |