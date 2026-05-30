# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccostobjectid | ccostobjectid | ccostobjectid | char(20) | √ |
| 2 | boutsourcing | boutsourcing | boutsourcing | char(1) |
| 3 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 4 | cmaincostobjectid | cmaincostobjectid | cmaincostobjectid | varchar2(20) |  |  | '~' |
| 5 | cmainmaterialid | cmainmaterialid | cmainmaterialid | varchar2(20) |  |  | '~' |
| 6 | cmarcostclassid | cmarcostclassid | cmarcostclassid | varchar2(20) |  |  | '~' |
| 7 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 8 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 9 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 10 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 11 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 12 | effectstatus | effectstatus | effectstatus | char(1) |
| 13 | enablestate | enablestate | enablestate | number(38, 0) | √ |
| 14 | finstoragetype | finstoragetype | finstoragetype | number(38, 0) |  |  | 1 |
| 15 | fproducttype | fproducttype | fproducttype | number(38, 0) |  |  | 1 |
| 16 | itype | itype | itype | number(38, 0) | √ |
| 17 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 18 | pk_org | pk_org | pk_org | char(20) | √ |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | char(20) | √ |  | '~' |
| 20 | sffzfw | sffzfw | sffzfw | char(1) |  |  | 'N' |
| 21 | vcostobjcode | vcostobjcode | vcostobjcode | varchar2(200) | √ |
| 22 | vcostobjname | vcostobjname | vcostobjname | varchar2(1050) | √ |
| 23 | vcostobjname2 | vcostobjname2 | vcostobjname2 | varchar2(1050) |
| 24 | vcostobjname3 | vcostobjname3 | vcostobjname3 | varchar2(1050) |
| 25 | vcostobjname4 | vcostobjname4 | vcostobjname4 | varchar2(1050) |
| 26 | vcostobjname5 | vcostobjname5 | vcostobjname5 | varchar2(1050) |
| 27 | vcostobjname6 | vcostobjname6 | vcostobjname6 | varchar2(1050) |
| 28 | vmobatchcode | vmobatchcode | vmobatchcode | varchar2(30) |
| 29 | vmocode | vmocode | vmocode | varchar2(40) |
| 30 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 31 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 32 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 33 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 34 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 35 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 36 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 37 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 38 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 39 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 40 | creationtime | creationtime | creationtime | char(19) |
| 41 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 44 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |