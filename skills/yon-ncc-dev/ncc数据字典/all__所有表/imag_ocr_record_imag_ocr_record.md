# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9230.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_record | pk_record | pk_record | varchar2(20) | √ |
| 2 | billid | billid | billid | varchar2(36) |
| 3 | billtype | billtype | billtype | varchar2(50) |
| 4 | code | code | code | varchar2(50) |
| 5 | factorycode | factorycode | factorycode | varchar2(50) |
| 6 | filename | filename | filename | varchar2(300) |
| 7 | fpdm | fpdm | fpdm | varchar2(50) |
| 8 | fphm | fphm | fphm | varchar2(50) |
| 9 | hjje | hjje | hjje | varchar2(50) |
| 10 | jshj | jshj | jshj | varchar2(50) |
| 11 | jym | jym | jym | varchar2(50) |
| 12 | kprq | kprq | kprq | varchar2(50) |
| 13 | msg | msg | msg | varchar2(1000) |
| 14 | nsrsbh | nsrsbh | nsrsbh | varchar2(50) |
| 15 | orgcode | orgcode | orgcode | varchar2(40) |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | tokenstate | tokenstate | tokenstate | number(38, 0) |
| 18 | transitype | transitype | transitype | varchar2(50) |
| 19 | type | type | type | number(38, 0) |
| 20 | userid | userid | userid | varchar2(20) |
| 21 | verifytoken | verifytoken | verifytoken | varchar2(64) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |