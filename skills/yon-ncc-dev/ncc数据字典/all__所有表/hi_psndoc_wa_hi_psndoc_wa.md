# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8676.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_wa | pk_psndoc_wa | pk_psndoc_wa | char(20) | √ |
| 2 | assgid | assgid | assgid | number(38, 0) |
| 3 | basedays | basedays | basedays | number(20, 8) |
| 4 | cperiod | cperiod | cperiod | char(2) |
| 5 | cyear | cyear | cyear | char(4) |
| 6 | daywage | daywage | daywage | number(38, 0) | √ |  | 0 |
| 7 | iwatype | iwatype | iwatype | number(38, 0) | √ |  | 0 |
| 8 | nafterdays | nafterdays | nafterdays | number(20, 8) | √ |  | 0 |
| 9 | naftermoney | naftermoney | naftermoney | number(20, 8) | √ |
| 10 | nbeforemoney | nbeforemoney | nbeforemoney | number(20, 8) | √ |  | 0 |
| 11 | nceforedays | nceforedays | nceforedays | number(20, 8) | √ |  | 0 |
| 12 | nmoney | nmoney | nmoney | number(31, 8) | √ |  | 0 |
| 13 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 14 | pk_psndoc_sub | pk_psndoc_sub | pk_psndoc_sub | varchar2(20) |
| 15 | pk_psnjob | pk_psnjob | pk_psnjob | varchar2(20) |
| 16 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) |
| 17 | pk_wa_item | pk_wa_item | pk_wa_item | varchar2(20) |
| 18 | pre_sub_id | pre_sub_id | pre_sub_id | varchar2(20) |
| 19 | pre_sub_ts | pre_sub_ts | pre_sub_ts | char(19) |
| 20 | sub_ts | sub_ts | sub_ts | char(19) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |