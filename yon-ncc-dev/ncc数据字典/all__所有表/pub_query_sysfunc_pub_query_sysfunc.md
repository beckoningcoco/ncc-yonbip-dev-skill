# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10979.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysfunc | pk_sysfunc | pk_sysfunc | char(20) | √ |
| 2 | classname | classname | classname | varchar2(300) | √ |
| 3 | layer | layer | layer | number(38, 0) | √ |  | -1 |
| 4 | moduleid | moduleid | moduleid | varchar2(50) |
| 5 | sysfunc_code | sysfunc_code | sysfunc_code | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |