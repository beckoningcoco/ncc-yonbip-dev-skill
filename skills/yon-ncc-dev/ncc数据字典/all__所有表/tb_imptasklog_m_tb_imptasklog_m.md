# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12039.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tasklog_m | pk_tasklog_m | pk_tasklog_m | char(20) | √ |
| 2 | execparam | execparam | execparam | blob |
| 3 | importtime | importtime | importtime | char(19) |
| 4 | logdetail | logdetail | logdetail | blob |
| 5 | loguser | loguser | loguser | varchar2(20) |
| 6 | pk_imptask | pk_imptask | pk_imptask | varchar2(20) | √ |
| 7 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 8 | pk_tasklog | pk_tasklog | pk_tasklog | varchar2(20) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |