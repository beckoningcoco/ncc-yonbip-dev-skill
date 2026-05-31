# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11514.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_menuitem | pk_menuitem | pk_menuitem | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(50) |  |  | '~' |
| 3 | appid | appid | appid | varchar2(50) |  |  | '~' |
| 4 | image_src | image_src | image_src | varchar2(200) |
| 5 | menudes | menudes | menudes | varchar2(200) |
| 6 | menuitemcode | menuitemcode | menuitemcode | varchar2(50) |
| 7 | menuitemname | menuitemname | menuitemname | varchar2(120) |
| 8 | parentcode | parentcode | parentcode | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_menu | pk_menu | pk_menu | varchar2(50) |
| 11 | resid | resid | resid | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |