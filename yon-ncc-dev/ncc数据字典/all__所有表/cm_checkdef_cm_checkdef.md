# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7601.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccheckdefid | ccheckdefid | ccheckdefid | char(20) | √ |
| 2 | beditable | beditable | beditable | char(1) |
| 3 | bselected | bselected | bselected | char(1) |
| 4 | ichecklevel | ichecklevel | ichecklevel | number(38, 0) |  |  | 2 |
| 5 | ichecktime | ichecktime | ichecktime | number(38, 0) |  |  | 1 |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | vchecksql | vchecksql | vchecksql | varchar2(300) |
| 10 | vcode | vcode | vcode | varchar2(40) |
| 11 | vjavaclass | vjavaclass | vjavaclass | varchar2(50) |
| 12 | vname | vname | vname | varchar2(300) |
| 13 | vname2 | vname2 | vname2 | varchar2(300) |
| 14 | vname3 | vname3 | vname3 | varchar2(300) |
| 15 | vname4 | vname4 | vname4 | varchar2(300) |
| 16 | vname5 | vname5 | vname5 | varchar2(300) |
| 17 | vname6 | vname6 | vname6 | varchar2(300) |
| 18 | vnote | vnote | vnote | varchar2(1024) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |