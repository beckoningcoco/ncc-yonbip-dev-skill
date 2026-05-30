# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8252.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskservicemap | pk_taskservicemap | pk_taskservicemap | char(20) | √ |
| 2 | pk_distributetasktype | pk_distributetasktype | pk_distributetasktype | varchar2(50) |
| 3 | servicename | servicename | servicename | varchar2(50) |
| 4 | threadnum | threadnum | threadnum | number(38, 0) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |