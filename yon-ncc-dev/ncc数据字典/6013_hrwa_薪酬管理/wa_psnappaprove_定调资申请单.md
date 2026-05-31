# |<<

**定调资申请单 (wa_psnappaprove / nc.vo.wa.adjust.PsnappaproveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6347.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnapp | 定调级申请单主键 | pk_psnapp | char(20) | √ | 主键 (UFID) |
| 2 | billcode | 申请单编码 | billcode | varchar(30) | √ | 字符串 (String) |
| 3 | billname | 申请单名称 | billname | varchar(50) | √ | 字符串 (String) |
| 4 | applydate | 申请日期 | applydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 5 | confirmdate | 批复日期 | confirmdate | char(19) |  | 日期时间 (UFDateTime) |
| 6 | usedate | 生效日期 | usedate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 7 | confirmstate | 审批状态 | confirmstate | int |  | 单据状态 (billStateEnum) |  | -1=自由; |