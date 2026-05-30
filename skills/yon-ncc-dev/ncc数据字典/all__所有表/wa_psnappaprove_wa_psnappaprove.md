# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12892.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnapp | pk_psnapp | pk_psnapp | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | approver | approver | approver | varchar2(20) |
| 4 | approvetype | approvetype | approvetype | number(38, 0) |  |  | 0 |
| 5 | approve_note | approve_note | approve_note | varchar2(128) |
| 6 | billcode | billcode | billcode | varchar2(30) |
| 7 | billname | billname | billname | varchar2(50) |
| 8 | billtype | billtype | billtype | varchar2(20) |
| 9 | confirmdate | confirmdate | confirmdate | char(19) |
| 10 | confirmstate | confirmstate | confirmstate | number(38, 0) |  |  | 0 |
| 11 | operator | operator | operator | varchar2(20) |
| 12 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |
| 13 | pk_changecause | pk_changecause | pk_changecause | varchar2(20) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 15 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 16 | pk_src_bill | pk_src_bill | pk_src_bill | varchar2(20) |
| 17 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 18 | sum_apply_money | sum_apply_money | sum_apply_money | number(31, 8) |
| 19 | sum_confim_money | sum_confim_money | sum_confim_money | number(31, 8) |
| 20 | transtype | transtype | transtype | varchar2(20) |
| 21 | transtypeid | transtypeid | transtypeid | varchar2(20) | √ |
| 22 | usedate | usedate | usedate | char(19) |
| 23 | vbasefile | vbasefile | vbasefile | varchar2(100) |
| 24 | creationtime | creationtime | creationtime | char(19) | √ |
| 25 | creator | creator | creator | varchar2(20) | √ |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |