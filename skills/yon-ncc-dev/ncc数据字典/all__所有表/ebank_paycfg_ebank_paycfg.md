# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | bank | bank | bank | varchar2(10) | √ |
| 3 | banktypecode | banktypecode | banktypecode | varchar2(40) |
| 4 | cs | cs | cs | number(38, 0) | √ |
| 5 | fileflag | fileflag | fileflag | varchar2(10) | √ |
| 6 | filename | filename | filename | varchar2(150) |
| 7 | func | func | func | varchar2(10) | √ |
| 8 | isbank | isbank | isbank | char(1) |
| 9 | iscorp | iscorp | iscorp | char(1) |
| 10 | isdate | isdate | isdate | char(1) |
| 11 | isedit | isedit | isedit | char(1) |
| 12 | issystem | issystem | issystem | char(1) |
| 13 | isuserid | isuserid | isuserid | char(1) |
| 14 | pk_corp | pk_corp | pk_corp | varchar2(30) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | savepath | savepath | savepath | varchar2(150) | √ |
| 19 | userid | userid | userid | varchar2(20) |  |  | '~' |
| 20 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 21 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 22 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 23 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 24 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |