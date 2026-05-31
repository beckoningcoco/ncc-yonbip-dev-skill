# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7677.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnemrqacorrect | pk_cnemrqacorrect | pk_cnemrqacorrect | char(20) | √ |
| 2 | corrected | corrected | corrected | char(1) |
| 3 | date_correct | date_correct | date_correct | char(19) |
| 4 | date_submit | date_submit | date_submit | char(19) |
| 5 | emr_pos | emr_pos | emr_pos | number(38, 0) |
| 6 | emr_pos2 | emr_pos2 | emr_pos2 | number(38, 0) |
| 7 | emr_text | emr_text | emr_text | varchar2(4000) |
| 8 | pk_cnemrqa | pk_cnemrqa | pk_cnemrqa | varchar2(20) |  |  | '~' |
| 9 | pk_emr | pk_emr | pk_emr | varchar2(20) |  |  | '~' |
| 10 | pk_psn_fix | pk_psn_fix | pk_psn_fix | varchar2(20) |  |  | '~' |
| 11 | pk_psn_phy | pk_psn_phy | pk_psn_phy | varchar2(20) |  |  | '~' |
| 12 | pk_psn_qa | pk_psn_qa | pk_psn_qa | varchar2(20) |  |  | '~' |
| 13 | pk_pv | pk_pv | pk_pv | varchar2(50) |  |  | '~' |
| 14 | qa_note | qa_note | qa_note | varchar2(4000) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |