# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9803.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | cascadedelete | cascadedelete | cascadedelete | char(1) |
| 3 | cascadeupdate | cascadeupdate | cascadeupdate | char(1) |
| 4 | componentid | componentid | componentid | varchar2(50) |
| 5 | createtime | createtime | createtime | char(19) |
| 6 | endcardinality | endcardinality | endcardinality | varchar2(10) |
| 7 | endelementid | endelementid | endelementid | varchar2(50) | √ |
| 8 | industry | industry | industry | varchar2(50) |
| 9 | isactive | isactive | isactive | char(1) |
| 10 | modifytime | modifytime | modifytime | char(19) |
| 11 | name | name | name | varchar2(60) | √ |
| 12 | startbeanid | startbeanid | startbeanid | varchar2(50) | √ |
| 13 | startcardinality | startcardinality | startcardinality | varchar2(10) |
| 14 | startelementid | startelementid | startelementid | varchar2(50) | √ |
| 15 | type | type | type | number(38, 0) |
| 16 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 17 | creator | creator | creator | varchar2(30) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifier | modifier | modifier | varchar2(30) |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |