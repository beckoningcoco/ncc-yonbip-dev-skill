# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10998.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transferset | pk_transferset | pk_transferset | char(20) | √ |
| 2 | dest_billtype | dest_billtype | dest_billtype | varchar2(100) |  |  | 'LCDPBill' |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |
| 4 | src_appcode | src_appcode | src_appcode | varchar2(100) |
| 5 | src_billtype | src_billtype | src_billtype | varchar2(100) |
| 6 | src_controlbackfield | src_controlbackfield | src_controlbackfield | varchar2(100) |
| 7 | src_controlfield | src_controlfield | src_controlfield | varchar2(100) |
| 8 | src_controlrule | src_controlrule | src_controlrule | varchar2(300) |
| 9 | src_controltype | src_controltype | src_controltype | number(38, 0) |
| 10 | src_nccqueryclass | src_nccqueryclass | src_nccqueryclass | varchar2(300) |
| 11 | src_subcontrolmetaid | src_subcontrolmetaid | src_subcontrolmetaid | varchar2(100) |
| 12 | src_transferpage | src_transferpage | src_transferpage | varchar2(100) |
| 13 | def1 | def1 | def1 | varchar2(100) |
| 14 | def2 | def2 | def2 | varchar2(100) |
| 15 | def3 | def3 | def3 | varchar2(20) |
| 16 | def4 | def4 | def4 | varchar2(20) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |