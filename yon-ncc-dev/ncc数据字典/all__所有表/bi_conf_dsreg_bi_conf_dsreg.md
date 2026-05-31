# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7302.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dsreg | pk_dsreg | pk_dsreg | char(20) | √ |
| 2 | code | code | code | varchar2(200) |
| 3 | conn_password | conn_password | conn_password | varchar2(100) |
| 4 | conn_url | conn_url | conn_url | varchar2(100) |
| 5 | conn_user | conn_user | conn_user | varchar2(100) |
| 6 | databasetype | databasetype | databasetype | varchar2(50) |
| 7 | datasourcetype | datasourcetype | datasourcetype | varchar2(50) |
| 8 | drivertype | drivertype | drivertype | varchar2(50) |
| 9 | enable | enable | enable | varchar2(10) |
| 10 | name | name | name | varchar2(200) |
| 11 | note | note | note | varchar2(50) |
| 12 | objid | objid | objid | varchar2(200) | √ |
| 13 | parentid | parentid | parentid | varchar2(50) |
| 14 | pool_maxcon | pool_maxcon | pool_maxcon | varchar2(20) |
| 15 | pool_mincon | pool_mincon | pool_mincon | varchar2(20) |
| 16 | regtype | regtype | regtype | varchar2(20) | √ |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | TO_CHAR(SYSDATE,'yyyy-mm-dd hh24:mi:ss') |