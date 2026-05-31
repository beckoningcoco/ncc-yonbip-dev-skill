# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7554.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noteproperty | pk_noteproperty | pk_noteproperty | char(20) | √ |
| 2 | bxdrivetype | bxdrivetype | bxdrivetype | varchar2(50) |
| 3 | isautobx | isautobx | isautobx | number(38, 0) |
| 4 | isautoly | isautoly | isautoly | number(38, 0) |
| 5 | isebmmange | isebmmange | isebmmange | char(1) |
| 6 | islyctrlbydate | islyctrlbydate | islyctrlbydate | char(1) |
| 7 | islyctrlbymoney | islyctrlbymoney | islyctrlbymoney | char(1) |
| 8 | islyctrlbynum | islyctrlbynum | islyctrlbynum | char(1) |
| 9 | limitation | limitation | limitation | number(20, 8) |
| 10 | lyctrltype | lyctrltype | lyctrltype | varchar2(50) |
| 11 | lydate | lydate | lydate | number(38, 0) |
| 12 | lymoney | lymoney | lymoney | number(20, 8) |
| 13 | lynum | lynum | lynum | number(38, 0) |
| 14 | pk_curr | pk_curr | pk_curr | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_notetype | pk_notetype | pk_notetype | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_orgbook | pk_orgbook | pk_orgbook | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |