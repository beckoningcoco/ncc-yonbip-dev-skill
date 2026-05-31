# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6415.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | busirespacklist | busirespacklist | busirespacklist | char(20) | √ |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | filename | filename | filename | varchar2(500) |
| 5 | respackcode | respackcode | respackcode | varchar2(500) |
| 6 | sendstatus | sendstatus | sendstatus | number(38, 0) |
| 7 | transpackid | transpackid | transpackid | varchar2(50) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |