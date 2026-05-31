# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8056.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_process | pk_process | pk_process | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(50) | √ |
| 3 | module | module | module | varchar2(20) |
| 4 | praname | praname | praname | varchar2(300) | √ |
| 5 | proclassname | proclassname | proclassname | varchar2(120) | √ |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |