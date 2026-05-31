# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7761.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | moduleid | moduleid | moduleid | varchar2(50) | √ |
| 2 | appscope | appscope | appscope | number(38, 0) |
| 3 | devmodule | devmodule | devmodule | varchar2(50) |
| 4 | isaccount | isaccount | isaccount | char(1) |
| 5 | isitem | isitem | isitem | char(1) |
| 6 | islightmodule | islightmodule | islightmodule | char(1) |  |  | 'N' |
| 7 | isncinnermodule | isncinnermodule | isncinnermodule | char(1) |
| 8 | isrelatedev | isrelatedev | isrelatedev | varchar2(50) |
| 9 | nodeorder | nodeorder | nodeorder | number(38, 0) |
| 10 | orgtypecode | orgtypecode | orgtypecode | varchar2(50) |
| 11 | parentcode | parentcode | parentcode | varchar2(20) |  |  | '~' |
| 12 | productscope | productscope | productscope | number(38, 0) |
| 13 | resid | resid | resid | varchar2(30) |
| 14 | supportcloseaccbook | supportcloseaccbook | supportcloseaccbook | char(1) |
| 15 | systypecode | systypecode | systypecode | varchar2(50) | √ |
| 16 | systypename | systypename | systypename | varchar2(75) |
| 17 | def1 | def1 | def1 | varchar2(99) |  |  | '~' |
| 18 | def2 | def2 | def2 | varchar2(99) |  |  | '~' |
| 19 | def3 | def3 | def3 | varchar2(99) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |