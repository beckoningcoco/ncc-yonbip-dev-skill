# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7841.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_paylog_h | pk_ebank_paylog_h | pk_ebank_paylog_h | char(20) | √ |
| 2 | bankaccnum | bankaccnum | bankaccnum | varchar2(60) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | createtime | createtime | createtime | char(19) |
| 5 | headpackageid | headpackageid | headpackageid | varchar2(50) |
| 6 | pk_bankacc | pk_bankacc | pk_bankacc | varchar2(20) |  |  | '~' |
| 7 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | varchar2(20) |  |  | '~' |
| 8 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 9 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | senddatetime | senddatetime | senddatetime | char(19) |
| 14 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 15 | srcbilltype | srcbilltype | srcbilltype | varchar2(20) |  |  | '~' |
| 16 | srcpkid | srcpkid | srcpkid | varchar2(30) |
| 17 | srcsystem | srcsystem | srcsystem | varchar2(50) |
| 18 | state | state | state | number(38, 0) |
| 19 | totalsum | totalsum | totalsum | number(28, 8) |
| 20 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 21 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 22 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 23 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 24 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |