# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_download_h | pk_ebank_download_h | pk_ebank_download_h | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | deffuntype | deffuntype | deffuntype | char(1) |
| 4 | funcode | funcode | funcode | varchar2(10) |
| 5 | funtype | funtype | funtype | varchar2(75) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 10 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 11 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 12 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 13 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |