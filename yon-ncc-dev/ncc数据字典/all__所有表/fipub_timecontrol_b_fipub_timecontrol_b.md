# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8279.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_timectrl_b | pk_timectrl_b | pk_timectrl_b | char(20) | √ |
| 2 | descr | descr | descr | varchar2(200) |
| 3 | endunit | endunit | endunit | number(38, 0) |
| 4 | pk_timectrl | pk_timectrl | pk_timectrl | char(20) | √ |
| 5 | propertyid | propertyid | propertyid | number(38, 0) |
| 6 | startunit | startunit | startunit | number(38, 0) |
| 7 | sumunit | sumunit | sumunit | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |