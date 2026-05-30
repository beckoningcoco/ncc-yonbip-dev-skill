# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11831.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transconfig | pk_transconfig | pk_transconfig | char(20) | √ |
| 2 | beforetime | beforetime | beforetime | number(38, 0) |  |  | 10 |
| 3 | lasttranstime | lasttranstime | lasttranstime | char(19) |
| 4 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(50) |
| 5 | property | property | property | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |