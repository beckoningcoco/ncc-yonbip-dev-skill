# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8864.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | account | account | account | varchar2(50) |
| 2 | address | address | address | varchar2(50) |
| 3 | optname | optname | optname | varchar2(50) |
| 4 | optstatus | optstatus | optstatus | number(38, 0) |
| 5 | opttime | opttime | opttime | char(19) |
| 6 | pk_outdatarecord | pk_outdatarecord | pk_outdatarecord | char(20) | √ |
| 7 | pk_outstockdata | pk_outstockdata | pk_outstockdata | char(20) | √ |
| 8 | pk_srcsystem | pk_srcsystem | pk_srcsystem | varchar2(50) |
| 9 | remark | remark | remark | varchar2(200) |
| 10 | srcsyscode | srcsyscode | srcsyscode | varchar2(50) |
| 11 | srcsysname | srcsysname | srcsysname | varchar2(50) |
| 12 | def1 | def1 | def1 | varchar2(101) |
| 13 | def2 | def2 | def2 | varchar2(101) |
| 14 | def3 | def3 | def3 | varchar2(101) |
| 15 | def4 | def4 | def4 | varchar2(101) |
| 16 | def5 | def5 | def5 | varchar2(101) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |