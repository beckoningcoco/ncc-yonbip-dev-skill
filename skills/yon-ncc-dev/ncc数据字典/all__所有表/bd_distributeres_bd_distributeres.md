# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6874.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributeres | pk_distributeres | pk_distributeres | char(20) | √ |
| 2 | buildorder | buildorder | buildorder | number(38, 0) |  |  | 0 |
| 3 | createstrategy | createstrategy | createstrategy | varchar2(100) |
| 4 | isdependentmd | isdependentmd | isdependentmd | char(1) |  |  | 'N' |
| 5 | iswithallsubentity | iswithallsubentity | iswithallsubentity | char(1) |  |  | 'N' |
| 6 | mdid | mdid | mdid | varchar2(50) | √ |
| 7 | processorstrategy | processorstrategy | processorstrategy | varchar2(100) |
| 8 | receiptsavestrategy | receiptsavestrategy | receiptsavestrategy | varchar2(100) |
| 9 | receiptstrategy | receiptstrategy | receiptstrategy | varchar2(100) |
| 10 | resscopestrategy | resscopestrategy | resscopestrategy | varchar2(100) |
| 11 | subentitynames | subentitynames | subentitynames | varchar2(200) |
| 12 | typecode | typecode | typecode | varchar2(40) | √ |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |