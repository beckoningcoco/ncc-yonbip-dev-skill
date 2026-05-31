# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | datatype | datatype | datatype | varchar2(50) | √ |
| 5 | datatypestyle | datatypestyle | datatypestyle | number(38, 0) | √ |
| 6 | description | description | description | varchar2(512) |
| 7 | displayname | displayname | displayname | varchar2(90) |
| 8 | help | help | help | varchar2(1024) |
| 9 | isaggvo | isaggvo | isaggvo | char(1) |
| 10 | modifytime | modifytime | modifytime | char(19) |
| 11 | name | name | name | varchar2(50) | √ |
| 12 | operationid | operationid | operationid | varchar2(50) |
| 13 | paramdefclassname | paramdefclassname | paramdefclassname | varchar2(50) |
| 14 | paramtypeforlog | paramtypeforlog | paramtypeforlog | varchar2(10) |
| 15 | parasequence | parasequence | parasequence | number(38, 0) | √ |
| 16 | resid | resid | resid | varchar2(90) |
| 17 | creator | creator | creator | varchar2(30) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifier | modifier | modifier | varchar2(30) |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |