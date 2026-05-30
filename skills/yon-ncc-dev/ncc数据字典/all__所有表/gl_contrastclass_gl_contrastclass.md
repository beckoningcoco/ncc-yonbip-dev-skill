# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8455.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastclass | pk_contrastclass | pk_contrastclass | char(20) | √ |
| 2 | classname | classname | classname | varchar2(100) |
| 3 | classtype | classtype | classtype | varchar2(100) |
| 4 | modules | modules | modules | varchar2(20) |
| 5 | sourceid | sourceid | sourceid | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |