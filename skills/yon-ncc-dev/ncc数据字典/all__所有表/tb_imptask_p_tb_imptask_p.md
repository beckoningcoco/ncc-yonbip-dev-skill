# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12043.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskparam | pk_taskparam | pk_taskparam | char(20) | √ |
| 2 | paramname | paramname | paramname | varchar2(20) |
| 3 | paramvalue | paramvalue | paramvalue | varchar2(2000) |
| 4 | pk_parent | pk_parent | pk_parent | varchar2(20) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |