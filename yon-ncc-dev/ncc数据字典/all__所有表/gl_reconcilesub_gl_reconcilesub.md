# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8541.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilesub | pk_reconcilesub | pk_reconcilesub | char(20) | √ |
| 2 | isneedconfirm | isneedconfirm | isneedconfirm | char(1) |
| 3 | isonlyinnercust | isonlyinnercust | isonlyinnercust | char(1) |
| 4 | issubjdetailrecon | issubjdetailrecon | issubjdetailrecon | char(1) |
| 5 | pk_othercorp | pk_othercorp | pk_othercorp | char(4) |
| 6 | pk_otherglbook | pk_otherglbook | pk_otherglbook | char(20) |
| 7 | pk_otherglorg | pk_otherglorg | pk_otherglorg | char(20) |
| 8 | pk_otherglorgbook | pk_otherglorgbook | pk_otherglorgbook | char(20) |
| 9 | pk_otherprepare | pk_otherprepare | pk_otherprepare | char(20) |
| 10 | pk_reconcile | pk_reconcile | pk_reconcile | char(20) | √ |
| 11 | pk_selfcorp | pk_selfcorp | pk_selfcorp | char(4) |
| 12 | pk_selfglbook | pk_selfglbook | pk_selfglbook | char(20) |
| 13 | pk_selfglorg | pk_selfglorg | pk_selfglorg | char(20) |
| 14 | pk_selfglorgbook | pk_selfglorgbook | pk_selfglorgbook | char(20) |
| 15 | serialnumber | serialnumber | serialnumber | number(38, 0) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |