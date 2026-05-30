# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10990.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysinit | pk_sysinit | pk_sysinit | char(20) | √ |
| 2 | controlflag | controlflag | controlflag | char(1) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | editflag | editflag | editflag | char(1) | √ |
| 5 | initcode | initcode | initcode | varchar2(50) |
| 6 | initname | initname | initname | varchar2(768) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |
| 8 | sysinit | sysinit | sysinit | varchar2(20) | √ |
| 9 | value | value | value | varchar2(512) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |