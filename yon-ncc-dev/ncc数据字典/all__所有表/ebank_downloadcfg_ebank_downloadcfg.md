# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7829.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | bankacc | bankacc | bankacc | varchar2(50) |
| 3 | banktypecode | banktypecode | banktypecode | varchar2(40) |
| 4 | detaildownloaddate | detaildownloaddate | detaildownloaddate | char(19) |
| 5 | firstday | firstday | firstday | char(19) |
| 6 | isbanlancedownload | isbanlancedownload | isbanlancedownload | char(1) |
| 7 | isdetaildownload | isdetaildownload | isdetaildownload | char(1) |
| 8 | ispaystatedownload | ispaystatedownload | ispaystatedownload | char(1) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | useid | useid | useid | varchar2(20) |  |  | '~' |
| 13 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 14 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 15 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 16 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 17 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |