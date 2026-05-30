# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11576.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_menuitem | pk_menuitem | pk_menuitem | char(20) | √ |
| 2 | funcode | funcode | funcode | varchar2(50) |  |  | '~' |
| 3 | iconpath | iconpath | iconpath | varchar2(100) |
| 4 | ismenutype | ismenutype | ismenutype | char(1) |
| 5 | menudes | menudes | menudes | varchar2(75) |
| 6 | menuitemcode | menuitemcode | menuitemcode | varchar2(50) |
| 7 | menuitemname | menuitemname | menuitemname | varchar2(180) |
| 8 | nodeorder | nodeorder | nodeorder | number(38, 0) |
| 9 | pk_menu | pk_menu | pk_menu | varchar2(50) |
| 10 | resid | resid | resid | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |