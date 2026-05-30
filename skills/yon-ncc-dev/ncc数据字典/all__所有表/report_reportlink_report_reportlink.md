# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportlink | pk_reportlink | pk_reportlink | char(20) | √ |
| 2 | linkreport | linkreport | linkreport | varchar2(50) |
| 3 | pk_report | pk_report | pk_report | char(20) | √ |
| 4 | sequence | sequence | sequence | number(38, 0) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |