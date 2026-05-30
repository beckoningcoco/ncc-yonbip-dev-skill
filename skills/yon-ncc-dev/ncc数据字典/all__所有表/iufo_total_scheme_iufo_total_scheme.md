# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_totalscheme | pk_totalscheme | pk_totalscheme | char(20) | √ |
| 2 | busi_prop | busi_prop | busi_prop | varchar2(20) |
| 3 | org_condition | org_condition | org_condition | blob |
| 4 | org_cond_show | org_cond_show | org_cond_show | clob |
| 5 | org_cond_sql | org_cond_sql | org_cond_sql | clob |
| 6 | org_content | org_content | org_content | blob |
| 7 | org_type | org_type | org_type | number(38, 0) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_rms | pk_rms | pk_rms | varchar2(20) |  |  | '~' |
| 11 | pk_rmsversion | pk_rmsversion | pk_rmsversion | varchar2(20) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |