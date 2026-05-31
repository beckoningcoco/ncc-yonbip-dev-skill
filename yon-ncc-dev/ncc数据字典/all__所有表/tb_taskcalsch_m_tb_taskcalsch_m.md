# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12117.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | dimvalues | dimvalues | dimvalues | blob |
| 3 | itemindex | itemindex | itemindex | number(38, 0) | √ |
| 4 | paradims | paradims | paradims | blob |
| 5 | pk_parent | pk_parent | pk_parent | varchar2(20) | √ |
| 6 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |