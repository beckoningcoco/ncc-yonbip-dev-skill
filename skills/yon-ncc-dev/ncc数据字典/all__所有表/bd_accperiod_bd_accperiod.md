# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6727.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accperiod | pk_accperiod | pk_accperiod | char(20) | √ |
| 2 | begindate | begindate | begindate | char(19) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | enddate | enddate | enddate | char(19) | √ |
| 5 | halfyearnum | halfyearnum | halfyearnum | number(38, 0) | √ |
| 6 | isadjustable | isadjustable | isadjustable | char(1) |
| 7 | islesstwelve | islesstwelve | islesstwelve | char(1) |
| 8 | periodnum | periodnum | periodnum | number(38, 0) | √ |
| 9 | periodyear | periodyear | periodyear | char(4) | √ |
| 10 | pk_accperiodscheme | pk_accperiodscheme | pk_accperiodscheme | char(20) | √ |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | char(20) | √ |
| 13 | quarternum | quarternum | quarternum | number(38, 0) | √ |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |