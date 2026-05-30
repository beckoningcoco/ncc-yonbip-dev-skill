# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11420.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costupdate | pk_costupdate | pk_costupdate | char(20) | √ |
| 2 | convolution_name | convolution_name | convolution_name | varchar2(50) |
| 3 | costdomainid_src | costdomainid_src | costdomainid_src | varchar2(20) |  |  | '~' |
| 4 | costdomainid_tar | costdomainid_tar | costdomainid_tar | varchar2(20) |  |  | '~' |
| 5 | costtagtype | costtagtype | costtagtype | number(38, 0) |
| 6 | costtag_src | costtag_src | costtag_src | varchar2(50) |
| 7 | costtag_tar | costtag_tar | costtag_tar | varchar2(50) |
| 8 | costtype_src | costtype_src | costtype_src | varchar2(20) |  |  | '~' |
| 9 | costtype_tar | costtype_tar | costtype_tar | varchar2(20) |  |  | '~' |
| 10 | effectdate | effectdate | effectdate | char(19) |
| 11 | effectperiod | effectperiod | effectperiod | varchar2(20) |  |  | '~' |
| 12 | isautocoverage | isautocoverage | isautocoverage | char(1) |  |  | 'N' |
| 13 | materialrange | materialrange | materialrange | number(38, 0) |
| 14 | operationtype | operationtype | operationtype | number(38, 0) |
| 15 | pk_accbook_src | pk_accbook_src | pk_accbook_src | varchar2(20) |  |  | '~' |
| 16 | pk_accbook_tar | pk_accbook_tar | pk_accbook_tar | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org_src | pk_org_src | pk_org_src | varchar2(20) |  |  | '~' |
| 19 | pk_org_tar | pk_org_tar | pk_org_tar | varchar2(20) |  |  | '~' |
| 20 | pk_org_v_src | pk_org_v_src | pk_org_v_src | varchar2(20) |  |  | '~' |
| 21 | pk_org_v_tar | pk_org_v_tar | pk_org_v_tar | varchar2(20) |  |  | '~' |
| 22 | pk_profitcenter_src | pk_profitcenter_src | pk_profitcenter_src | varchar2(20) |  |  | '~' |
| 23 | pk_profitcenter_tar | pk_profitcenter_tar | pk_profitcenter_tar | varchar2(20) |  |  | '~' |
| 24 | pk_setofbook_src | pk_setofbook_src | pk_setofbook_src | varchar2(20) |  |  | '~' |
| 25 | pk_setofbook_tar | pk_setofbook_tar | pk_setofbook_tar | varchar2(20) |  |  | '~' |
| 26 | pushstate | pushstate | pushstate | number(38, 0) |
| 27 | remark | remark | remark | varchar2(200) |
| 28 | creationtime | creationtime | creationtime | char(19) |
| 29 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 32 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |