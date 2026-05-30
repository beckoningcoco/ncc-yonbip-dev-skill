# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8145.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logchangerecord | pk_logchangerecord | pk_logchangerecord | char(20) | √ |
| 2 | change_content | change_content | change_content | varchar2(400) |
| 3 | change_period | change_period | change_period | char(19) |
| 4 | effective_period | effective_period | effective_period | char(19) |
| 5 | pk_card | pk_card | pk_card | char(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |