# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7142.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_esberror | pk_esberror | pk_esberror | char(20) | √ |
| 2 | esb_resson | esb_resson | esb_resson | varchar2(256) |
| 3 | esb_values | esb_values | esb_values | varchar2(4000) |
| 4 | flag_check | flag_check | flag_check | char(1) |
| 5 | usebp | usebp | usebp | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |