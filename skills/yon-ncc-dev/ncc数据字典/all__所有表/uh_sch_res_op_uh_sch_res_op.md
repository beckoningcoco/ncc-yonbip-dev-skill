# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12787.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resop | pk_resop | pk_resop | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | desc_res | desc_res | desc_res | varchar2(4000) |
| 4 | flag_stop | flag_stop | flag_stop | char(1) |  |  | 'N' |
| 5 | mnecode | mnecode | mnecode | varchar2(50) |
| 6 | name | name | name | varchar2(50) |
| 7 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_opt | pk_opt | pk_opt | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |