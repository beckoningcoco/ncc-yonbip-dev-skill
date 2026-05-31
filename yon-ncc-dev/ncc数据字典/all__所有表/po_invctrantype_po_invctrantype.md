# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10754.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invctrantype | pk_invctrantype | pk_invctrantype | char(20) | √ |
| 2 | bajust | bajust | bajust | char(1) |
| 3 | bcheckquality | bcheckquality | bcheckquality | char(1) | √ |
| 4 | bconsumepur | bconsumepur | bconsumepur | char(1) | √ |
| 5 | bsendpay | bsendpay | bsendpay | char(1) | √ |
| 6 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 7 | itoarapmode | itoarapmode | itoarapmode | number(38, 0) | √ |
| 8 | pk_group | pk_group | pk_group | char(20) | √ |
| 9 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |