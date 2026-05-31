# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10875.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attr_plugin | pk_attr_plugin | pk_attr_plugin | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |
| 3 | module | module | module | varchar2(50) |
| 4 | pluginclassname | pluginclassname | pluginclassname | varchar2(200) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |