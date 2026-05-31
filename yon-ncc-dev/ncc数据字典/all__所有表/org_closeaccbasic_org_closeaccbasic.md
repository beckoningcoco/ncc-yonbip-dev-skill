# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10182.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closebasic | pk_closebasic | pk_closebasic | char(20) | √ |
| 2 | closeacctype | closeacctype | closeacctype | varchar2(20) | √ |
| 3 | code | code | code | varchar2(20) | √ |
| 4 | devmodule | devmodule | devmodule | varchar2(20) | √ |
| 5 | enabled | enabled | enabled | char(1) | √ |
| 6 | implclassname | implclassname | implclassname | varchar2(300) | √ |
| 7 | moduleid | moduleid | moduleid | varchar2(20) | √ |
| 8 | name | name | name | varchar2(50) |  |  | '~' |
| 9 | note | note | note | varchar2(50) |  |  | '~' |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |