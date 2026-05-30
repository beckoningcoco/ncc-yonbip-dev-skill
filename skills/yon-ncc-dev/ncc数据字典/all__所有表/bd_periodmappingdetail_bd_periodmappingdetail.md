# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_periodmappingdetail | pk_periodmappingdetail | pk_periodmappingdetail | char(20) | √ |
| 2 | periodmappingdetail | periodmappingdetail | periodmappingdetail | char(20) | √ |
| 3 | periodyear | periodyear | periodyear | varchar2(50) |
| 4 | sourcebeginperiodmth | sourcebeginperiodmth | sourcebeginperiodmth | varchar2(20) |  |  | '~' |
| 5 | sourceendperiodmth | sourceendperiodmth | sourceendperiodmth | varchar2(20) |  |  | '~' |
| 6 | targetperiodmonth | targetperiodmonth | targetperiodmonth | varchar2(20) |  |  | '~' |
| 7 | targetperiodyear | targetperiodyear | targetperiodyear | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |