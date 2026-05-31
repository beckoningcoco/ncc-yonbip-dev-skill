# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8679.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | begindate | begindate | begindate | char(10) |
| 3 | bg_check | bg_check | bg_check | varchar2(1536) |
| 4 | certifier | certifier | certifier | varchar2(150) |
| 5 | certiphone | certiphone | certiphone | varchar2(20) |
| 6 | dimission_reason | dimission_reason | dimission_reason | varchar2(1536) |
| 7 | enddate | enddate | enddate | char(10) |
| 8 | lastflag | lastflag | lastflag | char(1) |
| 9 | linkphone | linkphone | linkphone | varchar2(30) |
| 10 | memo | memo | memo | varchar2(1536) |
| 11 | pk_group | pk_group | pk_group | char(20) |
| 12 | pk_org | pk_org | pk_org | char(20) |
| 13 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 14 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |  |  | '~' |
| 15 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |  |  | '~' |
| 16 | recordnum | recordnum | recordnum | number(38, 0) |
| 17 | workachive | workachive | workachive | varchar2(384) |
| 18 | workcorp | workcorp | workcorp | varchar2(300) |
| 19 | workdept | workdept | workdept | varchar2(300) |
| 20 | workduty | workduty | workduty | varchar2(900) |
| 21 | workjob | workjob | workjob | varchar2(300) |
| 22 | workpost | workpost | workpost | varchar2(300) |
| 23 | work_addr | work_addr | work_addr | varchar2(1536) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |