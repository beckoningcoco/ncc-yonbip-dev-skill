# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cshare_month | pk_cshare_month | pk_cshare_month | char(20) | √ |
| 2 | assume_org | assume_org | assume_org | varchar2(20) |  |  | '~' |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | global_amount | global_amount | global_amount | number(28, 8) |
| 5 | group_amount | group_amount | group_amount | number(28, 8) |
| 6 | org_amount | org_amount | org_amount | number(28, 8) |
| 7 | orig_amount | orig_amount | orig_amount | number(28, 8) |
| 8 | pk_costshare | pk_costshare | pk_costshare | varchar2(20) |  |  | '~' |
| 9 | pk_cshare_detail | pk_cshare_detail | pk_cshare_detail | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_pcorg | pk_pcorg | pk_pcorg | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |