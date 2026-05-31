# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11608.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permission_res | pk_permission_res | pk_permission_res | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | dpgenclassname | dpgenclassname | dpgenclassname | varchar2(200) |
| 4 | dpjudgerclassname | dpjudgerclassname | dpjudgerclassname | varchar2(200) |
| 5 | innercode | innercode | innercode | char(4) |
| 6 | isabstract | isabstract | isabstract | char(1) |
| 7 | isenablespecialperm | isenablespecialperm | isenablespecialperm | char(1) |
| 8 | isimmediately | isimmediately | isimmediately | char(1) |
| 9 | issptapproverperm | issptapproverperm | issptapproverperm | char(1) |
| 10 | keycolumnname | keycolumnname | keycolumnname | varchar2(50) |
| 11 | maintablename | maintablename | maintablename | varchar2(50) |
| 12 | mdid | mdid | mdid | varchar2(36) |  |  | '~' |
| 13 | ownmodule | ownmodule | ownmodule | varchar2(20) |  |  | '~' |
| 14 | parentid | parentid | parentid | varchar2(20) |  |  | '~' |
| 15 | resourcecode | resourcecode | resourcecode | varchar2(50) |
| 16 | resourcename | resourcename | resourcename | varchar2(300) |
| 17 | resourcename2 | resourcename2 | resourcename2 | varchar2(300) |
| 18 | resourcename3 | resourcename3 | resourcename3 | varchar2(300) |
| 19 | resourcename4 | resourcename4 | resourcename4 | varchar2(300) |
| 20 | resourcename5 | resourcename5 | resourcename5 | varchar2(300) |
| 21 | resourcename6 | resourcename6 | resourcename6 | varchar2(300) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |