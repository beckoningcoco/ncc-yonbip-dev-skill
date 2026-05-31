# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7600.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cautocostcalculationid | cautocostcalculationid | cautocostcalculationid | char(20) | √ |
| 2 | cexecutor | cexecutor | cexecutor | varchar2(20) |  |  | '~' |
| 3 | cnote | cnote | cnote | varchar2(50) |
| 4 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 5 | ctaskitem | ctaskitem | ctaskitem | number(38, 0) |
| 6 | freportstate | freportstate | freportstate | number(38, 0) |
| 7 | fstate | fstate | fstate | number(38, 0) |  |  | 1 |
| 8 | mreport | mreport | mreport | blob |
| 9 | ncosttime | ncosttime | ncosttime | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | tbegintime | tbegintime | tbegintime | char(19) |
| 14 | tendtime | tendtime | tendtime | char(19) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |