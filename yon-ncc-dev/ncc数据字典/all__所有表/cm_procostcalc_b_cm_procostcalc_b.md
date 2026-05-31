# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7640.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbrief | cbrief | cbrief | varchar2(50) | √ |
| 2 | ccostcentercode | ccostcentercode | ccostcentercode | varchar2(20) |  |  | '~' |
| 3 | celementcode | celementcode | celementcode | varchar2(20) |  |  | '~' |
| 4 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 5 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 6 | cperiod | cperiod | cperiod | varchar2(7) |  |  | '~' |
| 7 | nincost | nincost | nincost | number(28, 8) |
| 8 | nincostcenter | nincostcenter | nincostcenter | number(28, 8) |
| 9 | nincostother | nincostother | nincostother | number(28, 8) |
| 10 | nincostsub | nincostsub | nincostsub | number(28, 8) |
| 11 | nincostthis | nincostthis | nincostthis | number(28, 8) |
| 12 | ninnum | ninnum | ninnum | number(28, 8) |
| 13 | ninprice | ninprice | ninprice | number(28, 8) |
| 14 | ninprocost | ninprocost | ninprocost | number(28, 8) |
| 15 | ninprocostcenter | ninprocostcenter | ninprocostcenter | number(28, 8) |
| 16 | ninprocostother | ninprocostother | ninprocostother | number(28, 8) |
| 17 | ninprocostsub | ninprocostsub | ninprocostsub | number(28, 8) |
| 18 | ninprocostthis | ninprocostthis | ninprocostthis | number(28, 8) |
| 19 | ninpronum | ninpronum | ninpronum | number(28, 8) |
| 20 | ninproprice | ninproprice | ninproprice | number(28, 8) |
| 21 | noutcost | noutcost | noutcost | number(28, 8) |
| 22 | noutcostcenter | noutcostcenter | noutcostcenter | number(28, 8) |
| 23 | noutcostother | noutcostother | noutcostother | number(28, 8) |
| 24 | noutcostsub | noutcostsub | noutcostsub | number(28, 8) |
| 25 | noutcostthis | noutcostthis | noutcostthis | number(28, 8) |
| 26 | noutnum | noutnum | noutnum | number(28, 8) |
| 27 | noutprice | noutprice | noutprice | number(28, 8) |
| 28 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |