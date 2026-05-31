# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10911.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskdeliver | pk_taskdeliver | pk_taskdeliver | char(20) | √ |
| 2 | cuserid | cuserid | cuserid | varchar2(20) |
| 3 | exemode | exemode | exemode | varchar2(10) |
| 4 | locktag | locktag | locktag | char(1) |
| 5 | paramstr | paramstr | paramstr | varchar2(150) |
| 6 | pk_task | pk_task | pk_task | varchar2(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |