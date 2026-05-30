# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12108.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dsdef | pk_dsdef | pk_dsdef | char(20) | √ |
| 2 | dbtype | dbtype | dbtype | varchar2(20) | √ |
| 3 | db_ip | db_ip | db_ip | varchar2(20) | √ |
| 4 | db_port | db_port | db_port | varchar2(10) | √ |
| 5 | dsdesc | dsdesc | dsdesc | varchar2(50) |
| 6 | dsname | dsname | dsname | varchar2(20) | √ |
| 7 | hasmac_odbc | hasmac_odbc | hasmac_odbc | char(1) |
| 8 | hasmac_userid | hasmac_userid | hasmac_userid | char(1) |
| 9 | odbc_name | odbc_name | odbc_name | varchar2(20) | √ |
| 10 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 11 | userid | userid | userid | varchar2(20) | √ |
| 12 | userpw | userpw | userpw | varchar2(20) | √ |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |