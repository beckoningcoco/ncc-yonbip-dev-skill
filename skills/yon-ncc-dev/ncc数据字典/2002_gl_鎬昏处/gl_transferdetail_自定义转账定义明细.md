# |<<

**自定义转账定义明细 (gl_transferdetail / nc.vo.gl.transfer.TransferSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2488.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transferdetail | 明细标识 | pk_transferdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 3 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 4 | note | 摘要 | note | varchar(50) |  | 字符串 (String) |
| 5 | assid | 辅助项标识 | assid | varchar(50) |  | 字符串 (String) |
| 6 | orientation | 方向 | orientation | varchar(50) |  | 方向 (orientation) |  | Y=借; |