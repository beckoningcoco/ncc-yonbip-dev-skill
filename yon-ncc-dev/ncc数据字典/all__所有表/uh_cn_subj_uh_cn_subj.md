# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12551.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnsubj | pk_cnsubj | pk_cnsubj | char(20) | √ |
| 2 | desc_prob | desc_prob | desc_prob | varchar2(4000) |
| 3 | dies_cur | dies_cur | dies_cur | varchar2(4000) |
| 4 | dies_hist | dies_hist | dies_hist | varchar2(4000) |
| 5 | pk_cnet | pk_cnet | pk_cnet | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |