# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6605.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | char(20) | √ |
| 2 | createtime | createtime | createtime | varchar2(19) |
| 3 | ext_props | ext_props | ext_props | varchar2(300) |
| 4 | ext_tablename | ext_tablename | ext_tablename | varchar2(300) |
| 5 | ext_type | ext_type | ext_type | varchar2(300) |
| 6 | filesize | filesize | filesize | number(30, 0) |
| 7 | fileversion | fileversion | fileversion | number(38, 0) |
| 8 | lastmodifier | lastmodifier | lastmodifier | varchar2(50) |
| 9 | lastmodifytime | lastmodifytime | lastmodifytime | varchar2(19) |
| 10 | module | module | module | varchar2(20) |
| 11 | name | name | name | varchar2(1000) |
| 12 | path | path | path | varchar2(100) |
| 13 | tenantid | tenantid | tenantid | varchar2(50) |
| 14 | creator | creator | creator | varchar2(50) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |