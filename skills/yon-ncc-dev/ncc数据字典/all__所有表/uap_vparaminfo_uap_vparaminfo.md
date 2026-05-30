# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12331.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_param_id | pk_param_id | pk_param_id | char(20) | √ |
| 2 | controlflag | controlflag | controlflag | char(1) |
| 3 | oldcontrolflag | oldcontrolflag | oldcontrolflag | char(1) |
| 4 | oldparamvalue | oldparamvalue | oldparamvalue | varchar2(50) |
| 5 | paramcode | paramcode | paramcode | varchar2(20) |
| 6 | paraminfo | paraminfo | paraminfo | char(20) | √ |
| 7 | paramname | paramname | paramname | varchar2(768) |
| 8 | paramnote | paramnote | paramnote | varchar2(50) |
| 9 | paramvalue | paramvalue | paramvalue | varchar2(512) |
| 10 | realparamcode | realparamcode | realparamcode | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |