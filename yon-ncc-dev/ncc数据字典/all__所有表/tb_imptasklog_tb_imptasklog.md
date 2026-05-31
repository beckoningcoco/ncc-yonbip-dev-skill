# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tasklog | pk_tasklog | pk_tasklog | char(20) | √ |
| 2 | description | description | description | varchar2(500) |
| 3 | endtime | endtime | endtime | char(19) |
| 4 | loguser | loguser | loguser | varchar2(20) |
| 5 | mainparam | mainparam | mainparam | varchar2(100) |
| 6 | pk_exectask | pk_exectask | pk_exectask | varchar2(20) | √ |
| 7 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 8 | starttime | starttime | starttime | char(19) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |