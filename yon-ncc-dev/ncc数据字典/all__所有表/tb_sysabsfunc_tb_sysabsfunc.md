# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12099.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_absfunc | pk_absfunc | pk_absfunc | char(20) | √ |
| 2 | objcode | objcode | objcode | varchar2(20) | √ |
| 3 | objname | objname | objname | varchar2(50) | √ |
| 4 | pk_baseobj | pk_baseobj | pk_baseobj | varchar2(20) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |