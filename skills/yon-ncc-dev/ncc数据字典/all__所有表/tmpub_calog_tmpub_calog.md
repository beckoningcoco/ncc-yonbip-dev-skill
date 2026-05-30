# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12151.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_calog | pk_calog | pk_calog | char(20) | √ |
| 2 | actioncode | actioncode | actioncode | varchar2(30) |
| 3 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 4 | isclientsign | isclientsign | isclientsign | char(1) |
| 5 | modulecode | modulecode | modulecode | varchar2(30) |
| 6 | pk_property | pk_property | pk_property | varchar2(20) |  |  | '~' |
| 7 | pk_signuser | pk_signuser | pk_signuser | varchar2(20) |  |  | '~' |
| 8 | pk_vbill | pk_vbill | pk_vbill | varchar2(20) |  |  | '~' |
| 9 | signcontext | signcontext | signcontext | varchar2(1024) |
| 10 | unsigncontext | unsigncontext | unsigncontext | blob |
| 11 | vbillno | vbillno | vbillno | varchar2(50) |
| 12 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(100) |
| 13 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(100) |
| 14 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(100) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |