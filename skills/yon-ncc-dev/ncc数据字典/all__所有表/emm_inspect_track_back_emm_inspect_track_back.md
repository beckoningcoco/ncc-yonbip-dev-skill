# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7867.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inspect_track | pk_inspect_track | pk_inspect_track | char(20) | √ |
| 2 | accurancy | accurancy | accurancy | number(31, 25) |
| 3 | inspect_time | inspect_time | inspect_time | char(19) |
| 4 | keypointflag | keypointflag | keypointflag | char(1) |
| 5 | lat | lat | lat | varchar2(50) |
| 6 | lng | lng | lng | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_inspector | pk_inspector | pk_inspector | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | sequence | sequence | sequence | number(38, 0) |
| 11 | signal_type | signal_type | signal_type | varchar2(20) |
| 12 | speed | speed | speed | number(31, 25) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |