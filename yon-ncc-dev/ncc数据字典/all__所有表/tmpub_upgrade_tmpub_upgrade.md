# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12172.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_upgrade | pk_upgrade | pk_upgrade | char(20) | √ |
| 2 | beforemodule | beforemodule | beforemodule | varchar2(50) |
| 3 | interpath | interpath | interpath | varchar2(100) |
| 4 | isupdated | isupdated | isupdated | char(1) |  |  | 'N' |
| 5 | modules | modules | modules | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |