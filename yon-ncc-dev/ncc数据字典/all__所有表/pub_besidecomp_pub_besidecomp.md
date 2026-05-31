# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10888.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_besidecomp | pk_besidecomp | pk_besidecomp | char(20) | √ |
| 2 | compcode | compcode | compcode | varchar2(50) | √ |
| 3 | compname | compname | compname | varchar2(300) | √ |
| 4 | compname2 | compname2 | compname2 | varchar2(300) |
| 5 | compname3 | compname3 | compname3 | varchar2(300) |
| 6 | compname4 | compname4 | compname4 | varchar2(300) |
| 7 | compname5 | compname5 | compname5 | varchar2(300) |
| 8 | compname6 | compname6 | compname6 | varchar2(300) |
| 9 | comppanel | comppanel | comppanel | varchar2(20) | √ |  | '~' |
| 10 | comptype | comptype | comptype | varchar2(20) | √ |  | '~' |
| 11 | mdclassid | mdclassid | mdclassid | varchar2(50) |
| 12 | moduleid | moduleid | moduleid | varchar2(50) |  |  | '~' |
| 13 | pk_country | pk_country | pk_country | varchar2(20) |  |  | '~' |
| 14 | pk_industry | pk_industry | pk_industry | varchar2(20) |  |  | '~' |
| 15 | pk_level | pk_level | pk_level | varchar2(50) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |