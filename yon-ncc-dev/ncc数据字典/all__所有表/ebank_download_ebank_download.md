# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7828.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebank_download | pk_ebank_download | pk_ebank_download | char(20) | √ |
| 2 | bankacc | bankacc | bankacc | varchar2(50) |
| 3 | bankaccbas | bankaccbas | bankaccbas | varchar2(50) |
| 4 | banktype | banktype | banktype | varchar2(20) |  |  | '~' |
| 5 | banktypecode | banktypecode | banktypecode | varchar2(10) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | detaildownloaddate | detaildownloaddate | detaildownloaddate | char(19) |
| 8 | firstday | firstday | firstday | char(19) |
| 9 | isbanlancedownload | isbanlancedownload | isbanlancedownload | char(1) |
| 10 | isdetaildownload | isdetaildownload | isdetaildownload | char(1) |
| 11 | ishuidandownload | ishuidandownload | ishuidandownload | char(1) |
| 12 | ispaystatedownload | ispaystatedownload | ispaystatedownload | char(1) |
| 13 | isuse | isuse | isuse | varchar2(1) |
| 14 | netbankkinftp | netbankkinftp | netbankkinftp | varchar2(30) |
| 15 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 16 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 17 | pk_ebank_download_h | pk_ebank_download_h | pk_ebank_download_h | char(30) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 22 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 23 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 24 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 25 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |