# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6584.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indiprovision_d | pk_indiprovision_d | pk_indiprovision_d | char(20) | √ |
| 2 | dimratio | dimratio | dimratio | number(28, 8) |  |  | 0 |
| 3 | endbdreserve | endbdreserve | endbdreserve | number(28, 8) |  |  | 0 |
| 4 | globalmoney | globalmoney | globalmoney | number(28, 8) |  |  | 0 |
| 5 | globalrate | globalrate | globalrate | number(28, 8) |  |  | 1 |
| 6 | groupmoney | groupmoney | groupmoney | number(28, 8) |  |  | 0 |
| 7 | grouprate | grouprate | grouprate | number(28, 8) |  |  | 1 |
| 8 | initbdreserve | initbdreserve | initbdreserve | number(28, 8) |  |  | 0 |
| 9 | localmoney | localmoney | localmoney | number(28, 8) |  |  | 0 |
| 10 | money | money | money | number(28, 8) |  |  | 0 |
| 11 | pk_indiprovision | pk_indiprovision | pk_indiprovision | varchar2(20) |  |  | '~' |
| 12 | pk_recbill | pk_recbill | pk_recbill | varchar2(20) |  |  | '~' |
| 13 | pk_recitem | pk_recitem | pk_recitem | varchar2(20) |  |  | '~' |
| 14 | reason | reason | reason | varchar2(200) |
| 15 | totalar | totalar | totalar | number(28, 8) |  |  | 0 |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |