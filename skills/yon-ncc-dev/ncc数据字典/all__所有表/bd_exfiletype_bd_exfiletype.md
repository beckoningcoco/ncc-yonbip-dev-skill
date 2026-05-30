# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6921.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_filetype | pk_filetype | pk_filetype | char(20) | √ |
| 2 | beforelistener | beforelistener | beforelistener | varchar2(200) |
| 3 | classid | classid | classid | varchar2(50) |
| 4 | code | code | code | varchar2(10) | √ |
| 5 | editlistener | editlistener | editlistener | varchar2(200) |
| 6 | name | name | name | varchar2(50) |
| 7 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(10) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |