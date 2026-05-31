# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11589.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgbox | pk_msgbox | pk_msgbox | char(20) | √ |
| 2 | boxcode | boxcode | boxcode | varchar2(50) |
| 3 | boxfilter | boxfilter | boxfilter | varchar2(200) |
| 4 | boxname | boxname | boxname | varchar2(75) |
| 5 | boxorder | boxorder | boxorder | number(38, 0) |
| 6 | boxtable | boxtable | boxtable | varchar2(200) |
| 7 | msgstatejudger | msgstatejudger | msgstatejudger | varchar2(200) |
| 8 | parentbox | parentbox | parentbox | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |