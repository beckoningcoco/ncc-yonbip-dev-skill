# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | actionsscnode | actionsscnode | actionsscnode | varchar2(36) |
| 3 | actionsscpost | actionsscpost | actionsscpost | varchar2(36) |
| 4 | actiontype | actiontype | actiontype | varchar2(254) |
| 5 | actionuser | actionuser | actionuser | varchar2(36) |
| 6 | billno | billno | billno | varchar2(50) |
| 7 | businessid | businessid | businessid | varchar2(36) |
| 8 | endtime | endtime | endtime | varchar2(36) |
| 9 | isrejectout | isrejectout | isrejectout | char(1) |
| 10 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 11 | pk_org | pk_org | pk_org | varchar2(50) |
| 12 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(50) |
| 13 | ssctask | ssctask | ssctask | varchar2(36) |
| 14 | starttime | starttime | starttime | varchar2(36) |
| 15 | statisticaltime | statisticaltime | statisticaltime | number(38, 0) |
| 16 | statisticaltime_calendar | statisticaltime_calendar | statisticaltime_calendar | number(38, 0) |
| 17 | typeisfinal | typeisfinal | typeisfinal | char(1) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |