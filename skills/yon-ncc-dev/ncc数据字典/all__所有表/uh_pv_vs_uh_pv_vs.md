# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12764.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvvs | pk_pvvs | pk_pvvs | char(20) | √ |
| 2 | date_vs | date_vs | date_vs | char(19) |
| 3 | name_srv_vs | name_srv_vs | name_srv_vs | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 7 | pk_srv_vs | pk_srv_vs | pk_srv_vs | varchar2(20) |  |  | '~' |
| 8 | unit_srv_vs | unit_srv_vs | unit_srv_vs | varchar2(50) |
| 9 | val_vs | val_vs | val_vs | varchar2(256) |
| 10 | val_vs_std | val_vs_std | val_vs_std | varchar2(256) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |