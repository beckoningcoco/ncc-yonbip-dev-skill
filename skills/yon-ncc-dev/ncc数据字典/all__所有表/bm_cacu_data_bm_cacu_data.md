# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7345.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cacu_data | pk_cacu_data | pk_cacu_data | char(20) | √ |
| 2 | begindate | begindate | begindate | char(10) |
| 3 | cacu_value | cacu_value | cacu_value | number(31, 8) |  |  | 0 |
| 4 | char_value | char_value | char_value | varchar2(256) |
| 5 | enddate | enddate | enddate | char(10) |
| 6 | iscacu | iscacu | iscacu | char(1) | √ |  | 'N' |
| 7 | pk_bm_class | pk_bm_class | pk_bm_class | varchar2(20) | √ |
| 8 | pk_bm_data | pk_bm_data | pk_bm_data | varchar2(20) | √ |
| 9 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) | √ |
| 10 | psnage | psnage | psnage | number(38, 0) | √ |  | 0 |
| 11 | unitage | unitage | unitage | number(38, 0) | √ |  | 0 |
| 12 | workage | workage | workage | number(38, 0) | √ |  | 0 |
| 13 | creator | creator | creator | varchar2(20) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |