# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initial | pk_initial | pk_initial | char(20) | √ |
| 2 | accperiod | accperiod | accperiod | varchar2(20) |  |  | '~' |
| 3 | code | code | code | varchar2(50) |
| 4 | fiyear | fiyear | fiyear | varchar2(20) |  |  | '~' |
| 5 | isbuild | isbuild | isbuild | char(1) |
| 6 | name | name | name | varchar2(50) |
| 7 | pk_book | pk_book | pk_book | varchar2(20) |  |  | '~' |
| 8 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 10 | pk_manageorg | pk_manageorg | pk_manageorg | varchar2(20) |  |  | '~' |
| 11 | pk_profitorg | pk_profitorg | pk_profitorg | varchar2(20) |  |  | '~' |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |