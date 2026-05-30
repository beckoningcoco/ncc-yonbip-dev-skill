# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11432.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | allocatingout | allocatingout | allocatingout | char(1) |
| 2 | applyfor | applyfor | applyfor | char(1) |
| 3 | cbill | cbill | cbill | char(1) |
| 4 | cgeneralh | cgeneralh | cgeneralh | char(1) |
| 5 | cspecialb | cspecialb | cspecialb | char(1) |
| 6 | ordermaintain | ordermaintain | ordermaintain | char(1) |
| 7 | otherout | otherout | otherout | char(1) |
| 8 | pk_scm18 | pk_scm18 | pk_scm18 | char(20) | √ |
| 9 | storereq | storereq | storereq | char(1) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |