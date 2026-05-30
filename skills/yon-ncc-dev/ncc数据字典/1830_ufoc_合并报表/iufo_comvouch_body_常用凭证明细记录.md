# |<<

**常用凭证明细记录 (iufo_comvouch_body / nc.vo.hbbb.commonvouch.CommonVouchBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3407.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 明细主键 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | iorder | 分录号 | iorder | int |  | 整数 (Integer) |
| 3 | digest | 摘要 | digest | varchar(50) |  | 字符串 (String) |
| 4 | pk_measure | 合并报表项目 | pk_measure | varchar(20) |  | 合并报表项目 (project) |
| 5 | debitamount | 借方金额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | creditamount | 贷方金额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | note | 备注 | note | varchar(1024) |  | 备注 (Memo) |
| 8 | pk_comvouch_head | 常用调整凭证头主键 | pk_comvouch_head | varchar(50) |  | 字符串 (String) |