# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8366.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sharingrules_b | pk_sharingrules_b | pk_sharingrules_b | char(20) | √ |
| 2 | apportionmentmethod | apportionmentmethod | apportionmentmethod | varchar2(50) |
| 3 | apportionmentratio | apportionmentratio | apportionmentratio | number(28, 8) |
| 4 | datefieldsource | datefieldsource | datefieldsource | number(38, 0) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | numfieldsource | numfieldsource | numfieldsource | number(38, 0) |
| 7 | periods | periods | periods | varchar2(50) |  |  | '~' |
| 8 | periodsname | periodsname | periodsname | varchar2(50) |
| 9 | pk_sharingrules | pk_sharingrules | pk_sharingrules | char(20) | √ |
| 10 | startdate | startdate | startdate | varchar2(50) |  |  | '~' |
| 11 | startdatename | startdatename | startdatename | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |