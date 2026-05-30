# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8657.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | char(20) | √ |
| 2 | email | email | email | varchar2(50) |
| 3 | fax | fax | fax | varchar2(30) |
| 4 | homephone | homephone | homephone | varchar2(30) |
| 5 | ismain | ismain | ismain | char(1) |  |  | 'Y' |
| 6 | lastflag | lastflag | lastflag | char(1) |  |  | 'Y' |
| 7 | linkaddr | linkaddr | linkaddr | varchar2(384) |
| 8 | linkman | linkman | linkman | varchar2(300) |
| 9 | mobile | mobile | mobile | varchar2(30) |
| 10 | officephone | officephone | officephone | varchar2(30) |
| 11 | pk_group | pk_group | pk_group | char(20) | √ |
| 12 | pk_org | pk_org | pk_org | char(20) |
| 13 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 14 | pk_psnorg | pk_psnorg | pk_psnorg | varchar2(20) |  |  | '~' |
| 15 | postalcode | postalcode | postalcode | varchar2(20) |
| 16 | recordnum | recordnum | recordnum | number(38, 0) |
| 17 | relation | relation | relation | varchar2(192) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |