# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11570.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logmeta | pk_logmeta | pk_logmeta | char(20) | √ |
| 2 | isadmin | isadmin | isadmin | varchar2(1) |
| 3 | isroot | isroot | isroot | varchar2(1) |
| 4 | issys | issys | issys | varchar2(1) |
| 5 | metaid | metaid | metaid | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |