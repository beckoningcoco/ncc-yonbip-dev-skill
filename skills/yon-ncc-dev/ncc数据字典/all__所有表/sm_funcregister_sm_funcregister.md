# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11551.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfunid | cfunid | cfunid | char(20) | √ |
| 2 | class_name | class_name | class_name | varchar2(200) |
| 3 | funcode | funcode | funcode | varchar2(50) |
| 4 | funtype | funtype | funtype | number(38, 0) |
| 5 | fun_desc | fun_desc | fun_desc | varchar2(75) |
| 6 | fun_name | fun_name | fun_name | varchar2(300) |
| 7 | fun_property | fun_property | fun_property | number(38, 0) |
| 8 | help_name | help_name | help_name | varchar2(50) |
| 9 | isbuttonpower | isbuttonpower | isbuttonpower | char(1) |
| 10 | iscauserusable | iscauserusable | iscauserusable | char(1) |
| 11 | isenable | isenable | isenable | char(1) |
| 12 | isfunctype | isfunctype | isfunctype | char(1) |
| 13 | mdid | mdid | mdid | varchar2(36) |  |  | '~' |
| 14 | orgtypecode | orgtypecode | orgtypecode | varchar2(50) |
| 15 | own_module | own_module | own_module | varchar2(20) |  |  | '~' |
| 16 | parent_id | parent_id | parent_id | char(20) |
| 17 | pk_group | pk_group | pk_group | varchar2(50) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |