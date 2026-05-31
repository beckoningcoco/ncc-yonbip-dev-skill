# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9242.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancerule | pk_balancerule | pk_balancerule | char(20) | √ |
| 2 | bmdapply | bmdapply | bmdapply | char(1) | √ |
| 3 | bmmplan | bmmplan | bmmplan | char(1) | √ |
| 4 | bpo | bpo | bpo | char(1) | √ |
| 5 | bpr | bpr | bpr | char(1) | √ |
| 6 | breqin | breqin | breqin | char(1) | √ |
| 7 | breqout | breqout | breqout | char(1) | √ |
| 8 | bsafestock | bsafestock | bsafestock | char(1) | √ |
| 9 | bworkorder | bworkorder | bworkorder | char(1) | √ |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |