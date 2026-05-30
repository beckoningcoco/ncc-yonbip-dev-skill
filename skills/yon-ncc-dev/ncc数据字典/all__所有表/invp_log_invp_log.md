# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9250.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | pk_log | pk_log | char(20) | √ |
| 2 | bendrequest | bendrequest | bendrequest | char(1) |
| 3 | cplanuserid | cplanuserid | cplanuserid | varchar2(20) |  |  | '~' |
| 4 | dplandate | dplandate | dplandate | char(19) |
| 5 | fcalcsrc | fcalcsrc | fcalcsrc | number(38, 0) |
| 6 | ninvcount | ninvcount | ninvcount | number(28, 8) |
| 7 | nreqinvcount | nreqinvcount | nreqinvcount | number(28, 8) |
| 8 | ntalinvcount | ntalinvcount | ntalinvcount | number(28, 8) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | tbegintime | tbegintime | tbegintime | char(19) |
| 13 | tendtime | tendtime | tendtime | char(19) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |