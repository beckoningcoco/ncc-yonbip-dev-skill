# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13030.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_template | pk_template | pk_template | char(20) | √ |
| 2 | pk_appnode | pk_appnode | pk_appnode | varchar2(20) |  |  | '~' |
| 3 | pk_commonobject | pk_commonobject | pk_commonobject | varchar2(20) |  |  | '~' |
| 4 | pk_flwtype | pk_flwtype | pk_flwtype | varchar2(20) |  |  | '~' |
| 5 | pk_menuentrance | pk_menuentrance | pk_menuentrance | varchar2(20) |
| 6 | pk_menuitem | pk_menuitem | pk_menuitem | varchar2(20) |  |  | '~' |
| 7 | pk_templatecard | pk_templatecard | pk_templatecard | varchar2(20) |  |  | '~' |
| 8 | pk_templategrid | pk_templategrid | pk_templategrid | varchar2(20) |  |  | '~' |
| 9 | viewtype | viewtype | viewtype | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |