# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9793.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccoprodcoefbid | ccoprodcoefbid | ccoprodcoefbid | char(20) | √ |
| 2 | ccoprodcoefid | ccoprodcoefid | ccoprodcoefid | char(20) |
| 3 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 4 | ccosttypeid | ccosttypeid | ccosttypeid | varchar2(20) |  |  | '~' |
| 5 | celementid | celementid | celementid | varchar2(20) |  |  | '~' |
| 6 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) | √ |  | '~' |
| 7 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 8 | iproducttype | iproducttype | iproducttype | number(38, 0) | √ |
| 9 | nrelcoefficient | nrelcoefficient | nrelcoefficient | number(28, 8) | √ |
| 10 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |