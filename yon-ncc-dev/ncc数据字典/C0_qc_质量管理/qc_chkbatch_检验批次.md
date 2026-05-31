# |<<

**检验批次 (qc_chkbatch / nc.vo.qc.chkbatch.entity.ChkBatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4842.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chkbatch | 检验批次主键 | pk_chkbatch | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_applybill | 报检单主键 | pk_applybill | char(20) |  | 主键 (UFID) |
| 4 | vbatchcode | 检验批次 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 5 | nchecknum | 检验主数量 | nchecknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | cbilltype | 创建单据类型 | cbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | creationtime | 检验批次创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |