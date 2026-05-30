# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11974.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustbill_pub | pk_adjustbill_pub | pk_adjustbill_pub | char(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(20) |
| 3 | istransaction | istransaction | istransaction | char(1) |
| 4 | nbcrcode | nbcrcode | nbcrcode | varchar2(20) |
| 5 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 6 | style | style | style | char(1) |
| 7 | systemcode | systemcode | systemcode | varchar2(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |