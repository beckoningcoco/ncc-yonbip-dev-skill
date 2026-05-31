# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11020.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_def | pk_wf_def | pk_wf_def | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | billmaker_name | billmaker_name | billmaker_name | varchar2(80) |
| 4 | billmaker_type | billmaker_type | billmaker_type | varchar2(20) |
| 5 | billtype | billtype | billtype | varchar2(20) |
| 6 | content | content | content | blob |
| 7 | createdate | createdate | createdate | char(19) |
| 8 | ctmscode | ctmscode | ctmscode | varchar2(256) |
| 9 | emendenum | emendenum | emendenum | number(38, 0) |
| 10 | fatherpk | fatherpk | fatherpk | varchar2(20) |  |  | '~' |
| 11 | issubmittorejecter | issubmittorejecter | issubmittorejecter | char(1) |
| 12 | modifydate | modifydate | modifydate | char(19) |
| 13 | node_name | node_name | node_name | varchar2(256) |
| 14 | node_name2 | node_name2 | node_name2 | varchar2(256) |
| 15 | node_name3 | node_name3 | node_name3 | varchar2(256) |
| 16 | node_name4 | node_name4 | node_name4 | varchar2(256) |
| 17 | node_name5 | node_name5 | node_name5 | varchar2(256) |
| 18 | node_name6 | node_name6 | node_name6 | varchar2(256) |
| 19 | node_type | node_type | node_type | varchar2(4) |
| 20 | orgcount | orgcount | orgcount | number(38, 0) |
| 21 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | priority | priority | priority | number(38, 0) |
| 25 | processdefid | processdefid | processdefid | varchar2(64) |
| 26 | rejecttacheactivityid | rejecttacheactivityid | rejecttacheactivityid | varchar2(64) |
| 27 | supervisor | supervisor | supervisor | varchar2(512) |
| 28 | validity | validity | validity | number(38, 0) |
| 29 | version | version | version | varchar2(10) |
| 30 | workflow_type | workflow_type | workflow_type | number(38, 0) |
| 31 | creator | creator | creator | char(20) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | modifier | modifier | modifier | char(20) |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |