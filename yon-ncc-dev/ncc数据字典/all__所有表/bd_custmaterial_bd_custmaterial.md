# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6848.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custmaterial | pk_custmaterial | pk_custmaterial | char(20) | √ |
| 2 | cmmeasdoc | cmmeasdoc | cmmeasdoc | varchar2(20) |
| 3 | code | code | code | varchar2(40) | √ |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | digest | digest | digest | varchar2(64) |
| 6 | marmeasdoc | marmeasdoc | marmeasdoc | varchar2(20) |
| 7 | materialid | materialid | materialid | varchar2(20) | √ |  | '~' |
| 8 | measrate | measrate | measrate | varchar2(50) |
| 9 | name | name | name | varchar2(300) | √ |
| 10 | name2 | name2 | name2 | varchar2(300) |
| 11 | name3 | name3 | name3 | varchar2(300) |
| 12 | name4 | name4 | name4 | varchar2(300) |
| 13 | name5 | name5 | name5 | varchar2(300) |
| 14 | name6 | name6 | name6 | varchar2(300) |
| 15 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | def1 | def1 | def1 | varchar2(101) |
| 19 | def2 | def2 | def2 | varchar2(101) |
| 20 | def3 | def3 | def3 | varchar2(101) |
| 21 | def4 | def4 | def4 | varchar2(101) |
| 22 | def5 | def5 | def5 | varchar2(101) |
| 23 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 24 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 25 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 26 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 27 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 28 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 29 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 30 | vfree11 | vfree11 | vfree11 | varchar2(101) |
| 31 | vfree12 | vfree12 | vfree12 | varchar2(101) |
| 32 | vfree13 | vfree13 | vfree13 | varchar2(101) |
| 33 | vfree14 | vfree14 | vfree14 | varchar2(101) |
| 34 | vfree15 | vfree15 | vfree15 | varchar2(101) |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |