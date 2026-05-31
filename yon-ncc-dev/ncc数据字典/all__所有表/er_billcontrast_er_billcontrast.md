# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7941.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billcontrast | pk_billcontrast | pk_billcontrast | char(20) | √ |
| 2 | app_scene | app_scene | app_scene | number(38, 0) |
| 3 | des_billtype | des_billtype | des_billtype | varchar2(50) | √ |
| 4 | des_billtypeid | des_billtypeid | des_billtypeid | varchar2(20) |  |  | '~' |
| 5 | des_tradetype | des_tradetype | des_tradetype | varchar2(50) | √ |
| 6 | des_tradetypeid | des_tradetypeid | des_tradetypeid | varchar2(20) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | src_billtype | src_billtype | src_billtype | varchar2(50) | √ |
| 10 | src_billtypeid | src_billtypeid | src_billtypeid | varchar2(20) |  |  | '~' |
| 11 | src_tradetype | src_tradetype | src_tradetype | varchar2(50) | √ |
| 12 | src_tradetypeid | src_tradetypeid | src_tradetypeid | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |