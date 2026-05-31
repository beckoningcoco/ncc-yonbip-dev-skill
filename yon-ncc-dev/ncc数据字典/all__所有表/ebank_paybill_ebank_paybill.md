# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paybill | pk_paybill | pk_paybill | char(20) | √ |
| 2 | bilfromsys | bilfromsys | bilfromsys | varchar2(100) |
| 3 | billnum | billnum | billnum | varchar2(50) |
| 4 | busnar | busnar | busnar | varchar2(500) |
| 5 | checksign | checksign | checksign | varchar2(20) |
| 6 | crtacc | crtacc | crtacc | varchar2(40) |
| 7 | crtbank | crtbank | crtbank | varchar2(101) |
| 8 | crtccynbr | crtccynbr | crtccynbr | varchar2(20) |
| 9 | crtname | crtname | crtname | varchar2(200) |
| 10 | crtpvc | crtpvc | crtpvc | varchar2(100) |
| 11 | dbtacc | dbtacc | dbtacc | varchar2(40) |
| 12 | dbtccynbr | dbtccynbr | dbtccynbr | varchar2(20) |
| 13 | dbtname | dbtname | dbtname | varchar2(200) |
| 14 | dbtpvc | dbtpvc | dbtpvc | varchar2(100) |
| 15 | effectiveflag | effectiveflag | effectiveflag | char(1) |
| 16 | paydate | paydate | paydate | char(19) |
| 17 | payrelecode | payrelecode | payrelecode | varchar2(40) |
| 18 | paystates | paystates | paystates | number(38, 0) |
| 19 | pk_dbtacc | pk_dbtacc | pk_dbtacc | char(20) |
| 20 | pk_dbtaccsub | pk_dbtaccsub | pk_dbtaccsub | char(20) |
| 21 | pk_org | pk_org | pk_org | char(20) |
| 22 | pk_source | pk_source | pk_source | varchar2(20) |
| 23 | pk_user | pk_user | pk_user | char(20) |
| 24 | signdata | signdata | signdata | varchar2(500) |
| 25 | sourcenum | sourcenum | sourcenum | varchar2(50) |
| 26 | sourcetype | sourcetype | sourcetype | varchar2(100) |
| 27 | trsamt | trsamt | trsamt | number(28, 8) |
| 28 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 29 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 30 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 31 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 32 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 33 | obmdef6 | obmdef6 | obmdef6 | varchar2(101) |
| 34 | obmdef7 | obmdef7 | obmdef7 | varchar2(101) |
| 35 | obmdef8 | obmdef8 | obmdef8 | varchar2(101) |
| 36 | obmdef9 | obmdef9 | obmdef9 | varchar2(101) |
| 37 | obmdef10 | obmdef10 | obmdef10 | varchar2(101) |
| 38 | obmdef11 | obmdef11 | obmdef11 | varchar2(101) |
| 39 | obmdef12 | obmdef12 | obmdef12 | varchar2(101) |
| 40 | obmdef13 | obmdef13 | obmdef13 | varchar2(101) |
| 41 | obmdef14 | obmdef14 | obmdef14 | varchar2(101) |
| 42 | obmdef15 | obmdef15 | obmdef15 | varchar2(101) |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |