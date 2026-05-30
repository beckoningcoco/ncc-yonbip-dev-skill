# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8138.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_insurance | pk_insurance | pk_insurance | char(20) | √ |
| 2 | begin_date | begin_date | begin_date | char(19) |
| 3 | bill_code | bill_code | bill_code | varchar2(40) |
| 4 | corp | corp | corp | varchar2(20) |  |  | '~' |
| 5 | end_date | end_date | end_date | char(19) |
| 6 | pk_card | pk_card | pk_card | char(20) | √ |
| 7 | remark | remark | remark | varchar2(200) |
| 8 | type | type | type | varchar2(40) |
| 9 | value | value | value | number(28, 8) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |