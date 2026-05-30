# |<<

**对账明细 (gl_corpcontrastsub / nc.vo.gl.contrast.result.CorpContrastSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2393.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_corpcontrastsub | 对账子表主键 | pk_corpcontrastsub | char(20) | √ | 主键 (UFID) |
| 2 | bself | 本方标志(Y-本方，N-对方) | bself | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_voucherdetail | 会计分录 | pk_voucherdetail | char(20) |  | 主键 (UFID) |
| 4 | isinit | 是否期初 | isinit | char(1) | √ | 布尔类型 (UFBoolean) |
| 5 | pk_corpcontrast | 对帐关系标识 | pk_corpcontrast | char(20) |  | 主键 (UFID) |
| 6 | amountequal | 金额两情 | amountequal | char(50) |  | 字符串 (String) |
| 7 | quantityequal | 数量两情 | quantityequal | char(50) |  | 字符串 (String) |