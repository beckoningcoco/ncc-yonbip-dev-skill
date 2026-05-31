# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11749.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userandclerk | pk_userandclerk | pk_userandclerk | char(20) | √ |
| 2 | datastate | datastate | datastate | number(38, 0) |
| 3 | pk_corp | pk_corp | pk_corp | char(4) | √ |
| 4 | pk_project | pk_project | pk_project | char(20) |
| 5 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 6 | userid | userid | userid | char(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |