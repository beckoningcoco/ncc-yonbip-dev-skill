# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11958.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_persontask | pk_persontask | pk_persontask | char(20) | √ |
| 2 | appointtime | appointtime | appointtime | char(19) |
| 3 | isappointed | isappointed | isappointed | char(1) |
| 4 | istimewarning | istimewarning | istimewarning | char(1) |
| 5 | orderfield | orderfield | orderfield | varchar2(50) |
| 6 | pk_activetask | pk_activetask | pk_activetask | varchar2(20) |  |  | '~' |
| 7 | pk_busiactivity | pk_busiactivity | pk_busiactivity | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_post | pk_post | pk_post | varchar2(20) |  |  | '~' |
| 11 | pk_ssctask | pk_ssctask | pk_ssctask | varchar2(20) |  |  | '~' |
| 12 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 13 | userdef1 | userdef1 | userdef1 | varchar2(200) |
| 14 | userdef2 | userdef2 | userdef2 | varchar2(200) |
| 15 | userdef3 | userdef3 | userdef3 | varchar2(200) |
| 16 | userdef4 | userdef4 | userdef4 | varchar2(200) |
| 17 | userdef5 | userdef5 | userdef5 | varchar2(200) |
| 18 | userdef6 | userdef6 | userdef6 | varchar2(200) |
| 19 | userdef7 | userdef7 | userdef7 | varchar2(200) |
| 20 | userdef8 | userdef8 | userdef8 | varchar2(200) |
| 21 | userdef9 | userdef9 | userdef9 | varchar2(200) |
| 22 | userdef10 | userdef10 | userdef10 | varchar2(200) |
| 23 | def1 | def1 | def1 | varchar2(101) |
| 24 | def2 | def2 | def2 | varchar2(101) |
| 25 | def3 | def3 | def3 | varchar2(101) |
| 26 | def4 | def4 | def4 | varchar2(101) |
| 27 | def5 | def5 | def5 | varchar2(101) |
| 28 | def6 | def6 | def6 | varchar2(101) |
| 29 | def7 | def7 | def7 | varchar2(101) |
| 30 | def8 | def8 | def8 | varchar2(101) |
| 31 | def9 | def9 | def9 | varchar2(101) |
| 32 | def10 | def10 | def10 | varchar2(101) |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |