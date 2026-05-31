# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11520.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_app_group | pk_app_group | pk_app_group | char(20) | √ |
| 2 | groupname | groupname | groupname | varchar2(50) |
| 3 | position | position | position | number(38, 0) |
| 4 | resid | resid | resid | varchar2(50) |
| 5 | respath | respath | respath | varchar2(50) |
| 6 | workbenchid | workbenchid | workbenchid | varchar2(50) |
| 7 | creationtime | creationtime | creationtime | char(19) |
| 8 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 11 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |