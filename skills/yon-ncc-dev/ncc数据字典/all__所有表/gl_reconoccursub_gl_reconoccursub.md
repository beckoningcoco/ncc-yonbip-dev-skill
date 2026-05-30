# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8548.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_occursub | pk_occursub | pk_occursub | char(20) | √ |
| 2 | confirmdate | confirmdate | confirmdate | char(19) |
| 3 | confirmer | confirmer | confirmer | char(20) |
| 4 | isdetailrecon | isdetailrecon | isdetailrecon | char(1) |
| 5 | isreconcile | isreconcile | isreconcile | char(1) |
| 6 | pk_detailother | pk_detailother | pk_detailother | char(20) |
| 7 | pk_detailself | pk_detailself | pk_detailself | char(20) |
| 8 | pk_org | pk_org | pk_org | char(20) |
| 9 | pk_othercorp | pk_othercorp | pk_othercorp | char(20) |
| 10 | pk_otherglbook | pk_otherglbook | pk_otherglbook | char(20) |
| 11 | pk_otherglorg | pk_otherglorg | pk_otherglorg | char(20) |
| 12 | pk_otherglorgbook | pk_otherglorgbook | pk_otherglorgbook | char(20) |
| 13 | pk_othervoucher | pk_othervoucher | pk_othervoucher | char(20) |
| 14 | pk_reconcile | pk_reconcile | pk_reconcile | char(20) |
| 15 | pk_reconcileoccur | pk_reconcileoccur | pk_reconcileoccur | char(20) |
| 16 | pk_reconcilerule | pk_reconcilerule | pk_reconcilerule | char(20) |
| 17 | pk_selfglbook | pk_selfglbook | pk_selfglbook | char(20) |
| 18 | pk_selfglorg | pk_selfglorg | pk_selfglorg | char(20) |
| 19 | pk_selfglorgbook | pk_selfglorgbook | pk_selfglorgbook | char(20) |
| 20 | reconcilemessage | reconcilemessage | reconcilemessage | varchar2(300) |
| 21 | stat | stat | stat | number(38, 0) |
| 22 | subvos | subvos | subvos | char(20) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |