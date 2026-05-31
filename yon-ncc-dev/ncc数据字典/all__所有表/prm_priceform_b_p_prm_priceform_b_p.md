# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10829.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceform_b | pk_priceform_b | pk_priceform_b | char(20) | √ |
| 2 | bexprogressflag | bexprogressflag | bexprogressflag | char(1) |
| 3 | brelatebaseflag | brelatebaseflag | brelatebaseflag | char(1) |
| 4 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 5 | faffectflag | faffectflag | faffectflag | number(38, 0) |
| 6 | fformtypeflag | fformtypeflag | fformtypeflag | number(38, 0) |
| 7 | flimitmodelflag | flimitmodelflag | flimitmodelflag | number(38, 0) |
| 8 | nadjustprice | nadjustprice | nadjustprice | number(28, 8) |
| 9 | nadjustpriceadd | nadjustpriceadd | nadjustpriceadd | number(28, 8) |
| 10 | nadjustpricefactor | nadjustpricefactor | nadjustpricefactor | number(28, 8) |
| 11 | nlimitnum | nlimitnum | nlimitnum | number(28, 8) |
| 12 | nprice | nprice | nprice | number(28, 8) |
| 13 | npriceadd | npriceadd | npriceadd | number(28, 8) |
| 14 | npricefactor | npricefactor | npricefactor | number(28, 8) |
| 15 | nqueryprice | nqueryprice | nqueryprice | number(28, 8) |
| 16 | pk_formindex | pk_formindex | pk_formindex | varchar2(20) |
| 17 | pk_priceform | pk_priceform | pk_priceform | char(20) | √ |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |