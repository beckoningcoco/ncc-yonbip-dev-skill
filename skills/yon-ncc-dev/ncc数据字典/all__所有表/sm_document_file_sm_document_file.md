# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11545.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_file | pk_file | pk_file | char(20) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | description | description | description | varchar2(100) |
| 4 | filename | filename | filename | varchar2(100) |
| 5 | keyword | keyword | keyword | varchar2(100) |
| 6 | maxversion | maxversion | maxversion | number(38, 0) |
| 7 | pk_billitem | pk_billitem | pk_billitem | varchar2(50) |
| 8 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 9 | pk_category | pk_category | pk_category | varchar2(36) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(36) |  |  | '~' |
| 11 | subject | subject | subject | varchar2(100) |
| 12 | sysid | sysid | sysid | varchar2(10) |
| 13 | def1 | def1 | def1 | varchar2(100) |
| 14 | def2 | def2 | def2 | varchar2(100) |
| 15 | def3 | def3 | def3 | varchar2(100) |
| 16 | def4 | def4 | def4 | varchar2(100) |
| 17 | def5 | def5 | def5 | varchar2(100) |
| 18 | creator | creator | creator | varchar2(36) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifier | modifier | modifier | varchar2(36) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |