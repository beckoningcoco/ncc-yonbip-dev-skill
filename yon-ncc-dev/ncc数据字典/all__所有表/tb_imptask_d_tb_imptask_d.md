# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12040.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskdim | pk_taskdim | pk_taskdim | char(20) | √ |
| 2 | description | description | description | varchar2(100) |
| 3 | matchtype | matchtype | matchtype | char(1) |
| 4 | matchvalue | matchvalue | matchvalue | varchar2(100) |
| 5 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(20) |
| 6 | pk_imptask | pk_imptask | pk_imptask | varchar2(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |