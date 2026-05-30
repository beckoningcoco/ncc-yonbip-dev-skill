# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11572.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operatelog | pk_operatelog | pk_operatelog | char(20) | √ |
| 2 | buttoncode | buttoncode | buttoncode | varchar2(50) |
| 3 | buttonname | buttonname | buttonname | varchar2(75) |
| 4 | buttonresdir | buttonresdir | buttonresdir | varchar2(50) |
| 5 | buttonresid | buttonresid | buttonresid | varchar2(50) |
| 6 | detail | detail | detail | varchar2(500) |
| 7 | device | device | device | varchar2(50) |
| 8 | entersystemresult | entersystemresult | entersystemresult | char(1) |
| 9 | funccode | funccode | funccode | varchar2(50) |
| 10 | funcname | funcname | funcname | varchar2(300) |
| 11 | ip | ip | ip | varchar2(100) |
| 12 | logdate | logdate | logdate | char(19) |
| 13 | logintype | logintype | logintype | varchar2(50) |
| 14 | logoffdate | logoffdate | logoffdate | char(19) |
| 15 | logofftime | logofftime | logofftime | char(8) |
| 16 | logtime | logtime | logtime | char(8) |
| 17 | pk_funcnode | pk_funcnode | pk_funcnode | varchar2(50) |
| 18 | pk_group | pk_group | pk_group | varchar2(36) |  |  | '~' |
| 19 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(36) |  |  | '~' |
| 20 | pk_user | pk_user | pk_user | varchar2(36) |  |  | '~' |
| 21 | syscode | syscode | syscode | varchar2(50) |
| 22 | type | type | type | number(38, 0) |
| 23 | usertype | usertype | usertype | number(38, 0) |
| 24 | user_name | user_name | user_name | varchar2(300) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |