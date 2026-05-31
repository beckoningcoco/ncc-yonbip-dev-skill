# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11399.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convscheme | pk_convscheme | pk_convscheme | char(20) | √ |
| 2 | bomversion | bomversion | bomversion | varchar2(20) |
| 3 | cbomsource | cbomsource | cbomsource | number(38, 0) |  |  | 1 |
| 4 | convmethod | convmethod | convmethod | number(38, 0) |
| 5 | costdomainid | costdomainid | costdomainid | varchar2(20) |  |  | '~' |
| 6 | defaultscheme | defaultscheme | defaultscheme | char(1) |  |  | 'Y' |
| 7 | pk_costtype | pk_costtype | pk_costtype | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 12 | rtsource | rtsource | rtsource | number(38, 0) |  |  | 1 |
| 13 | rtversion | rtversion | rtversion | varchar2(20) |
| 14 | schemecode | schemecode | schemecode | varchar2(200) |
| 15 | schemename | schemename | schemename | varchar2(400) |
| 16 | vnote | vnote | vnote | varchar2(200) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |