# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_process | pk_process | pk_process | char(20) | √ |
| 2 | baseclassname | baseclassname | baseclassname | varchar2(120) |
| 3 | billtype | billtype | billtype | varchar2(50) | √ |
| 4 | module | module | module | varchar2(20) |
| 5 | praname | praname | praname | varchar2(300) | √ |
| 6 | proclassname | proclassname | proclassname | varchar2(120) | √ |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |