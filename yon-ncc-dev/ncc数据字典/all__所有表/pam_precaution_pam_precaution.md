# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10419.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_precaution | pk_precaution | pk_precaution | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | isolate_flag | isolate_flag | isolate_flag | char(1) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | precaution_code | precaution_code | precaution_code | varchar2(40) |
| 8 | precaution_content | precaution_content | precaution_content | varchar2(1024) |
| 9 | precaution_name | precaution_name | precaution_name | varchar2(120) |
| 10 | precaution_name2 | precaution_name2 | precaution_name2 | varchar2(120) |
| 11 | precaution_name3 | precaution_name3 | precaution_name3 | varchar2(120) |
| 12 | precaution_name4 | precaution_name4 | precaution_name4 | varchar2(120) |
| 13 | precaution_name5 | precaution_name5 | precaution_name5 | varchar2(120) |
| 14 | precaution_name6 | precaution_name6 | precaution_name6 | varchar2(120) |
| 15 | risk_type | risk_type | risk_type | varchar2(30) |
| 16 | def1 | def1 | def1 | varchar2(101) |
| 17 | def2 | def2 | def2 | varchar2(101) |
| 18 | def3 | def3 | def3 | varchar2(101) |
| 19 | def4 | def4 | def4 | varchar2(101) |
| 20 | def5 | def5 | def5 | varchar2(101) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |