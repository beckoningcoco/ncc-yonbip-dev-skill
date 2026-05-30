# |<<

**检验记录 (qc_continuebatch_b / nc.vo.qc.continuebatch.entity.ContinueBatchItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4845.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_continuebatch_b | 检验记录主键 | pk_continuebatch_b | char(20) | √ | 主键 (UFID) |
| 2 | ddate | 日期 | ddate | varchar(19) |  | 日期 (UFDate) |
| 3 | nbatchcount | 批量 | nbatchcount | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | facceptjudge | 接收判定 | facceptjudge | int |  | 接收判定 (acceptjudge) |  | 1=批接收; |