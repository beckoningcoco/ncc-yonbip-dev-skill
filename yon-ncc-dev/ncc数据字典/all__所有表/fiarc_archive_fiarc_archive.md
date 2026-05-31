# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8254.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_archive | pk_archive | pk_archive | char(20) | √ |
| 2 | period | period | period | char(2) | √ |
| 3 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) | √ |
| 4 | state | state | state | varchar2(50) | √ |
| 5 | year | year | year | char(4) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |