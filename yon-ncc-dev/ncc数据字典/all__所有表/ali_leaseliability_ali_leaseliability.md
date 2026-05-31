# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6481.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leaseliability | pk_leaseliability | pk_leaseliability | char(20) | √ |
| 2 | begin_date | begin_date | begin_date | char(19) |
| 3 | begin_liability | begin_liability | begin_liability | number(28, 8) |
| 4 | calculate_rentnotax | calculate_rentnotax | calculate_rentnotax | number(28, 8) |
| 5 | calculate_renttax | calculate_renttax | calculate_renttax | number(28, 8) |
| 6 | end_date | end_date | end_date | char(19) |
| 7 | end_liability | end_liability | end_liability | number(28, 8) |
| 8 | interest | interest | interest | number(28, 8) |
| 9 | memo | memo | memo | varchar2(50) |
| 10 | pk_used_confirm | pk_used_confirm | pk_used_confirm | char(20) | √ |
| 11 | stage | stage | stage | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |