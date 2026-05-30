# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10903.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billsource | pk_billsource | pk_billsource | char(20) | √ |
| 2 | billbusinessid | billbusinessid | billbusinessid | varchar2(20) |  |  | '~' |
| 3 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 4 | pk_businesstype | pk_businesstype | pk_businesstype | varchar2(20) |  |  | '~' |
| 5 | referbilltype | referbilltype | referbilltype | varchar2(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |